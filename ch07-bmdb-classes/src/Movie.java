
public class Movie {
	private String title;
	private String year;
	private String rating;
	private String genre;
	
	
	public Movie() {
		
	}
	public Movie(String title, String year, String rating, String genre) {
		
		this.title = title;
		this.year = year;
		this.rating = rating;
		this.genre = genre;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String displayMovie() {
		String str = "Movie Summary \n";
		str += "*********************************\n";
		str += "Title:\t\t" + title + "\n";
		str += "Year:\t\t" + year + "\n";
		str += "Rating:\t\t" + rating + "\n";
		str += "Genre:\t\t" + genre + "\n";
		str += "*********************************\n";
		return str; 
	}
	
}
