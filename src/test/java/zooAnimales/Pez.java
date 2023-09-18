package zooAnimales;
import java.util.ArrayList;
public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public static int salmones=0;
	public static int bacalaos=0;
	private String colorEscamas;
	private int cantidadAletas;
	
	private static int cantidadPeces=0;
	
	public Pez() {
		super("",0,"","");
		cantidadPeces++;
	}	
	public Pez(String nombre, int edad, String habitad, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitad,genero);
		this.setColorEscamas(colorEscamas);
		this.setCantidadAletas(cantidadAletas);
		cantidadPeces++;
		
	}
	public Pez(String nombre, int edad, String habitad, String genero, String colorEscamas) {
		super(nombre,edad,habitad,genero);
		this.setColorEscamas(colorEscamas);
		cantidadPeces++;
	}
	public Pez(String nombre, int edad, String habitad, String genero,int cantidadAletas) {
		super(nombre,edad,habitad,genero);
		this.setCantidadAletas(cantidadAletas);
		cantidadPeces++;
	}
	public Pez(String nombre, int edad, String habitad, String genero) {
		super(nombre, edad, habitad, genero);
		cantidadPeces++;
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre,edad,"oceano",genero);
		salmon.setCantidadAletas(6);
		salmon.setColorEscamas("rojo");
		Pez.listado.add(salmon);
		Pez.salmones++;
		return salmon;
		
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre,edad,"oceano",genero);
		bacalao.setCantidadAletas(6);
		bacalao.setColorEscamas("gris");
		listado.add(bacalao);
		Pez.bacalaos++;
		return bacalao;
		
}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static int cantidadPeces() {
		return cantidadPeces;
	}
	
	public ArrayList<Pez> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	
	
	
}
