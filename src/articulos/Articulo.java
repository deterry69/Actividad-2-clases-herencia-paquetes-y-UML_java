//Este comando indica en qué paquete se encuentra la clase.
package articulos;
//Declara atributos privados del artículo: título, año de lanzamiento y precio diario.
public class Articulo {
    private String titulo;
    private int anyoLanzamiento;
    private double precioPorDia;
//Constructor con parámetros: inicializa los atributos al crear un objeto.
    public Articulo(String titulo, int anyoLanzamiento, double precioPorDia) {
        this.titulo = titulo;
        this.anyoLanzamiento = anyoLanzamiento;
        this.precioPorDia = precioPorDia;
    }
//Constructor vacío: permite crear un objeto sin inicializar atributos.
    public Articulo() {
    }
//Sirven para acceder y modificar los atributos privados de una clase, respectivamente, lo que permite un control y una encapsulación adecuados de los datos.
    public String titulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int anyoLanzamiento() {
        return anyoLanzamiento;
    }

    public void setAnyoLanzamiento(int anyoLanzamiento) {
        this.anyoLanzamiento = anyoLanzamiento;
    }

    public double precioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }
    //Calcula el precio total de varios artículos por varios días.
    public double calcularPrecio(double numArticulos, int dias) {
        return numArticulos * dias * precioPorDia;
    }
    //Devuelve una representación en texto..
    @Override
    public String toString() {
        return "[Artículo] " + titulo + "(" + precioPorDia + " €)";
    }

    public double getPrecioBase() {
        return 0;
    }
}
