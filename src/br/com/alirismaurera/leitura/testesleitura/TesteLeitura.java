package br.com.alirismaurera.leitura.testesleitura;


import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {


        FileInputStream file = new FileInputStream("Prova-arquivo.txt");
        InputStreamReader sr =new InputStreamReader(file);
        BufferedReader br = new BufferedReader(sr);
        String linha = br.readLine();

        while (linha != null){

            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

    }
}
