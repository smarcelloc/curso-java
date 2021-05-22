package poo.exerciciofinal;

public class Lutador implements LutadorInterface{

    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Double peso;
    private Double altura;
    private CategoriaLutadorEnum categoria;
    private Integer vitoria;
    private Integer derrota;
    private Integer empate;
    
    
    /* CONSTANTES */
    private final Double PESOMINIMO = 52.2;
    private final Double PESOLEVE = 70.3;
    private final Double PESOMEDIO = 83.9;
    private final Double PESOPESADO = 120.2;

    /* Construtor */
    public Lutador() {}

    public Lutador(String nome, String nacionalidade, Integer idade, Double peso, Double altura, Integer vitoria, Integer derrota, Integer empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
    }

    /* Métodos especiais (GET / SET) */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public Integer getVitoria() {
        return vitoria;
    }

    public void setVitoria(Integer vitoria) {
        this.vitoria = vitoria;
    }

    public Integer getDerrota() {
        return derrota;
    }

    public void setDerrota(Integer derrota) {
        this.derrota = derrota;
    }

    public Integer getEmpate() {
        return empate;
    }

    public void setEmpate(Integer empate) {
        this.empate = empate;
    }

    public CategoriaLutadorEnum getCategoria() {
        return categoria;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    
    
    /* Outros Métodos Públicos */

    @Override
    public void apresentar() {
        System.out.println("-------------------------------------------------");
        System.out.println("Lutador: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println(this.idade + " anos");
        System.out.println(this.altura + "m de altura");
        System.out.println("Pesando: " + this.peso + "Kg");
        System.out.println("Categoria: " + this.categoria.getValor());
        System.out.println("Ganhou: " + this.vitoria);
        System.out.println("Perdeu: " + this.derrota);
        System.out.println("Empate: " + this.empate);
        System.out.println("-------------------------------------------------");
    }

    @Override
    public void status() {
        System.out.println("-------------------------------------------------");
        System.out.println("Lutador: " + this.nome);
        System.out.println("Categoria: " + this.categoria.getValor());
        System.out.println("Ganhou: " + this.vitoria);
        System.out.println("Perdeu: " + this.derrota);
        System.out.println("Empate: " + this.empate);
        System.out.println("-------------------------------------------------");
    }

    @Override
    public void ganharLuta() {
        this.setVitoria(++this.vitoria);
    }

    @Override
    public void perderLuta() {
        this.setDerrota(++this.derrota);
    }

    @Override
    public void empateLuta() {
        this.setEmpate(++this.empate);
    }
    
    /* Método Privado */
    private void setCategoria(){
        if(this.peso >= PESOMINIMO && this.peso <= PESOLEVE)
            this.categoria = CategoriaLutadorEnum.LEVE;
        else if(this.peso <= PESOMEDIO)
            this.categoria = CategoriaLutadorEnum.MEDIO;
        else if(this.peso <= PESOPESADO)
            this.categoria = CategoriaLutadorEnum.PESADO;
        else
            this.categoria = CategoriaLutadorEnum.INVALIDA;
    }
}
