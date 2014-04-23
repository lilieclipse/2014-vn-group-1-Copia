package correctorExamenes;

public class Test {

	public static void main(String[] args) {
		VerdaderoFalso preg1 = new VerdaderoFalso("Domingo Cavallo estatizó la deuda privada como presidente del BCRA en 1982", 7, true, false);
		Concreta preg2 = new Concreta("¿Cuál es la capital de Bulgaria?", 5, "Sofía", "Sofía");
		MultipleChoice preg3 = new MultipleChoice("El resultado de 1 + 1 es", 7, 1, 1);

		
		Examen exa = new Examen();
		exa.getPreguntas().add(preg1);
		exa.getPreguntas().add(preg2);
		exa.getPreguntas().add(preg3);
		
		Regla3Simple correccionRegla3 = new Regla3Simple();
		exa.setCorreccion(correccionRegla3);

		System.out.println("La nota por regla de 3 es: " + exa.corregir());

		
		Punto punto1= new Punto(16,10);
		Punto punto2= new Punto(15,8);
		Punto punto3= new Punto(14,6);
		Punto punto4= new Punto(13,4);
		TablaPuntuacion tablaConversion = new TablaPuntuacion();
		tablaConversion.getTablaDePuntos().add(punto1);
		tablaConversion.getTablaDePuntos().add(punto2);
		tablaConversion.getTablaDePuntos().add(punto3);
		tablaConversion.getTablaDePuntos().add(punto4);
		
		exa.setCorreccion(tablaConversion);
				
		System.out.println("La nota por tabla de puntos es: " + exa.corregir());
		
		NotaMasAlta notaMasAlta = new NotaMasAlta();
		notaMasAlta.getCriteriosCorreccion().add(correccionRegla3);
		notaMasAlta.getCriteriosCorreccion().add(tablaConversion);
		exa.setCorreccion(notaMasAlta);
		
		System.out.println("La nota por nota más alta es: " + exa.corregir());
		
		Promedio prom = new Promedio();
		prom.getCriteriosCorreccion().add(correccionRegla3);
		prom.getCriteriosCorreccion().add(tablaConversion);
		exa.setCorreccion(prom);
		
		System.out.println("La nota por promedio es: " + exa.corregir());
		
		RestaPuntos resta = new RestaPuntos(6);
		exa.setCorreccion(resta);

		System.out.println("La nota por resta es: " + exa.corregir());
		
		
	}
}
