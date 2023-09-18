package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones=0;
	public static int aguilas=0;
	private String colorPlumas;
	
private static int cantidadAves=0;
	public Ave() {
		super("",0,"","");
		 listado.add(this);
		cantidadAves++;
	}
	public Ave(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        listado.add(this);
        cantidadAves++;
	}
	public Ave(String nombre, int edad, String habitad, String genero, String colorPlumas) {
        super(nombre, edad, habitad, genero);
        this.colorPlumas=colorPlumas;
        listado.add(this);
        cantidadAves++;
	}
	public static Ave crearHalcon(String nombre, int edad,String genero) {
        Ave halcon = new Ave(nombre, edad, "montanas", genero);
        halcon.setColorPlumas("cafe glorioso");
        listado.add(halcon);
        Ave.halcones++;
        return halcon;
	}
	public static Ave crearAguila(String nombre, int edad,String genero) {
        Ave aguila = new Ave(nombre, edad, "montanas", genero);
        aguila.setColorPlumas("blanco y amarillo");
        listado.add(aguila);
        Ave.aguilas++;
        return aguila;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static int cantidadAves() {
		return cantidadAves;
	}
	
	public ArrayList<Ave> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

}
