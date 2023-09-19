package zooAnimales;
import java.util.ArrayList;
public class Mamifero extends Animal{
	
	private static ArrayList<Mamifero> listado;
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;
	private static int cantidadMamiferos = 0;
	
	
	static {
	    listado = new ArrayList<Mamifero>();
	}
	public Mamifero() {
		   super("",0,"","");
		   listado.add(this);
		   cantidadMamiferos++;
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje=pelaje;
        this.patas=patas;
        listado.add(this);
        cantidadMamiferos++;
    }
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje) {
        super(nombre, edad, habitat, genero);
        this.pelaje=pelaje;
        listado.add(this);
        cantidadMamiferos++;
    }
	public Mamifero(String nombre, int edad, String habitat, String genero,int patas) {
        super(nombre, edad, habitat, genero);
        this.patas=patas;
        listado.add(this);
        cantidadMamiferos++;
    }
	public Mamifero(String nombre, int edad, String habitat, String genero) {
	        super(nombre, edad, habitat, genero);
	        listado.add(this);
        cantidadMamiferos++;
	}
	public static Mamifero crearCaballo(String nombre, int edad,String genero) {
	        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero);
	        caballo.setPelaje(true);
	        caballo.setPatas(4);
	        listado.add(caballo);
	        Mamifero.caballos++;
	        return caballo;
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
	        Mamifero leon = new Mamifero(nombre, edad, "selva", genero);
	        leon.setPelaje(true);
	        leon.setPatas(4);
	        listado.add(leon);
	        Mamifero.leones++;
	        return leon; 
	}
	
	
	public static int cantidadMamiferos() {
		
		return cantidadMamiferos;
	}
	public ArrayList<Mamifero> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}
