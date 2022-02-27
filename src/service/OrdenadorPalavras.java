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
                if (palavras[segundoIndex].length() > palavras[segundoIndex + 1].length()) {
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
            while (j >= 0 && s.compareTo(naoOrdenado.get(j)) > 0) {
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
}
