package correctorExamenes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class NotaMasAlta implements Correccion {
	private List<Correccion> criteriosCorreccion;
	
	public NotaMasAlta(){
		this.criteriosCorreccion = new ArrayList<Correccion>();
	}

	@Override
	public double nota(int puntajePreguntasCorrectas, int puntajeTotalPreguntas) {
		DoubleStream notas = this.getCriteriosCorreccion().stream().mapToDouble(crit -> crit.nota(puntajePreguntasCorrectas, puntajeTotalPreguntas));
		return notas.max().getAsDouble();
	}
	
	public List<Correccion> getCriteriosCorreccion(){
		return this.criteriosCorreccion;
	}
	
	public void setCriteriosCorreccion(List<Correccion> value){
		this.criteriosCorreccion = value;
	}
	
}
