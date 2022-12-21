
package modelos;

import javax.persistence.*;

/**
 *
 * @author Daniel Lima & Kim Costa
 */
@Embeddable
public class Parametro {
    
    private Double valorKmRodado;

    public Double getValorKmRodado() {
        return valorKmRodado;
    }

    public void setValorKmRodado(Double valorKmRodado) {
        this.valorKmRodado = valorKmRodado;
    }
    
}
