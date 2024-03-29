package practica1;
import java.util.Scanner;

/**
 * La clase Notas permite ingresar, calcular y mostrar las notas de un estudiante,
 * además de verificar si ha aprobado o suspendido.
 * 
 * 
 * @author Jose Raul Martin
 */
public class notas {
	//declaramos la variables que nos hacen falta
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	//utilizamos scanner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	
	 /**
     * Método para ingresar las notas del estudiante.
     */
	
	public void InsertarNotas() {
		//cuando ejecutamos este metodo lo primero que queremos es que nos pida las notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	

	 /**
     * Método para comprobar la correcta introducción de notas.
     */
	
	public void comprobarcion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	
	/**
     * Método para calcular la nota definitiva del estudiante.
     */
	
	public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		
	}
	/**
     * Método para mostrar las notas introducidas y la nota definitiva del estudiante.
     */
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}
	/**
     * Método para verificar si el estudiante ha aprobado o suspendido.
     * 
     * @return una cadena que indica si el estudiante ha aprobado o suspendido.
     */

	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
		
	public static void main(String[] args) {
		// Creamos un objeto de la clase Notas
		notas fc= new notas();
		// Llamamos a los métodos para ingresar, calcular, mostrar y verificar las notas
		fc.InsertarNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		// Verificamos si el estudiante ha aprobado o suspendido
		fc.aprobado();
		
	}

}
