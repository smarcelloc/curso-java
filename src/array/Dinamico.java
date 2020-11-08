package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Dinamico {

  public static void run() {
    ArrayList<String> nomes = new ArrayList<String>();
    ArrayList<String> nomes02 = new ArrayList<String>();
    ArrayList<String> nomes03 = new ArrayList<String>();

    nomes.add("Marcello");
    nomes.add("Ricardo");
    nomes.add(2, "Vanessa");
    System.out.println(nomes.toString());
    System.out.println(nomes.get(1));

    nomes02 = (ArrayList<String>) nomes.clone();
    nomes02.remove("Marcello");
    System.out.println("Tamanho:" + nomes02.size());
    System.out.println(nomes02.toString());
    nomes02.set(0, "Rodrigo");
    System.out.println(nomes02.toString());

    System.out.println("Existe Rodrigo: " + nomes02.contains("Rodrigo"));
    System.out.println("Existe Lucas: " + nomes02.contains("Lucas"));
    nomes02.isEmpty();

    System.out.println("VALORES" + nomes02.toString() + " HASH:" + nomes02.hashCode());
    System.out.println("VALORES" + nomes.toString() + " HASH:" + nomes.hashCode());
    System.out.println("\n\n");
    nomes03 = (ArrayList<String>) nomes.clone();
    System.out.println("VALORES" + nomes03.toString() + " HASH:" + nomes03.hashCode());
    System.out.println("VALORES" + nomes.toString() + " HASH:" + nomes.hashCode());
    System.out.println("Index do RICARDO: " + nomes03.indexOf("Ricardo"));

    System.out.println(nomes.equals(nomes02));
    System.out.println(nomes.equals(nomes03));

    nomes.add("Ricardo");
    nomes.add("Valdenes");
    nomes.add("Kaio");

    System.out.println(nomes.toString());
    System.out.println(nomes.lastIndexOf("Ricardo"));
    System.out.println(nomes.indexOf("Ricardo"));

    List<String> subnome = nomes.subList(2, 4);
    System.out.println(subnome.toString());

    System.out.println("\n\nUso de ITERADOR GERADOR");
    Iterator<String> iNomes = nomes.iterator();

    while (iNomes.hasNext()) {
      System.out.println(iNomes.next());
    }

    System.out.println("\n\nUso de ITERADOR IMPLÍCITO");
    for (String iterador : nomes) {
      System.out.println(iterador);
    }

    System.out.println("\n\nUso de ADDALL");
    ArrayList<String> nomes04 = new ArrayList<String>();
    nomes04.add("Tiago");
    nomes04.add("Felipe");
    nomes.addAll(2, nomes04);

    for (String iterador : nomes) {
      System.out.println(iterador);
    }

    // System.out.println("\n\nUso de REMOVEALL");
    // ArrayList<String> nomes05 = new ArrayList<String>();
    // nomes05.add("Marcello");
    // nomes05.add("Ricardo");
    // nomes.removeAll(nomes05);
    // // nomes.removeAll(nomes); mesmo do nomes.clear();
    // for (String iterador : nomes) {
    // System.out.println(iterador);
    // }

    // System.out.println("\n\nUso de REMOVERALL");
    // nomes.removeIf(n -> (n.toLowerCase().charAt(0) == 'r'));
    // for (String iterador : nomes) {
    // System.out.println(iterador);
    // }

    // System.out.println("\n\nUso de RETAINALL");
    // ArrayList<String> nomes05 = new ArrayList<String>();
    // nomes05.add("Marcello");
    // nomes05.add("Ricardo");
    // nomes.retainAll(nomes05);

    // for (String iterador : nomes) {
    // System.out.println(iterador);
    // }

    System.out.println("\n\nUso em ORDER ALFABÉTICA");
    nomes.sort(null);
    for (String iterador : nomes) {
      System.out.println(iterador);
    }

    System.out.println("\n\nUso em ORDER MAIOR STRING");
    Comparator<String> comparator = new ComparadorPorTamanho();
    nomes.sort(comparator);
    for (String iterador : nomes) {
      System.out.println(iterador);
    }

    System.out.println("Testando o forEach");
    nomes.forEach(elemento -> {
      System.out.println(elemento);
    });

    System.out.println("Testando o forEach 2");
    nomes.forEach(System.out::println);

    ArrayList<String> nomesStream = (ArrayList<String>) nomes.stream();

  }

}

class ComparadorPorTamanho implements Comparator<String> {

  private int primeiroMostra = 1;
  private int segundoMostra = -1;
  private int empate = 0;

  @Override
  public int compare(String s1, String s2) {

    if (s1.length() > s2.length())
      return primeiroMostra;

    if (s1.length() < s2.length())
      return segundoMostra;

    return empate;
  }

}