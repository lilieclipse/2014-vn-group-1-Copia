package correctorExamenes;

public class Pregunta {
	
	private String titulo;
	private int pesoEspecifico;
	private Object respuestaCorrecta;
	private Object respuestaAlumno;
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public int getPesoEspecifico() {
		return this.pesoEspecifico;
	}

	public Object getRespuestaAlumno(){
		return this.respuestaAlumno;
	}
	
	public Object getRespuestaCorrecta(){
		return this.respuestaCorrecta;
	}
	
	public boolean esCorrecta(){
		return this.getRespuestaCorrecta() == this.getRespuestaAlumno();
	}
	
	public String setTitulo(String value){
		return this.titulo = value;
	}
	
	public void setPesoEspecifico(int value){
		this.pesoEspecifico = value;
	}
	
	public void setRespuestaCorrecta(Object value){
		this.respuestaCorrecta = value;
	}
	
	public void setRespuestaAlumno(Object value){
		this.respuestaAlumno = value;
	}
}
