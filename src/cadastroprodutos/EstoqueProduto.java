package cadastroprodutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private Map<Long, Produto> estoqueProduto;

    public EstoqueProduto(){
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        this.estoqueProduto.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(this.estoqueProduto);
    }


    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();
    estoqueProduto.adicionarProduto(1, "Melancia", 10, 5.50);
    estoqueProduto.exibirProdutos();
    }
}
