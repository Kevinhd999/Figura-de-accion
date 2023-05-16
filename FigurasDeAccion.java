import java.util.Scanner;

public class FigurasDeAccion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Tienda tienda = new Tienda();
            char continuar;

            do {
                System.out.print("Ingrese el nombre de la figura de acción: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese el precio de la figura de acción: ");
                double precio = sc.nextDouble();
                sc.nextLine();

                FiguraDeAccion figura = new FiguraDeAccion(nombre, precio);
                tienda.agregarFigura(figura);

                System.out.print("¿Desea agregar otra figura (s/n)? ");
                continuar = sc.nextLine().charAt(0);
            } while (continuar == 's' || continuar == 'S');

            System.out.println("Total de ventas: " + tienda.getTotalVentas());
            System.out.println("Figuras de acción disponibles:");
            for (FiguraDeAccion figura : tienda.getFigurasDisponibles()) {
                System.out.println(figura.getNombre() + " - $" + figura.getPrecio());
            }
        }
    }
}

class FiguraDeAccion {
    private String nombre;
    private double precio;

    public FiguraDeAccion(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

class Tienda {
    private FiguraDeAccion[] figuras;
    private int totalVentas;

    public Tienda() {
        figuras = new FiguraDeAccion[10];
    }

    public void agregarFigura(FiguraDeAccion figura) {
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] == null) {
                figuras[i] = figura;
                break;
            }
        }
    }

    public FiguraDeAccion[] getFigurasDisponibles() {
        FiguraDeAccion[] disponibles = new FiguraDeAccion[10];
        int contador = 0;

        for (FiguraDeAccion figura : figuras) {
            if (figura != null) {
                disponibles[contador] = figura;
                contador++;
            }
        }

        return disponibles;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void agregarVenta(double monto) {
        totalVentas += monto;
    }
}