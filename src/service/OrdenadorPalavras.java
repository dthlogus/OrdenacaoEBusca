package service;

import java.util.Arrays;
import java.util.List;

public class OrdenadorPalavras {


    public List<String> ordenacaoViaBubble(List<String> naoOrdenado){
        String[] palavras;
        Integer progress = 0;
        char[] animationChars = new char[]{'|', '/', '-', '\\'};
        palavras = naoOrdenado.toArray(new String[0]);
        for (Integer index = (palavras.length - 1); index != 1; index--) {
            System.out.print("Progresso: " + ((progress * 100) / palavras.length) + "% " + animationChars[progress % 4] + "\r");
            for (Integer segundoIndex = 1; !segundoIndex.equals(index); segundoIndex++) {
                if (palavras[segundoIndex].compareTo(palavras[segundoIndex + 1]) > 0) {
                    String auxiliar = palavras[segundoIndex];
                    palavras[segundoIndex] = palavras[segundoIndex + 1];
                    palavras[segundoIndex + 1] = auxiliar;
                }
            }
            progress++;
        }
        return Arrays.asList(palavras.clone());
    }

    public List<String> ordenacaoViaInsertion(List<String> naoOrdenado) {
        char[] animationChars = new char[]{'|', '/', '-', '\\'};
        for (int index = 1; index < naoOrdenado.size(); index++) {
            System.out.print("Progresso: " + ((index * 100) / naoOrdenado.size()) + "% " + animationChars[index % 4] + "\r");
            String s = naoOrdenado.get(index);
            int j = index - 1;
            while (j >= 0 && s.compareTo(naoOrdenado.get(j)) < 0) {
                String y = naoOrdenado.get(j + 1);
                naoOrdenado.set(j + 1, naoOrdenado.get(j));
                naoOrdenado.set(j, y);
                j--;
            }
            String y = naoOrdenado.get(j + 1);
            y = s;
        }
        return naoOrdenado;
    }

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
        char[] animationChars = new char[]{'|', '/', '-', '\\'};
        int tamanho = ultima - primeira + 1;
        String[] arrayAuxiliar = new String[tamanho];
        int primeiroElemento = primeira;
        int segundoElemento = meio + 1;
        int index = 0;

        while (primeiroElemento <= meio && segundoElemento <= ultima){
            System.out.print("Progresso: " + ((index * 100) / palavras.length) + "% " + animationChars[index % 4] + "\r");
            if (palavras[primeiroElemento].compareTo(palavras[segundoElemento]) < 0){
                arrayAuxiliar[index] = palavras[primeiroElemento];
                primeiroElemento++;
            } else {
                arrayAuxiliar[index] = palavras[segundoElemento];
                segundoElemento++;
            }
            index++;
        }

        while (primeiroElemento <= meio){
            arrayAuxiliar[index] = palavras[primeiroElemento];
            primeiroElemento++;
            index++;
        }

        while (segundoElemento <= ultima){
            arrayAuxiliar[index] = palavras[segundoElemento];
            segundoElemento++;
            index++;
        }

        for (int indexFor = 0; indexFor < tamanho; indexFor++){
            palavras[primeira + indexFor] = arrayAuxiliar[indexFor];
        }
    }

    public List<String> ordenacaoViaQuick(String[] palavras, int primeira, int ultima) {
        if (primeira < ultima) {
            int pivot = particao(palavras, primeira, ultima);
            ordenacaoViaQuick(palavras, primeira, pivot - 1);
            ordenacaoViaQuick(palavras, pivot + 1, ultima);
        }
        return Arrays.asList(palavras.clone());
    }

    private Integer particao(String[] palavras, int primeira, int ultima) {
        String pivot = palavras[ultima];
        int retorno = (primeira - 1);
        char[] animationChars = new char[]{'|', '/', '-', '\\'};
        for (int index = primeira; index < ultima; index++) {
            System.out.print("Progresso: " + animationChars[index % 4] + "\r");
            if (palavras[index].compareTo(pivot) <= 0) {
                retorno++;

                String troca = palavras[retorno];
                palavras[retorno] = palavras[index];
                palavras[index] = troca;
            }
        }
        String troca = palavras[retorno + 1];
        palavras[retorno + 1] = palavras[ultima];
        palavras[ultima] = troca;

        return retorno + 1;
    }

}
