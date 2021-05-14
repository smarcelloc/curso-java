package basico;

public class javadoc {
    
    /**
     * Nome da pessoa
     * 
     * Atenção: atributos privados são ignorados na ferramenta de gerar DOC.
     * Conhecidos por DOCKETS
     */
    private String nome;
    
    /**
     * Retorna o nome da pessoa
     * 
     * @return nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Alterar o nome da pessoa
     * 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    /**
     * Verificar se é a mesma pessoa pelo seu nome
     * 
     * @param nome 
     * @return 1 (sim) / 0 (não) / -1 Erro
     */
    public byte mesmaPessoa(String nome){
        try {
           return (byte) (this.nome.equals(nome) ? 1 : 0);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }
}
