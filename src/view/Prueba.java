package view;
import api.Manejador;
import model.Artist;

public class Prueba {
	public static void main(String[] args) {
		Manejador manejador = new Manejador("http://ws.audioscrobbler.com/2.0/?method=user.gettopartists&user=rj&api_key=35066a49f2deb23a3c35fd48ff5c9869&format=json");
		for (Artist artist:manejador.getTopArtist()) {
			System.out.println(artist);
		}
	}
}
