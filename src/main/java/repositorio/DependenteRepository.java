
package repositorio;

import java.util.List;
import javax.persistence.EntityManager;
import modelos.Dependente;

/**
 *
 * @author Daniel Lima & Kim Costa
 */
public class DependenteRepository {
    
    private final EntityManager manager;
    private final DAOGenerico<Dependente> daoGenerico;

    public DependenteRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<Dependente>(manager);
    }
    
     public Dependente salvaOuAtualiza(Dependente dependente) {
        return daoGenerico.salvaOuAtualiza(dependente);
    }

    public void remover(Dependente dependente)  {
        daoGenerico.remove(dependente );
    }
    
    public List<Dependente> porNome(String nome) {
        return this.manager
            .createQuery("from Dependente where upper(nome) like :nome", Dependente.class)
            .setParameter("nome", "%" + nome.toUpperCase() + "%")
            .getResultList();
    }
    
}
