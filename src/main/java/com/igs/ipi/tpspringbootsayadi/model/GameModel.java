package com.igs.ipi.tpspringbootsayadi.model;

public class GameModel {

    private static final int l = 7;

    private static final int h = 6;

    private String  nom1;

    private String nom2;

    private Jeton [][] tableau = new Jeton [h] [l];

    public GameModel() {
             for (int i = 0; i < tableau.length; i++) {
                 for (int j = 0; j < tableau[i].length; j++) { tableau[i][j] = Jeton.VIDE; }
                  }
          }



    public String getNom1() {
        return nom1;
    }

    public void setNom1(String nom1) {
        this.nom1 = nom1;
    }

    public String getNom2() {
        return nom2;
    }

    public void setNom2(String nom2) {
        this.nom2 = nom2;
    }

           public Jeton[][] gettableau() {
             return tableau;
    }

             public void settableau(Jeton[][] tableau) {
               this.tableau = tableau;
    }

}