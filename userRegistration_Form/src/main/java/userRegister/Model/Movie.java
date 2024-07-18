package userRegister.Model;

public class Movie {
		private int movie_id;
	 	private String movie_name;
	    private String movie_type;
	    private String movie_year;
	    private String movie_rate;
    
	 	public Movie(int movie_id, String movie_name, String movie_type, String movie_year, String movie_rate) {
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.movie_type = movie_type;
		this.movie_year = movie_year;
		this.movie_rate = movie_rate;
	 	}

		public int getMovie_id() {
			return movie_id;
		}

		public String getMovie_name() {
			return movie_name;
		}

		public String getMovie_type() {
			return movie_type;
		}

		public String getMovie_year() {
			return movie_year;
		}

		public String getMovie_rate() {
			return movie_rate;
		}

}
