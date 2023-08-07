package tarea_materiales;

import java.util.Scanner;

public class Menu_Materiales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); String continuar = "";
        System.out.println("Ingrese una opcion: \n 1. Rellenar Informacion. \n 2. Salir");
        String opcion = entrada.nextLine();
        if (opcion.equals("1") ) {

            Inventario inventario = new Inventario(0, 0.0, new Materiales[4]);
            Control_Materiales materiales = new Control_Materiales(inventario, "");

            do {
            	
            System.out.println("\n 1. Realizar Orden. \n 2. Revisar Inventario.");
            opcion = entrada.nextLine();
            switch (opcion) {
            case "1":
                System.out.println("Ingrese una orden: \n [c] compra \n [v] venta");
                String orden = entrada.nextLine();
                materiales.setOrden(orden);

                System.out.println("Ingrese un nombre de material: \n madera \n tornillo \n barniz \n pegamento");
                String nombre_Material = entrada.nextLine();
                System.out.println("Ingrese una cantidad: ");
                int cantidad = entrada.nextInt();
                System.out.println("Ingrese un costo: ");
                double costo = entrada.nextDouble();

                materiales.realizarOrden(orden, nombre_Material, cantidad, costo);

                System.out.println("Segun la orden realizada: " + "[" + orden +"]" + " El inventario actual es: ");
                System.out.println(inventario.toString());
                entrada.nextLine();
                break;
            case "2":
                System.out.println("El inventario actual es: ");
                System.out.println(inventario.toString());
                break;
            }
            System.out.println("Desea agregar otro producto? : [s] | [n]");
            continuar = entrada.nextLine();
            }while(continuar.equalsIgnoreCase("s"));
            if(continuar.equalsIgnoreCase("n")) {
            	opcion = "2";
            }
        }
        System.out.println("Que tenga un lindo dia");
        entrada.close();
    }
}
