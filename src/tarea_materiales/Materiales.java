package tarea_materiales;

public class Materiales {
	private String nombre;
	private int cantidad;
	private double costo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Materiales [nombre=" + nombre + ", cantidad=" + cantidad + ", costo=" + costo + "]";
	}

	public Materiales(String nombre, int cantidad, double costo) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.costo = costo;
	}

}
