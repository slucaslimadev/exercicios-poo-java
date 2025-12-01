public class Carro {
    private String marca; // O exercício pedia marca, mas 'nome' funciona também
    private String modelo;
    private int ano;      // 1. ADICIONADO: O atributo para guardar o valor

    // 2. CONSTRUTOR: Obriga a passar os dados ao criar o objeto
    public Carro(String marca, String modelo, int anoInicial) {
        this.marca = marca;
        this.modelo = modelo;
        // DICA DE OURO: Chamamos o setAno aqui dentro para aproveitar a validação!
        this.setAno(anoInicial); 
    }

    // Getters e Setters normais para marca/modelo...
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    // 3. O SETTER "INTELIGENTE"
    // Ele substitui o seu método "validarCarro"
    public void setAno(int ano) {
        if (ano < 1886) {
            System.out.println("Erro: O ano " + ano + " é inválido (antes de 1886).");
            // Note que aqui eu NÃO salvo o valor no this.ano
        } else {
            this.ano = ano; // AQUI A MÁGICA ACONTECE: Salvamos o valor!
            System.out.println("Ano cadastrado com sucesso: " + this.ano);
        }
    }
    
    // Getter para ler o ano depois
    public int getAno() {
        return ano;
    }
}