//Este comando indica en qué paquete se encuentra la clase.
package articulos;
//Declara atributos privados.
public class Videojuego extends Articulo {
    private String director;
    private String plataformas;
    private int pegi;
//Constructor con parámetros: inicializa los atributos al crear un objeto.
    public Videojuego(String titulo, int anyoLanzamiento, double precioPorDia, String director, String plataformas, int pegi) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.plataformas = plataformas;
        this.pegi = pegi;
    }
//Constructor vacío: permite crear un objeto sin inicializar atributos.
    public Videojuego() {
    }
//Sirven para acceder y modificar los atributos privados de una clase, respectivamente, lo que permite un control y una encapsulación adecuados de los datos.
    public String director() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String plataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public int pegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }
//Devuelve true si el juego es solo para adultos.
    public boolean paraAdultos() {
        return pegi >= 18;
    }
//Comprueba si una persona de cierta edad puede jugarlo según el PEGI.
    public boolean esApto(int edad) {
        return edad >= pegi;
    }
//Devuelve una representación en texto.
    @Override
    public String toString() {
        return "[Videojuego] " + titulo() + ", de " + director() + "(" + precioPorDia() + " €/dia)";
    }
}
