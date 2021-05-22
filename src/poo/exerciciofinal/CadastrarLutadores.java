package poo.exerciciofinal;

import java.util.ArrayList;

public abstract class CadastrarLutadores {
    private static ArrayList<Lutador> lutadores = new ArrayList<>();

    public static ArrayList<Lutador> getLutadores() {
        cadastrarLutador01();
        cadastrarLutador02();
        cadastrarLutador03();
        cadastrarLutador04();
        cadastrarLutador05();
        cadastrarLutador06();
        return lutadores;
    }
    
     public static void cadastrarLutador01(){
        Lutador lutador = new Lutador();
        
        lutador.setNome("Pretty Boy");
        lutador.setNacionalidade("França");
        lutador.setIdade(34);
        lutador.setAltura(1.75);
        lutador.setPeso(68.9);
        lutador.setVitoria(11);
        lutador.setEmpate(1);
        lutador.setDerrota(2);
        
        lutadores.add(lutador);
    }
    
    public static void cadastrarLutador02(){
        Lutador lutador = new Lutador();
        
        lutador.setNome("Putscript");
        lutador.setNacionalidade("Brasil");
        lutador.setIdade(29);
        lutador.setAltura(1.68);
        lutador.setPeso(57.8);
        lutador.setVitoria(14);
        lutador.setEmpate(3);
        lutador.setDerrota(2);
        
        lutadores.add(lutador);
    }
    
    public static void cadastrarLutador03(){
        Lutador lutador = new Lutador();
        
        lutador.setNome("Snapshadow");
        lutador.setNacionalidade("EUA");
        lutador.setIdade(35);
        lutador.setAltura(1.65);
        lutador.setPeso(80.9);
        lutador.setVitoria(12);
        lutador.setEmpate(1);
        lutador.setDerrota(2);
        
        lutadores.add(lutador);
    }
    
    public static void cadastrarLutador04(){
        Lutador lutador = new Lutador();
        
        lutador.setNome("Dead Code");
        lutador.setNacionalidade("Austrália");
        lutador.setIdade(28);
        lutador.setAltura(1.93);
        lutador.setPeso(81.6);
        lutador.setVitoria(13);
        lutador.setEmpate(1);
        lutador.setDerrota(0);
        
        lutadores.add(lutador);
    }
    
    public static void cadastrarLutador05(){
        Lutador lutador = new Lutador();
        
        lutador.setNome("UF0Cobol");
        lutador.setNacionalidade("Brasil");
        lutador.setIdade(37);
        lutador.setAltura(1.70);
        lutador.setPeso(119.3);
        lutador.setVitoria(5);
        lutador.setEmpate(3);
        lutador.setDerrota(4);
        
        lutadores.add(lutador);
    }
    
    public static void cadastrarLutador06(){
        Lutador lutador = new Lutador();
        
        lutador.setNome("NerdaArt");
        lutador.setNacionalidade("EUA");
        lutador.setIdade(30);
        lutador.setAltura(1.80);
        lutador.setPeso(155.7);
        lutador.setVitoria(12);
        lutador.setEmpate(4);
        lutador.setDerrota(2);
        
        lutadores.add(lutador);
    }
}
