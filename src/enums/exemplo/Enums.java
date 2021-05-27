package enums.exemplo;

import java.util.Arrays;

public class Enums {

    enum Mes {
        JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO,
        JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO,
        NOVEMBRO, DEZEMBRO
    };

    public static void main(String[] args) {
        
        System.out.println("INDEX: " + Mes.ABRIL.ordinal());
        System.out.println("Nome:" + Mes.ABRIL.name());
        System.out.println("Comparador do Mês ABRIL: " + Mes.ABRIL.compareTo(Mes.ABRIL));
        
        System.out.println(Arrays.toString(Mes.values()));
        
    }
}
