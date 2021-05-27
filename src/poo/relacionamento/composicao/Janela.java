package poo.relacionamento.composicao;

import java.util.ArrayList;

public class Janela {
    public String titulo;
    public double largura;
    public double altura;
    public ArrayList<Barramenus> barramenus = new ArrayList<>();
    
    public void excluir(){
        this.barramenus = new ArrayList<>(); // IRÁ EXCLUIR OS BARRAMENUS
        this.titulo = null;
        this.largura = 0;
        this.altura = 0;
    }
    
    
}
