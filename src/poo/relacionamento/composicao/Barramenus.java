package poo.relacionamento.composicao;

public class Barramenus {
    private Integer id;
    private String menus;
    private Janela janela;
    
    /* DEVE INCLUIR ISSO
       DEVE EXCLUIR JANELA TMB.
    */
    public void excluir(){
        this.id = null;
        this.menus = null;
        this.janela = null;
    }
}
