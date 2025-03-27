package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double ladoA;
    public double ladoB;
    public double ladoC;

    Scanner scanner = new Scanner(System.in);


    //Solicita ao usuário que digite os lados do triângulo.
    public boolean cadastrarTriangulo() {
        System.out.println("Digite o valor do lado A do triângulo:");
        this.ladoA = scanner.nextDouble();

        System.out.println("Digite o valor do lado B do triângulo:");
        this.ladoB = scanner.nextDouble();

        System.out.println("Digite o valor do lado C do triângulo:");
        this.ladoC = scanner.nextDouble();
        return true;
    }

    public void calcularArea(double ladoA, double ladoB, double ladoC){
        double s = (ladoA + ladoB + ladoC)/2;
        double area = Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
        System.out.println("A area é: " + area);

    }

    public void calcularPerimetro(double ladoA, double ladoB, double ladoC){
        double p = (ladoA + ladoB + ladoC);
        System.out.println("O perimetro é: " + p);
    }

    //Verifica se é um triangulo retangulo
    public boolean trianguloRetangulo() {
        if (Math.pow(ladoA, 2) + Math.pow(ladoB, 2) == Math.pow(ladoC, 2)) {
            return true;
        }
        if (Math.pow(ladoA, 2) + Math.pow(ladoC, 2) == Math.pow(ladoB, 2)) {
            return true;
        }
        if (Math.pow(ladoB, 2) + Math.pow(ladoC, 2) == Math.pow(ladoA, 2))
        {
            return true;
        }
        return false;
    }
    public void classificarTriangulo(){
        if (this.trianguloRetangulo()){
            System.out.println("É um triangulo retangulo !!");
        }else {
            System.out.println("Não é um Triangulo retangulo !!");
        }

    }

    public void verificaPitagoras(){
        if (this.verificarTriangulo()){
            System.out.println("É um triangulo 3 4 5 !!");
        }else {
            System.out.println("Não é um Triangulo 3 4 5 !!");
        }
    }


    //verifica se é um triangulo com os lados de medida 3 4 5
    public boolean verificarTriangulo() {
        return (ladoA == 3 && ladoB == 4 && ladoC == 5) ||
                (ladoA == 3 && ladoB == 5 && ladoC == 4) ||
                (ladoA == 4 && ladoB == 3 && ladoC == 5) ||
                (ladoA == 4 && ladoB == 5 && ladoC == 3) ||
                (ladoA == 5 && ladoB == 3 && ladoC == 4) ||
                (ladoA == 5 && ladoB == 4 && ladoC == 3);

    }
}
