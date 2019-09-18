package api;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import model.Artist;

public class Manejador {
	private ArrayList<Artist> topArtist;

	public Manejador(String urlTXT) {
		JSONObject json;
		JSONArray jsa;
		try {
			json =  new JSONObject(IOUtils.toString(new URL(urlTXT), Charset.forName("UTF-8")));
			json = (JSONObject)json.get("topartists");
			jsa = (JSONArray) json.get("artist");
			topArtist = new ArrayList<Artist>();
			Artist artist;
			for (int i=0;i<jsa.length();i++){
				json = (JSONObject)jsa.get(i);
				artist = new Artist();
				artist.setName(json.getString("name"));
				artist.setUrl(json.getString("url"));
				JSONObject rankJson = (JSONObject)json.get("@attr");
				artist.setRank(rankJson.getString("rank"));
				JSONArray imageJsa = (JSONArray)json.get("image");
				artist.setImage(((JSONObject)imageJsa.get(imageJsa.length()-1)).getString("#text"));
				topArtist.add(artist);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public ArrayList<Artist> getTopArtist() {
		return topArtist;
	}
}
