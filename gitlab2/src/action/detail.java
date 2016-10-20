package action;
import java.sql.*;
import java.util.Map;
import java.util.HashMap;
import Jdbc.connection;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class detail extends ActionSupport{
	private String title;
	public float price;
	public int ISBN;
	public String name;
	public int Age;
	public String Country;
	public int AuthorID;
	public String Publisher;
	public String PublishDate;
	private Map m;
	public String bookdetail()
	{
		System.out.println(title);
		Statement stmt = null;
		Connection conn = null;
		conn = connection.getConnection();
		try{
			stmt=conn.createStatement();
			String sql = "select * from book where title = '"+ title +"';";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				ISBN = rs.getInt(1);
				AuthorID=rs.getInt(3);
				Publisher = rs.getString(4);
				PublishDate = rs.getString(5); 
				price = rs.getInt(6);
			}
			Statement stmt2=conn.createStatement();
			String sql1="select * from author where authorID='"+AuthorID+"';";
			ResultSet ps = stmt2.executeQuery(sql1);
			while(ps.next())
			{
				name = ps.getString(2);
				Age = ps.getInt(3);
				Country = ps.getString(4);
			}
		}catch(Exception se){
				se.printStackTrace();
			}
		m = ActionContext.getContext().getSession();
		m=new HashMap();
		m.put("title", title);
		m.put("ISBN",ISBN);
		m.put("Publisher",Publisher);
		m.put("Publishdate",PublishDate);
		m.put("price",price);
		m.put("Name",name);
		m.put("Age",Age);
		m.put("Country",Country);	
		return "error";	
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {	
		try {
			this.title=new String(title.getBytes("ISO8859_1"), "UTF8");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public float getprice()
	{
		return price;
	}
	
	public void setprice(float price)
	{
		this.price = price;
	}

	public void setISBN(int ISBN)
	{
		this.ISBN = ISBN;
	}
	
	public long getISBN()
	{
		return ISBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int Age)
	{
		this.Age=Age;
	}

	public void setCountry(String Country)
	{
		this.Country = Country;
	}

	public int getAuthorID() {
		return AuthorID;
	}

	public void setAuthorID(int authorID) {
		AuthorID = authorID;
	}

	public void setPublisher(String Publisher)
	{
		this.Publisher=Publisher;
	}

	public void setPublishDate(String PublishDate)
	{
		this.PublishDate=PublishDate;
	}

	public Map getM() {
		return m;
	}
	public void setM(Map m) {
		this.m = m;
	}

}
