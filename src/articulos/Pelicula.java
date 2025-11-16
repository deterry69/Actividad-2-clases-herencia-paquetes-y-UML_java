//Este comando indica en qué paquete se encuentra la clase.
package articulos;
//Declara atributos privados.
public class Pelicula extends Articulo {
    private String director;
    private int duracion;
//Constructor con parámetros: inicializa los atributos al crear un objeto.
    public Pelicula(String titulo, int anyoLanzamiento, double precioPorDia, String director, int duracion) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.duracion = duracion;
    }
//Constructor vacío: permite crear un objeto sin inicializar atributos.
    public String director() {
        return director;
    }
//Sirven para acceder y modificar los atributos privados de una clase, respectivamente, lo que permite un control y una encapsulación adecuados de los datos.
    public void setDirector(String director) {
        this.director = director;
    }

    public int duracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
//Convierte la duración de minutos a horas y minutos y lo imprime.
    public void getDuracionHorasYMinutos() {
        int horas = duracion / 60;
        int minutos = duracion % 60;
        System.out.println(horas + " horas y " + minutos + " minutos");
    }
//Devuelve la duración en segundos.
    public int getDuracionSegundos() {
        return duracion * 60;
    }
//Devuelve una representación en texto.
    @Override
    public String toString() {
        return "[Pelicula] " + titulo() + ", de " + director + "(" + precioPorDia() + " €/dia)";
    }
}

