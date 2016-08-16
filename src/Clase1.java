import java.util.Scanner;

public class Clase1 {
	public static void main(String[] parametro){
		 Scanner teclado=new Scanner(System.in);
		 System.out.println("Ingrese el valor 1");
		 int num1 = teclado.nextInt();
		 System.out.println("Ingrese el valor 2");
		 int num2 = teclado.nextInt();
		 int suma = num1+num2;
		 System.out.println("La suma da:"+ suma);
	}
}
