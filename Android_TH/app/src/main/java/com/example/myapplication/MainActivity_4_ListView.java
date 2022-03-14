package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_4_ListView extends AppCompatActivity {
    private List<SanPham> sanPhamList;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_list_view);

        listView = findViewById(R.id.listviewSapPham);
        sanPhamList = new ArrayList<>();
        sanPhamList.add(new SanPham(1,"Cá nấu lẫu","Shop Devang"));
        sanPhamList.add(new SanPham(2,"1 KG khô gà","Shop LTD"));
        sanPhamList.add(new SanPham(3,"Xe cần cẩu","Shop Devang"));
        sanPhamList.add(new SanPham(4,"Đồ chơi mô hình","Shop Thế gới đồ chơi"));
        sanPhamList.add(new SanPham(5,"Sách lãnh đạo đơn giản","Shop Thế gới đồ chơi"));
        sanPhamList.add(new SanPham(6,"HIếu lòng con trẻ","Minh Long Shop"));
        sanPhamList.add(new SanPham(7,"Donal Trum","Minh Long Shop"));

        CustomAdapter adapter = new CustomAdapter(this,R.layout.activity_custom_list_view4, sanPhamList);
        listView.setAdapter(adapter);
    }
}