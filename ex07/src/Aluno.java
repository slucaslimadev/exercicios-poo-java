
public class Aluno {
    private String nome;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Aluno(String nome, double[]notas){
        this.nome = nome;
        this.notas = notas;
    }

    private double calcularMedia(){
        double soma = 0;
        for(double nota: this.notas){
            soma+=nota;
        }
        return soma/ this.notas.length;
    }
    public void verificarAprovacao(){
        double media = this.calcularMedia();

        System.out.println("Aluno: " + this.nome);
        System.out.println("Média calculada: " + media);

        if (media >= 7) {
            System.out.println("Situação: APROVADO ✅");
        } else {
            System.out.println("Situação: REPROVADO X");
        }


    }

}
