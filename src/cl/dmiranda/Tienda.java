package cl.dmiranda;

public class Tienda extends Automotora{
	private Vehiculo vehiculo;
	private Vendedor vendedor;
	private int stock;
	
	public Tienda(int stock) {
		super();
		this.stock=stock;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
		
	public void existeStock()  {
		System.out.println("Cant. de Stock es: " + stock);
	}
	
	}
