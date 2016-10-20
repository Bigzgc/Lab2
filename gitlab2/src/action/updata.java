package action;
import java.sql.*;
import java.util.Map;
import java.util.HashMap;
import com.opensymphony.xwork2.ActionSupport;
import Jdbc.connection;
public class updata extends ActionSupport{
	public float price;
	public String name;
	private String title;
	public int AuthorID;
	public String Publisher;
	public String PublishDate;
	private Map m;
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(int authorID) {
		AuthorID = authorID;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}
	public Map getM() {
		return m;
	}
	public void setM(Map m) {
		this.m = m;
	}
	public String changebook()
	{
		Statement stmt = null;
		Connection conn = null;
		try{
			conn = connection.getConnection();
			System.out.println(conn);
			stmt = conn.createStatement();
			if(!Publisher.equals(""))
			{
				String sql="update book set publisher='" + Publisher+"'where title ='"+ title+"';";
				stmt.executeUpdate(sql);
			}
			if(!PublishDate.equals(""))
			{
				String sql="update book set publishdate='" + PublishDate+"'where title ='"+ title+"';";
				stmt.executeUpdate(sql);
			}
			if(price != 0)
			{
				String sql="update book set price='" + price+"'where title ='"+ title+"';";
				stmt.executeUpdate(sql);
			}
			if(!name.equals(""))
			{
				String sql ="select * from author where name='"+name+"';";
				ResultSet qs =stmt.executeQuery(sql);
				if(qs.next())
				{
					AuthorID = qs.getInt(1);
					String sql1="update book set authorID='" + AuthorID+"'where title ='"+ title+"';";
					stmt.executeUpdate(sql1);
				}
				else
				{
					return "error";
				}
			}
			m=new HashMap();
			m.put("title", title);
			m.put("Publisher",Publisher);
			m.put("Publishdate",PublishDate);    //updata my information
			m.put("price",price);
			m.put("Name",name);
			return "success";
		}catch(Exception e){
		}
		return "success";
	}

}
