
package repositorio;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.List;
import java.util.Optional;
import modelos.Veiculo;

/**
 *
 * @author Daniel Lima & Kim Costa
 */

public class VeiculoRepository {

    private final EntityManager manager;
    private final DAOGenerico<Veiculo> daoGenerico;

    public VeiculoRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<Veiculo>(manager);

    }

    public Veiculo buscaPor(Integer id) {
        return daoGenerico.buscaPorId(Veiculo.class, id);
    }

    
    public Veiculo salvaOuAtualiza(Veiculo veiculo) {
        return daoGenerico.salvaOuAtualiza(veiculo );
    }

    public void remover(Veiculo veiculo)  {
        daoGenerico.remove(veiculo );
    }
    
    public List<Veiculo> porNome(String numeroPlaca) {
        return this.manager
            .createQuery("from Veiculo where upper(numeroPlaca) like :numeroPlaca", Veiculo.class)
            .setParameter("numeroPlaca", "%" + numeroPlaca.toUpperCase() + "%")
            .getResultList();
    }
    
}
