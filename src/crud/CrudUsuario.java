package crud;

import entidades.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

public class CrudUsuario {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void menu() {
        int opcao;
        do {
            System.out.println("\n--- CRUD de Usuários ---");
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
        System.out.print("Email: ");
        String email = entrada.nextLine();
        System.out.print("Cargo: ");
        String cargo = entrada.nextLine();
        usuarios.add(new Usuario(nome, email, cargo));
        System.out.println("Usuário cadastrado!");
    }

    static void listar() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário encontrado.");
            return;
        }
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(i + " - " + usuarios.get(i));
        }
    }

    static void atualizar() {
        listar();
        if (usuarios.isEmpty()) return;
        System.out.print("Índice para atualizar: ");
        int indice = entrada.nextInt();
        entrada.nextLine();
        if (indice >= 0 && indice < usuarios.size()) {
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Email: ");
            String email = entrada.nextLine();
            System.out.print("Cargo: ");
            String cargo = entrada.nextLine();
            usuarios.set(indice, new Usuario(nome, email, cargo));
            System.out.println("Usuário atualizado!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    static void remover() {
        listar();
        if (usuarios.isEmpty()) return;
        System.out.print("Índice para remover: ");
        int indice = entrada.nextInt();
        entrada.nextLine();
        if (indice >= 0 && indice < usuarios.size()) {
            usuarios.remove(indice);
            System.out.println("Usuário removido!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}