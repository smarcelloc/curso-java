package poo.polimorfismo.universal.parametrico;

public class Main {

    public static void main(String[] args) {
        //Par<String> tPar = new Par<String>("Ana", "José");
        Par<String> tPar = new Par<>("Ana", "José");
        
        
        System.out.println(tPar.getPrimeiro());
        System.out.println(tPar.getSegundo());
    }
}
