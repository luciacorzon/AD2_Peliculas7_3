package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager(JPAUtil.PELICULASH2);
        Pelicula p = em.find(Pelicula.class, 20);

        TypedQuery<Pelicula> query = em.createNamedQuery("SELECT p FROM Pelicula p WHERE p.anoInicio IS NOT NULL;", Pelicula.class);
        List<Pelicula> peliculas = query.getResultList();

        for(Pelicula peli : peliculas){
            System.out.println(peli);
        }

        var q = em.createQuery("SELECT p FROM Pelicula p JOIN p.personaxes pp JOIN pp.personaxe per WHERE per.nomeOrdenado LIKE 'Antonio Banderas';", Pelicula.class);

        var pelis = q.getResultList();

        for (Pelicula peli2 : pelis) {
            System.out.println(peli2);
        }

        // Obtener todos los países que no tienen películas asociadas
        //TypedQuery<String> query2 = em.createQuery("SELECT p FROM Pais p JOIN Pelicula pel ON p.pais = pel.pais;", Pais.class);
    }
}