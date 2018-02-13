package com.example.athi.rock.musique;

/**
 * Created by Athi on 12/02/2018.
 */

public class Musique {
    private String nomMusique;
    private String artiste;
    private String nbLike;

    public Musique (String nomMusique,String artiste,String nbLike){
        this.nomMusique=nomMusique;
        this.artiste=artiste;
        this.nbLike=nbLike;
    }

    public String getNomMusique() {return nomMusique;}
    public void setNomMusique(String nomMusique) {this.nomMusique = nomMusique;}
    public String getArtiste() {return artiste;}
    public void setArtiste(String artiste) {this.artiste = artiste;}
    public String getNbLike() {return nbLike;}
    public void setNbLike(String nbLike) {this.nbLike = nbLike;}

}
