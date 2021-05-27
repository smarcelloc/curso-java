package enums.implementacao;

public class DentroDaClasse {

    enum Mes {
        JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO,
        JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO,
        NOVEMBRO, DEZEMBRO;

        public String getDescricao() {
            switch (this) {
                case JANEIRO:
                    return "Janeiro";
                case FEVEREIRO:
                    return "Fevereiro";
                case MARCO:
                    return "Março";
                case ABRIL:
                    return "Abril";
                case MAIO:
                    return "Maio";
                case JUNHO:
                    return "Junho";
                case JULHO:
                    return "Julho";
                case AGOSTO:
                    return "Agosto";
                case SETEMBRO:
                    return "Setembro";
                case OUTUBRO:
                    return "Outubro";
                case NOVEMBRO:
                    return "Novembro";
                case DEZEMBRO:
                    return "Dezembro";
                default:
                    return "";
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(Mes.JANEIRO.getDescricao());
    }
}
