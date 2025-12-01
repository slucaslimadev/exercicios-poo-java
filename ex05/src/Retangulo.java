public class Retangulo {
    double largura;
    double altura;
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    public void calcularArea(){
        double resultado = this.largura * this.altura;
        System.out.println("Largura: "+largura+"\nAltura: "+altura+ "\nÁrea: "+resultado);
    }
    public void calcularPerimetro(){
        double perimetro = 2 * (this.largura + this.altura);
        System.out.println("O Perímetro é: " + perimetro);
    }
}
