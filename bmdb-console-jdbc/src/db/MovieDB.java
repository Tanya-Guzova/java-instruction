package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import business.Movie;


public class MovieDB implements DAO<Movie> {
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb";
		String usernamme = "bmdb_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, usernamme, password);
		return conn;
	}

	@Override
	public Movie get(int id) {
		Movie m = null;
		String sql = "SELECT * FROM movie where id = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			// we only expect 1 row
			if (rs.next()) {
				m = getMovieFromResultSet(rs);
			}
		} catch (SQLException e) {
			System.out.println("Error getting all movies!");
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		// p.679
		String sql = "select * from movie;";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery(sql);) {
			// p.681 - process the result set
			// while our rs has a line
			while (rs.next()){
				Movie m = getMovieFromResultSet(rs);
				movies.add(m);
			}

		} catch (SQLException e) {
			System.out.println("Error getting all movies!");
			e.printStackTrace();
			movies = null;
		}

		return movies;
	}

	@Override
	public boolean add(Movie m) {
		boolean success = false;
		String sql = "insert into movie values (?, ?, ?, ?, ?)";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, m.getId());
			ps.setString(2, m.getTitle());
			ps.setString(3, m.getYear());
			ps.setString(4, m.getRating());
			ps.setString(5, m.getDirector());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error adding movie!");
			e.printStackTrace();

		}
		return success;
	}

	@Override
	public boolean update(Movie m) {
		boolean success = false;
		String sql = "update movie set " + "Title = ?," + "Year = ?," + "Rating = ?," + "Director = ?"
				+ "where id = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			// mention we set the values in the order they appear in a query
			ps.setString(1, m.getTitle());
			ps.setString(2, m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getDirector());
			ps.setInt(5, m.getId());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error updating movie!");
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean delete(Movie m) {
		boolean success = false;
		String sql = "delete from movie " + "where id = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, m.getId());
			ps.executeUpdate();
			success = true;
		} catch (NullPointerException e) {
			System.out.println("No Movie found!");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("Error deleting actor!");
			e.printStackTrace();
		}
		return success;
	}
	private Movie getMovieFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String t = rs.getString(2);
		String y = rs.getString(3);
		String r = rs.getString(4);
		String dir = rs.getString(5);
		Movie movie = new Movie(id,t,y,r,dir);
		return movie;
	}

	@Override
	public List<Movie> findByLastName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
