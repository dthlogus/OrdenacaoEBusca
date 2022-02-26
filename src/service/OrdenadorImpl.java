package service;

import java.util.Arrays;
import java.util.List;

public class OrdenadorImpl implements Ordenador {

    @Override
    public List<String> ordenacaoViaBubble(List<String> naoOrdenado) {
        String palavras[];
        palavras = naoOrdenado.toArray(new String[0]);
        for (Integer index = (palavras.length - 1); index != 1; index--){
            for (Integer segundoIndex = 1; !segundoIndex.equals(index); segundoIndex++){
                if (palavras[segundoIndex].length() > palavras[segundoIndex + 1].length()){
                    String auxiliar = palavras[segundoIndex];
                    palavras[segundoIndex] = palavras[segundoIndex + 1];
                    palavras[segundoIndex + 1] = auxiliar;
                }
            }
            System.out.println("Entrou na primeira fase: index: "+index);
        }
        return Arrays.asList(palavras.clone());
    }

}
