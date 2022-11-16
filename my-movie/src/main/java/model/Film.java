package model;


import io.swagger.annotations.ApiModelProperty;

public class Film {
    @ApiModelProperty(notes = "titre du film",name="titre",required=true,value="test titre")
    private String titre;
    @ApiModelProperty(notes = "réalisateur du film",name="réalisateur",required=true,value="test réalisateur")
    private String réalisateur;
    @ApiModelProperty(notes = "acteur du film",name="acteur",required=true,value="test acteur")
    private String acteur;
    @ApiModelProperty(notes = "date_de_sortie du film",name="date_de_sortie",required=true,value="test date_de_sortie")
    private String date_de_sortie;

    public Film(String titre, String réalisateur, String acteur, String date_de_sortie) {
        this.titre = titre;
        this.réalisateur = réalisateur;
        this.acteur = acteur;
        this.date_de_sortie = date_de_sortie;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRéalisateur() {
        return réalisateur;
    }

    public void setRéalisateur(String réalisateur) {
        this.réalisateur = réalisateur;
    }

    public String getActeur() {
        return acteur;
    }

    public void setActeur(String acteur) {
        this.acteur = acteur;
    }

    public String getDate_de_sortie() {
        return date_de_sortie;
    }

    public void setDate_de_sortie(String date_de_sortie) {
        this.date_de_sortie = date_de_sortie;
    }
}

