package busca;

import java.util.List;

public class Busca {

    public String buscaSequencial (List<String> palavras, String palavra){
        for (int index = 0; index < palavras.size(); index++){
            if (palavras.get(index).equals(palavra)){
                return "Palavra "+palavra+" encontrada na posição: "+ index + " , usando o método busca sequencial";
            }
        }
        return "Palavra "+palavra+" não encontrada nessa lista, usando o método busca sequencial";
    }

    public String buscaBinaria(String[] palavrasOrdenadas, String palavra, int inicio, int fim){
        if (fim >= inicio && inicio < palavrasOrdenadas.length - 1){
            int meio  = inicio + (fim - inicio) / 2;
            if (palavrasOrdenadas[meio].equals(palavra)){
                return "Palavra "+palavra+" encontrada na posição: "+ meio + " , usando o método busca binaria";
            }
            if (palavrasOrdenadas[meio].compareTo(palavra) > 0){
                return buscaBinaria(palavrasOrdenadas, palavra, inicio, meio - 1);
            }
            return buscaBinaria(palavrasOrdenadas, palavra, meio + 1, fim);
        }
        return "Palavra "+palavra+" não encontrada nessa lista, usando o método busca binaria";
    }
}
