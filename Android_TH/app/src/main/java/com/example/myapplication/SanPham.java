package com.example.myapplication;

public class SanPham {
    private int id;
    private String TenSP;
    private String TenShop;

    public SanPham(int id, String tenSP, String tenShop) {
        this.id = id;
        TenSP = tenSP;
        TenShop = tenShop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public String getTenShop() {
        return TenShop;
    }

    public void setTenShop(String tenShop) {
        TenShop = tenShop;
    }
}
