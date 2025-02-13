package org.example;

import jakarta.persistence.Column;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;

@Entity
@Access(AccessType.FIELD)
public class Ocupacion {
    @Column(length = 50)
    private String ocupacion;
    @Column(length = 11)
    private int orde;

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

    public int getOrde() {
        return orde;
    }

    public void setOrde(int orde) {
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
