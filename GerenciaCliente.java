package Locadora;

import java.util.Scanner;
import java.util.ArrayList;

public class GerenciaCliente {

  public void gerCliente(Scanner sc, ArrayList<Cliente> clientes) {

    int opcao;

    do {

      System.out.println("1 - Cadastrar cliente");
      System.out.println("2 - Remover cliente");
      System.out.println("3 - Listar clientes");
      System.out.println("4 - Buscar cliente");
      System.out.println("5 - Alterar cliente");
      System.out.println("0 - Sair");
      opcao = sc.nextInt();
      sc.nextLine();
      switch (opcao) {
        case 1:
          cadastrarCliente(sc, clientes);
          break;
        case 2:
          removerCliente();
          break;
        case 3:
          listarClientes(clientes);
          break;
        case 4:
          buscarCliente();
          break;
        case 5:
          alterarCliente();
          break;
        case 0:
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }

    } while (opcao != 0);
  }

  public void cadastrarCliente(Scanner sc, ArrayList<Cliente> clientes) {
    int op;

    while (true) {

      Cliente cliente = new Cliente();

      System.out.println("Digite o nome do cliente: ");
      String nome = sc.nextLine();

      System.out.println("Digite o CPF do cliente: ");
      String cpf = sc.nextLine();

      cliente = new Cliente(nome, cpf);
      clientes.add(cliente);

      System.out.println("Deseja cadastrar outro cliente? (1 - Sim / 2 - Não)");
      op = sc.nextInt();
      sc.nextLine();
      if (op == 1) {
        continue;
      } else if (op == 2) {
        break;
      } else {
        System.out.println("Opção inválida!");
        break;
      }
    }

  }

  public void removerCliente() {
  }

  public void listarClientes(ArrayList<Cliente> clientes) {
    for (int i = 0; i < clientes.size(); i++) {
      System.out.println(clientes.get(i).getNome());
    }
  }

  public void buscarCliente() {
  }

  public void alterarCliente() {
  }

}
