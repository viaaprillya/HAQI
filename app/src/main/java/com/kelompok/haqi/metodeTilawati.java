package com.kelompok.haqi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class metodeTilawati extends AppCompatActivity {
    Button guruTilawati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_tilawati);

        guruTilawati = (Button) findViewById(R.id.pilihguru);

        guruTilawati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(metodeTilawati.this,guruTilawati.class);
                metodeTilawati.this.startActivity(intent);
            }
        });
    }
}
