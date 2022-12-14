package com.example.calculatrice_ii;

import android.util.Log;

import com.google.android.material.button.MaterialButton;

/**
 * Classe Interface Utilisateur de la calculatrice format standard
 */
public class UICalcultriceStandard {
    String val = "0";
    Calculatrice calculatrice = new Calculatrice();

    public void afficher(String val) {
        Log.i("BENOIT", "Dans afficher() 'val' : " + val);
        this.val = val;
    }
    public void onToucheAppuyee(MaterialButton btn){
        Log.i("BENOIT", "Message transmis par afficher() : " + btn.getText());
        calculatrice.toucheAppuyee(btn.getText().toString());
        Log.i("BENOIT", "Retour dans UI 'value' : " + calculatrice.value);
        afficher(calculatrice.value);
    }
}
