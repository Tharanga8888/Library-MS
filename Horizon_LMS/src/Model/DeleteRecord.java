package Model;

import java.sql.Statement;

public class DeleteRecord {
    Statement stmt; 
     
public void FormDeleteMember(int lid) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("DELETE FROM member WHERE LibraryID = '"+lid+"'");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormDeleteBook(int bid) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("DELETE FROM book WHERE BID = '"+bid+"'");        
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormDeleteStaff(int sid) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("DELETE FROM staff WHERE SID = '"+sid+"'");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormDeleteIssue(int isid) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("DELETE FROM issuebook WHERE IssueID = '"+isid+"'");        
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormDeleteReturn(int reid) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("DELETE FROM returnbook WHERE ReturnID = '"+reid+"'");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }    
}
