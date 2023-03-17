package CREACIONDECLASES;

	/*
	 * Cómo crear clases en JAVA:
	 * 
	 * Constructor: public (publico para todas las clases de un proyecto), protected 
	 * (desde cualquier punto del paquete, private (solo para la clase definida)
	 * 
	 * Getter: Para obtener un valor de una variable en un momento concreto
	 * 
	 * Setter: Para establecer valores en las variables definidas de la clase
	 * 
	 * Specifics Methods: Funciones que realizará clase
	 */


/////////////Constructores/////////////////
public class Alumno {
		private String nombre;
		private String DNI;
		private int edad;
		private int CP;
		private String sexo;
		
	///Constructor vacío///	
		public Alumno() {
			this.nombre="";
			this.DNI="";
			this.CP=0;
			this.edad=0;
			this.sexo="";
			
			
		
		}
		public Alumno(String nombre, String DNI, int CP, int edad, String sexo) {
			this.nombre=nombre;
			this.DNI=DNI;
			this.CP=CP;
			this.edad=edad;
			this.sexo=sexo;
			
			
			//Alumno Alex = new Alumno(Alex, 76547898J, 18011, 28, Masculino){
			//Alex.presentarse();}
			
			//syso (Alex.getNombre())
		}
		//////////////GETTER///////////////
		
		public String getNombre() {
			return this.nombre;
			
		}
		
		/////////////SETTER///////////////
		public void setNombre(String nombre) {
			this.nombre=nombre;
			
		}

		///////////// SPECIFIC METHODS ///////////////////
		public void presentarse() {
			System.out.println("hola me llamo " + this.nombre + " y mi dni es " + this.DNI);
		}



}