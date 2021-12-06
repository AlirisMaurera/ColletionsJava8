package br.com.alirismaurera.leitura.testesescrita;


import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {


        FileOutputStream file = new FileOutputStream("Prova-arquivo2.txt");
        OutputStreamWriter sr =new OutputStreamWriter(file);
        BufferedWriter br = new BufferedWriter(sr);

      br.write("Hola aliris Maurera");
      br.newLine();
      br.newLine();
      br.write("Hola sebastian");

        br.close();

    }
}
