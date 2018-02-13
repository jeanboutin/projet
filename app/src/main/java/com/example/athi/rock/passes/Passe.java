package com.example.athi.rock.passes;

/**
 * Created by Athi on 12/02/2018.
 */

public class Passe {
    private String nom;
    private String niveau;
    private int color;

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
