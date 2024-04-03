/*
 /**
* Identification comments:
*   @author  Sarthak Shinde
*   Homework/Lab #4B Assignment - Basic Listening with MVC
*   Due Date: 04-06-23
*   Email Address: sps6944@psu.edu
*   @version 1.0
*   @since   03-28-23
* 
* Beginning comments:
*   Filename: InitialPanel.java
    @author: Sarthak Shinde
    Overview: The View package appears to contain the InitialPanel class, which is a custom panel class that extends JPanel and represents 
              the initial view of an application based on the provided code. Here's an overview of the InitialPanel class:
              The InitialPanel class is a visual component that is intended to be displayed in a graphical user interface (GUI) and 
              provides a panel with a dark gray background. It contains three buttons, b1, b2, and b3, which are initialized with text 
              labels "B1", "B2", and "B3", respectively, and added to the panel using the add() method. The buttons are stored in an 
              ArrayList called buttons, which is also initialized and used to keep track of the buttons. The setButtonText() method 
              allows setting the text of the buttons based on the button index and the text to be set. This suggests that the InitialPanel
              class is designed to provide methods for updating the buttons' text dynamically. The getAllButtons() method returns the 
              ArrayList of buttons, which can be used to add ActionListener or perform other operations on the buttons. The InitialPanel 
              class does not have any reference to the Model or Controller components, indicating that it may be solely responsible for 
              rendering the initial view and providing methods to update the view based on data provided by other components in an 
              MVC-based application. Overall, the InitialPanel class in the View package appears to be responsible for providing the 
              initial graphical user interface view for an application, specifically a panel with buttons, and methods to update the 
              view's appearance based on data provided by other components. Further implementation details would be needed to fully 
              understand its role and functionality within the overall application architecture.
   
* */
package View.Record;

import javax.swing.*;

public class InitialPanelRecord extends JPanel {

    private RecordTablePanel rtp;
    private AddRecordPanel arp;
    private EditRecordPanel erp;
    private DeleteRecordPanel drp;

    public InitialPanelRecord() {
        super();
        rtp = new RecordTablePanel();
        add(rtp);
        arp = new AddRecordPanel();
        add(arp);
        erp = new EditRecordPanel();
        add(erp);
        drp = new DeleteRecordPanel();
        add(drp);
    }

    public void setRtp(RecordTablePanel rtp) {
        this.rtp = rtp;
    }

    public RecordTablePanel getRtp() {
        return rtp;
    }

    public void setErp(EditRecordPanel erp) {
        this.erp = erp;
    }

    public void setArp(AddRecordPanel arp) {
        this.arp = arp;
    }

    public AddRecordPanel getArp() {
        return arp;
    }

    public EditRecordPanel getErp() {
        return erp;
    }
    
    public DeleteRecordPanel getDrp() {
        return drp;
    }
    
    public void setDrp(DeleteRecordPanel drp) {
        this.drp = drp;
    }
}
