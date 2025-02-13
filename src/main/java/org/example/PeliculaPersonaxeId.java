package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PeliculaPersonaxeId implements Serializable {
    @Column(name = "idPelicula")
    private Integer idPelicula;

    @Column(name = "idPersonaxe")
    private Integer idPersonaxe;

    @Column(name = "idOcupacion")
    private Integer idOcupacion;

    public PeliculaPersonaxeId() {
    }

    public PeliculaPersonaxeId(Integer idPelicula, Integer idPersonaxe, Integer idOcupacion) {
        this.idPelicula = idPelicula;
        this.idPersonaxe = idPersonaxe;
        this.idOcupacion = idOcupacion;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Integer getIdPersonaxe() {
        return idPersonaxe;
    }

    public void setIdPersonaxe(Integer idPersonaxe) {
        this.idPersonaxe = idPersonaxe;
    }

    public Integer getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(Integer idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    // Para o ID composto é esencial o EQUALS e o HASH-CODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeliculaPersonaxeId that = (PeliculaPersonaxeId) o;
        return Objects.equals(idPelicula, that.idPelicula) && Objects.equals(idPersonaxe, that.idPersonaxe) && Objects.equals(idOcupacion, that.idOcupacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPelicula, idPersonaxe, idOcupacion);
    }

    @Override
    public String toString() {
        return "PeliculaPersonaxeId{" +
                "idPelicula=" + idPelicula +
                ", idPersonaxe=" + idPersonaxe +
                ", idOcupacion=" + idOcupacion +
                '}';
    }
}


