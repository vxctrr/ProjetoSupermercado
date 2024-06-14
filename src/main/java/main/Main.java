package main;

import iplementacao.Supermercado;
import iplementacao.SupermercadoArray;

import java.util.Scanner;

public class Main {

    private final static int TAMANHO = 3;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Supermercado supermercado = new SupermercadoArray(TAMANHO);
        int opcao;
        do{
            System.out.println("\n Lista de Compras");
            System.out.println("\n 1 - Inserir");
            System.out.println(" 2 - Listar");
            System.out.println(" 3 - Remover");
            System.out.println(" 4 - Sair");
            System.out.print("\n Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Digite o item a ser inserido: ");
                    String item = scanner.next();
                    supermercado.add(item);
                    break;
                case 2:
                    supermercado.print();
                    break;
                case 3:
                    System.out.print("Digite a posição do item à ser removido: ");
                    int indice = scanner.nextInt();
                    supermercado.delete(indice);
                    break;
                case 4:
                    System.out.println("Saindo do Programa...");
                break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }while(opcao != 4);

        scanner.close();
    }

}
