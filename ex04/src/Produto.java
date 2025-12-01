public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public void adicionarEstoque(int qtdParaAdicionar){
        this.quantidade += qtdParaAdicionar;
        System.out.println("--- ESTOQUE ATUALIZADO ---");
        System.out.println("Produto: " + this.nome); 
        System.out.println("Adicionado: " + qtdParaAdicionar);
        System.out.println("Total atual: " + this.quantidade);

    }
    public void removerEstoque(int qtdParaRemover) {
        if (qtdParaRemover > this.quantidade) {
            System.out.println("Erro: Estoque insuficiente de " + this.nome);
        } else {
            this.quantidade -= qtdParaRemover;
            System.out.println("--- ITEM REMOVIDO ---");
            System.out.println("Produto: " + this.nome);
            System.out.println("Removido: " + qtdParaRemover);
            System.out.println("Total atual: " + this.quantidade);
    }
}

}
