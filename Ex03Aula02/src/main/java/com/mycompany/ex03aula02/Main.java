
package com.mycompany.ex03aula02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        
        System.out.println("Digite o nome:");
        func1.setNome(input.nextLine());
        
        System.out.println("Digite o sobrenome:");
        func1.setSobrenome(input.nextLine());
        
        System.out.println("Digite o salario:");
        func1.setSalario(input.nextFloat());
        
        input.nextLine();
        
        System.out.println("Digite o nome:");
        func2.setNome(input.nextLine());
        
        System.out.println("Digite o sobrenome:");
        func2.setSobrenome(input.nextLine());
        
        System.out.println("Digite o salario:");
        func2.setSalario(input.nextFloat());
        
        input.nextLine();
        
        System.out.println("Lista de Funcionários: ");
        System.out.println("| Nome: " + func1.getNome() + " " + func1.getSobrenome() + " | Salario: " + func1.getSalario() + " | Salario anual: " + func1.salarioAnual() + " |");
        System.out.println("| Nome: " + func2.getNome() + " " + func2.getSobrenome() + " | Salario: " + func2.getSalario() + " | Salario anual: " + func2.salarioAnual() + " |");
        
        System.out.println("Gostaria de dar um aumento aos funcionarios (s or n)");
        String aumento = input.nextLine();
        
        if ("s".equals(aumento)) {
            float novoSalario = func1.getSalario() * (float)1.1;
            
            System.out.println(novoSalario);
            
            func1.setSalario(novoSalario);
            
            novoSalario = func2.getSalario() * (float)1.1;
            func2.setSalario(novoSalario);
        }
        
        System.out.println("| Nome: " + func1.getNome() + " " + func1.getSobrenome() + " | Salario: " + func1.getSalario() + " | Salario anual: " + func1.salarioAnual() + " |");
        System.out.println("| Nome: " + func2.getNome() + " " + func2.getSobrenome() + " | Salario: " + func2.getSalario() + " | Salario anual: " + func2.salarioAnual() + " |");
    }
}
