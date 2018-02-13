package com.example.athi.rock;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.athi.rock.musique.Musique;
import com.example.athi.rock.musique.MusiqueAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MusiquesFragment extends Fragment {

    public MusiquesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_musiques, container, false);
        List<Musique> musiques = genererMusiques();
        ListView listViewMusique = (ListView) view.findViewById(R.id.id_listViewMusique);
        MusiqueAdapter adapter = new MusiqueAdapter(getActivity(),musiques);
        listViewMusique.setAdapter(adapter);
        return view;
    }

    private List<Musique> genererMusiques() {
        List<Musique> musiques = new ArrayList<Musique>();
        musiques.add(new Musique("Hymn For The Weekend", "Coldplay","10"));
        musiques.add(new Musique("Hymn For The Weekend", "Coldplay","1"));
        musiques.add(new Musique("Hymn For The Weekend", "Coldplay","122"));
        musiques.add(new Musique("Hymn For The Weekend", "Coldplay","13"));
        musiques.add(new Musique("Hymn For The Weekend", "Coldplay","4"));
        musiques.add(new Musique("Hymn For The Weekend", "Coldplay","500"));
        musiques.add(new Musique("Hymn For The Weekend", "Coldplay","1000"));
        musiques.add(new Musique("Hymn For The Weekend", "Coldplay","40"));
        musiques.add(new Musique("Hymn For The Weekend", "Coldplay","0"));
        musiques.add(new Musique("Hymn For The Weekend", "Coldplay","3"));
        return musiques;
    }
}
