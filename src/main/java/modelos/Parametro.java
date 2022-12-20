
package modelos;

import javax.persistence.*;

/**
 *
 * @author Daniel Lima & Kim Costa
 */
@Entity
public class Parametro implements EntidadeBase{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Double valorKmRodado;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorKmRodado() {
        return valorKmRodado;
    }

    public void setValorKmRodado(Double valorKmRodado) {
        this.valorKmRodado = valorKmRodado;
    }
    
}
