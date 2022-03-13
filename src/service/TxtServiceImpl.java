package service;

import controller.OrdenacaoServiceImpl;
import model.Ordenacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TxtServiceImpl {

    private Scanner scan = new Scanner(System.in);
    private OrdenacaoServiceImpl ordenacaoServiceImpl;
    private Ordenacao ordenacao;

    public TxtServiceImpl(OrdenacaoServiceImpl ordenacaoServiceImpl) {
        this.ordenacaoServiceImpl = ordenacaoServiceImpl;
        ordenacao = new Ordenacao();
    }

    public void ordenadorBubble(String nomeArquivo) throws IOException {
        ordenacao.setListaOrdenacao(leitorArquivo(nomeArquivo));
        System.out.println("Qual palavra deseja buscar?");
        ordenacao.setPalavraBuscar(scan.nextLine());
        ordenacao = ordenacaoServiceImpl.ordencaoBubble(ordenacao);
        criarArquivoTxt(ordenacao.getListaOrdenacao());
        System.out.println("Busca Sequencial: " + ordenacao.getRetornoBuscaSequencial());
        System.out.println("Busca Binaria: " + ordenacao.getRetornoBuscaBinaria());
        System.out.println("Tempo de ordenação: " + ordenacao.getOrdenacao() + " milissegundos");
        if (ordenacao.getBuscaSequencialMili() > 0) {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialMili() + " milissegundos");
        } else {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialNano() + " nanosegundos");
        }
        if (ordenacao.getBuscaBinariaMili() > 0) {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaMili() + " milissegundos");
        } else {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaNano() + " nanosegundo");
        }
        System.out.println("Tempo com busca binaria e ordenação " + (ordenacao.getBuscaBinariaMili() + ordenacao.getOrdenacao()) + " milissegundos");
    }

    public void ordenadorInsertion(String nomeArquivo) throws IOException {
        ordenacao.setListaOrdenacao(leitorArquivo(nomeArquivo));
        System.out.println("Qual palavra deseja buscar?");
        ordenacao.setPalavraBuscar(scan.nextLine());
        ordenacao = ordenacaoServiceImpl.ordencaoInsert(ordenacao);
        criarArquivoTxt(ordenacao.getListaOrdenacao());
        System.out.println("Busca Sequencial: " + ordenacao.getRetornoBuscaSequencial());
        System.out.println("Busca Binaria: " + ordenacao.getRetornoBuscaBinaria());
        System.out.println("Tempo de ordenação: " + ordenacao.getOrdenacao() + " milissegundos");
        if (ordenacao.getBuscaSequencialMili() > 0) {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialMili() + " milissegundos");
        } else {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialNano() + " nanosegundos");
        }
        if (ordenacao.getBuscaBinariaMili() > 0) {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaMili() + " milissegundos");
        } else {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaNano() + " nanosegundo");
        }
        System.out.println("Tempo com busca binaria e ordenação " + (ordenacao.getBuscaBinariaMili() + ordenacao.getOrdenacao()) + " milissegundos");
    }

    public void ordenadorMerge(String nomeArquivo) throws IOException {
        ordenacao.setListaOrdenacao(leitorArquivo(nomeArquivo));
        System.out.println("Qual palavra deseja buscar?");
        ordenacao.setPalavraBuscar(scan.nextLine());
        ordenacao = ordenacaoServiceImpl.ordencaoMerge(ordenacao);
        criarArquivoTxt(ordenacao.getListaOrdenacao());
        System.out.println("Busca Sequencial: " + ordenacao.getRetornoBuscaSequencial());
        System.out.println("Busca Binaria: " + ordenacao.getRetornoBuscaBinaria());
        System.out.println("Tempo de ordenação: " + ordenacao.getOrdenacao() + " milissegundos");
        if (ordenacao.getBuscaSequencialMili() > 0) {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialMili() + " milissegundos");
        } else {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialNano() + " nanosegundos");
        }
        if (ordenacao.getBuscaBinariaMili() > 0) {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaMili() + " milissegundos");
        } else {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaNano() + " nanosegundo");
        }
        System.out.println("Tempo com busca binaria e ordenação " + (ordenacao.getBuscaBinariaMili() + ordenacao.getOrdenacao()) + " milissegundos");
    }

    public void ordenadorQuick(String nomeArquivo) throws IOException {
        ordenacao.setListaOrdenacao(leitorArquivo(nomeArquivo));
        System.out.println("Qual palavra deseja buscar?");
        ordenacao.setPalavraBuscar(scan.nextLine());
        ordenacao = ordenacaoServiceImpl.ordencaoQuick(ordenacao);
        criarArquivoTxt(ordenacao.getListaOrdenacao());
        System.out.println("Busca Sequencial: " + ordenacao.getRetornoBuscaSequencial());
        System.out.println("Busca Binaria: " + ordenacao.getRetornoBuscaBinaria());
        System.out.println("Tempo de ordenação: " + ordenacao.getOrdenacao() + " milissegundos");
        if (ordenacao.getBuscaSequencialMili() > 0) {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialMili() + " milissegundos");
        } else {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialNano() + " nanosegundos");
        }
        if (ordenacao.getBuscaBinariaMili() > 0) {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaMili() + " milissegundos");
        } else {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaNano() + " nanosegundo");
        }
        System.out.println("Tempo com busca binaria e ordenação " + (ordenacao.getBuscaBinariaMili() + ordenacao.getOrdenacao()) + " milissegundos");
    }

    public void relatorioTodos(String nomeArquivo) throws IOException {
        String retorno = "";
        ordenacao.setListaOrdenacao(leitorArquivo(nomeArquivo));
        System.out.println("Qual palavra deseja buscar?");
        ordenacao.setPalavraBuscar(scan.nextLine());
        ordenacao = ordenacaoServiceImpl.ordencaoBubble(ordenacao);
        retorno = criadorSaidaString("Bubble", retorno, ordenacao);
        ordenacao.setListaOrdenacao(leitorArquivo(nomeArquivo));
        ordenacao = ordenacaoServiceImpl.ordencaoInsert(ordenacao);
        retorno = criadorSaidaString("Insert", retorno, ordenacao);
        ordenacao.setListaOrdenacao(leitorArquivo(nomeArquivo));
        ordenacao = ordenacaoServiceImpl.ordencaoMerge(ordenacao);
        retorno = criadorSaidaString("Merge", retorno, ordenacao);
        ordenacao.setListaOrdenacao(leitorArquivo(nomeArquivo));
        ordenacao = ordenacaoServiceImpl.ordencaoQuick(ordenacao);
        retorno = criadorSaidaString("Quick", retorno, ordenacao);
        criarArquivoTxt(ordenacao.getListaOrdenacao());
        System.out.printf(retorno);
    }

    private String criadorSaidaString(String metodo, String retorno, Ordenacao ordenacao) {
        retorno = retorno.concat("#### "+metodo+" ####\n");
        retorno = retorno.concat("Busca Sequencial: "+ordenacao.getRetornoBuscaSequencial()+" \n");
        retorno = retorno.concat("Busca Binaria: "+ordenacao.getRetornoBuscaBinaria()+" \n");
        retorno = retorno.concat("Tempo de Ordenação: "+ ordenacao.getOrdenacao() + " milissegundos \n");
        if (ordenacao.getBuscaSequencialMili() > 0) {
            retorno = retorno.concat("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialMili() + " milissegundos\n");
        } else {
            retorno = retorno.concat("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialNano() + " nanosegundos\n");
        }
        if (ordenacao.getBuscaBinariaMili() > 0) {
            retorno = retorno.concat("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaMili() + " milissegundos\n");
        } else {
            retorno = retorno.concat("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaNano() + " nanosegundo\n");
        }
        retorno = retorno.concat("Tempo com busca binaria e ordenação " + (ordenacao.getBuscaBinariaMili() + ordenacao.getOrdenacao()) + " milissegundos\n\n\n");
        return retorno;
    }

    private List<String> leitorArquivo(String nomeArquivo) throws IOException {
        File arquivo = new File("src/resource/" + nomeArquivo + ".txt");
        return txtToList(arquivo);
    }

    private List<String> txtToList(File arquivo) throws FileNotFoundException {
        ArrayList<String> listPalavras = new ArrayList<>();
        Scanner scan = new Scanner(arquivo);
        while (scan.hasNext()) {
            String palavra = scan.nextLine();
            String[] arrayString = palavra.split(Pattern.quote("\\"));
            if (arrayString.length > 0 || !palavra.isEmpty()) {
                listPalavras.add(arrayString[0]);
            }
        }
        listPalavras.remove(0);
        return listPalavras;
    }

    public void criarArquivoTxt(List<String> palavras) throws IOException {
        File arquivo = new File("src/resource/saida/saida.txt");
        if (arquivo.delete()) {
            if (!arquivo.createNewFile()) {
                throw new IOException("Problema na criação do arquivo");
            }
        }
        FileWriter writer = new FileWriter(arquivo);
        palavras.forEach(palavra -> {
            try {
                writer.write(palavra + " ___ Tamanho: " + palavra.length() + System.lineSeparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
    }


}
