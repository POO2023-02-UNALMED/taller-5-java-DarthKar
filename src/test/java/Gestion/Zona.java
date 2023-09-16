package Gestion;
import java.util.ArrayList;
import zooAnimales.Animal;
public class Zona {
	private String nombre;
	private ArrayList<Zoologico> zoo;
	private ArrayList<Animal> animales;
	
	public Zona() {
		
	}

    public Zona(String nombre) {
        this.nombre = nombre;
        animales = new ArrayList<Animal>();
    }
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
		animal.setZona(this);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Zoologico> getZoo() {
		return zoo;
	}

	public void setZoo(ArrayList<Zoologico> zoo) {
		this.zoo = zoo;
	}
}
