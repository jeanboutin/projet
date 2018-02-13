package com.example.athi.rock;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DanseFragment extends Fragment {
    private TabLayout danseTabLayout;
    private ViewPager danseViewPager;

    public DanseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootViewDanse = inflater.inflate(R.layout.fragment_danse,container,false);
        danseViewPager = (ViewPager) rootViewDanse.findViewById(R.id.viewpager_content_danse);
        danseTabLayout =(TabLayout) rootViewDanse.findViewById(R.id.tabsdanse);
        danseTabLayout.setupWithViewPager(danseViewPager);

        setupViewPager(danseViewPager);
        return rootViewDanse;
    }

    public void setupViewPager(ViewPager upViewPager) {
        TabViewPagerAdapter adapterDanse = new TabViewPagerAdapter(getChildFragmentManager());
        adapterDanse.addFragment(new PassesFragment(),"Passe");
        adapterDanse.addFragment(new MusiquesFragment(), "Musiques");
        danseViewPager.setAdapter(adapterDanse);
    }
}
