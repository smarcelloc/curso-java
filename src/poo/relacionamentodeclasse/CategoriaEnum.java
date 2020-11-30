package poo.relacionamentodeclasse;

public enum CategoriaEnum {
  LEVE("Leve"), MEDIO("Médio"), PESADO("Pesado");

  private String categoria;

  CategoriaEnum(String categoria) {
    this.categoria = categoria;
  }

  public String getCategoria() {
    return this.categoria;
  }
}
