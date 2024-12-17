package aula;
// as classes, registros, etc, são
// sempre substantivos,
// iniciam com letra maiúscula
// UX: User eXperience
// DX: Developer eXperience
            // syntax sugar (açúcar sintático)
            // campos ou atributos (a ordem importa)
record Carro(String fabricante,
             String modelo,
             double cilindrada,
             int potencia,
             Categoria categoria) {

}

// class Carro2 {
//     private final String fabricante;
//     private final String modelo;
//     private final double cilindrada;
//     private final int potencia;

//     Carro2(String fabricante, 
//            String modelo,
//            double cilindrada,
//            int potencia) {
//         this.fabricante = fabricante;
//         this.modelo = modelo;
//         this.cilindrada = cilindrada;
//         this.potencia = potencia;
//     }

//     @Override
//     public int hashCode() {

//     }

//     public boolean equals(Object o) {
        
//     }


//     @Override
//     public String toString() {
//         return fabricante + ", " + modelo + ^
//     }
// }