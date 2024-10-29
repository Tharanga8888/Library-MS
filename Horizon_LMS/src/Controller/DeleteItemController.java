package Controller;

import javax.swing.JOptionPane;

public class DeleteItemController {

public static void mDeleteForm(int lid) { 
    new Model.DeleteRecord().FormDeleteMember(lid);         
    JOptionPane.showMessageDialog(null, "The Record has been Deleted", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void sDeleteForm(int sid) { 
    new Model.DeleteRecord().FormDeleteStaff(sid);         
    JOptionPane.showMessageDialog(null, "The Record has been Deleted", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void bDeleteForm(int bid) { 
    new Model.DeleteRecord().FormDeleteBook(bid);         
    JOptionPane.showMessageDialog(null, "The Record has been Deleted", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void issueDeleteForm(int isid) { 
    new Model.DeleteRecord().FormDeleteIssue(isid);         
    JOptionPane.showMessageDialog(null, "Issue record has been Deleted", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}

public static void returnDeleteForm(int reid) { 
    new Model.DeleteRecord().FormDeleteReturn(reid);         
    JOptionPane.showMessageDialog(null, "The Record has been Deleted", "Successfull", 
    JOptionPane.INFORMATION_MESSAGE); 
}    
}
