package com.example.calculatrice_ii;

import android.util.Log;

public class Calculatrice {

    int opperande_1 = 0;
    int opperande_2 = 0;
    boolean isOpperande_1 = true;
    Opperator opperator = null;
    double resultatCourant = 0;
    String value = "";

    public void toucheAppuyee(String btn) {

        Log.i("BENOIT", "Calculatrice btn : " + btn);

        switch (btn){
            case "+" :
                Log.i("BENOIT", "Dans Boucle '+' : " + btn);
                isOpperande_1 = false;
                Log.i("BENOIT", "Dans Boucle '+' : " + isOpperande_1);
                this.opperator = Opperator.ADD;
                Log.i("BENOIT", "Dans Boucle '+' : " + opperator.name());
                this.value = "";
                Log.i("BENOIT", "Dans Boucle 'Value' : " + value);
                break;
            case "=" :
                switch(opperator) {
                    case ADD : this.resultatCourant = opperande_1 + opperande_2; break;
                    case SUB : this.resultatCourant = opperande_1 - opperande_2; break;
                    case MUL : this.resultatCourant = opperande_1 * opperande_2; break;
                    case DIV : this.resultatCourant = opperande_1 / opperande_2; break;
                    default : return; // do nothing if no operator
                }
                opperande_2 = 0;
                isOpperande_1 = true;
                Log.i("BENOIT", " resultat = " + resultatCourant);
                value = String.valueOf(resultatCourant);
                break;
            default :
                if(isOpperande_1){
                    this.value = value + btn;
                    Log.i("BENOIT", "Btn opperande = " + btn);
                    Log.i("BENOIT", "Value : " + this.value);
                    this.opperande_1 = Integer.parseInt(value);
                    Log.i("BENOIT", "Oppérande : " + this.opperande_1);
                    break;
                }else {
                    this.value = value + btn;
                    this.opperande_2 = this.opperande_2 + Integer.parseInt(value);
                    break;
            }
        }

        if (btn.equals("=")){

        }
        if (btn.equals("null")){
            btn = "0";
        }
        else {

        }
    }

    public void calculer(boolean isOperarition1){
        if(isOperarition1){
            // Ne rien faire
        } else {

        }
    }
    public static double getResultatCourant(){
        double resultatCourant = 0;
        return resultatCourant;
    }
    public void etat(String touche){

    }
    public enum Opperator {
        ADD("+"),
        SUB("-"),
        MUL("*"),
        DIV("/");

        private String name = "";
        Opperator(String name){this.name = name;}
        public String toString(){return name;}
    }
    public enum Etat{
        SAISIE_OPERANDE_1,
        SAISIE_OPERANDE_2,
        RESULTAT,
        ERREUR,
    }
}
