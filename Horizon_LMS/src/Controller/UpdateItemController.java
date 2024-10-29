package Controller;

import java.sql.Date;
import javax.swing.JOptionPane;

public class UpdateItemController {
    
public static void mUPForm(String mName, String SID, String Faculty, int intake, String conNum, int mAge, String gender, int lid) { 
    new Model.UpdateRecord().FormUpdateMember(mName, SID, Faculty, intake, conNum, mAge, gender, lid);         
    JOptionPane.showMessageDialog(null, "Record has been updated", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void sUPForm(String sName, int sAge, String sconNum, String position, int sid) { 
    new Model.UpdateRecord().FormUpdateStaff(sName, sAge, sconNum, position, sid);         
    JOptionPane.showMessageDialog(null, "Record has been updated", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void bUPForm(String bName, String bAuthor, int bYear, String category, int quantity, int bid) { 
    new Model.UpdateRecord().FormUpdateBook(bName, bAuthor, bYear, category, quantity, bid);         
    JOptionPane.showMessageDialog(null, "Record has been updated", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void QuantityUPForm(int bid) { 
    new Model.UpdateRecord().FormUpdateQuantity(bid);
    JOptionPane.showMessageDialog(null, "Quantity has been updated too", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void QuantityInUPForm(int bid) { 
    new Model.UpdateRecord().FormUpdateQuantityIn(bid);
    JOptionPane.showMessageDialog(null, "Quantity has been updated too", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void issueUPForm(int issueID, Date issueDate, Date dueDate) { 
    new Model.UpdateRecord().FormUpdateIssue(issueID, issueDate, dueDate);         
    JOptionPane.showMessageDialog(null, "Record has been updated", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void issueStatusUPForm(int issueID, String status) { 
    new Model.UpdateRecord().FormUpdateIssueStatus(issueID, status);         
    JOptionPane.showMessageDialog(null, "Issue status has been updated", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void returnUPForm(int returnID, Date returnDate, int fine) { 
    new Model.UpdateRecord().FormUpdateReturn(returnID, returnDate, fine);         
    JOptionPane.showMessageDialog(null, "Record has been updated", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}    
}
