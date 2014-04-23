package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import correctorExamenes.Concreta;
import correctorExamenes.Examen;
import correctorExamenes.MultipleChoice;
import correctorExamenes.RestaPuntos;
import correctorExamenes.VerdaderoFalso;

public class testRestaPuntos {

	public static Examen examen;
	public static RestaPuntos restaDePuntos;
	
	@BeforeClass
	public static void testSetup(){
		VerdaderoFalso preg1 = new VerdaderoFalso("Domingo Cavallo estatiz� la deuda privada como presidente del BCRA en 1982", 7, true, false);
		Concreta preg2 = new Concreta("�Cu�l es la capital de Bulgaria?", 5, "Sof�a", "Sof�a");
		MultipleChoice preg3 = new MultipleChoice("El resultado de 1 + 1 es", 7, 1, 1);
		examen = new Examen();
		restaDePuntos = new RestaPuntos(6);
		examen.getPreguntas().add(preg1);
		examen.getPreguntas().add(preg2);
		examen.getPreguntas().add(preg3);
	}
	
	@Test
	public void elResultadoDeLaCorreccionSegunRestaDePuntosEs6(){
		examen.setCorreccion(restaDePuntos);
		assertEquals(examen.corregir(), 6.0, 1);
	}

}
