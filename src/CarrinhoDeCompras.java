import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras () {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem (String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }
    public void removerItem (String nome){
    List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : itemList){
            if (i.getnome().equalsIgnoreCase(nome)){
        itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }
    public double calcularValorTotal(){
        //calcula e retorna o valor total do carrinho
    double valorTotal = 0.0;
    for (Item item : itemList){
       double valorItem = item.getPreco() * item.getQuantidade();
       valorTotal += valorItem; //valorTotal = valorTotal + valorItem
    }
    return valorTotal;
    }

    public void exibirItens(){
        if(itemList.isEmpty()) {
            System.out.println(this.itemList);
        }
        else{
            System.out.println("a lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Banana", 7, 2);
        carrinho.adicionarItem("pasta de dentes", 10, 1);

        System.out.println("valor total do carrinho: " + carrinho.calcularValorTotal());
    }
}

