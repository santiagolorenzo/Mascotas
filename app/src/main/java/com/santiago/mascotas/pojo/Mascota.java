package com.santiago.mascotas.pojo;

public class Mascota {
    String nombre;
    int rating;
    int foto;
    public Mascota(int foto, String nombre) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int raiting) {
        this.rating = raiting;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
