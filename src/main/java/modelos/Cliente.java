
package modelos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author Daniel Lima & Kim Costa
 */
@Entity
public class Cliente extends PessoaFisica{
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Frete> fretes = new ArrayList<>();

    public Cliente(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }
    
    public void addFrete(Frete frete){
        this.fretes.add(frete);
    }
    
    public void removerFrete(Frete frete){
        this.fretes.remove(frete);
    }
    
}
