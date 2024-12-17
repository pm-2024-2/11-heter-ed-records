package aula;
// domínio

import java.time.LocalDate;

// br.edu.ifrs.riogrande (pacote qualificado)

class App {
  public static void main(String[] args) {
    // Object[] objetos = { 1, "teste", 3 };
    // cast, coerção (deve-se evitar casts)
    // System.out.println(2 + (Integer) objetos[2]);
    // Map<Integer, String>

    // Object[] carro = {"Fiat", "Palio", 1.0, 75, LocalDate.of(2014, 6, 13)};
    // Object[] carro2 = {"Palio", 75, "Fiat", }
    // tipo é ao mesmo tempo uma constraint (restrição)
    // categoria: passeio, utilitário
    // new -> operador para instanciar um objeto
    var c1 = new Carro(
        "Chevrolet", "Onix", 1.0, 80, Categoria.PASSEIO);
    System.out.println(c1);
    System.out.println(c1.potencia() + "cv");
    System.out.println(c1.categoria());

    // 0
    System.out.println(Categoria.PASSEIO.ordinal());
    // 1
    System.out.println(Categoria.UTILITARIO.ordinal());
    /*
     * CREATE TABLE carros (
     * categoria INTEGER
     * )
     */

    // Consórcio
    // valor bem 70000
    // valor fundo de reserva 5000
    // valor taxa administrativa 4000
    // valor da parcela 1400
    // quantidade de meses 60

    // ENCAPSULAMENTO
    Consorcio sim1 = Consorcio.simular(70000);
    System.out.println(sim1);
    // Armazenado
    System.out.println(sim1.valorBem());
    System.out.println(sim1.fundoReserva());
    System.out.println(sim1.taxaAdministrativa());
    System.out.println(sim1.quantidadeMeses());
    // Calculado
    System.out.println(sim1.valorParcela());
    System.out.println(sim1.valorTotal());

  }
}