package Locadora;

import java.time.LocalDate;

public class Locacao {

  private Cliente cliente;
  private Veiculo veiculo;
  private LocalDate dataInicio;
  private LocalDate dataFinal;
  private double valor;

  public Locacao(Cliente cliente, Veiculo veiculo, LocalDate dataInicio, double valor, LocalDate dataFinal) {
    this.cliente = cliente;
    this.veiculo = veiculo;
    this.dataInicio = dataInicio;
    this.dataFinal = dataFinal;
    this.valor = valor;
  }

  public LocalDate getDataInicio() {
    return dataInicio;
  }

  public void setDataInicio(LocalDate dataInicio) {
    this.dataInicio = dataInicio;
  }

  public LocalDate getDataFinal() {
    return dataFinal;
  }

  public void setDataFinal(LocalDate dataFinal) {
    this.dataFinal = dataFinal;
  }

  public Locacao() {
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Veiculo getVeiculo() {
    return veiculo;
  }

  public void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
  }

  public LocalDate getdataInicio() {
    return dataInicio;
  }

  public void setdataInicio(LocalDate dataInicio) {
    this.dataInicio = dataInicio;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public Cliente getCliente() {
    return cliente;
  }

}
