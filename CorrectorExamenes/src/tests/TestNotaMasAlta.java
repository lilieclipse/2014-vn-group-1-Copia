package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import correctorExamenes.Concreta;
import correctorExamenes.Examen;
import correctorExamenes.MultipleChoice;
import correctorExamenes.NotaMasAlta;
import correctorExamenes.Punto;
import correctorExamenes.Regla3Simple;
import correctorExamenes.TablaPuntuacion;
import correctorExamenes.VerdaderoFalso;

public class TestNotaMasAlta {

	public static Examen examen;
	public static Regla3Simple correccionRegla3;
	public static TablaPuntuacion tablaConversion;
	public static NotaMasAlta notaMasAlta;
	
	@BeforeClass
	public static void testSetup(){
		VerdaderoFalso preg1 = new VerdaderoFalso("Domingo Cavallo estatizó la deuda privada como presidente del BCRA en 1982", 7, true, false);
		Concreta preg2 = new Concreta("¿Cuál es la capital de Bulgaria?", 5, "Sofía", "Sofía");
		MultipleChoice preg3 = new MultipleChoice("El resultado de 1 + 1 es", 7, 1, 1);
		examen = new Examen();
		examen.getPreguntas().add(preg1);
		examen.getPreguntas().add(preg2);
		examen.getPreguntas().add(preg3);
		
		Punto punto1= new Punto(16,10);
		Punto punto2= new Punto(15,8);
		Punto punto3= new Punto(14,6);
		Punto punto4= new Punto(13,4);
		tablaConversion = new TablaPuntuacion();
		tablaConversion.getTablaDePuntos().add(punto1);
		tablaConversion.getTablaDePuntos().add(punto2);
		tablaConversion.getTablaDePuntos().add(punto3);
		tablaConversion.getTablaDePuntos().add(punto4);
		
		correccionRegla3 = new Regla3Simple();
		
		notaMasAlta = new NotaMasAlta();
	}
	
	@Test
	public void elResultadoDeLaCorreccionPorCriteriosSegunNotaMasAltaEs6(){
		notaMasAlta.getCriteriosCorreccion().add(correccionRegla3);
		notaMasAlta.getCriteriosCorreccion().add(tablaConversion);
		examen.setCorreccion(notaMasAlta);
		assertEquals(examen.corregir(), 6.0, 1);
	}

}
