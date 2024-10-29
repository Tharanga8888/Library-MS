package Model;

import java.sql.Date;
import java.sql.Statement; 
 
public class AddRecord { 
     
    Statement stmt; 
     
public void FormMember(String mName, String SID, String Faculty, int intake, String conNum, int mAge, String gender) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("INSERT INTO member(Name, StudentID, Faculty, Intake, ContactNo, Age, Mgender) VALUES('"+mName+"', '"+SID+"', '"+Faculty+"', '"+intake+"', '"+conNum+"', '"+mAge+"', '"+gender+"')");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormBook(String bName, String bAuthor, int bYear, String category, int quantity) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("INSERT INTO book(Bname, Bauthor, Byear, Category, Quantity) VALUES('"+bName+"', '"+bAuthor+"', '"+bYear+"', '"+category+"', '"+quantity+"')");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormStaff(String sName, int sAge, String sconNum, String position) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("INSERT INTO staff(Sname, Sage, Scontactno, Sposition) VALUES('"+sName+"', '"+sAge+"', '"+sconNum+"', '"+position+"')");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormIssue(int issueBID, int issueLID, Date issueDate, Date issueDueDate) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("INSERT INTO issuebook(BID, LibraryID, IssueDate, DueDate) VALUES('"+issueBID+"', '"+issueLID+"', '"+issueDate+"', '"+issueDueDate+"')");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

public void FormReturn(int issueID, Date returnDate, Date returnDueDate, int fine) { 
    try { 
        stmt = DBConnection.getStatCon(); 
        stmt.executeUpdate ("INSERT INTO returnbook(IssueID, DueDate, ReturnDate, Fine) VALUES('"+issueID+"', '"+returnDueDate+"', '"+returnDate+"', '"+fine+"')");         
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }

}
