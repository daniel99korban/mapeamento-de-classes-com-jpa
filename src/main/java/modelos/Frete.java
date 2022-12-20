
package modelos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Daniel Lima & Kim Costa
 */
@Entity
public class Frete implements EntidadeBase{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false)
    private String codigo;
    
    private Double valor;
    
    @Column(nullable = false)
    private String numeroNotaFiscal;
    
    @ManyToOne
    @JoinColumn(name = "veiculo_id", nullable = false)
    private Veiculo veiculo;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
    
    @OneToMany(mappedBy = "frete")
    private List<ItemFrete> itens = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "categoria_frete_id", nullable = false)
    private CategoriaFrete categoriaFrete;
    
    private Parametro parametro;
    
    @ManyToOne
    @JoinColumn(name = "cidade_origem_id", nullable = false)
    private Cidade cidadeOrigem;
    
    @ManyToOne
    @JoinColumn(name = "cidade_destino_id", nullable = false)
    @Column(nullable = false)
    private Cidade cidadeDestino;

    public Frete(String codigo, Double valor, String numeroNotaFiscal, Parametro parametro) {
        this.codigo = codigo;
        this.valor = valor;
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.parametro = parametro;
    }

    public Frete() {}
    
    public Parametro getParametro() {
        return parametro;
    }

    public void setParametro(Parametro parametro) {
        this.parametro = parametro;
    }

    
    public void calcularFrete(){
        // código aqui
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void addItemFrete(ItemFrete itemFrete){
        this.itens.add(itemFrete);
    }

    public CategoriaFrete getCategoriaFrete() {
        return categoriaFrete;
    }

    public Cidade getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(Cidade cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public Cidade getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(Cidade cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public void setCategoriaFrete(CategoriaFrete categoriaFrete) {
        this.categoriaFrete = categoriaFrete;
    }    
    
}
