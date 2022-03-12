package model;

import java.util.List;

public class Ordenacao {

    private List<String> listaOrdenacao;
    private String palavraBuscar;
    private Long ordenacao;
    private Long buscaSequencialMili;
    private Long buscaSequencialNano;
    private Long buscaBinariaMili;
    private Long buscaBinariaNano;
    private String retornoBuscaSequencial;
    private String retornoBuscaBinaria;

    public Ordenacao() {
        this.ordenacao = 0L;
        this.buscaSequencialMili = 0L;
        this.buscaBinariaMili = 0L;
        this.buscaSequencialNano = 0L;
        this.buscaBinariaNano = 0L;
    }

    public Ordenacao(List<String> listaOrdenacao, String palavraBuscar, Long ordenacao, Long buscaSequencialMili, Long buscaSequencialNano, Long buscaBinariaMili, Long buscaBinariaNano, String retornoBuscaSequencial, String retornoBuscaBinaria) {
        this.listaOrdenacao = listaOrdenacao;
        this.palavraBuscar = palavraBuscar;
        this.ordenacao = ordenacao;
        this.buscaSequencialMili = buscaSequencialMili;
        this.buscaSequencialNano = buscaSequencialNano;
        this.buscaBinariaMili = buscaBinariaMili;
        this.buscaBinariaNano = buscaBinariaNano;
        this.retornoBuscaSequencial = retornoBuscaSequencial;
        this.retornoBuscaBinaria = retornoBuscaBinaria;
    }

    public List<String> getListaOrdenacao() {
        return listaOrdenacao;
    }

    public void setListaOrdenacao(List<String> listaOrdenacao) {
        this.listaOrdenacao = listaOrdenacao;
    }

    public String getPalavraBuscar() {
        return palavraBuscar;
    }

    public void setPalavraBuscar(String palavraBuscar) {
        this.palavraBuscar = palavraBuscar;
    }

    public Long getOrdenacao() {
        return ordenacao;
    }

    public void setOrdenacao(Long ordenacao) {
        this.ordenacao = ordenacao;
    }

    public String getRetornoBuscaSequencial() {
        return retornoBuscaSequencial;
    }

    public void setRetornoBuscaSequencial(String retornoBuscaSequencial) {
        this.retornoBuscaSequencial = retornoBuscaSequencial;
    }

    public String getRetornoBuscaBinaria() {
        return retornoBuscaBinaria;
    }

    public void setRetornoBuscaBinaria(String retornoBuscaBinaria) {
        this.retornoBuscaBinaria = retornoBuscaBinaria;
    }

    public Long getBuscaSequencialMili() {
        return buscaSequencialMili;
    }

    public void setBuscaSequencialMili(Long buscaSequencialMili) {
        this.buscaSequencialMili = buscaSequencialMili;
    }

    public Long getBuscaSequencialNano() {
        return buscaSequencialNano;
    }

    public void setBuscaSequencialNano(Long buscaSequencialNano) {
        this.buscaSequencialNano = buscaSequencialNano;
    }

    public Long getBuscaBinariaMili() {
        return buscaBinariaMili;
    }

    public void setBuscaBinariaMili(Long buscaBinariaMili) {
        this.buscaBinariaMili = buscaBinariaMili;
    }

    public Long getBuscaBinariaNano() {
        return buscaBinariaNano;
    }

    public void setBuscaBinariaNano(Long buscaBinariaNano) {
        this.buscaBinariaNano = buscaBinariaNano;
    }
}
