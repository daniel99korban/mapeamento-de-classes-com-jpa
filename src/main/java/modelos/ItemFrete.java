
package modelos;

import javax.persistence.*;

/**
 *
 * @author Daniel Lima & Kim Costa
 */
@Entity
public class ItemFrete implements EntidadeBase{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String descricao;
    private Double peso;
    
    // chave estrangeira
    @ManyToOne
    @JoinColumn(name = "frete_id", nullable = false)
    private Frete frete;

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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
    
}
