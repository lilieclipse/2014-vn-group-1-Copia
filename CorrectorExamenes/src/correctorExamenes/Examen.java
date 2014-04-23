package correctorExamenes;

import java.util.ArrayList;
import java.util.List;

public class Examen {
	private List<Pregunta> preguntas;
	private Correccion correccion;
	
	public Examen(){
		this.preguntas = new ArrayList<Pregunta>();
	}
	
	public List<Pregunta> getPreguntas(){
		return this.preguntas;
	}
	
	public Correccion getCorreccion(){
		return this.correccion;
	}
	
	public void setPreguntas(List<Pregunta> value){
		this.preguntas = value;
	}
	
	public void setCorreccion(Correccion value){
		this.correccion = value;
	}
	
	public double corregir(){
		return this.getCorreccion().nota(this.puntajePreguntasCorrectas(), this.puntajeTotalPreguntas());
	}
	
	private int puntajePreguntasCorrectas(){
		return this.getPreguntas().stream().filter(p -> p.esCorrecta() == true).mapToInt(preg -> preg.getPesoEspecifico()).sum();
	}
	
	private int puntajeTotalPreguntas(){
		return this.getPreguntas().stream().mapToInt(preg -> preg.getPesoEspecifico()).sum();
	}
}
