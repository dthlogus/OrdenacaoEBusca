package busca;

import java.util.List;

public class Busca {

    public String buscaSequencial (List<String> palavras, String palavra){
        for (int index = 0; index < palavras.size(); index++){
            if (palavras.get(index).equals(palavra)){
                return "Palavra "+palavra+" encontrada na posição: "+ (index + 2)+ " , usando o método busca sequencial";
            }
        }
        return "Palavra "+palavra+" não encontrada nessa lista, usando o método busca sequencial";
    }

    public String buscaBinaria(List<String> palavrasOrdenadas, String palavra, int inicio, int fim){
        if (fim >= inicio && inicio < palavrasOrdenadas.size() - 1){
            int meio  = inicio + (fim - inicio) / 2;
            if (palavrasOrdenadas.get(meio).length() == palavra.length()){
                for (Integer index = meio; palavrasOrdenadas.get(index).length() == palavra.length(); index--){
                    if (palavrasOrdenadas.get(index).equals(palavra)){
                        return "Palavra "+palavrasOrdenadas.get(index)+" encontrado na posição "+(index+1)+" usando método binário";
                    }
                }
                for (Integer index = meio; palavrasOrdenadas.get(index).length() == palavra.length(); index++){
                    if (palavrasOrdenadas.get(index).equals(palavra)){
                        return "Palavra "+palavrasOrdenadas.get(index)+" encontrado na posição "+(index+1)+" usando método binário";
                    }
                }
            }
            if (palavrasOrdenadas.get(meio).length() > palavra.length()){
                return buscaBinaria(palavrasOrdenadas, palavra, inicio, meio - 1);
            }
            return buscaBinaria(palavrasOrdenadas, palavra, meio + 1, fim);
        }
        return "Palavra "+palavra+" não encontrada nessa lista, usando o método busca binaria";
    }
}
