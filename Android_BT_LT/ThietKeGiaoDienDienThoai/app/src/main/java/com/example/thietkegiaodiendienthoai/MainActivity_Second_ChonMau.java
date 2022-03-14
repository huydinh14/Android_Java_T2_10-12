package com.example.thietkegiaodiendienthoai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity_Second_ChonMau extends AppCompatActivity {
    ImageView imgXanh, imgDo, imgDen, imgTrang, imgAnhDT;
    Button btnXong;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second_chon_mau);

        imgXanh = findViewById(R.id.imgTrang);
        imgDo = findViewById(R.id.imgDo);
        imgDen = findViewById(R.id.imgDen);
        imgTrang = findViewById(R.id.imgXanh);
        imgAnhDT = findViewById(R.id.imgDienThoai);
        btnXong = findViewById(R.id.btnXong);

        imgXanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnhDT.setImageResource(R.drawable.vsblue);
                index = R.drawable.vsblue;
            }
        });

        imgDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnhDT.setImageResource(R.drawable.vsblack);
                index = R.drawable.vsblack;
            }
        });

        imgDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnhDT.setImageResource(R.drawable.vsred);
                index = R.drawable.vsred;
            }
        });

        imgTrang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnhDT.setImageResource(R.drawable.vsbac);
                index = R.drawable.vsbac;
            }
        });

        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("index",index);
                Log.d("alo", index+"");
                finish();
            }
        });
    }
}