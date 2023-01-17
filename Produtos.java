
package componentes;

/**
 *
 * @author Adm
 */
public class Produtos {
    Integer id;
    String nome;
    Integer preco;
    String descricao;
    String local;
    
    public Integer getId() {
        return id;
    }
    public String getNome() { 
        return nome;
    } 
    public Integer getPreco() { 
        return preco;
    }  
    public String getDescricao() {
        return descricao;
    }
    
    public void setId(Integer id) {
        this.id = id;
    } 
    public void setNome(String nome) { 
        this.nome = nome;
    } 
    public void setPreco(Integer preco) { 
        this.preco = preco;
    }     
    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }
}
