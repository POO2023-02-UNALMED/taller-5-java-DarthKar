package zooAnimales;
import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
	}
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero= genero;	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTotalAnimales() {
		return totalAnimales;
	}
	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	public void totalPorTipo() {
		
	}
	
	public String toString() {
		return "Mi nombre es"+this.getNombre() + ", tengo una edad de"+ this.getEdad()+", habito en"+ this.getHabitat() +" y mi genero"+ this.getGenero()+", la zona en la que me ubico es "+this.getZona()+", en el zoo";
		
	}
	
}
