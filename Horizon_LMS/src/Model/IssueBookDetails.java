package Model;

import java.sql.ResultSet;
import java.sql.Statement;

public class IssueBookDetails {

    Statement stmt; 
    ResultSet rs;    
    
public ResultSet memberDetails(int memberid){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT * FROM member WHERE LibraryID = '"+memberid+"'");
        } 
    catch(Exception e){ 
        e.printStackTrace();    
    } 
    return rs; 
    }    

public ResultSet bookDetails(int bookid){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT * FROM book WHERE BID = '"+bookid+"'"); 
        } 
    catch(Exception e){ 
        e.printStackTrace();    
    } 
    return rs; 
    }

public ResultSet bookDetailsName(String bookName){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT * FROM book WHERE Bname = '"+bookName+"'"); 
        } 
    catch(Exception e){ 
        e.printStackTrace();    
    } 
    return rs; 
    }
}
