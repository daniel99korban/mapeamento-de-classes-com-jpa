
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author danie
 */
public class GerenteEntidade {
    
    public static EntityManager getGerenteDeEntidade(){
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("AtividadeJPA_HIBERNATEParte1");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }
    
}
