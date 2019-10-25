package com.kelompok.haqi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class metodeIqra extends AppCompatActivity {
    Button guruIqra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_iqra);

        guruIqra = (Button) findViewById(R.id.pilihguru);

        guruIqra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(metodeIqra.this,guruIqra.class);
                metodeIqra.this.startActivity(intent);
            }
        });
    }
}
