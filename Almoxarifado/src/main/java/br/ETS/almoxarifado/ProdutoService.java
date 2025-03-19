package Almoxarifado.src.main.java.br.ETS.almoxarifado;

import java.util.ArrayList;

public class ProdutoService {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarNovoProduto(DadosProduto dadosProduto) {
        var produto = new Produto(dadosProduto);
    }
}