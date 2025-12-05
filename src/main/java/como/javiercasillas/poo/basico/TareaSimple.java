package como.javiercasillas.poo.basico;

public class TareaSimple {
	
  //Atributos
  String titulo;
  boolean Completada;
  
 
  public TareaSimple(String titulo, boolean completada) {
	super();
	this.titulo = titulo;
	Completada = completada;
}
  
  
  public TareaSimple() {
}

  

  //Getter and Setters
  
  
  public String getTitulo() {
	return titulo;
  }
  public void setTitulo(String titulo) {
	this.titulo = titulo;
  }
  public boolean isCompletada() {
	return Completada;
  }
  public void setCompletada(boolean completada) {
	Completada = completada;
  }
  public void mostarTarea() {
	  
  System.out.println("Esta es la tarea simple");
  
  
	  
  }
  public void cambiarEstado() {
	  
  }
}
