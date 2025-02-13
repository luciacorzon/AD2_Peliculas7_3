package org.example;

import jakarta.persistence.*;

@Entity
@Access(AccessType.FIELD)
public class Ocupacion {
    @Id
    @Column(length = 50)
    private String ocupacion;
    @Column(length = 11)
    private Integer orde;

    @OneToMany(mappedBy = "ocupacion")
    @Basic(fetch = FetchType.LAZY)
    private PeliculaPersonaxe peliculaPersonaxe;

    public Ocupacion() {
    }

    public Ocupacion(String ocupacion, int orde) {
        this.ocupacion = ocupacion;
        this.orde = orde;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Integer getOrde() {
        return orde;
    }

    public void setOrde(Integer orde) {
        this.orde = orde;
    }

    @Override
    public String toString() {
        return "Ocupacion{" +
                "ocupacion='" + ocupacion + '\'' +
                ", orde=" + orde +
                '}';
    }
}
