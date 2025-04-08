package crud;

import entidades.Devolucao;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudDevolucao {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Devolucao> devolucoes = new ArrayList<>();

    public static void menu() {
        int opcao;
        do {
            System.out.println("\n--- CRUD de Devoluções ---");
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
        System.out.print("Funcionário: ");
        String funcionario = entrada.nextLine();
        System.out.print("EPI devolvido: ");
        String epi = entrada.nextLine();
        devolucoes.add(new Devolucao(funcionario, epi));
        System.out.println("Devolução registrada.");
    }

    static void listar() {
        if (devolucoes.isEmpty()) {
            System.out.println("Nenhuma devolução registrada.");
            return;
        }
        for (int i = 0; i < devolucoes.size(); i++) {
            Devolucao d = devolucoes.get(i);
            System.out.println(i + " - " + d.getFuncionario() + " - " + d.getEpiDevolvido());
        }
    }

    static void atualizar() {
        listar();
        if (devolucoes.isEmpty()) return;
        System.out.print("Índice para atualizar: ");
        int indice = entrada.nextInt();
        entrada.nextLine();
        if (indice >= 0 && indice < devolucoes.size()) {
            System.out.print("Novo nome do funcionário: ");
            String funcionario = entrada.nextLine();
            System.out.print("Novo EPI devolvido: ");
            String epi = entrada.nextLine();
            devolucoes.set(indice, new Devolucao(funcionario, epi));
            System.out.println("Devolução atualizada!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    static void remover() {
        listar();
        if (devolucoes.isEmpty()) return;
        System.out.print("Índice para remover: ");
        int indice = entrada.nextInt();
        entrada.nextLine();
        if (indice >= 0 && indice < devolucoes.size()) {
            devolucoes.remove(indice);
            System.out.println("Devolução removida!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
