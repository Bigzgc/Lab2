package action;
import java.sql.*;
import java.sql.Connection;
import java.util.Map;
import java.util.ArrayList;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import Jdbc.connection;
public class search extends ActionSupport{
	public ArrayList<String> list = new ArrayList<String>();
	private String name;
	public int AuthorID;
	private Map m;
		public String find(){
			Statement stmt = null;
			Statement stmt1 = null;
			Connection conn = null;
			try{
				conn = connection.getConnection();
				stmt = conn.createStatement();
				String sql = "select * from author where Name = '"+ name +"';";  //begin serach
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					AuthorID = rs.getInt(1);
				}
				stmt1 = conn.createStatement();
				String sql1 = "select * from book where AuthorID ='" +AuthorID +"';";
				ResultSet qs = stmt1.executeQuery(sql1);
				while(qs.next())
				{
					list.add(qs.getString(2));
				}
				stmt.close();
				stmt1.close();
			}	
			catch(Exception se){
				se.printStackTrace();
			}
			m = ActionContext.getContext().getSession();
			for(int i= 0;i<list.size();i++)
			{
				m.put("title", list.get(i));
			}
			return SUCCESS;
		}
		public int getAuthorID() {
			return AuthorID;
		}
		public void setAuthorID(int authorID) {
			AuthorID = authorID;
		}
		public Map getM() {
			return m;
		}
		public void setM(Map m) {
			this.m = m;
		}
		public ArrayList<String> getList() {
			return list;
		}
		public void setList(ArrayList<String> list) {
			this.list = list;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}
