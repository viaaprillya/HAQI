package com.kelompok.haqi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Metode extends AppCompatActivity {
    ImageButton metodeIqra, metodeTilawati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode);

        metodeIqra = (ImageButton) findViewById(R.id.iqra);
        metodeTilawati = (ImageButton) findViewById(R.id.tilawati);

       metodeIqra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Metode.this,metodeIqra.class);
                Metode.this.startActivity(intent);
            }
        });
       metodeTilawati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Metode.this,metodeTilawati.class);
                Metode.this.startActivity(intent);
            }
        });
    }
}
