package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {


    Scanner scanner = new Scanner(System.in);

    public void executarMenu() {

        boolean exit = false;

        while (!exit) {
            System.out.println("/*****************/");
            System.out.println("/*   Geometria   *");
            System.out.println("/*****************/");
            System.out.println("/* 1 - Circulo   *");
            System.out.println("/* 2 - Retangulo *");
            System.out.println("/* 3 - Triangulo *");
            System.out.println("/* 4 - Sair      *");
            System.out.println("/*****************/");

            System.out.println("Informe a opção desejada: ");
            int optionUser = scanner.nextInt();

            switch(optionUser) {
                case 1:

                    boolean exitCirculo = false;

                    Circulo circulo = new Circulo();

                    boolean validaCadastro = false;

                    while (!exitCirculo) {
                        System.out.println("/***************************/");
                        System.out.println("/******** Circulo  *********/");
                        System.out.println("/***************************/");
                        System.out.println("/* 1 - Cadastrar circulo   */");
                        System.out.println("/* 2 - Calcular area       */");
                        System.out.println("/* 3 - Calcular perimetro  */");
                        System.out.println("/* 4 - Sair                */");
                        System.out.println("/***************************/");
                        System.out.println("Informe a opção desejada:");

                        int optionCirculo = scanner.nextInt();

                        switch (optionCirculo) {
                            case 1:
                                validaCadastro = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastro) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um circulo: ");
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um circulo: ");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo do circulo...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA");
                        }
                    }
                    break;
                case 2:

                    boolean exitRetangulo = false;

                    Retangulo retangulo = new Retangulo();

                    boolean validaRetangulo = false;

                    while (!exitRetangulo) {
                        System.out.println("/***************************/");
                        System.out.println("/******** Retangulo  *******/");
                        System.out.println("/***************************/");
                        System.out.println("/* 1 - Cadastrar Retangulo */");
                        System.out.println("/* 2 - Calcular area       */");
                        System.out.println("/* 3 - Calcular perimetro  */");
                        System.out.println("/* 4 - Sair                */");
                        System.out.println("/***************************/");
                        System.out.println("Informe a opção desejada:");

                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo) {
                            case 1:
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                if (validaRetangulo) {
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retangulo");
                                }
                                break;
                            case 3:
                                if (validaRetangulo) {
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retangulo");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo Retangulo...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção valida! ");
                        }
                    }
                    break;
                case 3:

                    boolean exitTriangulo = false;

                    Triangulo triangulo = new Triangulo();

                    boolean validaTriangulo = false;

                    while (!exitTriangulo) {
                        System.out.println("/*************************************/");
                        System.out.println("/********    Triangulo  **************/");
                        System.out.println("/*************************************/");
                        System.out.println("/* 1 - Cadastrar triangulo           */");
                        System.out.println("/* 2 - Verificar triangulo Retangulo */");
                        System.out.println("/* 3 - Verificar Triangulo 3,4,5     */");
                        System.out.println("/* 4 - Sair                          */");
                        System.out.println("/*************************************/");
                        System.out.println("Informe a opção desejada:");

                        int optionTriangulo = scanner.nextInt();

                        switch (optionTriangulo) {
                            case 1:
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                if (validaTriangulo) {
                                    triangulo.classificarTriangulo();
                                } else {
                                    System.out.println("Cadastre um Triangulo");
                                }
                                break;
                            case 3:
                                if (validaTriangulo) {
                                    triangulo.verificaPitagoras();
                                } else {
                                    System.out.println("Cadastre um Triangulo");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo triangulo...");
                                exitTriangulo = true;
                                break;
                        }
                    }
                case 4:
                    System.out.println("SAINDO...");
                    exit = true;
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            }
        }

    }
}

