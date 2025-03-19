package Almoxarifado.src.main.java.br.ETS.almoxarifado;

public class Produto {
    private int id;
    private String produto;
    private String partNumber;
    private String divisao;
    private int quantidade;


    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDivisao() {
        return divisao;
    }

    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public Produto(DadosProduto dadosProduto){
        this.id = dadosProduto.id();
        this.produto = dadosProduto.produto();
        this.partNumber = dadosProduto.partnumber();
        this.divisao = dadosProduto.divisao();
        this.quantidade = dadosProduto.quantidade();

    }
}
