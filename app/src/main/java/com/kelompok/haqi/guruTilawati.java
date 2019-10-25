package com.kelompok.haqi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class guruTilawati extends AppCompatActivity {
    ImageButton guruFatima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru_tilawati);

        guruFatima = findViewById(R.id.guru1);

        guruFatima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guruTilawati.this,pesan.class);
                guruTilawati.this.startActivity(intent);
            }
        });
    }
}
