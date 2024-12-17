package aula;
            // Armazenado
record Consorcio(double valorBem,
                 double fundoReserva,
                 double taxaAdministrativa,
                 int quantidadeMeses) {
  
  // método não é estático: depende do objeto
  double valorTotal() { // Calculado
    return valorBem + fundoReserva + taxaAdministrativa;
  }

  double valorParcela() { // Calculado
    return valorTotal() / quantidadeMeses;
  }

  // valor bem 70000
  // valor fundo de reserva 5000
  // valor taxa administrativa 4000
  // valor da parcela 1400
  // quantidade de meses 60

  static Consorcio simular(int valor) {
    // TODO: como devolver várias simulações em vez de uma
    // 24, 36, 48, 60, 72
    int numeroParcelas = 60; 
    // TODO: LER A TAXA ADMINISTRATIVA E FUNDO RESERVA DE UM ARQUIVO
    double taxaAdministrativa = 0.10; // 10%
    double fundoReserva = 0.05; // %5
    // double valorTotal = valor 
    //             + (valor * taxaAdministrativa)
    //             + (valor * fundoReserva);
    // double valorParcela = valorTotal / numeroParcelas;
    
    return new Consorcio(valor,
                         valor * fundoReserva,
                         valor * taxaAdministrativa, 
                         numeroParcelas);
  }
}
