import crud.*;

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. CRUD de Usuários");
            System.out.println("2. CRUD de EPIs");
            System.out.println("3. CRUD de Empréstimos");
            System.out.println("4. CRUD de Devoluções");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> CrudUsuario.menu();
                case 2 -> CrudEpi.menu();
                case 3 -> CrudEmprestimo.menu();
                case 4 -> CrudDevolucao.menu();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
