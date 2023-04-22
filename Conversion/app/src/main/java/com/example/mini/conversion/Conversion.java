package com.example.mini.conversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Conversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        Button k = (Button) findViewById(R.id.PAD);
        k.setOnClickListener(oklistener);
        Button m = (Button) findViewById(R.id.DAP);
        m.setOnClickListener(oklistener2);
        Button s= (Button) findViewById(R.id.SALIR);
        s.setOnClickListener(oklistener3);

    }
    private View.OnClickListener oklistener = new android.view.View.OnClickListener() {
        @Override
        public void onClick(View v) {
            calcular();


        }

        public void calcular() {
            EditText numero1 = (EditText) findViewById(R.id.VALOR);
            double valor = Double.parseDouble(numero1.getText().toString());
            double dolar = 18.6;
            double C1 = valor/ dolar;
            Toast.makeText(getApplicationContext(), valor + " Pesos son:  " + C1 + " Dòlares", Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener oklistener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            calcular1();


        }

        public void calcular1() {
            EditText numero1 = (EditText) findViewById(R.id.VALOR);
            double valor = Double.parseDouble(numero1.getText().toString());
            double dolar = 18.6 ;
            double C2 = valor*dolar;
            Toast.makeText(getApplicationContext(), valor + " Dòlares son:  " + C2 + " Pesos", Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener oklistener3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sal();
        }

        public void sal() {
            Toast.makeText(getApplicationContext(),  " ADIÒS " , Toast.LENGTH_SHORT).show();

            System.exit(0);

        }
    };
}
