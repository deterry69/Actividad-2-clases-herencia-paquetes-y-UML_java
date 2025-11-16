//Este comando indica en qué paquete se encuentra la clase.
package usuarios;

import articulos.Articulo;

//La clase Cliente hereda de Usuario.
public class Cliente extends Usuario {
    private Articulo articulo;
    private int numSocio;

    //Constructor con parámetros: inicializa los atributos del usuario y del cliente.
    public Cliente(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Articulo articulo, int numSocio) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.articulo = articulo;
        this.numSocio = numSocio;
    }

    //Constructor alternativo: inicializa solo el artículo y número de socio.
    public Cliente(Articulo articulo, int numSocio) {
        this.articulo = articulo;
        this.numSocio = numSocio;
    }

    //Constructor vacío: crea un cliente con valores por defecto.
    public Cliente() {
        super();
//Crea un artículo vacío.
        this.articulo = new Articulo();
        this.numSocio = 0;
    }

//Sirven para modificar y acceder al artículo del cliente.
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
//Sirven para modificar y acceder al número de socio.
    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    //Método que calcula el precio total según el número de artículos y días.
//Usa el precio base del artículo.
    public double calcularPrecio(int numArticulos, int dias) {

        return this.articulo.getPrecioBase() * numArticulos * dias;
    }

    //Devuelve una representación en texto.
    @Override
    public String toString() {
       return "Cliente()";
    }
}
