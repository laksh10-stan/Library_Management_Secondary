
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akshay
 */
public class myquery {
    

      
        
    public ArrayList<User>BindTable(){
Connection conn;
   conn=javaconnect.ConnecrDb();
      ResultSet rs;
      PreparedStatement pst;
ArrayList<User> list= new ArrayList<User>();

    try{
        String sql="select Student_ID,Name,Enroll_No,Course,Branch,Year,Semester,Image from Student";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
    User p;
    while(rs.next()){
        p= new User(
                rs.getInt("Student_ID"),
        rs.getString("Name"),
     rs.getString("Enroll_No"),
    rs.getString("Course"),
                rs.getString("Branch"),
                rs.getInt("Year"),
                rs.getString("Semester"),
                rs.getBytes("Image")
        );
        list.add(p);
    }
    
        
    } catch (SQLException ex) {
        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
    }
    return list;
}
}