
package modelos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author Daniel Lima & Kim Costas
 */
@Entity
public class Funcionario extends PessoaFisica{
    
    @Column(nullable = false)
    private String matricula;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Dependente> dependentes = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "filial_id", nullable = false)
    private Filial filial;
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void adiciona(Dependente dependente) {
        dependentes.add(dependente );
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }
    
    public void addDependente(Dependente dependente){
        this.dependentes.add(dependente);
    }
    
}
