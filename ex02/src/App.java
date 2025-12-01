public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria minhaConta = new ContaBancaria();

        //conta.setSaldo();
        minhaConta.depositar(1200);
        minhaConta.sacar(1300);

        minhaConta.sacar(1000);
        

    }
}
