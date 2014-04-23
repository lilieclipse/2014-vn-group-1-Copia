package correctorExamenes;

public class MultipleChoice extends Pregunta {

	private Integer respuestaAlumno;
	private Integer respuestaCorrecta;
	
	public MultipleChoice(String titulo, int peso, int respuestaAlumno, int respuestaCorrecta){
		this.setTitulo(titulo);
		this.setPesoEspecifico(peso);
		this.setRespuestaAlumno(respuestaAlumno);
		this.setRespuestaCorrecta(respuestaCorrecta);
	}
	
	public Integer getRespuestaAlumno() {
		return this.respuestaAlumno;
	}
	
	public Integer getRespuestaCorrecta() {
		return this.respuestaCorrecta;
	}
	
	public void setRespuestaAlumno(Integer value) {
		this.respuestaAlumno = value;
	}
	
	public void setRespuestaCorrecta(Integer value){
		this.respuestaCorrecta = value;
	}
}
