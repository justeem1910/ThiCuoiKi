package com.example.thicuoiki.Model;

import java.io.Serializable;

public class NhanVien implements Serializable {
    private int maNv;
    private String tenNv, date, address;

    public NhanVien(int maNv, String tenNv, String date, String address) {
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.date = date;
        this.address = address;
    }

    public NhanVien() {
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
