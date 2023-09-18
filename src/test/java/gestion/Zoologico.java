package gestion;
import java.util.ArrayList;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {
		 this.nombre = "";
	     this.ubicacion = "";
	     this.zonas = new ArrayList<Zona>();
	}
	public Zoologico(String nombre, String ubicacion) {
	        this.nombre = nombre;
	        this.ubicacion = ubicacion;
	        this.zonas = new ArrayList<Zona>();
    }
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
		zona.setZoo(this);
	}
	public int cantidadTotalAnimales() {
		int cantidadTotalAnimales = 0;
		for (int i=0; i<zonas.size();i++) {
			Zona zona = zonas.get(i);
			cantidadTotalAnimales += zona.cantidadAnimales();
		}
		return cantidadTotalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
}