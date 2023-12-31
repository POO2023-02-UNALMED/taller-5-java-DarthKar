package zooAnimales;
import java.util.ArrayList;
public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	public static int iguanas=0;
	public static int serpientes=0;
	private String colorEscamas;
	private int largoCola;
	
	private static int cantidadReptiles=0;
	static {
	    listado = new ArrayList<Reptil>();
	}
	public Reptil() {
		super("",0,"","");
		 listado.add(this);
		cantidadReptiles++;
	}
	public Reptil(String nombre, int edad, String habitad, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitad, genero);
        this.colorEscamas=colorEscamas;
        this.largoCola=largoCola;
        listado.add(this);
        cantidadReptiles++;
	}
	public Reptil(String nombre, int edad, String habitad, String genero, String colorEscamas) {
        super(nombre, edad, habitad, genero);
        this.colorEscamas=colorEscamas;
        listado.add(this);
        cantidadReptiles++;
	}
	public Reptil(String nombre, int edad, String habitad, String genero, int largoCola) {
        super(nombre, edad, habitad, genero);
        this.largoCola=largoCola;
        listado.add(this);
        cantidadReptiles++;
    }
	public Reptil(String nombre, int edad, String habitad, String genero) {
        super(nombre, edad, habitad, genero);
        listado.add(this);
        cantidadReptiles++;
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana= new Reptil(nombre, edad, "humedal", genero);
		iguana.setColorEscamas("verde");
		iguana.setLargoCola(3);
		listado.add(iguana);
		Reptil.iguanas++;
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente= new Reptil(nombre, edad, "jungla", genero);
		serpiente.setColorEscamas("blanco");
		serpiente.setLargoCola(1);
		listado.add(serpiente);
		Reptil.serpientes++;
		return serpiente;
	}
	
	public String movimiento() {
		return "reptar";
	}
	

	public ArrayList<Reptil> getListado() {
		return Reptil.listado;
	}

	public void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

	public static int cantidadReptiles() {
		return cantidadReptiles;
	}
	
}
