package action;
import java.sql.*;
import Jdbc.connection;
import com.opensymphony.xwork2.ActionSupport;
public class delete extends ActionSupport{
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String deletebook(){
		Statement stmt = null;
		Connection conn = null;
		conn = connection.getConnection();
		try{
			String sql="delete from book where title=?;";
            PreparedStatement input=conn.prepareStatement(sql);
            input.setString(1, title);
            input.executeUpdate();
            stmt.close();
            conn.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
	 return SUCCESS;
	}
}
