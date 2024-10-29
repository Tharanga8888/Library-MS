package Model;

import java.sql.ResultSet;
import java.sql.Statement;


public class DBSearchBar {

    Statement stmt; 
    ResultSet rs;    
    
    public ResultSet searchBarBook(String search){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT * FROM book WHERE Bname LIKE '%"+search+"%' OR Bauthor LIKE '%"+search+"%' OR BID LIKE '%"+search+"%' OR Category LIKE '%"+search+"%'"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }
    
    public ResultSet searchBarMember(String search){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT * FROM member WHERE Name LIKE '%"+search+"%' OR StudentID LIKE '%"+search+"%' OR Faculty LIKE '%"+search+"%' OR Intake LIKE '%"+search+"%' OR LibraryID LIKE '%"+search+"%'"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    } 
    
    public ResultSet searchBarStaff(String search){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT * FROM staff WHERE Sname LIKE '%"+search+"%' OR Sage LIKE '%"+search+"%' OR Sposition LIKE '%"+search+"%' OR SID LIKE '%"+search+"%'"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }    
}
