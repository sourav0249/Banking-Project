package myproject;

import java.sql.*;
public class conn
{
    Connection c;
    Statement s;
    public conn()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           c=DriverManager.getConnection("jdbc:mysql:///myproject", "root", "");
           s=c.createStatement();
        }catch(Exception e){e.printStackTrace();}
    }
    public ResultSet execute(String r) throws Exception
    {
        return(s.executeQuery(r));
    }
    public void update(String t) throws Exception
    {
        s.executeUpdate(t);
    }

}

