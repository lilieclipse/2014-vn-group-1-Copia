package correctorExamenes;

public class VerdaderoFalso extends Pregunta {
	
	private Boolean respuestaAlumno;
	private Boolean respuestaCorrecta;
	
	public VerdaderoFalso(String titulo, int peso, Boolean respuestaAlumno, Boolean respuestaCorrecta){
		this.setTitulo(titulo);
		this.setPesoEspecifico(peso);
		this.setRespuestaAlumno(respuestaAlumno);
		this.setRespuestaCorrecta(respuestaCorrecta);
	}
	
	public Boolean getRespuestaAlumno() {
		return this.respuestaAlumno;
	}
	
	public Boolean getRespuestaCorrecta(){
		return this.respuestaCorrecta;
	}
	
	public void setRespuestaAlumno(Boolean value) {
		this.respuestaAlumno = value;
	}
	
	public void setRespuestaCorrecta(Boolean value){
		this.respuestaCorrecta = value;
	}
}
