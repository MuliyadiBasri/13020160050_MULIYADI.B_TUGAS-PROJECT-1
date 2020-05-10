package com.example.tugasproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText a,t;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (EditText)findViewById(R.id.txt_alas);
        t = (EditText)findViewById(R.id.txt_tinggi);
        hitung = (Button) findViewById(R.id.button);
        hasil = (TextView) findViewById(R.id.txt_hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.length()==0 && t.length()==0){
                    Toast.makeText(getApplication(),"Alas Tinggi Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else if(t.length()==0){
                    Toast.makeText(getApplication(),"Tinggi Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else if(a.length()==0){
                    Toast.makeText(getApplication(),"Alas Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else{
                    String isialas = a.getText().toString();
                    String isitinggi = t.getText().toString();
                    double a = Double.parseDouble(isialas);
                    double t = Double.parseDouble(isitinggi);
                    double hs = LuasSegitiga(a,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasSegitiga(double a, double t){return a*t/3;}
}
