//Este comando indica en qué paquete se encuentra la clase.
package articulos;
//Declara atributos privados.
public class AlbumMusica extends Articulo {
    private String autor;
    private int numCanciones;
    private boolean single;
//Constructor con parámetros: inicializa los atributos al crear un objeto.
    public AlbumMusica(String titulo, int anyoLanzamiento, double precioPorDia, String director, int numCanciones, boolean single) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numCanciones = numCanciones;
        this.single = single;
    }
//Constructor vacío: permite crear un objeto sin inicializar atributos.
    public AlbumMusica() {
    }
//Sirven para acceder y modificar los atributos privados de una clase, respectivamente, lo que permite un control y una encapsulación adecuados de los datos.
    public String autor() {
        return autor;
    }

    public void setDirector(String autor) {
        this.autor = autor;
    }

    public int numCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public boolean single() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }
//Calcula la duración total del álbum multiplicando la duración de cada canción por el número de canciones.
    public double getDuracionTotal(int duracion){
        return numCanciones * duracion;
    }
//Devuelve una representación en texto.
    @Override
    public String toString() {
        return "[Album] " + titulo() + ", de " + autor + "(" + precioPorDia() + " €/dia)";
    }
}
