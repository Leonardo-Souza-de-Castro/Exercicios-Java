
package com.mycompany.ex03aula02;


public class Funcionario {
    private String nome;
    private String sobrenome;
    private float salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        if (salario < 0) {
            this.salario = 0;
        }
        else{
            this.salario = salario;
        }
        
    }
    
    public float salarioAnual(){
        return salario *12;
    }
}
