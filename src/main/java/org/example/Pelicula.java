package org.example;

import jakarta.persistence.Column;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Access(AccessType.FIELD)
public class Pelicula {
    @Id
    @Column(length = 10)
    private Long idPelicula;
    @Column(length = 50)
    private String musica;
    @Column(length = 125)
    private String orixinal;
    @Column(length = 125)
    private String ingles;
    @Column(length = 125)
    private String castelan;
    @Column(length = 50)
    private String xenero;
    @Column(length = 5)
    private Short anoInicio;
    @Column(length = 125)
    private String pais;
    @Column(length = 5)
    private Short duracion;
    @Column(length = 25)
    private String outrasDuracions;
    @Column(length = 12)
    private String cor;
    @Column(length = 6)
    private String son;
    @Column(length = 2)
    private String video;
    @Column(length = 2)
    private String laserDisc;
    @Lob
    private String texto;
    @Lob
    private byte[] poster;
    @Column(length = 10)
    private String revisado;

    public Pelicula() {
    }

    public Pelicula(Long idPelicula, String musica, String orixinal, String ingles, String castelan, String xenero, Short anoInicio, String pais, Short duracion, String outrasDuracions, String cor, String son, String video, String laserDisc, String texto, byte[] poster, String revisado) {
        this.idPelicula = idPelicula;
        this.musica = musica;
        this.orixinal = orixinal;
        this.ingles = ingles;
        this.castelan = castelan;
        this.xenero = xenero;
        this.anoInicio = anoInicio;
        this.pais = pais;
        this.duracion = duracion;
        this.outrasDuracions = outrasDuracions;
        this.cor = cor;
        this.son = son;
        this.video = video;
        this.laserDisc = laserDisc;
        this.texto = texto;
        this.poster = poster;
        this.revisado = revisado;
    }

    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getOrixinal() {
        return orixinal;
    }

    public void setOrixinal(String orixinal) {
        this.orixinal = orixinal;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getCastelan() {
        return castelan;
    }

    public void setCastelan(String castelan) {
        this.castelan = castelan;
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    public Short getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(Short anoInicio) {
        this.anoInicio = anoInicio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Short getDuracion() {
        return duracion;
    }

    public void setDuracion(Short duracion) {
        this.duracion = duracion;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getLaserDisc() {
        return laserDisc;
    }

    public void setLaserDisc(String laserDisc) {
        this.laserDisc = laserDisc;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getOutrasDuracions() {
        return outrasDuracions;
    }

    public void setOutrasDuracions(String outrasDuracions) {
        this.outrasDuracions = outrasDuracions;
    }

    public byte[] getPoster() {
        return poster;
    }

    public void setPoster(byte[] poster) {
        this.poster = poster;
    }

    public String getRevisado() {
        return revisado;
    }

    public void setRevisado(String revisado) {
        this.revisado = revisado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return idPelicula == pelicula.idPelicula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPelicula);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "idPelicula=" + idPelicula +
                ", musica='" + musica + '\'' +
                ", orixinal='" + orixinal + '\'' +
                ", ingles='" + ingles + '\'' +
                ", castelan='" + castelan + '\'' +
                ", xenero='" + xenero + '\'' +
                ", anoInicio=" + anoInicio +
                ", pais='" + pais + '\'' +
                ", duracion=" + duracion +
                ", outrasDuracions='" + outrasDuracions + '\'' +
                ", cor='" + cor + '\'' +
                ", son='" + son + '\'' +
                ", video='" + video + '\'' +
                ", laserDisc='" + laserDisc + '\'' +
                ", texto='" + texto + '\'' +
                ", poster=" + poster +
                ", revisado='" + revisado + '\'' +
                '}';
    }
}
