package com.example.calculatrice_ii;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

/**
 * Classe principale de Calculatrice II
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView textView;
    private UICalcultriceStandard ui;



    /**
     * A la création
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Initialisation
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textView = findViewById(R.id.textView);
        this.ui = new UICalcultriceStandard();
        Log.i("BENOIT", "Vue pour la calculatrice créée");
    }

    /**
     * Au click sur un boutton
     * @param view Vue
     */
    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        ui.onToucheAppuyee(button);
        textView.setText(ui.val);
    }
}
