package com.mycompany.ex02aula02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o modelo da televisao:");
        tv1.setModelo(input.nextLine());
        
        System.out.println("Digite o preco da televisao: ");
        tv1.setPreco(input.nextFloat());
        
        System.out.println("Digite o tamanho da televisao:");
        tv1.setTamanho(input.nextFloat());
        
        System.out.println("Digite o volume da televisao:");
        tv1.setVolume(input.nextInt());
        
        System.out.println("Digite o canal da televisao:");
        tv1.setCanal(input.nextInt());
        
        System.out.println("Digite o status da televisao (se ela esta ligada ou nao):");
        tv1.setLigada(input.nextBoolean());
        
        input.nextLine();
        
        System.out.println("Valores da prmeira televisão:");
        System.out.println("| Modelo: " + tv1.getModelo() + " | Tamanho: " + tv1.getTamanho() + " | Preco: " + tv1.getPreco() + " | Volume: " + tv1.getVolume() + " | Canal: " + tv1.getCanal() + " | Status: " + tv1.getLigada() + "|");
        
        System.out.println("Digite o modelo da televisao:");
        tv2.setModelo(input.nextLine());
        
        System.out.println("Digite o preco da televisao: ");
        tv2.setPreco(input.nextFloat());
        
        System.out.println("Digite o tamanho da televisao:");
        tv2.setTamanho(input.nextFloat());
        
        System.out.println("Digite o volume da televisao:");
        tv2.setVolume(input.nextInt());
        
        System.out.println("Digite o canal da televisao:");
        tv2.setCanal(input.nextInt());
        
        System.out.println("Digite o status da televisao (se ela esta ligada ou nao):");
        tv2.setLigada(input.nextBoolean());
        
        input.nextLine();
        
        System.out.println("Valores da segunda televisão:");
        System.out.println("| Modelo: " + tv2.getModelo() + " | Tamanho: " + tv2.getTamanho() + " | Preco: " + tv2.getPreco() + " | Volume: " + tv2.getVolume() + " | Canal: " + tv2.getCanal() + " | Ligada: " + tv2.getLigada() + "|");
        
        System.out.println("Digite a modificacao no volume da primeira TV: ");
        tv1.alteraVolume(input.nextInt());
        tv1.alteraCanal();
        
        System.out.println("Digite a modificacao no volume da segunda TV: ");
        tv2.alteraVolume(input.nextInt());
        tv2.alteraCanal();
        
        System.out.println("Valores da prmeira televisão:");
        System.out.println("| Modelo: " + tv1.getModelo() + " | Tamanho: " + tv1.getTamanho() + " | Preco: " + tv1.getPreco() + " | Volume: " + tv1.getVolume() + " | Canal: " + tv1.getCanal() + " | Ligada: " + tv1.getLigada() + "|");
        
        System.out.println("Valores da segunda televisão:");
        System.out.println("| Modelo: " + tv2.getModelo() + " | Tamanho: " + tv2.getTamanho() + " | Preco: " + tv2.getPreco() + " | Volume: " + tv2.getVolume() + " | Canal: " + tv2.getCanal() + " | Ligada: " + tv2.getLigada() + "|");

        tv2.setLigada(false);
        
        System.out.println("Valores da segunda televisão:");
        System.out.println("| Modelo: " + tv2.getModelo() + " | Tamanho: " + tv2.getTamanho() + " | Preco: " + tv2.getPreco() + " | Volume: " + tv2.getVolume() + " | Canal: " + tv2.getCanal() + " | Ligada: " + tv2.getLigada() + "|");
    }
 
}
