package Locadora;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class GerenciaLocacao {

  public void gerLocacao(Scanner sc, ArrayList<Locacao> locacoes, ArrayList<Cliente> clientes,
      ArrayList<Veiculo> veiculos) {
    int opcao;

    do {

      System.out.println("1 - Cadastrar locação");
      System.out.println("2 - Remover locação");
      System.out.println("3 - Listar locações");
      System.out.println("4 - Buscar locação");
      System.out.println("5 - Alterar locação");
      System.out.println("0 - Sair");
      opcao = sc.nextInt();
      sc.nextLine();

      switch (opcao) {

        case 1:
          cadastrarLocacao(sc, clientes, veiculos, locacoes);
          break;
        case 2:
          removerLocacoes();
          break;
        case 3:
          listarLocacoes(locacoes);
          break;
        case 4:
          buscarLocacao();
          break;
        default:
          break;
      }

    } while (opcao != 0);
  }

  public void cadastrarLocacao(Scanner sc, ArrayList<Cliente> clientes, ArrayList<Veiculo> veiculos,
      ArrayList<Locacao> locacoes) {
    int pos = 0, pos2 = 0;

    for (int i = 0; i < clientes.size(); i++) {
      if (!clientes.isEmpty()) {

        System.out.println("Nome: " + clientes.get(i).getNome());
        System.out.println("CPF: " + clientes.get(i).getCpf());
        System.out.println("");
        pos = i;
      }
    }
    System.out.println("Digite o CPF do cliente: ");
    String buscacpf = sc.nextLine();

    for (int i = 0; i < clientes.size(); i++) {
      if (clientes.get(i).getCpf().equals(buscacpf)) {
        pos = i;
      } else {
        System.out.println("Cliente não cadastrado.");
        break;
      }
    }
    Cliente cliente = clientes.get(pos);

    System.out.println("Escolha o veículo: ");
    for (int i = 0; i < veiculos.size(); i++) {
      if (!veiculos.isEmpty()) {
        System.out.println("Marca: " + veiculos.get(i).getMarca());
        System.out.println("Modelo: " + veiculos.get(i).getModelo());
        System.out.println("Placa: " + veiculos.get(i).getPlaca());
      } else {
        System.out.println("Não existem carros cadastrados.");
        break;
      }
    }

    System.out.println("Digite a placa do carro: ");
    String placa = sc.nextLine();
    for (int i = 0; i < veiculos.size(); i++) {
      if (veiculos.get(i).getPlaca().equals(placa)) {
        pos = i;
      } else {
        System.out.println("Veiculo não cadastrado.");
      }
    }

    Veiculo veiculo = veiculos.get(pos2);

    System.out.println("Digite a data da locação (dd/mm/yyyy): ");
    LocalDate dataInicio = lerData(sc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    System.out.println("Digite a data da devolução (dd/mm/yyyy): ");
    LocalDate dataFim = lerData(sc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    System.out.println("Digite o valor da locação: ");
    double valor = sc.nextDouble();
    sc.nextLine();

    Locacao locacao = new Locacao(cliente, veiculo, dataInicio, valor, dataFim);
    locacoes.add(locacao);

  }

  public static LocalDate lerData(Scanner sc, DateTimeFormatter dateFormatter) {
    while (true) {
      try {
        String input = sc.nextLine();
        return LocalDate.parse(input, dateFormatter);
      } catch (Exception e) {
        System.out.println("Formato de data inválido. Digite novamente (dd/mm/yyyy): ");
      }
    }
  }

  public void removerLocacoes() {

  }

  public void listarLocacoes(ArrayList<Locacao> locacoes) {
    System.out.println("Dados da locacao.");
    System.out.println("");
    for (int i = 0; i < locacoes.size(); i++) {
      System.out.println("Nome do cliente: " + locacoes.get(i).getCliente().getNome());
      System.out.println("CPF cliente: " + locacoes.get(i).getCliente().getCpf());
      System.out.println("Marca do veiculo: " + locacoes.get(i).getVeiculo().getMarca());
      System.out.println("Modelo do veiculo: " + locacoes.get(i).getVeiculo().getModelo());
      System.out.println("Placa do veiculo: " + locacoes.get(i).getVeiculo().getPlaca());
      System.out.println("Inicio da locacao: " + locacoes.get(i).getDataInicio());
      System.out.println("Final da locacao: " + locacoes.get(i).getDataFinal());
      System.out.println("Valor da locacao: " + locacoes.get(i).getValor());
    }
  }

  public void buscarLocacao() {

  }

}
