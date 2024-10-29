package Model;

import java.sql.Date;
import java.sql.Statement;

public class UpdateRecord {
    Statement stmt; 
     
public void FormUpdateMember(String mName, String SID, String Faculty, int intake, String conNum, int mAge, String gender, int lid) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("UPDATE member SET Name='"+mName+"', StudentID='"+SID+"', Faculty='"+Faculty+"', Intake='"+intake+"', ContactNo='"+conNum+"', Age='"+mAge+"', Mgender='"+gender+"' WHERE LibraryID='"+lid+"'");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormUpdateBook(String bName, String bAuthor, int bYear, String category, int quantity, int bid) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("UPDATE book SET Bname='"+bName+"', Bauthor='"+bAuthor+"', Byear='"+bYear+"', Category='"+category+"', Quantity='"+quantity+"' WHERE BID='"+bid+"'");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormUpdateStaff(String sName, int sAge, String sconNum, String position, int sid) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("UPDATE staff SET Sname='"+sName+"', Sage='"+sAge+"', Scontactno='"+sconNum+"',Sposition='"+position+"' WHERE SID='"+sid+"'");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormUpdateQuantity(int bid) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("UPDATE book SET Quantity=Quantity-1 WHERE BID='"+bid+"'");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormUpdateQuantityIn(int bid) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("UPDATE book SET Quantity=Quantity+1 WHERE BID='"+bid+"'");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormUpdateIssue(int issueID, Date issueDate, Date dueDate) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("UPDATE issuebook SET IssueDate='"+issueDate+"', DueDate='"+dueDate+"' WHERE IssueID='"+issueID+"'");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormUpdateIssueStatus(int issueID, String status) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("UPDATE issuebook SET Status='"+status+"' WHERE IssueID='"+issueID+"'");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormUpdateReturn(int returnID, Date returnDate, int fine) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("UPDATE returnbook SET ReturnDate='"+returnDate+"', Fine='"+fine+"' WHERE ReturnID='"+returnID+"'");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }    
}
