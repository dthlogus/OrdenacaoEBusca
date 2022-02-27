package service;

import java.util.List;

public interface OrdenadorNumero {

    public List<String> ordenacaoViaBubble(List<String> naoOrdenado);

    public List<String> ordenacaoViaInsertion(List<String> naoOrdenado);

    public List<String> ordenacaoViaMerge(String[] palavras, Integer primeira, Integer ultima);

    public List<String> ordenacaoViaQuick(String[] palavras, int primeira, int ultima);

}
