package com.example.athi.rock.equipe;

/**
 * Created by Athi on 11/02/2018.
 */

public class Membre {
    private String role;
    private String description;
    private String nom;
    private String prenom;
    private int color;

    public Membre (String role, String description, String nom, String prenom, int color){
        this.role=role;
        this.description=description;
        this.nom=nom;
        this.prenom=prenom;
        this.color=color;
    }
    /*TODO*/
    public static final String SQL_TABLE_NAME = "membre";
    public static final String KEY_ID ="id";
    public static final String KEY_PRENOM="prenom";
    public static final String KEY_NOM ="nom";
    public static final String KEY_DESCRIPTION="description";
    public static final String KEY_PHOTOCHEMIN="text";



    public String getRole() {return role;}
    public void setRole(String role) {this.role = role;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public int getColor() {return color;}
    public void setColor(int color) {this.color = color;}
}
