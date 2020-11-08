package basico;

/**
 * @author Marcello mar***@***.com
 * @version 2.0
 * @since 1.0
 * 
 * @see {@value}
 */
public class Comments {

    private int idade;
    private String nome;

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Pegar o nome do usuário
     * 
     * @return retorna o nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Para fins de teste
     * 
     * @exception e mensagem da exceção
     * @param nome nome da pessoa
     * @return true / false
     */
    public Boolean titulo() {
        try {
            this.nome = nome;
            return true;
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
    }
}