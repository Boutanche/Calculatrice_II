package com.example.calculatrice_ii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

/**
 * Classe principale de Calculatrice II
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText tn_operation, tn_result;
    MaterialButton bt_1, bt_2, bt_3, bt_4, bt_5, bt_6, bt_7, bt_8, bt_9, bt_0;
    MaterialButton bt_add, bt_sub, bt_mul, bt_div, bt_result, bt_raz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tn_operation = findViewById(R.id.tn_operation);
        tn_result = findViewById(R.id.tn_result);

        assignId(bt_1, R.id.bt_1);
        assignId(bt_2, R.id.bt_2);
        assignId(bt_3, R.id.bt_3);
        assignId(bt_4, R.id.bt_4);
        assignId(bt_5, R.id.bt_5);
        assignId(bt_6, R.id.bt_6);
        assignId(bt_7, R.id.bt_7);
        assignId(bt_8, R.id.bt_8);
        assignId(bt_9, R.id.bt_9);
        assignId(bt_0, R.id.bt_0);

        assignId(bt_add, R.id.bt_add);
        assignId(bt_sub, R.id.bt_sub);
        assignId(bt_mul, R.id.bt_mul);
        assignId(bt_div, R.id.bt_div);
        assignId(bt_result, R.id.bt_result);
        assignId(bt_raz, R.id.bt_raz);

    }
    void assignId(MaterialButton bt, int id){
        bt = findViewById(id);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button =(MaterialButton) view;
        String buttonText = button.getText().toString();
        tn_operation.setText(buttonText);

    }
}