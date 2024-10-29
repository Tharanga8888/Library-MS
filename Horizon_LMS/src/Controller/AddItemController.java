package Controller;

import java.sql.Date;
import javax.swing.JOptionPane; 
 
public class AddItemController { 
     
public static void mForm(String mName, String SID, String Faculty, int intake, String conNum, int mAge, String gender) { 
    new Model.AddRecord().FormMember(mName, SID, Faculty, intake, conNum, mAge, gender);         
    JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void sForm(String sName, int sAge, String sconNum, String position) { 
    new Model.AddRecord().FormStaff(sName, sAge, sconNum, position);         
    JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void bForm(String bName, String bAuthor, int bYear, String category, int quantity) { 
    new Model.AddRecord().FormBook(bName, bAuthor, bYear, category, quantity);         
    JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void issueForm(int issueBID, int issueLID, Date issueDate, Date issueDueDate) { 
    new Model.AddRecord().FormIssue(issueBID, issueLID, issueDate, issueDueDate);         
    JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void returnForm(int issueID, Date returnDate, Date returnDueDate, int fine) { 
    new Model.AddRecord().FormReturn(issueID, returnDate, returnDueDate, fine);         
    JOptionPane.showMessageDialog(null, "The Book has been returned", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}
} 
