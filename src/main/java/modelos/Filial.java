
package modelos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Daniel Lima & Kim Costa
 */
@Entity
public class Filial implements EntidadeBase{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String endereco;
    
    private String telefone;
    
    @OneToMany(mappedBy = "filial", cascade = CascadeType.ALL)
    private List<Funcionario> funcionarios = new ArrayList<>();
    
    @OneToMany(mappedBy = "filial")
    private List<Veiculo> veiculos = new ArrayList<>();

    public Filial(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    // crud funcionarios
    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    // crud veiculos
    public void addVeiculos(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }

    @Override
    public Integer getId() {
        return id;
    }
    
}
