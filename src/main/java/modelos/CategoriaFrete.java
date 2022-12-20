
package modelos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Daniel Lima & Kim Costa
 */
@Entity
public class CategoriaFrete implements EntidadeBase{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Double desconto;
    private Double percentual;
    
    @OneToMany(mappedBy = "categoriaFrete")
    private List<Frete> fretes = new ArrayList<>();

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }
    
    public void addFrete(Frete frete){
        this.fretes.add(frete);
    }
    
}
