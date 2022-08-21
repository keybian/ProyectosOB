
public class Encapsulacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		persona.setNombre("Keybian");
		persona.setEdad(18);
		persona.setTelefono(4140562);
		
		System.out.println(persona.getNombre());
		System.out.println(persona.getEdad());
		System.out.println(persona.getTelefono());
		
	}
	
	public static class Persona {
		private String nombre;
		private int edad;
		private int telefono;
	
		public String getNombre() {		
			return this.nombre;		
		}
	
		public void setNombre(String nombre) {
			this.nombre=nombre;
		}
	
		public int getEdad() {
			return this.edad;
		}
	
		public void setEdad(int edad) {
			this.edad=edad;
		}
	
		public int getTelefono() {
			return this.telefono;
		}
	
		public void setTelefono(int telefono) {
			this.telefono=telefono;
		}
	}

}
