package action;
import java.sql.*;
import java.util.Map;
import java.util.HashMap;

import com.opensymphony.xwork2.ActionSupport;

import Jdbc.connection;
public class addauther extends ActionSupport{
	public String name;
	public int Age;
	public String Country;
	private Map m;
	public int AuthorID;
	public String autheradd()
	{
		Statement stmt = null;
		Connection conn = null;
		try{
			conn = connection.getConnection();
			System.out.println(conn);
			stmt = conn.createStatement();
			String sql = "insert into author(AuthorID,Name,Age,Country) values('"+AuthorID+"','"+name+"',"+Age+",'"+Country+"');";
			stmt.executeUpdate(sql);
			m=new HashMap();
			m.put("AuthorID", AuthorID);
			m.put("name", name);
			m.put("age", Age);
			m.put("Country", Country);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return "success";
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
	public Map getM() {
		return m;
	}
	public void setM(Map m) {
		this.m = m;
	}
}
