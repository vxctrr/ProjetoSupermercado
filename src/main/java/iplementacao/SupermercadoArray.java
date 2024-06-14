package iplementacao;

public class SupermercadoArray implements Supermercado{

    private final String [] itens;

    private int ultimoIndice;

    public SupermercadoArray(final int tamanho) {
      itens = new String[tamanho];
      ultimoIndice = -1;
    }

    public void add(final String item){

        if (ultimoIndice == itens.length-1 ){
            System.err.println("Lista de Supermercado cheia");
        }else{
            ultimoIndice++;
            itens[ultimoIndice] = item;
        }
    }
    public void print(){
        System.out.println("---------------------------");
        if (ultimoIndice < 0){
            System.out.println("Lista de Supermercado vazia");
        }
        for(int i = 0; i <= ultimoIndice; i++){
            System.out.println(i + " - " + itens[i]);
        }

        System.out.println("---------------------------");

    }

    public void delete(final int indice){
        if(indice>= 0 && indice <= ultimoIndice){
            shift(indice);
            ultimoIndice--;
        }else{
            System.err.println("Indice invalido:" + indice);

        }

    }

    private void shift(final int indice) {
        for(int i = indice; i < ultimoIndice; i++){
            itens[i] = itens[i + 1];
        }
    }
}
