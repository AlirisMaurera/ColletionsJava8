package br.com.alirismaurera.leitura.testesleitura;


import java.io.*;

public class TesteEscritaLeitura {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("Prova-arquivo.txt");
        InputStreamReader sr =new InputStreamReader(file);
        BufferedReader br = new BufferedReader(sr);



        FileOutputStream file1 = new FileOutputStream("Prova-arquivo2.txt");
        OutputStreamWriter sr1 =new OutputStreamWriter(file1);
        BufferedWriter br1 = new BufferedWriter(sr1);

        String linha = br.readLine();

        while (linha != null){

            br1.write(linha);
            br1.newLine();
            linha = br.readLine();
        }



        br.close();
        br1.close();

    }
}
