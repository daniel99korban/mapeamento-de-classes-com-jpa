package repositorio;


import javax.persistence.EntityManager;
import java.util.Objects;
import modelos.EntidadeBase;

class DAOGenerico<T extends EntidadeBase> {

    private final EntityManager manager;

    public DAOGenerico(EntityManager manager) {
        this.manager = manager;
    }

    T buscaPorId(Class<T> classe, Integer id) {
        return manager.find(classe, id);
    }

    T salvaOuAtualiza(T t) {
        if( Objects.isNull(t.getId()) )
             this.manager.persist(t);
        else
            t = this.manager.merge(t);
        return t;
    }

    void remove(T t) {
        manager.remove(t);
        manager.flush();
    }
}