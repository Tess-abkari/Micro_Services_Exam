package model;


import io.swagger.annotations.ApiModelProperty;

public class Acteur {
    @ApiModelProperty(notes = "nom de l'acteur",name="nom",required=true,value="test nom")
    private String nom;
    @ApiModelProperty(notes = "prénom de l'acteur",name="prénom",required=true,value="test prénom")
    private String prénom;
    @ApiModelProperty(notes = "date_de_naissance de l'acteur",name="date_de_naissance",required=true,value="test date_de_naissance")
    private String date_de_naissance;
    @ApiModelProperty(notes = "filmographie de l'acteur",name="filmographie",required=true,value="test filmographie")
    private String filmographie;

    public Acteur(String nom, String prénom, String date_de_naissance, String filmographie) {
        this.nom = nom;
        this.prénom = prénom;
        this.date_de_naissance = date_de_naissance;
        this.filmographie = filmographie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getFilmographie() {
        return filmographie;
    }

    public void setFilmographie(String filmographie) {
        this.filmographie = filmographie;
    }
}