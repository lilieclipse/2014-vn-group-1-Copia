package correctorExamenes;

public class Punto {
	private int nota;
	private int puntaje;
	
	public Punto(int puntaje, int nota){
		this.setNota(nota);
		this.setPuntaje(puntaje);
	}
	
	public int getNota(){
		return this.nota;
	}
	
	public int getPuntaje(){
		return this.puntaje;
	}
	
	public void setNota(int value){
		this.nota = value;
	}
	
	public void setPuntaje(int value){
		this.puntaje = value;
	}
}
