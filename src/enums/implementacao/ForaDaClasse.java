package enums.implementacao;

enum Mes {
    JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO,
    JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO,
    NOVEMBRO, DEZEMBRO
}

public class ForaDaClasse {

    public static void main(String args[]) {
        System.out.println(Mes.ABRIL.name());
    }
}
