package correctorExamenes;

public class RestaPuntos implements Correccion {
	
	private int puntos;
	
	public RestaPuntos(int puntos){
		this.setPuntos(puntos);
	}
	
	public int getPuntos(){
		return this.puntos;
	}
	
	@Override
	public double nota(int puntajePreguntasCorrectas, int puntajeTotalPreguntas) {
		return puntajePreguntasCorrectas - this.getPuntos();
	}
	
	public void setPuntos(int value){
		this.puntos = value;
	}

}
