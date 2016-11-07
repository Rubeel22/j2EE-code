package registrationEg1; 
import java.sql.*;  
public class RegisterDao {  
  
public static int save(RegisterAction r){  
int status=0;  
try{  
	Class.forName("com.mysql.jdbc.Driver");  
	  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/sonoo","root","");  
  
PreparedStatement ps=con.prepareStatement("insert into strutsuser values(?,?,?,?,?)");  
ps.setString(1,r.getName());  
ps.setString(2,r.getPassword());  
ps.setString(3,r.getEmail());  
ps.setString(4,r.getGender());  
ps.setString(5,r.getCountry());  
          
status=ps.executeUpdate();  
  
}catch(Exception e){e.printStackTrace();}  
    return status;  
}  
}  