package correctorExamenes;

public class Regla3Simple implements Correccion {

	@Override
	public double nota(int preguntasCorrectas, int totalPreguntas) {
		return (preguntasCorrectas * 10) / totalPreguntas;
	}

}
