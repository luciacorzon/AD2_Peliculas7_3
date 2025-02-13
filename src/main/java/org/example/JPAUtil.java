package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

public class JPAUtil {
    public static final String PELICULASH2 = "peliculasH2";

    public static final Map<String, EntityManagerFactory> instancies = new HashMap<>();

    private JPAUtil(){

    }

    private static boolean isEntityManagerFactoryClosed(String unidadPersistencia){
        return !instancies.containsKey(unidadPersistencia) || instancies.get(unidadPersistencia) == null
                || !instancies.get(unidadPersistencia).isOpen();
    }

    public static EntityManagerFactory getEntityManagerFactory(String unidadPersistencia){
        if (isEntityManagerFactoryClosed(unidadPersistencia)){
            synchronized (JPAUtil.class){
                if (isEntityManagerFactoryClosed(unidadPersistencia)){
                    try{
                        instancies.put(unidadPersistencia, Persistence.createEntityManagerFactory(unidadPersistencia));
                    }catch (Exception e){
                        System.err.println("Erro ó crear a unidade de persistencia");
                    }
                }
            }
        }
        return instancies.get(unidadPersistencia);
    }

    public static EntityManager getEntityManager(String unidadPersistencia){
        return getEntityManagerFactory(unidadPersistencia).createEntityManager();
    }

    public static void close(String unidadPersistencia){
        if(instancies.containsKey(unidadPersistencia)){
            instancies.get(unidadPersistencia).close();
            instancies.remove(unidadPersistencia);
        }
    }
}
