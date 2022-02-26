package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TxtServiceImpl {

    private Ordenador ordenador;
    private Long tempoOrdenacao = 0L;
    private Long tempoComBusca = 0L;
    private Long tempoComBuscaEOrdencao = 0L;


    public TxtServiceImpl(Ordenador ordenador){
        this.ordenador = ordenador;
    }

    public void ordenadorBubble(String nomeArquivo) throws IOException {
        List<String> palavras = leitorArquivo(nomeArquivo);
        tempoOrdenacao = System.currentTimeMillis();
        palavras = this.ordenador.ordenacaoViaBubble(palavras);
        tempoOrdenacao = System.currentTimeMillis() - tempoOrdenacao;
        System.out.println(tempoOrdenacao);
        criarArquivoTxt(palavras);
    }

    public void ordenadorInsertion(String nomeArquivo) throws IOException {
        List<String> palavras = leitorArquivo(nomeArquivo);
        tempoOrdenacao = System.currentTimeMillis();
        palavras = this.ordenador.ordenacaoViaInsertion(palavras);
        tempoOrdenacao = System.currentTimeMillis() - tempoOrdenacao;
        System.out.println(tempoOrdenacao);
        criarArquivoTxt(palavras);
    }

    public void ordenadorMerge(String nomeArquivo) throws IOException {
        List<String> palavras = leitorArquivo(nomeArquivo);
        String[] arrayPalavras = palavras.toArray(new String[0]);
        tempoOrdenacao = System.currentTimeMillis();
        palavras = this.ordenador.ordenacaoViaMerge(arrayPalavras, 0,palavras.size() - 1);
        tempoOrdenacao = System.currentTimeMillis() - tempoOrdenacao;
        System.out.println(tempoOrdenacao);
        criarArquivoTxt(palavras);
    }

    public void ordenadorQuick(String nomeArquivo) throws IOException {
        List<String> palavras = leitorArquivo(nomeArquivo);
        String[] arrayPalavras = palavras.toArray(new String[0]);
        tempoOrdenacao = System.currentTimeMillis();
        palavras = this.ordenador.ordenacaoViaQuick(arrayPalavras, 0, palavras.size() - 1);
        tempoOrdenacao = System.currentTimeMillis() - tempoOrdenacao;
        System.out.println(tempoOrdenacao);
        criarArquivoTxt(palavras);
    }


    private List<String> leitorArquivo(String nomeArquivo) throws IOException{
        File arquivo = new File("src/resource/"+nomeArquivo+".txt");
        return txtToList(arquivo);
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

    public void criarArquivoTxt(List<String> palavras) throws IOException {
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
