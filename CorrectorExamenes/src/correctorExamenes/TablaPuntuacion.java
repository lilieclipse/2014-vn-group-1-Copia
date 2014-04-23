package correctorExamenes;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class TablaPuntuacion implements Correccion {
	
	private List<Punto> tablaDePuntos;
	
	public TablaPuntuacion(){
		this.tablaDePuntos = new ArrayList<Punto>();
	}
	
	@Override
	public double nota(int puntajePreguntasCorrectas, int puntajeTotalPreguntas) {
		
		Stream<Punto> puntuaciones = this.tablaDePuntos.stream().filter(x -> x.getPuntaje() == puntajePreguntasCorrectas);
		OptionalDouble nota = null;
		if (puntuaciones != null && puntuaciones.count() > 0){
			nota =  this.tablaDePuntos.stream().filter(x -> x.getPuntaje() == puntajePreguntasCorrectas).mapToDouble(y -> y.getNota()).findFirst();
			if (nota != null)
				return nota.getAsDouble();
			else
				return 2;
		}
		else
		{	
			return 2;
		}
	}
	
	public List<Punto> getTablaDePuntos(){
		return this.tablaDePuntos;
	}
	
	public void setTablaDePuntos(List<Punto> value){
		this.tablaDePuntos = value;
	}
}
