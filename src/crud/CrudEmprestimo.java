package crud;

import entidades.Emprestimo;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudEmprestimo {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public static void menu() {
        int opcao;
        do {
            System.out.println("\n--- CRUD de Empréstimos ---");
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
        System.out.print("EPI emprestado: ");
        String epi = entrada.nextLine();
        emprestimos.add(new Emprestimo(funcionario, epi));
        System.out.println("Empréstimo registrado.");
    }

    static void listar() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo registrado.");
            return;
        }
        for (int i = 0; i < emprestimos.size(); i++) {
            Emprestimo e = emprestimos.get(i);
            System.out.println(i + " - " + e.getFuncionario() + " - " + e.getEpi());
        }
    }

    static void atualizar() {
        listar();
        if (emprestimos.isEmpty()) return;
        System.out.print("Índice para atualizar: ");
        int indice = entrada.nextInt();
        entrada.nextLine();
        if (indice >= 0 && indice < emprestimos.size()) {
            System.out.print("Novo nome do funcionário: ");
            String funcionario = entrada.nextLine();
            System.out.print("Novo EPI emprestado: ");
            String epi = entrada.nextLine();
            emprestimos.set(indice, new Emprestimo(funcionario, epi));
            System.out.println("Empréstimo atualizado!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    static void remover() {
        listar();
        if (emprestimos.isEmpty()) return;
        System.out.print("Índice para remover: ");
        int indice = entrada.nextInt();
        entrada.nextLine();
        if (indice >= 0 && indice < emprestimos.size()) {
            emprestimos.remove(indice);
            System.out.println("Empréstimo removido!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
