package cl.dmiranda;

//import java.io.BufferedWriter;
import java.io.File;
//import java.FileWriter;
//atributos
	public class LibroVenta {
		private String nombreVenta;
		private String fechaVenta; //pTENTE, EDAD,FECHA Y NOMBRE VEHIC
		private String directorio;
		private String ficheros = getNombreVenta();
		
		//Constructor	
		
		public LibroVenta (String nombreVenta, String fechaVenta)  {
			this.setNombreVenta(nombreVenta);
			this.setFechaVenta(fechaVenta);			
		}
				
		public String getNombreVenta() {
			return nombreVenta;
		}

		public void setNombreVenta(String nombreVenta) {
			this.nombreVenta = nombreVenta;
		}

		public String getFechaVenta() {
			return fechaVenta;
		}

		public void setFechaVenta(String fechaVenta) {
			this.fechaVenta = fechaVenta;
		}
		
		public void guardarVenta (Cliente cliente, Vehiculo vehiculo)  {
			}
        File archivo = new File("src/" + directorio + "/" + ficheros);
        
       /* try  {
        	if (!directorio.exists() == false)  {
        		
        		if (directorio.exists())  {
        			if (directorio.mkdirs())  {
        				System.out.println("Directorio creado");
        				try  {
        					  int fecha = Integer.parseInt(getFechaVenta());
        					  FileWriter writer = new FileWriter(archivo);
							BufferedWriter bufferedWriter = new BufferedWriter(writer);
							bufferedWriter.write(Cliente.getEdad() + "/n");
        				}
        			
        			}
        		}
        	}
        		
        }*/
		
		}
		

		
		
	 
