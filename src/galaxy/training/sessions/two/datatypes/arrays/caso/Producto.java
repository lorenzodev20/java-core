package pe.edu.galaxy.training.java.jd0.app.caso;

public class Producto {

	// 1.- Atributos/Fields
	/*
	 * 
	 * 
	 */
	//private/protected/public 
	private Long id;
	private String nombre;
	private Double precio;
	private Integer cantidad;
	
	// 2.- Metodos
	
	   // 2.1  Constructores
	
	public Producto() {
		
	}
		
	public Producto(Long id,String nombre) {
		this.id=id;
		this.nombre=nombre;
		//this.precio=0.0;
		this.cantidad=0;
	}


	public Producto(String nombre, Double precio, Integer cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	
	
	   public Producto(Long id, String nombre, Double precio, Integer cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	// 2.2  Getters/Setters
	public void setId(Long id) throws Exception {
		if (id==null || id <=0) {
			throw new Exception("El id "+ id + " No es válido");
		}
		this.id=id;
	}
	public Long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		try {
			return "Producto ["
					+ "id=" + id 
					+", nombre=" + nombre + ","
					+" precio=" + precio + ", "
					+ "cantidad=" + cantidad + ", "
					+ "total=" + this.total() + ", "
					+ "]";
		} catch (Exception e) {
			return "";
		}
		
	}

	public Double total() throws Exception {
		if (precio==null ) {
			throw new Exception("El precio "+ precio + " No es válido");
		}
		if (cantidad==null ) {
			throw new Exception("El cantidad "+ cantidad + " No es válido");
		}
		return this.precio*this.cantidad;
	}
	
	   // 2.3  Operacionales
	
	
}
