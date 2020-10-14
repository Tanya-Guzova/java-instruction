package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import business.User;


public class UserDB implements DAO<User> {
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs";
		String usernamme = "prs_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, usernamme, password);
		return conn;
	}
	@Override
	public User get(int id) {
		User user = null;
		String sql = "SELECT * FROM user where id = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			// we only expect 1 row
			if (rs.next()) {
				user = getUserFromResultSet(rs);
			}
		} catch (SQLException e) {
			System.out.println("Error getting a user!");
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public List<User> getAll() {
		List<User> users = new ArrayList<>();
		String sql = "select * from user;";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			// p.681 - process the result set
			// while our rs has a line
			while (rs.next()){
				User u = getUserFromResultSet(rs);
				users.add(u);
			}

		} catch (SQLException e) {
			System.out.println("Error getting all users!");
			e.printStackTrace();
			users = null;
		}
		return users;
	}


	@Override
	public boolean add(User u) {
		boolean success = false;
		String sql = "insert into user (UserName, Password, FirstName, LastName, "
				+ "PhoneNumber, Email, IsReviewer, IsAdmin) " + 
				"values (?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getFirstName());
			ps.setString(4, u.getLastName());
			ps.setString(5, u.getPhoneNumber());
			ps.setString(6, u.getEmail());
			ps.setBoolean(7, u.isReviewer());
			ps.setBoolean(8, u.isAdmin());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error adding user!");
			e.printStackTrace();

		}
		return success;
	}

	@Override
	public boolean update(User u) {
			boolean success = false;
			String sql = "update user set " + "UserName = ?," + "Password = ?," + "FirstName = ?," +
			"LastName = ?" + "PhoneNumber = ?, Email = ?, IsReviewer = ?, IsAdmin = ?;"
					+ "where id = ?";
			try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
				// mention we set the values in the order they appear in a query
				ps.setString(1, u.getUserName());
				ps.setString(2, u.getPassword());
				ps.setString(3, u.getFirstName());
				ps.setString(4, u.getLastName());
				ps.setString(5, u.getPhoneNumber());
				ps.setString(6, u.getEmail());
				ps.setBoolean(7, u.isReviewer());
				ps.setBoolean(8, u.isAdmin());
				ps.executeUpdate();
				success = true;
			} catch (SQLException e) {
				System.out.println("Error updating user!");
				e.printStackTrace();

			}
			return success;
	}

	@Override
	public boolean delete(User u) {
		boolean success = false;
		String sql = "delete from user " +
		"where id = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, u.getId());
			ps.executeUpdate();
			success = true;
		} 
		catch (SQLException e) {
			System.out.println("Error deleting user!");
			e.printStackTrace();
		}
		return success;
	}
	private User getUserFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String userName = rs.getString(2);
		String password = rs.getString(3);
		String firstName = rs.getString(4);
		String lastName = rs.getString(5);
		String phoneNumber = rs.getString(6);
		String email = rs.getString(7);
		boolean isReviewer = rs.getBoolean(8);
		boolean isAdmin = rs.getBoolean(9);
		User user = new User(id, userName, password, firstName, lastName, phoneNumber,email, isReviewer,isAdmin);
		return user;
	}

}
