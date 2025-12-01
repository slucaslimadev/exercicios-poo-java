public class Calculadora {
    public void somar(double numero1, double numero2){
        double calcularSoma = numero1 + numero2;
        System.out.println("A soma dos números: "+numero1+" + " + numero2+" = "+ calcularSoma);
    }
    public void subtrair(double numero1, double numero2){
        double calcularSubtrair = numero1 - numero2;
        System.out.println("A subtração dos números: "+numero1+" - " + numero2+" = "+ calcularSubtrair);
    }
    public void multiplicar(double numero1, double numero2){
        double calcularMultiplicar = numero1 * numero2;
        System.out.println("A multiplicação dos números: "+numero1+" * " + numero2+" = "+ calcularMultiplicar);
    }
    public void dividir(double numero1, double numero2){
        double calcularDividir = numero1 / numero2;
        System.out.println("A divisão dos números: "+numero1+" / " + numero2+" = "+ calcularDividir);
    }
}
