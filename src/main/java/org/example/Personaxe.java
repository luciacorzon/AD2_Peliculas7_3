package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Access(AccessType.FIELD)
public class Personaxe {
    @Id
    @Column(length = 10)
    private int idPersonaxe;
    @Column(length = 16)
    private String importancia;
    @Column(length = 125)
    private String nome;
    @Column(length = 125)
    private String nomeOrdenado;
    @Column(length = 125)
    private String nomeOrixinal;
    @Column(length = 6)
    private String sexo;
    private LocalDate dataNacemento;
    @Column(length = 125)
    private String paisNacemento;
    @Column(length = 125)
    private String cidadeNacemento;
    private LocalDate dataDefuncion;
    @Column(length = 125)
    private String paisDefuncion;
    @Column(length = 125)
    private String cidadeDefuncion;
    @Column(length = 1)
    private String estudio;
    @Column(length = 1)
    private String bio;
    @Lob
    private String texto;
    @Lob
    private String textoFilmografia;
    @Column(length = 10)
    private String revisado;

    public Personaxe() {
    }

    public Personaxe(int idPersonaxe, String importancia, String nome, String nomeOrdenado, String nomeOrixinal, String sexo, LocalDate dataNacemento, String paisNacemento, String cidadeNacemento, LocalDate dataDefuncion, String paisDefuncion, String cidadeDefuncion, String bio, String estudio, String texto, String textoFilmografia, String revisado) {
        this.idPersonaxe = idPersonaxe;
        this.importancia = importancia;
        this.nome = nome;
        this.nomeOrdenado = nomeOrdenado;
        this.nomeOrixinal = nomeOrixinal;
        this.sexo = sexo;
        this.dataNacemento = dataNacemento;
        this.paisNacemento = paisNacemento;
        this.cidadeNacemento = cidadeNacemento;
        this.dataDefuncion = dataDefuncion;
        this.paisDefuncion = paisDefuncion;
        this.cidadeDefuncion = cidadeDefuncion;
        this.bio = bio;
        this.estudio = estudio;
        this.texto = texto;
        this.textoFilmografia = textoFilmografia;
        this.revisado = revisado;
    }

    public int getIdPersonaxe() {
        return idPersonaxe;
    }

    public void setIdPersonaxe(int idPersonaxe) {
        this.idPersonaxe = idPersonaxe;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeOrdenado() {
        return nomeOrdenado;
    }

    public void setNomeOrdenado(String nomeOrdenado) {
        this.nomeOrdenado = nomeOrdenado;
    }

    public String getNomeOrixinal() {
        return nomeOrixinal;
    }

    public void setNomeOrixinal(String nomeOrixinal) {
        this.nomeOrixinal = nomeOrixinal;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(LocalDate dataNacemento) {
        this.dataNacemento = dataNacemento;
    }

    public String getPaisNacemento() {
        return paisNacemento;
    }

    public void setPaisNacemento(String paisNacemento) {
        this.paisNacemento = paisNacemento;
    }

    public String getCidadeNacemento() {
        return cidadeNacemento;
    }

    public void setCidadeNacemento(String cidadeNacemento) {
        this.cidadeNacemento = cidadeNacemento;
    }

    public LocalDate getDataDefuncion() {
        return dataDefuncion;
    }

    public void setDataDefuncion(LocalDate dataDefuncion) {
        this.dataDefuncion = dataDefuncion;
    }

    public String getPaisDefuncion() {
        return paisDefuncion;
    }

    public void setPaisDefuncion(String paisDefuncion) {
        this.paisDefuncion = paisDefuncion;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getCidadeDefuncion() {
        return cidadeDefuncion;
    }

    public void setCidadeDefuncion(String cidadeDefuncion) {
        this.cidadeDefuncion = cidadeDefuncion;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTextoFilmografia() {
        return textoFilmografia;
    }

    public void setTextoFilmografia(String textoFilmografia) {
        this.textoFilmografia = textoFilmografia;
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
        Personaxe personaxe = (Personaxe) o;
        return idPersonaxe == personaxe.idPersonaxe;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPersonaxe);
    }

    @Override
    public String toString() {
        return "Personaxe{" +
                "idPersonaxe=" + idPersonaxe +
                ", importancia='" + importancia + '\'' +
                ", nome='" + nome + '\'' +
                ", nomeOrdenado='" + nomeOrdenado + '\'' +
                ", nomeOrixinal='" + nomeOrixinal + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNacemento=" + dataNacemento +
                ", paisNacemento='" + paisNacemento + '\'' +
                ", cidadeNacemento='" + cidadeNacemento + '\'' +
                ", dataDefuncion=" + dataDefuncion +
                ", paisDefuncion='" + paisDefuncion + '\'' +
                ", cidadeDefuncion='" + cidadeDefuncion + '\'' +
                ", estudio='" + estudio + '\'' +
                ", bio='" + bio + '\'' +
                ", texto='" + texto + '\'' +
                ", textoFilmografia='" + textoFilmografia + '\'' +
                ", revisado='" + revisado + '\'' +
                '}';
    }
}
