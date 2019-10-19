package com.gustiramadhan.apidb;

import com.google.gson.annotations.SerializedName;

public class Pegawai {
    private String id;
    private String name;
    private String position;
    private String salary;

    public Pegawai(String idPegawai, String name, String position, String salary) {
        this.id = idPegawai;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getIdPegawai() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }
}
