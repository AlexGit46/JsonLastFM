package model;

public class Artist {
	private String rank;
	private String name;
	private String url;
	private String image;
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Artist(String rank, String name, String url, String image) {
		super();
		this.rank = rank;
		this.name = name;
		this.url = url;
		this.image = image;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Artist [rank=" + rank + ", name=" + name + ", url=" + url + ", image=" + image + "]";
	}


}
