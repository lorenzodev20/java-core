package pe.edu.galaxy.training.java.jd0.app;

public class Fruta {
    private String nombre;
    private int cantidad;
    private String favorito;

    public Fruta(String nombre, int cantidad, String favorito) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.favorito = favorito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", favorito='" + favorito + '\'' +
                '}';
    }
}
