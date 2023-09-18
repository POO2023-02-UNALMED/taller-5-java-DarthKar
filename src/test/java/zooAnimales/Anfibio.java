package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public static int ranas=0;
	public static int salamandras=0;
	private String colorPiel;
	private boolean venenoso;
	
	private static int cantidadAnfibios=0;
	
	public Anfibio() {
		super("",0,"","");
		cantidadAnfibios++;
	}
	public Anfibio(String nombre, int edad, String habitad, String genero) {
		super(nombre,edad,habitad,genero);
		cantidadAnfibios++;
	}
	
	public Anfibio(String nombre, int edad, String habitad, String genero, String colorPiel, boolean venenoso) {
		super(nombre,edad,habitad,genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		cantidadAnfibios++;
	}
	
	public Anfibio(String nombre, int edad, String habitad, String genero, String colorPiel) {
		super(nombre,edad,habitad,genero);
		this.colorPiel=colorPiel;
		cantidadAnfibios++;
	}
	public Anfibio(String nombre, int edad, String habitad, String genero, boolean venenoso) {
		super(nombre,edad,habitad,genero);
		this.venenoso=venenoso;
		cantidadAnfibios++;
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio Rana = new Anfibio(nombre, edad, "selva", genero);
		Rana.setColorPiel("rojo");
		Rana.setVenenoso(true);
		Anfibio.listado.add(Rana);
		Anfibio.ranas++;
		return Rana;
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio Salamandra = new Anfibio(nombre, edad, "selva", genero);
		Salamandra.setColorPiel("negro y amarillo");
		Salamandra.setVenenoso(false);
		listado.add(Salamandra);
		Anfibio.salamandras++;
		return Salamandra;
	}
	
	public String movimiento() {
		return "saltar";
	}
	public ArrayList<Anfibio> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public static int getCantidadAnfibios() {
		return cantidadAnfibios;
	}
	
}
