public class App {
    public static void main(String[] args) throws Exception {
        
        Produto produto1 = new Produto("Notebook Gamer", 2000);
        produto1.adicionarEstoque(5);
        produto1.removerEstoque(1);
        
        Produto produto2 = new Produto("Headset Razer", 300);
        produto2.adicionarEstoque(10);
    }
}
