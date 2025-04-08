package crud;

import entidades.Epi;
import java.util.ArrayList;
import java.util.Scanner;

public class CrudEpi {
    static ArrayList<Epi> epis = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    public static void menu() {
        int opcao;
        do {
            System.out.println("\n--- CRUD de EPIs ---");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Atualizar");
            System.out.println("4. Remover");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> listar();
                case 3 -> atualizar();
                case 4 -> remover();
                case 0 -> {}
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    static void cadastrar() {
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = entrada.nextInt();
        entrada.nextLine();
        epis.add(new Epi(nome, quantidade));
        System.out.println("EPI cadastrado!");
    }

    static void listar() {
        if (epis.isEmpty()) {
            System.out.println("Nenhum EPI cadastrado.");
            return;
        }
        for (int i = 0; i < epis.size(); i++) {
            Epi e = epis.get(i);
            System.out.println(i + " - " + e.getNome() + " - " + e.getQuantidade());
        }
    }

    static void atualizar() {
        listar();
        System.out.print("Índice para atualizar: ");
        int indice = entrada.nextInt();
        entrada.nextLine();

        if (indice >= 0 && indice < epis.size()) {
            System.out.print("Novo nome: ");
            String nome = entrada.nextLine();
            System.out.print("Nova quantidade: ");
            int quantidade = entrada.nextInt();
            entrada.nextLine();
            epis.set(indice, new Epi(nome, quantidade));
            System.out.println("EPI atualizado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    static void remover() {
        listar();
        System.out.print("Índice para remover: ");
        int indice = entrada.nextInt();
        entrada.nextLine();

        if (indice >= 0 && indice < epis.size()) {
            epis.remove(indice);
            System.out.println("EPI removido.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
