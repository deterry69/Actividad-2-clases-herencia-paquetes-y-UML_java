//Este comando indica en qué paquete se encuentra la clase.
package usuarios;

//Declara atributos privados del usuario.
public class Usuario {
    private String nombreUsuario;
    private String contrasenya;
    private int id;
    private static int anyoNacimiento;
    private String articulo;

    //Constructor con parámetros: inicializa los atributos al crear un objeto.
    public Usuario(String nombreUsuario, String contrasenya, int id, int anyoNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.id = id;
        this.anyoNacimiento = anyoNacimiento;
    }

    //Constructor vacío: permite crear un objeto sin inicializar atributos.
    public Usuario() {
    }

    //Sirven para acceder y modificar los atributos privados de una clase, respectivamente.
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    //Método estático que calcula si el usuario es mayor de edad según el año actual.
    public static boolean esAdulto(){

        int edadCalculada = 2025 - anyoNacimiento;
        return edadCalculada >= 18;
    }

    //Comprueba si la contraseña es segura, es decir, mayor de 10 caracteres.
    public boolean contrasenyaSegura() {
        return this.contrasenya != null && this.contrasenya.length() > 10;
    }

    //Devuelve una representación en texto.
    @Override
    public String toString() {
        return "()";
    }
}