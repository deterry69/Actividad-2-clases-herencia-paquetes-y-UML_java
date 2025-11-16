//Este comando indica en qué paquete se encuentra la clase.
package usuarios;

//La clase Administrador hereda de Usuario.
public class Administrador extends Usuario {

    //Enumerado que define el rol del administrador.
    public enum Rol {
        Jefe,
        Vendedor;
        }

//Atributo que indica el tipo de rol del administrador.
    private Rol rol;

    //Constructor con parámetros: inicializa los atributos heredados y el rol del administrador.
    public Administrador(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Rol rol) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.rol = rol;
    }

    //Constructor vacío: permite crear un administrador sin inicializar atributos.
    public Administrador() {

    }

    //Sirven para acceder y modificar el rol del administrador.
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    //Asigna un artículo a un usuario, usando el método setArticulo().
    public void asignarArticulo(Usuario usuario, String articulo) {
        usuario.setArticulo(articulo);
    }

    //Elimina el artículo del usuario estableciéndolo a null.
    public void retirarArticulo(Usuario usuario) {
        usuario.setArticulo(null);
    }

    //Devuelve una representación en texto.
    @Override
    public String toString() {
        return "Cliente()";
    }
}




