
package com.mycompany.ex01aula02;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        
        System.out.println("Digite o lado 1 do primeiro retangulo:");
        int lado1 = input.nextInt();
        
        System.out.println("Digite o lado 2 do primeiro retangulo:");
        int lado2 = input.nextInt();
       
        
        ret1.setLado1(lado1);
        ret1.setLado2(lado2);
        
        System.out.println("Digite o lado 1 do segundo retangulo:");
        lado1 = input.nextInt();
        
        System.out.println("Digite o lado 2 do segundo retangulo:");
        lado2 = input.nextInt();
        
        ret2.setLado1(lado1);
        ret2.setLado2(lado2);
        
        System.out.println("Lados do retangulo 1: " + ret1.getLado1() + ", " + ret1.getLado2());
        System.out.println("Perimetro do retangulo 1: " + ret1.perimetro());
        System.out.println("Area do retangulo 1: " + ret1.area());
        
        System.out.println("Lados do retngulo 2: " + ret2.getLado1() + ", " + ret2.getLado2());
        System.out.println("Perimetro do retangulo 2: " + ret2.perimetro());
        System.out.println("Area do retangulo 2: " + ret2.perimetro());

    }
}
