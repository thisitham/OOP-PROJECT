package userRegister.Model;

public class TVseries {
	private String Name; 
	private String Imdb; 
	private String Category; 
	private String Sesons;
	private String Director;
	
	public TVseries(String name, String imdb, String category, String sesons, String director) {
		super();
		Name = name;
		Imdb = imdb;
		Category = category;
		Sesons = sesons;
		Director = director;
	}

	public String getName() {
		return Name;
	}

	public String getImdb() {
		return Imdb;
	}

	public String getCategory() {
		return Category;
	}

	public String getSesons() {
		return Sesons;
	}

	public String getDirector() {
		return Director;
	}
}
