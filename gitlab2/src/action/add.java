package action;
import java.sql.*;
import java.util.Map;
import java.util.HashMap;
import com.opensymphony.xwork2.ActionSupport;
import Jdbc.connection;
public class add extends ActionSupport{
	public float price;
	public int ISBN;
	public String name;
	public int Age;
	public String Country;
	private String title;
	public int AuthorID;
	public String Publisher;
	public String PublishDate;
	private Map m;
	public String addbook()
	{	
		System.out.println(title);
		Statement stmt = null;
		Connection conn = null;
		try{
			conn = connection.getConnection();
			stmt = conn.createStatement();
			String sql = "select * from author where name='"+name+"';";   //begin serch
			ResultSet rs= stmt.executeQuery(sql);
			if(!rs.next())
			{
				return "error";
			}
			else
			{
				AuthorID=rs.getInt(1);
				String sql1="insert into book values("+ISBN+",'"+title+"',"+AuthorID+",'"+Publisher+"','"+PublishDate+"',"+price+");";
				stmt.executeUpdate(sql1);
				m=new HashMap();
				m.put("title", title);
				m.put("ISBN",ISBN);
				m.put("Publisher",Publisher);
				m.put("Publishdate",PublishDate);
				m.put("price",price);
				m.put("Name",name);
				return "success";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "error";	
		}
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		
		Country = country;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws Exception{
		this.title=title;
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

}
