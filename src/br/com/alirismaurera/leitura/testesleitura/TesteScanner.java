package br.com.alirismaurera.leitura.testesleitura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner leitor = new Scanner(new File("contas.csv"));

        while (leitor.hasNextLine()){
            String linha = leitor.nextLine();
            System.out.println(linha);

           Scanner l = new Scanner(linha);
           l.useDelimiter(",");

        }

        leitor.close();
    }
}
