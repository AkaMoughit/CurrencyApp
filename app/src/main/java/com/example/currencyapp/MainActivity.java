package com.example.currencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner s1,s2;
    EditText t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = findViewById(R.id.fromspiner);
        s2 = findViewById(R.id.tospiner);
        t1 = findViewById(R.id.montantxt);
        b1 = findViewById(R.id.convbutton);

        String[] from = {"MAD","EURO","USD","YEN"};
        ArrayAdapter a1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        s1.setAdapter(a1);


        String[] to = {"MAD","EURO","USD","YEN"};
        ArrayAdapter a2 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        s2.setAdapter(a2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double total;

                Double montant = Double.parseDouble(t1.getText().toString());
                if(s1.getSelectedItem().toString() == "MAD"){
                    switch(s2.getSelectedItem().toString()) {
                        case "EURO":
                            total = montant * 0.09;
                            Toast.makeText(getApplicationContext(),total.toString()+" euro",Toast.LENGTH_LONG).show();
                            break;
                        case "USD":
                            total = montant * 0.014;
                            Toast.makeText(getApplicationContext(),total.toString() + "$",Toast.LENGTH_LONG).show();
                            break;
                        case "YEN":
                            total = montant * 12.9;
                            Toast.makeText(getApplicationContext(),total.toString() + "yen",Toast.LENGTH_LONG).show();
                            break;
                        default:
                            Toast.makeText(getApplicationContext(),"You cant convert from MAD to MAD",Toast.LENGTH_LONG).show();
                    }
                }else if (s1.getSelectedItem().toString() == "EURO"){
                    switch(s2.getSelectedItem().toString()) {
                        case "MAD":
                            total = montant * 11.09;
                            Toast.makeText(getApplicationContext(),total.toString() + "dh",Toast.LENGTH_LONG).show();
                            break;
                        case "USD":
                            total = montant * 1.06;
                            Toast.makeText(getApplicationContext(),total.toString() + "$",Toast.LENGTH_LONG).show();
                            break;
                        case "YEN":
                            total = montant * 143.7;
                            Toast.makeText(getApplicationContext(),total.toString() + "yen",Toast.LENGTH_LONG).show();
                            break;
                        default:
                            Toast.makeText(getApplicationContext(),"You cant convert from EURO to EURO",Toast.LENGTH_LONG).show();
                    }
                }
                else if (s1.getSelectedItem().toString() == "USD"){
                    switch(s2.getSelectedItem().toString()) {
                        case "MAD":
                            total = montant * 10.4;
                            Toast.makeText(getApplicationContext(),total.toString() + "dh",Toast.LENGTH_LONG).show();
                            break;
                        case "EURO":
                            total = montant * 0.93;
                            Toast.makeText(getApplicationContext(),total.toString() + "euro",Toast.LENGTH_LONG).show();
                            break;
                        case "YEN":
                            total = montant * 134.7;
                            Toast.makeText(getApplicationContext(),total.toString() + "yen",Toast.LENGTH_LONG).show();
                            break;
                        default:
                            Toast.makeText(getApplicationContext(),"You cant convert from USD to USD",Toast.LENGTH_LONG).show();
                    }
                }
                else if (s1.getSelectedItem().toString() == "YEN"){
                    switch(s2.getSelectedItem().toString()) {
                        case "MAD":
                            total = montant * 0.077;
                            Toast.makeText(getApplicationContext(),total.toString() + "dh",Toast.LENGTH_LONG).show();
                            break;
                        case "EURO":
                            total = montant * 0.0069;
                            Toast.makeText(getApplicationContext(),total.toString() + "euro",Toast.LENGTH_LONG).show();
                            break;
                        case "USD":
                            total = montant * 0.007;
                            Toast.makeText(getApplicationContext(),total.toString() + "$",Toast.LENGTH_LONG).show();
                            break;
                        default:
                            Toast.makeText(getApplicationContext(),"You cant convert from USD to USD",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}