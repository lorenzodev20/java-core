package galaxy.training.sessions.four.jfc.bean;

public class FrutaInternacional implements Fruta{

    private Long 	codigo;
    private String 	nombre;
    private Integer cantidad;
    private String 	preferencia;

    @Override
    public Long getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(Long codigo) {

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Integer getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(Integer cantidad) {
        this.cantidad=cantidad;
    }

    @Override
    public String getPreferencia() {
        return preferencia;
    }

    @Override
    public void setPreferencia(String preferencia) {
        this.preferencia=preferencia;
    }
}
