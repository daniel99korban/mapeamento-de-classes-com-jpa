
package modelos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Daniel Lima & Kim Costa
 */
@Entity
public class TipoVeiculo implements EntidadeBase{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String descricao;
    private Double pesoMaximo;
    
    @OneToMany(mappedBy = "tipoVeiculo", cascade = CascadeType.ALL)
    private List<Veiculo> veiculos = new ArrayList<>();

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(Double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }  
    
}
