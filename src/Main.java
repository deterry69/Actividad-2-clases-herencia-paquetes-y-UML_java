import articulos.*;
import usuarios.*;

public class Main {
    public static void main(String[] args) {

        // 2 artículos de cada tipo
        AlbumMusica album1 = new AlbumMusica("LGL", 2021, 1.5, "JC Reyes", 10, false);
        AlbumMusica album2 = new AlbumMusica("El PLUGG 3", 2025, 2, "Yung Beef", 8, true);

        libro libro1 = new libro("Harry Potter 2", 1998, 1.2, "J.K Rowling", 150);
        libro libro2 = new libro("La historia interminable", 1979, 1.8, "Michael Ende", 999);

        Pelicula peli1 = new Pelicula("It", 1090, 2.5, "Stephen King", 120);
        Pelicula peli2 = new Pelicula("El viaje de Chihiro", 2002,3.0, "Hayao Miyakazi", 140);

        Videojuego juego1 = new Videojuego("Undertale", 2015, 3.5, "Toby Fox", "PC", 12);
        Videojuego juego2 = new Videojuego("Grand Theft Auto V", 2013, 4.0, "Rockstar Games", "PS5", 18);

        // 2 clientes
        Cliente cliente1 = new Cliente("Carlos", "password1", 1, 2000, album1, 101);
        Cliente cliente2 = new Cliente("Laura", "password2", 2, 1999, peli2, 102);

        // 1 administrador
        Administrador admin = new Administrador("Admin", "admin1234", 999, 1980, Administrador.Rol.Jefe);

        // Asignar un artículo a un cliente
        admin.asignarArticulo(cliente1, "Juego 2");

        }
}
