package com.michkin.CursoSpringAPI.model;

public class Usuario {
    private int id;
    private String login;
    private String password;

    public Usuario() {
    }

    public Usuario(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
