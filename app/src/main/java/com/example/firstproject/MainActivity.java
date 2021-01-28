package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public ImageView img1;
    public int jumlah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txthw = (TextView) findViewById(R.id.tv_hw);
        TextView txtnama = (TextView) findViewById(R.id.tv_nama);
        TextView txtalamat = (TextView) findViewById(R.id.tv_alamat);
        Button btnMove = findViewById(R.id.btn_pindah);

        txtnama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda menekan Tulisan" + txtnama.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        txtalamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda menekan Tulisan alamat ",
                        Toast.LENGTH_SHORT).show();
            }
        });
        txthw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlah++;
                Toast.makeText(MainActivity.this, "Anda menekan sebanyak !! " + jumlah + "kali",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nama_key", txtnama.getText());
                startActivity(intent);
                finish();
//               onDestroy();
            }
        });

    }
}