package modelo;

public class Produto {

    private int produtoId;
    private String nome;
    private String precoVenda;
    private String precoCusto;
    private String unidade;
    private String categoria;

    public Produto() {
        this(-1, "", "", "", "", "");
    }

    public Produto(int produtoId, String nome, String precoVenda, String precoCusto, String unidade, String categoria) {
        setProdutoId(produtoId);
        setNome(nome);
        setPrecoVenda(precoVenda);
        setPrecoCusto(precoCusto);
        setUnidade(unidade);
        setCategoria(categoria);
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getPrecoCusto() {
        return precoCusto;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
