package com.eatr.eatr.DTOS;

import com.eatr.eatr.models.Usuario;

public class UsuarioDTO {

    private long id;
    private String NyA, TelNum;
    private Boolean Seña;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.NyA = usuario.getNyA();
        this.TelNum = usuario.getTelNum();
        this.Seña = usuario.getSeña();
    }

    public long getId() {
        return id;
    }

    public String getNyA() {
        return NyA;
    }

    public String getTelNum() {
        return TelNum;
    }

    public Boolean getSeña() {
        return Seña;
    }
}
