package Model;

import java.sql.ResultSet;
import java.sql.Statement;

public class DBToTable {

    Statement stmt; 
    ResultSet rs;
    
public ResultSet tableMember(){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT LibraryID, Name, StudentID, Faculty, Intake, ContactNo AS Contact, Age, Mgender AS Gender FROM member"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }

public ResultSet tableBook(){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT BID AS ID, Bname AS Name, Bauthor AS Author, Byear AS Year, Category, Quantity FROM book"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }

public ResultSet tableStaff(){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT SID AS ID, Sname AS Name, Sage AS Age, Scontactno AS Contact, Sposition AS Position FROM staff"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }

public ResultSet tableIssueDetails(){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT IssueID, BID, Bname AS Book, LibraryID AS SID, Name, IssueDate, DueDate FROM issue_view WHERE Status='Not Returned'"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }

public ResultSet tableReturnDetails(){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT ReturnID, IssueID, BID, Bname AS Book, LibraryID AS SID, Name, IssueDate, DueDate, ReturnDate, Fine FROM return_view"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }
public ResultSet tableHomeIssueDetails(){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT Bname AS Book, LibraryID AS SID, Name, IssueDate, DueDate FROM issue_view WHERE Status='Not Returned'"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }
public ResultSet tableHomeOverDueDetails(){        
    try{ 
            stmt = DBConnection.getStatCon();  
            rs = stmt.executeQuery("SELECT BID, Bname AS Book, LibraryID AS MID, Name, DueDate FROM overdue_view"); 
        } 
    catch(Exception e){ 
             
    } 
    return rs; 
    }
}
