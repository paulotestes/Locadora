package Locadora;

import java.util.Scanner;
import java.util.ArrayList;

public class GerenciaVeiculo {

  public void gerVeiculos(Scanner sc, ArrayList<Veiculo> veiculos) {
    int opcao;
    do {

      System.out.println("1 - Cadastrar veículo");
      System.out.println("2 - Remover veículo");
      System.out.println("3 - Listar veículos");
      System.out.println("4 - Buscar veículo");
      System.out.println("5 - Alterar veículo");
      System.out.println("0 - Sair");
      opcao = sc.nextInt();
      sc.nextLine();
      switch (opcao) {
        case 1:
          cadastrarVeiculo(sc, veiculos);
          break;
        case 2:
          removerVeiculo();
          break;
        case 3:
          listarVeiculos(veiculos);
          break;
        case 4:
          buscarVeiculo(sc, veiculos);
          break;
        case 5:
          alterarVeiculo();
          break;
        case 0:
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }

    } while (opcao != 0);

  }

  public void cadastrarVeiculo(Scanner sc, ArrayList<Veiculo> veiculos) {
    Veiculo carro = new Veiculo();
    while (true) {
      char op;

      System.out.println("Digite o modelo do veículo: ");
      String modelo = sc.nextLine();

      System.out.println("Digite a placa do veiculo: ");
      String placa = sc.nextLine();

      System.out.println("Digite a marca do veículo: ");
      String marca = sc.nextLine();

      carro = new Veiculo(placa, modelo, marca);
      veiculos.add(carro);

      System.out.println("Deseja cadastrar outro veículo? (S/N)");
      op = sc.nextLine().charAt(0);

      if (op == 'N' || op == 'n') {
        break;
      } else if (op == 'S' || op == 's') {
        continue;
      } else {
        System.out.println("Opção inválida!");
        break;
      }

    }
  }

  public void removerVeiculo() {
  }

  public void listarVeiculos(ArrayList<Veiculo> veiculos) {

    for (Veiculo veiculo : veiculos) {
      System.out.println("Modelo: " + veiculo.getModelo());
      System.out.println("Marca: " + veiculo.getMarca());
      System.out.println("Placa: " + veiculo.getPlaca());

    }
  }

  public void buscarVeiculo(Scanner sc, ArrayList<Veiculo> veiculos) {
    System.out.println("Digite a placa do veículo: ");
    String buscaplaca = sc.nextLine();
    for (Veiculo veiculo : veiculos) {
      if (veiculo.getPlaca().equals(buscaplaca)) {
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Placa: " + veiculo.getPlaca());

      }

    }
  }

  public void alterarVeiculo() {
  }
}
