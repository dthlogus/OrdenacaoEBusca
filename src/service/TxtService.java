package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TxtService {

    private Ordenador ordenador;
    private Long tempo = 0L;

    public TxtService(Ordenador ordenador){
        this.ordenador = ordenador;
    }

    public void LeitorArquivo(String nomeArquivo) throws IOException{
        File arquivo = new File("src/resource/"+nomeArquivo+".txt");
        List<String> ordenado = txtToList(arquivo);
        tempo = System.currentTimeMillis();
        ordenado = this.ordenador.ordenacaoViaBubble(ordenado);
        tempo = System.currentTimeMillis() - tempo;
        criarArquivoTxt(ordenado);
    }

    private List<String> txtToList(File arquivo) throws FileNotFoundException {
        ArrayList<String> listPalavras = new ArrayList<>();
        Scanner scan = new Scanner(arquivo);
        while (scan.hasNext()){
            String[] arrayString = scan.next().split("/");
            listPalavras.add(arrayString[0]);
        }
        listPalavras.remove(0);
        return listPalavras;
    }

    private void criarArquivoTxt(List<String> palavras) throws IOException {
        File arquivo = new File("src/resource/saida/saida.txt");
        if (arquivo.delete()) {
            if (!arquivo.createNewFile()){
                throw new IOException("Problema na criação do arquivo");
            }
        }
        FileWriter writer = new FileWriter(arquivo);
        palavras.forEach(palavra -> {
            try {
                writer.write(palavra+" ___ Tamanho: "+palavra.length() + System.lineSeparator());
            } catch (IOException e) {
               e.printStackTrace();
            }
        });
        writer.close();
    }
}
