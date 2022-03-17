package service;

import java.util.Arrays;
import java.util.List;

public class OrdenadorNumeroImpl implements OrdenadorNumero {

    @Override
    public List<String> ordenacaoViaBubble(List<String> naoOrdenado) {
        String[] palavras;
        palavras = naoOrdenado.toArray(new String[0]);
        for (Integer index = (palavras.length - 1); index != 1; index--) {
            for (Integer segundoIndex = 0; !segundoIndex.equals(index); segundoIndex++) {
                if (palavras[segundoIndex].length() > palavras[segundoIndex + 1].length()) {
                    String auxiliar = palavras[segundoIndex];
                    palavras[segundoIndex] = palavras[segundoIndex + 1];
                    palavras[segundoIndex + 1] = auxiliar;
                }
            }
        }
        return Arrays.asList(palavras.clone());
    }

    @Override
    public List<String> ordenacaoViaInsertion(List<String> naoOrdenado) {
        String[] palavras;
        palavras = naoOrdenado.toArray(new String[0]);
        for (Integer index = 1; index != palavras.length; index++) {
            String auxiliar = palavras[index];
            Integer segundoIndex = index;
            while (segundoIndex > 0 && (palavras[segundoIndex - 1].length() > auxiliar.length())) {
                palavras[segundoIndex] = palavras[segundoIndex - 1];
                segundoIndex--;
            }
            palavras[segundoIndex] = auxiliar;
        }
        return Arrays.asList(palavras.clone());
    }

    @Override
    public List<String> ordenacaoViaMerge(String[] palavras, Integer primeira, Integer ultima) {
        if (primeira < ultima) {
            Integer meio = (primeira + ultima) / 2;
            ordenacaoViaMerge(palavras, primeira, meio);
            ordenacaoViaMerge(palavras, meio + 1, ultima);
            merge(palavras, primeira, meio, ultima);
        }
        return Arrays.asList(palavras.clone());
    }


    private void merge(String[] palavras, Integer primeira, Integer meio, Integer ultima) {
        String[] arrayEsquerda = new String[meio - primeira + 1];
        String[] arrayDireita = new String[ultima - meio];

        for (Integer index = 0; index < arrayEsquerda.length; index++) {
            arrayEsquerda[index] = palavras[primeira + index];
        }
        for (Integer index = 0; index < arrayDireita.length; index++) {
            arrayDireita[index] = palavras[(meio + index) + 1];
        }

        Integer indexEsquerda = 0;
        Integer indexDireita = 0;

        for (Integer index = primeira; index < ultima + 1; index++) {
            if (indexEsquerda < arrayEsquerda.length && indexDireita < arrayDireita.length) {
                if (arrayEsquerda[indexEsquerda].length() < arrayDireita[indexDireita].length()) {
                    palavras[index] = arrayEsquerda[indexEsquerda];
                    indexEsquerda++;
                } else {
                    palavras[index] = arrayDireita[indexDireita];
                    indexDireita++;
                }
            } else if (indexEsquerda < arrayEsquerda.length) {
                palavras[index] = arrayEsquerda[indexEsquerda];
                indexEsquerda++;
            } else if (indexDireita < arrayDireita.length) {
                palavras[index] = arrayDireita[indexDireita];
                indexDireita++;
            }
        }
    }

    @Override
    public List<String> ordenacaoViaQuick(String[] palavras, int primeira, int ultima) {

        if (primeira < ultima){
            int index = particao(palavras, primeira, ultima);
            ordenacaoViaQuick(palavras, primeira, index - 1);
            ordenacaoViaQuick(palavras, index + 1,ultima);
        }
        return Arrays.asList(palavras.clone());
    }

    private Integer particao(String[] palavras, int primeira, int ultima) {
        String pivot = palavras[ultima];
        int i = (primeira - 1);
        for (int j = primeira; j < ultima; j++){
            if (palavras[j].length() < pivot.length()){
                i++;
                String temp = palavras[i];
                palavras[i] = palavras[j];
                palavras[j] = temp;
            }
        }
        String temp = palavras[i+1];
        palavras[i+1] = palavras[ultima];
        palavras[ultima] = temp;
        return i+1;
    }
}
