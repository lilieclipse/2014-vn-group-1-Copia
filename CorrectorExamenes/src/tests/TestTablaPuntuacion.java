package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import correctorExamenes.Concreta;
import correctorExamenes.Examen;
import correctorExamenes.MultipleChoice;
import correctorExamenes.Punto;
import correctorExamenes.TablaPuntuacion;
import correctorExamenes.VerdaderoFalso;

public class TestTablaPuntuacion {
	
	public static Examen examen;
	public static TablaPuntuacion tablaConversion;

	@BeforeClass
	public static void testSetup(){
		VerdaderoFalso preg1 = new VerdaderoFalso("Domingo Cavallo estatizó la deuda privada como presidente del BCRA en 1982", 7, true, false);
		Concreta preg2 = new Concreta("¿Cuál es la capital de Bulgaria?", 4, "Sofía", "Sofía");
		MultipleChoice preg3 = new MultipleChoice("El resultado de 1 + 1 es", 5, 1, 1);
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
		
	}
	
	@Test
	public void elResultadoDeLaCorreccionPorTablaDePuntosDelExamenEs2() {
		examen.setCorreccion(tablaConversion);
		assertEquals(examen.corregir(), 2.0, 1);
	}

}
