package tarea_materiales;

import java.util.Arrays;

public class Inventario {
private int cantidadMateriales = 0;
private double cantidadDinero = 0.0;
private Materiales[] materiales;


public Materiales[] getMateriales() {
	return materiales;
}
public void setMateriales(Materiales[] materiales) {
	this.materiales = materiales;
}
public int getCantidadMateriales() {
	return cantidadMateriales;
}
public void setCantidadMateriales(int cantidadMateriales) {
	this.cantidadMateriales = cantidadMateriales;
}
public double getCantidadDinero() {
	return cantidadDinero;
}
public void setCantidadDinero(double cantidadDinero) {
	this.cantidadDinero = cantidadDinero;
}
public Inventario(int cantidadMateriales, double cantidadDinero, Materiales[] materiales) {
	super();
	this.cantidadMateriales = cantidadMateriales;
	this.cantidadDinero = cantidadDinero;
	this.materiales = materiales;
}
public Inventario() {
}
@Override
public String toString() {
	return "Inventario [cantidadMateriales=" + cantidadMateriales + ", cantidadDinero=" + cantidadDinero
			+ ", materiales=" + Arrays.toString(materiales) + "]";
}


}
