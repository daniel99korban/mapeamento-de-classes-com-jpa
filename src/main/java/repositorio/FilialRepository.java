
package repositorio;

import javax.persistence.EntityManager;
import java.util.List;
import modelos.Filial;


/**
 *
 * @author Daniel Lima & Kim Costa
 */

public class FilialRepository {

    private final EntityManager manager;
    private final DAOGenerico<Filial> daoGenerico;

    public FilialRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<Filial>(manager);

    }

    public Filial buscaPor(Integer id) {
        return daoGenerico.buscaPorId(Filial.class, id);
    }

    
    public Filial salvaOuAtualiza(Filial filial) {
        return daoGenerico.salvaOuAtualiza(filial );
    }

    public void remover(Filial filial)  {
        daoGenerico.remove(filial );
    }
    
    public List<Filial> porNome(String nome) {
        return this.manager
                .createQuery("from Filial where upper(nome) like :nome", Filial.class)
                .setParameter("nome", "%" + nome.toUpperCase() + "%")
                .getResultList();
    }
    
}

