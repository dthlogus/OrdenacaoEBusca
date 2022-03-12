package service;

import controller.OrdenacaoController;
import model.Ordenacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TxtServiceImpl {

    private Scanner scan = new Scanner(System.in);
    private OrdenacaoController ordenacaoController;
    private Ordenacao ordenacao;

    public TxtServiceImpl(OrdenacaoController ordenacaoController) {
        this.ordenacaoController = ordenacaoController;
        ordenacao = new Ordenacao();
    }

    public void ordenadorBubble(String nomeArquivo) throws IOException {
        ordenacao.setListaOrdenacao(leitorArquivo(nomeArquivo));
        System.out.println("Qual palavra deseja buscar?");
        ordenacao.setPalavraBuscar(scan.next());
        ordenacao = ordenacaoController.ordencaoBubble(ordenacao);
        criarArquivoTxt(ordenacao.getListaOrdenacao());
        System.out.println("Busca Sequencial: " + ordenacao.getRetornoBuscaSequencial());
        System.out.println("Busca Binaria: " + ordenacao.getRetornoBuscaBinaria());
        System.out.println("Tempo de ordenação: " + ordenacao.getOrdenacao() + " milissegundos");
        if (ordenacao.getBuscaSequencialMili() > 0) {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialMili() + " milissegundos");
        } else {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialNano() + " nanosegundos");
        }
        if (ordenacao.getBuscaSequencialMili() > 0) {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaMili() + " milissegundos");
        } else {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaNano() + " nanosegundo");
        }
        System.out.println("Tempo com busca binaria e ordenação " + (ordenacao.getBuscaBinariaMili() + ordenacao.getOrdenacao()) + " milissegundos");
    }

    public void ordenadorInsertion(String nomeArquivo) throws IOException {
        ordenacao.setListaOrdenacao(leitorArquivo(nomeArquivo));
        System.out.println("Qual palavra deseja buscar?");
        ordenacao.setPalavraBuscar(scan.next());
        ordenacao = ordenacaoController.ordencaoInsert(ordenacao);
        criarArquivoTxt(ordenacao.getListaOrdenacao());
        System.out.println("Busca Sequencial: " + ordenacao.getRetornoBuscaSequencial());
        System.out.println("Busca Binaria: " + ordenacao.getRetornoBuscaBinaria());
        System.out.println("Tempo de ordenação: " + ordenacao.getOrdenacao() + " milissegundos");
        if (ordenacao.getBuscaSequencialMili() > 0) {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialMili() + " milissegundos");
        } else {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialNano() + " nanosegundos");
        }
        if (ordenacao.getBuscaSequencialMili() > 0) {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaMili() + " milissegundos");
        } else {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaNano() + " nanosegundo");
        }
        System.out.println("Tempo com busca binaria e ordenação " + (ordenacao.getBuscaBinariaMili() + ordenacao.getOrdenacao()) + " milissegundos");
    }

    public void ordenadorMerge(String nomeArquivo) throws IOException {
        ordenacao.setListaOrdenacao(leitorArquivo(nomeArquivo));
        System.out.println("Qual palavra deseja buscar?");
        ordenacao.setPalavraBuscar(scan.next());
        ordenacao = ordenacaoController.ordencaoMerge(ordenacao);
        criarArquivoTxt(ordenacao.getListaOrdenacao());
        System.out.println("Busca Sequencial: " + ordenacao.getRetornoBuscaSequencial());
        System.out.println("Busca Binaria: " + ordenacao.getRetornoBuscaBinaria());
        System.out.println("Tempo de ordenação: " + ordenacao.getOrdenacao() + " milissegundos");
        if (ordenacao.getBuscaSequencialMili() > 0) {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialMili() + " milissegundos");
        } else {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialNano() + " nanosegundos");
        }
        if (ordenacao.getBuscaSequencialMili() > 0) {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaMili() + " milissegundos");
        } else {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaNano() + " nanosegundo");
        }
        System.out.println("Tempo com busca binaria e ordenação " + (ordenacao.getBuscaBinariaMili() + ordenacao.getOrdenacao()) + " milissegundos");
    }

    public void ordenadorQuick(String nomeArquivo) throws IOException {
        ordenacao.setListaOrdenacao(leitorArquivo(nomeArquivo));
        System.out.println("Qual palavra deseja buscar?");
        ordenacao.setPalavraBuscar(scan.next());
        ordenacao = ordenacaoController.ordencaoQuick(ordenacao);
        criarArquivoTxt(ordenacao.getListaOrdenacao());
        System.out.println("Busca Sequencial: " + ordenacao.getRetornoBuscaSequencial());
        System.out.println("Busca Binaria: " + ordenacao.getRetornoBuscaBinaria());
        System.out.println("Tempo de ordenação: " + ordenacao.getOrdenacao() + " milissegundos");
        if (ordenacao.getBuscaSequencialMili() > 0) {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialMili() + " milissegundos");
        } else {
            System.out.println("Tempo de busca sequencial: " + ordenacao.getBuscaSequencialNano() + " nanosegundos");
        }
        if (ordenacao.getBuscaSequencialMili() > 0) {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaMili() + " milissegundos");
        } else {
            System.out.println("Tempo somente da busca binária: " + ordenacao.getBuscaBinariaNano() + " nanosegundo");
        }
        System.out.println("Tempo com busca binaria e ordenação " + (ordenacao.getBuscaBinariaMili() + ordenacao.getOrdenacao()) + " milissegundos");
    }

    public void relatorioTodos(String nomeArquivo) throws IOException {

    }

    private void criadorSaidaString(Long ordenacao, Long buscaSequencial, Long buscaBinaria) {

    }

    private List<String> leitorArquivo(String nomeArquivo) throws IOException {
        File arquivo = new File("src/resource/" + nomeArquivo + ".txt");
        return txtToList(arquivo);
    }

    private List<String> txtToList(File arquivo) throws FileNotFoundException {
        ArrayList<String> listPalavras = new ArrayList<>();
        Scanner scan = new Scanner(arquivo);
        while (scan.hasNext()) {
            String[] arrayString = scan.next().split("/");
            listPalavras.add(arrayString[0]);
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
