import java.util.*;
public class Calculadora{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double a,b;
		int eleccion;
		System.out.print("\nIngrese el primer numero: ");
		a=sc.nextDouble();
		System.out.print("Ingrese el segundo numero: ");
        	b=sc.nextDouble();
		System.out.println("\n===Operaciones===\n1 -> Suma\n2 -> Resta\n3 -> Multiplicacion\n4 -> Division\n5 -> Modulo\n=================");
		System.out.print("Seleccione la operacion: ");
        	eleccion=sc.nextInt();
		System.out.print("=================\nEl resultado de la operacion es: ");
		switch(eleccion){
		case(1): System.out.print(add(a,b));
			 break;
		case(2): System.out.print(sub(a,b));
                	 break;
		case(3): System.out.print(mul(a,b));
        	         break;
		case(4): System.out.print(div(a,b));
        	         break;
		case(5): System.out.print(mod(a,b));
		}
	}
	public static double div(double a, double b){
		return a/b;	
	}
	public static double add(double a, double b){
		return a + b;
	}
	public static double sub(double a, double b){
		return a - b;
	}
	public static double mul(double a, double b){
		return a*b;
	}	
	public static double mod(double a, double b){
		return a%b;
	}
}
