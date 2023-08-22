package com.sitenovoshop.novoshop.models.userlogin;

public class User {
    private Integer id;
    private String name;
    private String estado;
    private String cpf;
    private String email;

    public User(String name, String estado, String cpf, String email) {
        this.name = name;
        this.estado = estado;
        this.cpf = cpf;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEstado() {
        return estado;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
}
