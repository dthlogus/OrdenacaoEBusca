package controller;

import busca.Busca;
import model.Ordenacao;
import service.OrdenadorNumero;

public class OrdenacaoController {

    private OrdenadorNumero ordenadorNumero;
    private Busca busca = new Busca();

    public OrdenacaoController(OrdenadorNumero ordenadorNumero){this.ordenadorNumero = ordenadorNumero;}

    public Ordenacao ordencaoBubble(Ordenacao ordenacao){
        ordenacao.setBuscaSequencialNano(System.nanoTime());
        ordenacao.setBuscaSequencialMili(System.currentTimeMillis());
        ordenacao.setRetornoBuscaSequencial(busca.buscaSequencial(ordenacao.getListaOrdenacao(), ordenacao.getPalavraBuscar()));
        ordenacao.setBuscaSequencialNano(System.nanoTime() - ordenacao.getBuscaSequencialNano());
        ordenacao.setBuscaSequencialMili(System.currentTimeMillis() - ordenacao.getBuscaSequencialMili());
        ordenacao.setOrdenacao(System.currentTimeMillis());
        ordenacao.setListaOrdenacao(ordenadorNumero.ordenacaoViaBubble(ordenacao.getListaOrdenacao()));
        ordenacao.setOrdenacao(System.currentTimeMillis() - ordenacao.getOrdenacao());
        ordenacao.setBuscaBinariaNano(System.nanoTime());
        ordenacao.setBuscaBinariaMili(System.currentTimeMillis());
        ordenacao.setRetornoBuscaBinaria(busca.buscaBinaria(ordenacao.getListaOrdenacao(), ordenacao.getPalavraBuscar(), 0, ordenacao.getListaOrdenacao().size()));
        ordenacao.setBuscaBinariaNano(System.nanoTime() - ordenacao.getBuscaBinariaNano());
        ordenacao.setBuscaBinariaMili(System.currentTimeMillis() - ordenacao.getBuscaBinariaMili());
        return ordenacao;
    }

    public Ordenacao ordencaoInsert(Ordenacao ordenacao){
        ordenacao.setBuscaSequencialNano(System.nanoTime());
        ordenacao.setBuscaSequencialMili(System.currentTimeMillis());
        ordenacao.setRetornoBuscaSequencial(busca.buscaSequencial(ordenacao.getListaOrdenacao(), ordenacao.getPalavraBuscar()));
        ordenacao.setBuscaSequencialNano(System.nanoTime() - ordenacao.getBuscaSequencialNano());
        ordenacao.setBuscaSequencialMili(System.currentTimeMillis() - ordenacao.getBuscaSequencialMili());
        ordenacao.setOrdenacao(System.currentTimeMillis());
        ordenacao.setListaOrdenacao(ordenadorNumero.ordenacaoViaInsertion(ordenacao.getListaOrdenacao()));
        ordenacao.setOrdenacao(System.currentTimeMillis() - ordenacao.getOrdenacao());
        ordenacao.setBuscaBinariaNano(System.nanoTime());
        ordenacao.setBuscaBinariaMili(System.currentTimeMillis());
        ordenacao.setRetornoBuscaBinaria(busca.buscaBinaria(ordenacao.getListaOrdenacao(), ordenacao.getPalavraBuscar(), 0, ordenacao.getListaOrdenacao().size()));
        ordenacao.setBuscaBinariaNano(System.nanoTime() - ordenacao.getBuscaBinariaNano());
        ordenacao.setBuscaBinariaMili(System.currentTimeMillis() - ordenacao.getBuscaBinariaMili());
        return ordenacao;
    }

    public Ordenacao ordencaoMerge(Ordenacao ordenacao){
        ordenacao.setBuscaSequencialNano(System.nanoTime());
        ordenacao.setBuscaSequencialMili(System.currentTimeMillis());
        ordenacao.setRetornoBuscaSequencial(busca.buscaSequencial(ordenacao.getListaOrdenacao(), ordenacao.getPalavraBuscar()));
        ordenacao.setBuscaSequencialNano(System.nanoTime() - ordenacao.getBuscaSequencialNano());
        ordenacao.setBuscaSequencialMili(System.currentTimeMillis() - ordenacao.getBuscaSequencialMili());
        ordenacao.setOrdenacao(System.currentTimeMillis());
        ordenacao.setListaOrdenacao(ordenadorNumero.ordenacaoViaMerge(ordenacao.getListaOrdenacao().toArray(new String[0]),0, ordenacao.getListaOrdenacao().size()-1));
        ordenacao.setOrdenacao(System.currentTimeMillis() - ordenacao.getOrdenacao());
        ordenacao.setBuscaBinariaNano(System.nanoTime());
        ordenacao.setBuscaBinariaMili(System.currentTimeMillis());
        ordenacao.setRetornoBuscaBinaria(busca.buscaBinaria(ordenacao.getListaOrdenacao(), ordenacao.getPalavraBuscar(), 0, ordenacao.getListaOrdenacao().size()));
        ordenacao.setBuscaBinariaNano(System.nanoTime() - ordenacao.getBuscaBinariaNano());
        ordenacao.setBuscaBinariaMili(System.currentTimeMillis() - ordenacao.getBuscaBinariaMili());
        return ordenacao;
    }

    public Ordenacao ordencaoQuick(Ordenacao ordenacao){
        ordenacao.setBuscaSequencialNano(System.nanoTime());
        ordenacao.setBuscaSequencialMili(System.currentTimeMillis());
        ordenacao.setRetornoBuscaSequencial(busca.buscaSequencial(ordenacao.getListaOrdenacao(), ordenacao.getPalavraBuscar()));
        ordenacao.setBuscaSequencialNano(System.nanoTime() - ordenacao.getBuscaSequencialNano());
        ordenacao.setBuscaSequencialMili(System.currentTimeMillis() - ordenacao.getBuscaSequencialMili());
        ordenacao.setOrdenacao(System.currentTimeMillis());
        ordenacao.setListaOrdenacao(ordenadorNumero.ordenacaoViaQuick(ordenacao.getListaOrdenacao().toArray(new String[0]),0, ordenacao.getListaOrdenacao().size() - 1));
        ordenacao.setOrdenacao(System.currentTimeMillis() - ordenacao.getOrdenacao());
        ordenacao.setBuscaBinariaNano(System.nanoTime());
        ordenacao.setBuscaBinariaMili(System.currentTimeMillis());
        ordenacao.setRetornoBuscaBinaria(busca.buscaBinaria(ordenacao.getListaOrdenacao(), ordenacao.getPalavraBuscar(), 0, ordenacao.getListaOrdenacao().size()));
        ordenacao.setBuscaBinariaNano(System.nanoTime() - ordenacao.getBuscaBinariaNano());
        ordenacao.setBuscaBinariaMili(System.currentTimeMillis() - ordenacao.getBuscaBinariaMili());
        return ordenacao;
    }


}
