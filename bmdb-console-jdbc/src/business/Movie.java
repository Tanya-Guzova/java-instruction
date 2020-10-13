package business;

public class Movie {
	private int id;
	private String title;
	private String year;
	private String rating;
	private String director;
	
	public Movie() {
		super();
	}
	

	
	public Movie(int id, String title, String year, String rating, String director) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.rating = rating;
		this.director = director;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String displaySummary() {
		String str = "id: "+ id + ", "+title+" ("+rating+") was released in "+
				year+". Director: "+director;
		return str;
	}

}
