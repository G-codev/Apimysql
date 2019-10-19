package com.gustiramadhan.apidb;

import java.util.ArrayList;

public class PegawaiResult {
    private ArrayList<Pegawai> result;

    public PegawaiResult(ArrayList<Pegawai> pegawai) {
        this.result = pegawai;
    }

    public ArrayList<Pegawai> getPegawai() {
        return result;
    }
}
