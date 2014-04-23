package correctorExamenes;

public class Concreta extends Pregunta {
	private String respuestaAlumno;
	private String respuestaCorrecta;
	
	public Concreta(String titulo, int peso, String respuestaAlumno, String respuestaCorrecta){
		this.setTitulo(titulo);
		this.setPesoEspecifico(peso);
		this.setRespuestaAlumno(respuestaAlumno);
		this.setRespuestaCorrecta(respuestaCorrecta);
	}
	
	public String getRespuestaAlumno() {
		return this.respuestaAlumno;
	}
	
	public String getRespuestaCorrecta(){
		return this.respuestaCorrecta;
	}
	
	public void setRespuestaAlumno(String value) {
		this.respuestaAlumno = value;
	}
	
	public void setRespuestaCorrecta(String value){
		this.respuestaCorrecta = value;
	}
}
