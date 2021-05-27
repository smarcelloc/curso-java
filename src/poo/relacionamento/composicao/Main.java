package poo.relacionamento.composicao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Cadastrar Janela
        Janela janela01 = new Janela();
        janela01.altura = 980;
        janela01.largura = 800;
        janela01.titulo = "Netbeans";
        
        // Cadastrar a barramenus
        ArrayList<Barramenus> _barramenus = new ArrayList<>();
        _barramenus.add(new Barramenus("File"));
        _barramenus.add(new Barramenus("Edit"));
        _barramenus.add(new Barramenus("Navigate"));
        _barramenus.add(new Barramenus("Source"));
        janela01.barramenus = _barramenus;
        
        // Exibir na tela
        System.out.println("DADOS");
        janela01.barramenus.forEach(menu -> {
            System.out.println("JANELA: " + janela01.titulo + " MENU: " + menu.nome);
        });
        
        // Excluir o TODO (a composição exige que as partes sejam toda destruída)
        // TODO: JANELA e BARRAMENTO: PARTE
        
        janela01.excluir();
        
        // Exibir o RESULTADO
        System.out.println("\nRESULTADO");
        janela01.barramenus.forEach(menu -> {
            System.out.println("JANELA: " + janela01.titulo + " MENU: " + menu.nome);
        });
        
    }
}
