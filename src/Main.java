import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // ADICIONAR CLIENTES
        Scanner leitor = new Scanner(System.in);
        ArrayList<Clientes> clients = new ArrayList<Clientes>();
        ArrayList<Livros> livros = new ArrayList<Livros>();

        // VER PESSOAS CADASTRADAS

        while (true) {
            int opcao = 0;
            System.out.println("\nPara adicionar um cliente digite 1");
            System.out.println("Para adicionar um livro digite 2");
            System.out.println("Para ver os clientes cadastrados digite 3");
            System.out.println("Para ver os livros cadastrados digite 4");
            System.out.println("Para remover um cliente digite 5");
            System.out.println("Para remover um Livro digite 6");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    char controle = 's';
                    do {
                        System.out.println("\nDigite o nome: ");
                        String nome = leitor.next();
                        System.out.println("Digite o Cpf: ");
                        String cpf = leitor.next();
                        System.out.println("Digite o Email: ");
                        String email = leitor.next();
                        Clientes cliente = new Clientes(nome, cpf, email);
                        clients.add(cliente);
                        System.out.println("\nDeseja cadastrar outra pessoa? s ou S para sim.");
                        controle = leitor.next().charAt(0);
                    } while (controle == 's' || controle == 'S');
                    break;
                case 2:
                    char controle2 = 's';
                    do {
                        System.out.println("\nDigite o nome do livro: ");
                        String nomelivro = leitor.next();
                        System.out.println("Digite o Gênero: ");
                        String genero = leitor.next();
                        Livros livro = new Livros(nomelivro, genero);
                        livros.add(livro);
                        System.out.println("Deseja adicionar outro livro? ");
                        controle2 = leitor.next().charAt(0);
                    } while (controle2 == 's' || controle2 == 'S');
                    break;
                case 3:
                    for (Clientes i : clients) {
                        System.out.println(i);
                    }
                    break;

                case 4:
                    for (Livros i : livros) {
                        System.out.println(i);
                    }
                    break;

                case 5:
                    int removedor;
                    System.out.println("\nEscolha um usuario a ser removido a partir da posição 0: ");
                    for (Clientes i : clients) {
                        System.out.println(i);
                    }
                    removedor = leitor.nextInt();
                    System.out.println(clients.get(removedor));
                    System.out.println("\nSe esse for o usuario que deseja remover Digite 's' ou 'S'");
                    char confirmar;
                    confirmar = leitor.next().charAt(0);
                    if (confirmar == 's' || confirmar == 'S') {
                        clients.remove(removedor);
                        System.out.println("\nUsuario removido com sucesso\n");
                        break;
                    }
                    System.out.println("\nOperação cancelada.");
                    break;

                case 6:
                    int removedor2;
                    System.out.println("\nEscolha um livro a ser removido a partir da posição 0: ");
                    for (Livros i : livros) {
                        System.out.println(i);
                    }
                    removedor2 = leitor.nextInt();
                    System.out.println(livros.get(removedor2));
                    System.out.println("\nSe esse for o usuario que deseja remover Digite 's' ou 'S'");
                    char confirmar2;
                    confirmar2 = leitor.next().charAt(0);
                    if (confirmar2 == 's' || confirmar2 == 'S') {
                        livros.remove(removedor2);
                        System.out.println("\nLivro removido com sucesso");
                        break;
                    }
                    System.out.println("\nOperação cancelada.");
                    break;
                default:
                    System.out.println("\nOpção invalida");
                    break;


            }
        }
    }
}





























