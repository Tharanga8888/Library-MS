package Model;

import java.sql.ResultSet;
import java.sql.Statement; 
 
public class DBSearch { 
 
    Statement stmt; 
    ResultSet rs; 
 
public ResultSet searchLogin(String usName) {  
        try { 
            stmt = DBConnection.getStatCon(); 
            String name = usName;
            rs = stmt.executeQuery("SELECT * FROM login where username='"+name+"'"); 
        } catch (Exception e) { 
            e.printStackTrace();         
        } 
        return rs; 
    }

public ResultSet searchMember(){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT * FROM member"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }

public ResultSet searchStaff(){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT * FROM staff"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }

public ResultSet searchBook(){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT * FROM book"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }

public ResultSet searchIssueBook(){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT * FROM issue_view"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }

public ResultSet searchOverDueBook(){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT * FROM overdue_view"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }

} 

