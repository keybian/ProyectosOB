
public class Buckles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroIf = 10;
		int numeroWhile=0;
		int numeroDoWhile=0;
		String estacion="tu abuela";
		if (numeroIf > 0) {
			System.out.println("es positivo");
		}else if(numeroIf < 0) {
			System.out.println("es negativo");
		}else {
			System.out.println("es cero");
		}
		
		while(numeroWhile < 3){
			System.out.println("este es un numero del contador del while: " + numeroWhile);
			numeroWhile++;
		}
		
		do {
			System.out.println("Este es el contador del Do While: " + numeroDoWhile );
			
		}while (numeroDoWhile!=0);
		
		for(int numeroFor = 0;numeroFor <=3;numeroFor++) {
			System.out.println("ESte el contador del For: " + numeroFor);
		}
		
		
		switch(estacion) {
		case "Verano":
			System.out.println("es verano");
			break;
		case "Invierno":
			System.out.println("es invierno");
			break;
		case "otoño":
			System.out.println("es otoño");
			break;
		case "Primavera":
			System.out.println("es primavra");
			break;
		default:
			System.out.println("lo que realmente tipeo fue: " + estacion);
			
		}
			

	}

}
