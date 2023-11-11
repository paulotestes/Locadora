package Locadora;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int opcao;

    GerenciaVeiculo gerveiculo = new GerenciaVeiculo();
    GerenciaCliente gercliente = new GerenciaCliente();
    GerenciaLocacao gerlocacao = new GerenciaLocacao();
    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Locacao> locacoes = new ArrayList<Locacao>();

    do {

      System.out.println("1 - Veículo");
      System.out.println("2 - Cliente");
      System.out.println("3 - Locação");
      System.out.println("0 - Sair");
      opcao = sc.nextInt();
      sc.nextLine();
      switch (opcao) {
        case 1:
          gerveiculo.gerVeiculos(sc, veiculos);
          break;
        case 2:
          gercliente.gerCliente(sc, clientes);
          break;
        case 3:
          gerlocacao.gerLocacao(sc, locacoes, clientes, veiculos);
          break;
        case 0:
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }

    } while (opcao != 0);
    sc.close();
  }

}
