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

import com.example.athi.rock.equipe.Membre;
import com.example.athi.rock.equipe.MembreAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class EquipeFragment extends Fragment {

    public EquipeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_equipe, container, false);
        List<Membre> membres = genererMembres();
        ListView listViewEquipe = (ListView) view.findViewById(R.id.id_listViewEquipe);
        MembreAdapter adapter = new MembreAdapter(getActivity(),membres);
        listViewEquipe.setAdapter(adapter);
        return view;
    }

    private List<Membre> genererMembres() {
        List<Membre> membres = new ArrayList<Membre>();
        membres.add(new Membre("President", "la desciption du pres", "Gorgeon", "Clément", Color.GRAY));
        membres.add(new Membre("President", "la desciption du pres blbalablablablablablabalablabl abalbalablablabalbalbalablab blabalblabalbalbalablabalba balkbalablbal babalb lablabalablablablab",
                "Gorgeon", "Clément", Color.GRAY));
        membres.add(new Membre("President", "la desciption du pres", "Gorgeon", "Clément", Color.GRAY));
        membres.add(new Membre("President", "la desciption du pres", "Gorgeon", "Clément", Color.GRAY));
        membres.add(new Membre("President", "la desciption du pres", "Gorgeon", "Clément", Color.GRAY));
        membres.add(new Membre("President", "la desciption du pres", "Gorgeon", "Clément", Color.GRAY));
        membres.add(new Membre("President", "la desciption du pres", "Gorgeon", "Clément", Color.GRAY));
        membres.add(new Membre("President", "la desciption du pres", "Gorgeon", "Clément", Color.GRAY));

        return membres;
    }
}
