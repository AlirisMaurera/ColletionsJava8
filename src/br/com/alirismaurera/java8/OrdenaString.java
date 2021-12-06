package br.com.alirismaurera.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Aliris Maurera");
        palavras.add("Sebastian Rivero");
        palavras.add("Franlis Rivero");
        palavras.add("Franklin Villalba");

        System.out.println(palavras);
//        System.out.println();
//        Collections.sort(palavras, new comparadorDeTamanho());
//        System.out.println(palavras);
//        System.out.println();
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.forEach(p -> System.out.println(p));
//        System.out.println(palavras);

        palavras.sort((Comparator.comparing(s -> s.length())));
    }
}

class comparadorDeTamanho implements Comparator<String>{

    @Override
    public int compare(String palavra1, String palavra2) {
       if (palavra1.length() < palavra2.length()){
           return  -1;
       }
        if (palavra1.length() > palavra2.length()){
            return  1;
        }
       return 0;
    }
}
