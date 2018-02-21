package com.example.athi.rock.passes;

/**
 * Created by Athi on 12/02/2018.
 */

public class Passe {
    private String nom;
    private String niveau;
    private int color;

    /*TODO*/
    public static final String SQL_TABLE_NAME = "passe";
    public static final String KEY_IDPASSE ="idPasse";
    public static final String KEY_NOM="nom";
    public static final String KEY_CHEMINVIDEO ="cheminVideo";
    public static final String KEY_DATEAPPARITION="dateAppparition";
    public static final String KEY_NIV="niv";


    public Passe (String nom, String niveau, int color){
        this.nom=nom;
        this.niveau=niveau;
        this.color=color;
    }

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getNiveau() {return niveau;}
    public void setNiveau(String niveau) {this.niveau = niveau;}
    public int getColor() {return color;}
    public void setColor(int color) {this.color = color;}
}
