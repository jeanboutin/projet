package com.example.athi.rock.equipe;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.athi.rock.R;
import java.util.List;

/**
 * Created by Athi on 11/02/2018.
 */

public class MembreAdapter extends ArrayAdapter<Membre>{
    public MembreAdapter(Context context, List<Membre> membres) {
        super(context, 0,membres);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.ligne_liste_role,parent, false);
        }

        MembreViewHolder viewHolder = (MembreViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new MembreViewHolder();
            viewHolder.role = (TextView) convertView.findViewById(R.id.id_role);
            viewHolder.prenom = (TextView) convertView.findViewById(R.id.id_prenom);
            viewHolder.nom = (TextView) convertView.findViewById(R.id.id_nom);
            viewHolder.desciption = (TextView) convertView.findViewById(R.id.id_description);
            viewHolder.photoRole = (ImageView) convertView.findViewById(R.id.id_photoRole);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Membre membre = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.role.setText(membre.getRole());
        viewHolder.prenom.setText(membre.getPrenom());
        viewHolder.nom.setText(membre.getNom());
        viewHolder.desciption.setText(membre.getDescription());
        viewHolder.photoRole.setImageDrawable(new ColorDrawable(membre.getColor()));

        return convertView;
    }

    private class MembreViewAdapter{
        public TextView role;
        public TextView prenom;
        public  TextView nom;
        public TextView description;
        public ImageView photoRole;
    }
}
