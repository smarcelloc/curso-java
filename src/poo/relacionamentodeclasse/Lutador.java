package poo.relacionamentodeclasse;

public class Lutador implements LutadorInterface {
  private String nome;
  private String nacionalidade;
  private Short idade;
  private Float peso;
  private Float altura;
  private CategoriaEnum categoria;
  private Integer vitoria;
  private Integer derrota;
  private Integer empate;

  public Lutador() {
  }

  public Lutador(String nome, String nacionalidade, Short idade, Float peso, Float altura, CategoriaEnum categoria,
      Integer vitoria, Integer derrota, Integer empate) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
    this.categoria = categoria;
    this.vitoria = vitoria;
    this.derrota = derrota;
    this.empate = empate;
  }

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

  public Short getIdade() {
    return idade;
  }

  public void setIdade(Short idade) {
    this.idade = idade;
  }

  public Float getPeso() {
    return peso;
  }

  public void setPeso(Float peso) {
    this.peso = peso;
  }

  public Float getAltura() {
    return altura;
  }

  public void setAltura(Float altura) {
    this.altura = altura;
  }

  public CategoriaEnum getCategoria() {
    return categoria;
  }

  public void setCategoria(CategoriaEnum categoria) {
    this.categoria = categoria;
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

  @Override
  public String toString() {
    return "Lutador [altura=" + altura + ", categoria=" + categoria + ", derrota=" + derrota + ", empate=" + empate
        + ", idade=" + idade + ", nacionalidade=" + nacionalidade + ", nome=" + nome + ", peso=" + peso + ", vitoria="
        + vitoria + "]";
  }

  @Override
  public void apresentar() {
    System.out.println(this.toString());
  }

  @Override
  public void ganharLuta() {
    this.vitoria++;
  }

  @Override
  public void perderLuta() {
    this.derrota++;
  }

  @Override
  public void empatarLuta() {
    this.empate++;
  }

}
