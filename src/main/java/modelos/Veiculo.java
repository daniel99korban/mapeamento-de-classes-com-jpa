
package modelos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Daniel Lima & Kim Costa
 */
@Entity
public class Veiculo implements EntidadeBase{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false)
    private String numeroPlaca;

    @ManyToOne
    @JoinColumn(name = "filial_id", nullable = false)
    private Filial filial;
    
    @ManyToOne
    @JoinColumn(name = "tipoVeiculo_id", nullable = false)
    private TipoVeiculo tipoVeiculo;
    
    @OneToMany(mappedBy = "veiculo", cascade = CascadeType.ALL)
    private List<Frete> frentes = new ArrayList<>();
    
    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    } 

    @Override
    public Integer getId() {
        return id;
    }
    
}
