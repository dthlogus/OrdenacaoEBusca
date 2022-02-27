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
        int meio = (inicio + fim) / 2;
        int comparacao = palavrasOrdenadas[meio].compareTo(palavra);
        if (inicio > fim) {
            return "Palavra " + palavra + " não encontrada nessa lista, usando o método busca binaria";
        }
        if (comparacao == 0){
            return "Palavra "+palavra+" encontrada na posição: "+meio+", usando o método busca binaria";
        }else if (comparacao < 0){
            return buscaBinaria(palavrasOrdenadas, palavra, inicio, meio - 1);
        }else{
            return buscaBinaria(palavrasOrdenadas, palavra, meio+1, fim);
        }
    }
}
