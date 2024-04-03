/*
/**
* 
* 
* Identification comments:
*   Name: Sarthak Shinde
*   Homework/Lab 3B Assignment - Interfaces and Arrays
*   Due Date: 03-03-23
*   Email Address: sps6944@psu.edu
*   @version 1.0
*   
* 
* Beginning comments
* Filename: View.java
* author:   Sarthak Shinde
* Overview: The View class represents the user interface of an application, and it is responsible for presenting data to the 
            user and receiving input from them. It is typically used in the Model-View-Controller (MVC) architectural pattern, 
            where the View is the part of the application that interacts with the user and displays information. The public class 
            View is declared but there are no methods or fields defined in it.
*/

package View;

import View.Record.ManageRecordFrame;

import java.awt.*;
import java.util.ArrayList;

public class View {
    FirstFrame ff;
    ManageClentFrame msf;
    ManageRecordFrame mcf;


    public View()
    {
        ff = new FirstFrame();
        msf = new ManageClientFrame();
        mcf = new ManageRecordFrame();
    }

    public void centerInitialSetupClient(int linesBeingDisplayed, int size) {
        msf.getIp().getCp().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        msf.getIp().getCp().createButtons((linesBeingDisplayed+1) * size);
    }

    public void centerInitialSetupCourse(int linesBeingDisplayed, int size) {
        mcf.getCourse_ip().getCtp().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        mcf.getCourse_ip().getCtp().createButtons((linesBeingDisplayed+1) * size);
    }

    public void centerUpdateRecord(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {
        for (int i = 0; i < headers.size(); i++)
        {
            mcf.getRecord_ip().getCtp().getAllButtons().get(i).setText(headers.get(i));
        }

        for (int course_row_no = 0; record_row_no < lines.size(); record_row_no++)
        {
            for (int record_col_no = 0; record_col_no < headers.size(); record_col_no++)
            {
                int button_no = record_row_no * headers.size() + headers.size() + record_col_no;
                String button_txt = lines.get(record_row_no).get(trecord_col_no);

                mcf.getRecord_ip().getCtp().getAllButtons().get(button_no).setText(button_txt);
            }
        }
    }

    public void setFf(FirstFrame ff) {
        this.ff = ff;
    }

    public FirstFrame getFf() {
        return ff;
    }

    public void setMsf(ManageClientFrame msf) {
        this.msf = msf;
    }

    public ManageClientFrame getMsf() {
        return msf;
    }

    public void setMcf(ManageRecordFrame mcf) {
        this.mcf = mcf;
    }

    public ManageRecordFrame getMcf() {
        return mcf;
    }

}

