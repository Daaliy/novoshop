package com.sitenovoshop.novoshop.models;

public class Product {
    private int id;
    private String name;
    private String tipo;
    private double preco;

    public Product(int id, String name, String tipo, double preco) {
        this.id = id;
        this.name = name;
        this.tipo = tipo;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                '}';
    }
}
