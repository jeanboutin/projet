package com.example.athi.rock;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.athi.rock.equipe.MembreAdapter;
import com.example.athi.rock.passes.Passe;
import com.example.athi.rock.passes.PasseAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PassesFragment extends Fragment {

    public PassesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_passes, container, false);
        List<Passe> passes= genererPasses();
        ListView listViewPasse = (ListView) view.findViewById(R.id.id_listViewPasse);
        PasseAdapter adapter = new PasseAdapter(getActivity(),passes);
        listViewPasse.setAdapter(adapter);
        return view;
    }

    private List<Passe> genererPasses() {
        List<Passe> passes =new ArrayList<Passe>();
        passes.add(new Passe("Huit","2",Color.MAGENTA));
        passes.add(new Passe("Transition 1", "1", Color.GRAY));
        passes.add(new Passe("Transition 2","1",Color.GRAY));
        passes.add(new Passe("Transition 3","1", Color.GRAY));
        passes.add(new Passe("Transition 4", "1", Color.GRAY));
        passes.add(new Passe("Pirouette Plouf", "3", Color.GRAY));
        passes.add(new Passe("pirouette","3", Color.GRAY));
        return passes;
    }


}
