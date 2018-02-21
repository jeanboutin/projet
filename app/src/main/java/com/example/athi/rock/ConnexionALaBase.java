package com.example.athi.rock;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by jeanb on 19/02/2018.
 */
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONObject;


public class ConnexionALaBase {
    String result = "";
    // L'année à envoyer
    ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
nameValuePairs.add(new BasicNameValuePair("year","1980"));

// Envoi de la requête avec HTTPPost
try{
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("http://example.com/getAllPeopleBornAfter.php");
        httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        HttpResponse response = httpclient.execute(httppost);
        HttpEntity entity = response.getEntity();
        InputStream is = entity.getContent();
    }catch(Exception e){
        Log.e("log_tag", "Error in http connection "+e.toString());
    }

//Conversion de la réponse en chaine
try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line + "\n");
        }
        is.close();

        result=sb.toString();
    }catch(Exception e){
        Log.e("log_tag", "Error converting result "+e.toString());
    }

// Parsing des données JSON
try{
        JSONArray jArray = new JSONArray(result);
        for(int i=0;i<jArray.length();i++){
            JSONObject json_data = jArray.getJSONObject(i);
            Log.i("log_tag","id: "+json_data.getInt("id")+
                    ", name: "+json_data.getString("name")+
                    ", sex: "+json_data.getInt("sex")+
                    ", birthyear: "+json_data.getInt("birthyear")
            );
        }
    }
}catch(JSONException e){
        Log.e("log_tag", "Error parsing data "+e.toString());
        }
}
