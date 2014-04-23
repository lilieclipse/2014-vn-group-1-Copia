package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import correctorExamenes.Concreta;
import correctorExamenes.Examen;
import correctorExamenes.MultipleChoice;
import correctorExamenes.Regla3Simple;
import correctorExamenes.VerdaderoFalso;

public class TestRegla3 {
	
	public static Examen examen;
	public static Regla3Simple regla3Simple;
	
	@BeforeClass
	public static void testSetup(){
		VerdaderoFalso preg1 = new VerdaderoFalso("Domingo Cavallo estatizó la deuda privada como presidente del BCRA en 1982", 7, true, false);
		Concreta preg2 = new Concreta("¿Cuál es la capital de Bulgaria?", 4, "Sofía", "Sofía");
		MultipleChoice preg3 = new MultipleChoice("El resultado de 1 + 1 es", 5, 1, 1);
		examen = new Examen();
		examen.getPreguntas().add(preg1);
		examen.getPreguntas().add(preg2);
		examen.getPreguntas().add(preg3);
		regla3Simple = new Regla3Simple();
	}
	
	@Test
	public void elResultadoDeLaCorreccionPorReglaDe3DelExamenEs6() {
		
		examen.setCorreccion(regla3Simple);
		assertEquals(examen.corregir(), 6.0, 1);
	}
}
