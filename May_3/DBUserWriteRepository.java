package May_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUserWriteRepository implements UserWriteRepository
{
	String url = "jdbc:sqlserver://STOLAS;databaseName=Homework;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
	public void save(User user)
	{
		try (Connection connection = DriverManager.getConnection(url);)
		{
			PreparedStatement ps = connection.prepareStatement("insert into May_3 (id, namee, email) values (?, ?, ?)");
			ps.setLong(1, user.get_id());
			ps.setString(2, user.get_name());
			ps.setString(3, user.get_email());
			ps.execute();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void update(User user)
	{
		try (Connection connection = DriverManager.getConnection(url);)
		{
			PreparedStatement ps = connection.prepareStatement("update May_3 set id=?, namee=?, email=? where May_3=100001");
			ps.setLong(1, user.get_id());
			ps.setString(2, user.get_name());
			ps.setString(3, user.get_email());
			ps.execute();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void delete(Long id)
	{
		try (Connection connection = DriverManager.getConnection(url);)
		{
			PreparedStatement ps = connection.prepareStatement("delete from May_3 where id=?");
			ps.setLong(1, id);
			ps.execute();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
