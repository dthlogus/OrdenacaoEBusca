package service;

import busca.Busca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TxtServiceImpl {

    private OrdenadorNumero ordenadorNumero;
    private Long tempoOrdenacao = 0L;
    private Long tempoComBusca = 0L;
    private Long tempoComBuscaEOrdencao = 0L;
    private String retornoBuscaSequencial;
    private String retornoBuscaBinaria;
    private OrdenadorPalavras ordenadorPalavras = new OrdenadorPalavras();
    private Scanner scan = new Scanner(System.in);
    private Busca busca = new Busca();


    public TxtServiceImpl(OrdenadorNumero ordenadorNumero){
        this.ordenadorNumero = ordenadorNumero;
    }

    public void ordenadorBubble(String nomeArquivo) throws IOException {
        List<String> palavras = leitorArquivo(nomeArquivo);
        tempoOrdenacao = System.currentTimeMillis();
        List<String> palavrasOrdenadas = this.ordenadorNumero.ordenacaoViaBubble(palavras);
        tempoOrdenacao = System.currentTimeMillis() - tempoOrdenacao;
        criarArquivoTxt(palavrasOrdenadas);
        System.out.println("Qual palavra deseja buscar?");
        String palavraProcurar = scan.next();
        tempoComBusca = System.currentTimeMillis();
        retornoBuscaSequencial = busca.buscaSequencial(palavras, palavraProcurar);
        tempoComBusca = System.currentTimeMillis() - tempoComBusca;
        tempoComBuscaEOrdencao = System.currentTimeMillis();
        palavrasOrdenadas = ordenadorPalavras.ordenacaoViaBubble(palavrasOrdenadas);
        retornoBuscaBinaria = busca.buscaBinaria(palavrasOrdenadas.toArray(new String[0]), palavraProcurar,0, palavrasOrdenadas.size());
        tempoComBuscaEOrdencao = System.currentTimeMillis() - tempoComBuscaEOrdencao;
        System.out.println("Busca Sequencial: "+retornoBuscaSequencial);
        System.out.println("Busca Binaria: "+retornoBuscaBinaria);
        System.out.println("Tempo de ordenação: "+tempoOrdenacao + " milissegundos");
        System.out.println("Tempo de busca sequencial: "+tempoComBusca+ " milissegundos");
        System.out.println("Tempo somente da busca binária: "+tempoComBuscaEOrdencao+" milissegundos");
    }

    public void ordenadorInsertion(String nomeArquivo) throws IOException {
        List<String> palavras = leitorArquivo(nomeArquivo);
        tempoOrdenacao = System.currentTimeMillis();
        List<String> palavrasOrdenadas = this.ordenadorNumero.ordenacaoViaInsertion(palavras);
        tempoOrdenacao = System.currentTimeMillis() - tempoOrdenacao;
        criarArquivoTxt(palavrasOrdenadas);
        System.out.println("Qual palavra deseja buscar?");
        String palavraProcurar = scan.nextLine();
        tempoComBusca = System.currentTimeMillis();
        retornoBuscaSequencial = busca.buscaSequencial(palavras, palavraProcurar);
        tempoComBusca = System.currentTimeMillis() - tempoComBusca;
        tempoComBuscaEOrdencao = System.currentTimeMillis();
        palavrasOrdenadas = ordenadorPalavras.ordenacaoViaInsertion(palavrasOrdenadas);
        retornoBuscaBinaria = busca.buscaBinaria(palavrasOrdenadas.toArray(new String[0]), palavraProcurar,0, palavrasOrdenadas.size());
        tempoComBuscaEOrdencao = System.currentTimeMillis() - tempoComBuscaEOrdencao;
        System.out.println("Busca Sequencial: "+retornoBuscaSequencial);
        System.out.println("Busca Binaria: "+retornoBuscaBinaria);
        System.out.println("Tempo de ordenação: "+tempoOrdenacao + " milissegundos");
        System.out.println("Tempo de busca sequencial: "+tempoComBusca+ " milissegundos");
        System.out.println("Tempo somente da busca binária: "+tempoComBuscaEOrdencao+" milissegundos");
    }

    public void ordenadorMerge(String nomeArquivo) throws IOException {
        List<String> palavras = leitorArquivo(nomeArquivo);
        tempoOrdenacao = System.currentTimeMillis();
        List<String> palavrasOrdenadas = this.ordenadorNumero.ordenacaoViaMerge(palavras.toArray(new String[0]), 0,palavras.size() - 1);
        tempoOrdenacao = System.currentTimeMillis() - tempoOrdenacao;
        criarArquivoTxt(palavrasOrdenadas);
        System.out.println("Qual palavra deseja buscar?");
        String palavraProcurar = scan.nextLine();
        tempoComBusca = System.currentTimeMillis();
        retornoBuscaSequencial = busca.buscaSequencial(palavras, palavraProcurar);
        tempoComBusca = System.currentTimeMillis() - tempoComBusca;
        tempoComBuscaEOrdencao = System.currentTimeMillis();
        palavrasOrdenadas = ordenadorPalavras.ordenacaoViaMerge(palavrasOrdenadas.toArray(new String[0]), 0, palavrasOrdenadas.size() - 1);
        retornoBuscaBinaria = busca.buscaBinaria(palavrasOrdenadas.toArray(new String[0]), palavraProcurar,0, palavrasOrdenadas.size());
        tempoComBuscaEOrdencao = System.currentTimeMillis() - tempoComBuscaEOrdencao;
        System.out.println("Busca Sequencial: "+retornoBuscaSequencial);
        System.out.println("Busca Binaria: "+retornoBuscaBinaria);
        System.out.println("Tempo de ordenação: "+tempoOrdenacao + " milissegundos");
        System.out.println("Tempo de busca sequencial: "+tempoComBusca+ " milissegundos");
        System.out.println("Tempo somente da busca binária: "+tempoComBuscaEOrdencao+" milissegundos");
    }

    public void ordenadorQuick(String nomeArquivo) throws IOException {
        List<String> palavras = leitorArquivo(nomeArquivo);
        tempoOrdenacao = System.currentTimeMillis();
        List<String> palavrasOrdenadas = this.ordenadorNumero.ordenacaoViaQuick(palavras.toArray(new String[0]), 0, palavras.size() - 1);
        tempoOrdenacao = System.currentTimeMillis() - tempoOrdenacao;
        criarArquivoTxt(palavrasOrdenadas);
        System.out.println("Qual palavra deseja buscar?");
        String palavraProcurar = scan.next();
        tempoComBusca = System.currentTimeMillis();
        retornoBuscaSequencial = busca.buscaSequencial(palavras, palavraProcurar);
        tempoComBusca = System.currentTimeMillis() - tempoComBusca;
        tempoComBuscaEOrdencao = System.currentTimeMillis();
        palavrasOrdenadas = ordenadorPalavras.ordenacaoViaQuick(palavrasOrdenadas.toArray(new String[0]), 0, palavrasOrdenadas.size() - 1);
        retornoBuscaBinaria = busca.buscaBinaria(palavrasOrdenadas.toArray(new String[0]), palavraProcurar,0, palavrasOrdenadas.size());
        tempoComBuscaEOrdencao = System.currentTimeMillis() - tempoComBuscaEOrdencao;
        System.out.println("Busca Sequencial: "+retornoBuscaSequencial);
        System.out.println("Busca Binaria: "+retornoBuscaBinaria);
        System.out.println("Tempo de ordenação: "+tempoOrdenacao + " milissegundos");
        System.out.println("Tempo de busca sequencial: "+tempoComBusca+ " milissegundos");
        System.out.println("Tempo somente da busca binária: "+tempoComBuscaEOrdencao+" milissegundos");
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
                if (palavra.length() > 0) {
                    writer.write(palavra + " ___ Tamanho: " + palavra.length() + System.lineSeparator());
                }
            } catch (IOException e) {
               e.printStackTrace();
            }
        });
        writer.close();
    }


}
