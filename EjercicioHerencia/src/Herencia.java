
public class Herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Keybian");
		cliente.setEdad(43);
		cliente.setTelefono(4140562);
		cliente.setCredito(1500);
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getEdad());
		System.out.println(cliente.getTelefono());
		System.out.println(cliente.getCredito());
		
		Trabajador trabajador = new Trabajador();
		trabajador.setNombre("Mathias");
		trabajador.setEdad(18);
		trabajador.setTelefono(4140561);
		trabajador.setSalario(8000);
		System.out.println(trabajador.getNombre());
		System.out.println(trabajador.getEdad());
		System.out.println(trabajador.getTelefono());
		System.out.println(trabajador.getSalario());
		
		
		

	}
	
	public static class Persona{
		private int edad;
		private String nombre;
		private int telefono;
		
		public void setNombre(String nombre) {
			this.nombre= nombre;
		}
		
		public String getNombre() {
			return this.nombre;
		}
		public void setEdad(int edad) {
			this.edad= edad;
		}
		
		public int getEdad() {
			return this.edad;
		}
		
		public void setTelefono(int telefono) {
			this.telefono= telefono;
		}
		
		public int getTelefono() {
			return this.telefono;
		}
		
		
	}
	
	  public static class Cliente extends Persona {
		
	  private	int credito;
	  
	  public void setCredito(int credito) {
			this.credito= credito;
		}
		
		public int getCredito() {
			return this.credito;
		}
		
		
	}
	
	public static class Trabajador extends Persona {
		
		private int salario;
		
		public void setSalario(int salario) {
			this.salario= salario;
		}
		
		public int getSalario() {
			return this.salario;
		}
	}

}
