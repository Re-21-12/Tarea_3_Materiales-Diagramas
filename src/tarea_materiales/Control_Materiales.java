package tarea_materiales;

public class Control_Materiales {
    private Inventario inventario;
    private String orden;

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public String revisarInventario() {
        inventario = Control_Materiales.this.getInventario();
        System.out.println("El inventario es: ");
        return inventario.toString();
    }

    public void realizarOrden(String orden, String nombre, Integer cantidad, double costo) {
        Materiales material = new Materiales(nombre, cantidad, costo);

        // Obtenemos el arreglo de materiales del inventario
        Materiales[] materialesEnInventario = inventario.getMateriales();

        // Verificamos si el material ya existe en el inventario
        boolean materialExistente = false;
        for (int i = 0; i < materialesEnInventario.length; i++) {
            if (materialesEnInventario[i] != null && materialesEnInventario[i].getNombre().equalsIgnoreCase(nombre)) {
                // Actualizamos la cantidad y costo del material existente
                materialesEnInventario[i].setCantidad(materialesEnInventario[i].getCantidad() + cantidad);
                materialesEnInventario[i].setCosto(costo);
                materialExistente = true;
                break;
            }
        }

        // Si el material no existe en el inventario, lo agregamos
        if (!materialExistente) {
            for (int i = 0; i < materialesEnInventario.length; i++) {
                if (materialesEnInventario[i] == null) {
                    materialesEnInventario[i] = material;
                    materialExistente = true;
                    break;
                }
            }
        }

        // Si el inventario está lleno y el material no existe, imprimir mensaje de error
        if (!materialExistente) {
            System.out.println("No se puede agregar el material, el inventario está lleno.");
            return;
        }

        // Calculamos el costo y cantidad totales del inventario
        double costoTotal = 0.0;
        int cantidadTotal = 0;
        for (Materiales materiali : materialesEnInventario) {
            if (materiali != null) {
                if (orden.equalsIgnoreCase("c")) {
                    costoTotal -= materiali.getCosto() * materiali.getCantidad();
                    cantidadTotal += materiali.getCantidad();
                } else if (orden.equalsIgnoreCase("v")) {
                    costoTotal += materiali.getCosto() * materiali.getCantidad();
                    cantidadTotal -= materiali.getCantidad();
                }
            }
        }

        // Actualizamos el inventario
        inventario.setMateriales(materialesEnInventario);
        inventario.setCantidadDinero(costoTotal);
        inventario.setCantidadMateriales(cantidadTotal);
    }

    public Control_Materiales(Inventario inventario, String orden) {
        super();
        this.inventario = inventario;
        this.orden = orden;
    }

    public Control_Materiales() {

    }
}
