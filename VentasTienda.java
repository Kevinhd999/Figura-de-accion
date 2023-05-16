import java.util.Scanner;

public class VentasTienda {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[][] ventas = new double[5][5];
            int referencia, vendedor;
            double monto;
            char continuar;

            String[] figuras = {"Superhéroes", "Star Wars", "Anime", "Películas", "Videojuegos"};
            int[] vendedores = {1, 2, 3, 4, 5};

            do {
                System.out.print("Ingrese la referencia de la figura vendida: ");
                referencia = sc.nextInt();
                System.out.print("Ingrese el número del vendedor: ");
                vendedor = sc.nextInt();
                System.out.print("Ingrese el monto de la venta: ");
                monto = sc.nextDouble();

                ventas[referencia - 1][vendedor - 1] += monto;

                System.out.print("¿Desea continuar (s/n)? ");
                continuar = sc.next().charAt(0);
            } while (continuar == 's' || continuar == 'S');

            // Impresión de resultados
            for (int i = 0; i < figuras.length; i++) {
                for (int j = 0; j < vendedores.length; j++) {
                    System.out.println("El vendedor " + vendedores[j] + " vendió " + ventas[i][j] + " de la figura " + figuras[i]);
                }
            }
        }
    }
}