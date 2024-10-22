
import controllers.*;
import model.*;
import view.FiltroView;
import view.Menus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        // Exibe o menu somente até o momento em que o usuário escolhe a opção 'Sair'
        do {
            escolha = Menus.menu(scanner, escolha);

            // Switch Case para definir as ações de acordo com a escolha
            switch (escolha) {
                case 1:
                    System.out.println();
                    PessoaController.CadastrarPessoa(scanner);
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;

                case 2:
                    System.out.println();
                    Pessoa pessoa = PessoaController.EscolherPessoa(scanner);
                    PessoaController.EditarPessoa(scanner, pessoa);
                    System.out.println("Pessoa editada com sucesso!");
                    break;

                case 3:
                    System.out.println();
                    PessoaController.VisualizarDadosPessoa();
                    break;

                case 4:
                    System.out.println();
                    AnimalController.CadastrarAnimal(scanner);
                    System.out.println("\nAnimal cadastrado com sucesso!!!");
                    break;

                case 5:
                    FiltroView.buscaPorFiltro(scanner);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (escolha != 6);
        scanner.close();
    }

}
