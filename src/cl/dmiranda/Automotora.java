package cl.dmiranda;

public class Automotora {

	public static void main(String[] args)  {
		//crea objetos de la clase correspondiente 
		MiniBus busecito = new MiniBus("Rojo", "AS-22-33", "Particular", 18);
		Taxi taxicito = new Taxi (null, null, 1000, 2000, 1000);//pasaje
		Bus bigBus = new Bus ("verde", "AA-BB-55", 12); //cant asientos
		Tienda tienda1 = new Tienda(44); 
		

				
		busecito.imprimeBus();
		System.out.println("---------------------------");
		System.out.println(taxicito.toString());
		System.out.println("---------------------------");
		tienda1.existeStock(); 
		System.out.println("---------------------------");
		bigBus.cantidDeAsientos();
		System.out.println("----------------------------");
		
		bigBus.utilidad(40, 1000);
		System.out.println("---------------------------");
		bigBus.gastoVencina();
		
	}
}
