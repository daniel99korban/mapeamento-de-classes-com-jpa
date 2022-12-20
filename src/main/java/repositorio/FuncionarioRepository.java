
package repositorio;

import javax.persistence.EntityManager;
import java.util.List;
import modelos.Filial;
import modelos.Funcionario;

/**
 *
 * @author Daniel Lima & Kim Costa
 */

public class FuncionarioRepository {

    private final EntityManager manager;
    private final DAOGenerico<Funcionario> daoGenerico;

    public FuncionarioRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<Funcionario>(manager);

    }

    public Funcionario buscaPor(Integer id) {
        return daoGenerico.buscaPorId(Funcionario.class, id);
    }
    
    public Funcionario salvaOuAtualiza(Funcionario funcionario) {
        return daoGenerico.salvaOuAtualiza(funcionario);
    }

    public void remover(Funcionario funcionario)  {
        daoGenerico.remove(funcionario );
    }
    
    public List<Filial> porNome(String nome) {
        return this.manager
            .createQuery("from Funcionario where upper(nome) like :nome", Filial.class)
            .setParameter("nome", "%" + nome.toUpperCase() + "%")
            .getResultList();
    }
    
}

