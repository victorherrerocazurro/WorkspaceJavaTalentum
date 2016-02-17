
public class Lanzador {

	public static void main(String[] args) {
		
		int factor = 10;
		
		for (int i = 1; i <= 9; i++) {
			//Previo al bucle de las columnas
			System.out.print(i * factor + " : ");
			
			//Bucle
			for (int j = 1; j <= 9; j++) {
				//Despues del bucle de las columnas
				if(j == 9){
					System.out.println(j*factor);
				} else {
					System.out.print(j * factor + ",");
				}
			}
		}
	}
}
