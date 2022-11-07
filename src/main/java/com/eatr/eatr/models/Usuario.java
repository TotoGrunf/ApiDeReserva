package com.eatr.eatr.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String NyA, TelNum;
    private Boolean Seña;

    public Usuario() {
    }

    public Usuario(long id, String nyA, String telNum, Boolean seña) {
        this.id = id;
        this.NyA = nyA;
        this.TelNum = telNum;
        this.Seña = seña;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNyA() {
        return NyA;
    }

    public void setNyA(String nyA) {
        NyA = nyA;
    }

    public String getTelNum() {
        return TelNum;
    }

    public void setTelNum(String telNum) {
        TelNum = telNum;
    }

    public Boolean getSeña() {
        return Seña;
    }

    public void setSeña(Boolean seña) {
        Seña = seña;
    }
}
