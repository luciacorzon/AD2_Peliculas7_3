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
    }
}