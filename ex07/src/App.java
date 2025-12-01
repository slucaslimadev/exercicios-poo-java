public class App {
    public static void main(String[] args) throws Exception {
        double[] notasLucas = {7,8,9,10};
        Aluno a1 = new Aluno("Lucas", notasLucas);
        a1.verificarAprovacao();
    }
}
