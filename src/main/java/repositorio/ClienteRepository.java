
package repositorio;

import java.util.List;
import javax.persistence.EntityManager;
import modelos.Cliente;
import modelos.Dependente;

/**
 *
 * @author danie
 */
public class ClienteRepository {
    
    private final EntityManager manager;
    private final DAOGenerico<Cliente> daoGenerico;

    public ClienteRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<Cliente>(manager);
    }
    
    
    public Cliente salvaOuAtualiza(Cliente cliente) {
        return daoGenerico.salvaOuAtualiza(cliente);
    }

    public void remover(Cliente cliente)  {
        daoGenerico.remove(cliente );
    }
    
    public List<Cliente> porNome(String nome) {
        return this.manager
            .createQuery("from Cliente where upper(nome) like :nome", Cliente.class)
            .setParameter("nome", "%" + nome.toUpperCase() + "%")
            .getResultList();
    }
}
