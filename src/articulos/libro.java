//Este comando indica en qué paquete se encuentra la clase.
package articulos;
//Declara atributos privados.
public class libro extends Articulo {
    private String autor;
    private int numPaginas;
    public enum Genero {Misterio, Terror, Accion, Historia, Fantasia}
    private Genero genero;
//Constructor con parámetros: inicializa los atributos al crear un objeto.
    public libro(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numPaginas) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
//Constructor vacío: permite crear un objeto sin inicializar atributos.
    public libro() {
    }
//Defino la variable del número de páginas, que en este caso serían 100.
    public libro(String titulo, int anyoLanzamiento, String autor, double precioPorDia, Genero genero) {
        this.setTitulo(titulo);
        this.setAnyoLanzamiento(anyoLanzamiento);
        this.autor = autor;
        this.setPrecioPorDia(precioPorDia);
        this.genero = genero;
        this.numPaginas = 100;
    }
//Sirven para acceder y modificar los atributos privados de una clase, respectivamente, lo que permite un control y una encapsulación adecuados de los datos.
    public String autor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int numPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero genero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
//Método que devuelve true si el libro tiene más de 200 páginas.
    public boolean esLargo() {
        return numPaginas > 200;
    }
//Devuelve una representación en texto.
    @Override
    public String toString() {
        return "[Libro] " + titulo() + ", de " + autor + "(" + precioPorDia() + " €)";
    }
}


