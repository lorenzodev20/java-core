package galaxy.training.sessions.four.jfc.bean;

//import lombok.Builder;
//import lombok.Data;

import java.util.Objects;

//@Data
//@Builder
public class FrutaClasica {

	private Long 	codigo;
	private String 	nombre;
	private Integer cantidad;
	private String 	preferencia;
	
	public FrutaClasica() {
		super();
	}
	
	
	public FrutaClasica(Long codigo, String nombre, Integer cantidad, String preferencia) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.preferencia = preferencia;
	}


	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getPreferencia() {
		return preferencia;
	}
	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}


	@Override
	public String toString() {
		return "FrutaClásica [codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", preferencia="
				+ preferencia + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof FrutaClasica that)) return false;
        return Objects.equals(getCodigo(), that.getCodigo()) && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getCantidad(), that.getCantidad()) && Objects.equals(getPreferencia(), that.getPreferencia());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCodigo(), getNombre(), getCantidad(), getPreferencia());
	}
}
