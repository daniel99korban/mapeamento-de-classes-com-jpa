
package modelos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author danie
 */
@Entity
public class Cidade implements EntidadeBase{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nome;
    private String estado;
    
    @OneToMany(mappedBy = "cidadeOrigem")
    private List<Frete> fretesOrigem = new ArrayList<>();
    
    @OneToMany(mappedBy = "cidadeDestino")
    private List<Frete> fretesDestino = new ArrayList<>();
    // fazer add 
    @OneToMany(mappedBy = "origem")
    private List<Distancia> distanciasOrigem = new ArrayList<>();
    
    @OneToMany(mappedBy = "destino")
    private List<Distancia> distanciasDestino = new ArrayList<>();

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    // CRUD cidade origem e cidadade destino
    public void addfreteOrigem(Frete frete){
        this.fretesOrigem.add(frete);
    }
    
    public void addfreteDestino(Frete frete){
        this.fretesDestino.add(frete);
    }
    
}
