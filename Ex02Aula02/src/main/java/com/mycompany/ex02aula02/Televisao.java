package com.mycompany.ex02aula02;


public class Televisao {
    private String modelo;
    private float preco;
    private float tamanho;
    private int volume;
    private int canal;
    private boolean ligada;
    
    public String getModelo(){
        return modelo;
    }
    
    public float getPreco(){
        return preco;
    }
    
    public float getTamanho(){
        return tamanho;
    }
    public int getVolume(){
        return volume;
    }
    public int getCanal(){
        return canal;
    }
    
    public boolean getLigada(){
        return ligada;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    
    public void alteraVolume(int novo_valor){
        if (volume < 100) {
            volume = volume + novo_valor;
        }
    }
    
    public void alteraCanal(){
        canal = canal +1;
    }
}
