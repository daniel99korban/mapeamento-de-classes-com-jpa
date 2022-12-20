
package repositorio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelos.Frete;

/**
 *
 * @author danie
 */
public class FreteRepository {
    
    private final EntityManager manager;
    private final DAOGenerico<Frete> daoGenerico;
    
    public FreteRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<Frete>(manager);
    }
    
    public Frete porId(Integer id) {
        return daoGenerico.buscaPorId(Frete.class, id);
    }

    public Frete salvaOuAtualiza(Frete frete) {
       return daoGenerico.salvaOuAtualiza(frete);
    }

    public List<Frete> concluidos() {
        // jpql
        TypedQuery<Frete> query = manager
            .createQuery("SELECT * FROM Frete", Frete.class);
        List<Frete> results = query.getResultList();
        return results;
    }
    
}
