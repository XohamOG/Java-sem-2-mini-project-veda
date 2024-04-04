package Controller;

import Model.Model;
import Model.Clients.Client;
import View.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Controller {
    Model model;
    View view;

    public Controller(Model m, View v) {
        model = m;
        view = v;

        view.getFf().getManageRecordBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Record Button Clicked");
                view.getFf().setVisible(false);
                view.getMcf().setVisible(true);
            }
        });

        view.getMcf().addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                view.getFf().setVisible(true);
            }
        });

        model.getMc().setLinesBeingDisplayed(21);
        view.centerInitialSetupCourse(model.getMc().getLinesBeingDisplayed(), model.getMc().getHeaders().size());

        model.getMc().setFirstLineToDisplay(0);
        view.centerUpdateCourse(model.getMc().getLines(model.getMc().getFirstLineToDisplay(), model.getMc().getLastLineToDisplay()), model.getMc().getHeaders());

        view.getMcf().getRecord_ip().getAps().getAddRecordBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt_record_id = view.getMcf().getRecord_ip().getAps().getTxt_record_id().getText();
                String txt_record_name = view.getMcf().getRecord_ip().getAps().getTxt_record_name().getText();
                String txt_record_duration = view.getMcf().getRecord_ip().getAps().getTxt_record_duration().getText();
                try {
                    model.getMc().addNewRecord(Integer.valueOf(txt_record_id), txt_record_name, txt_record_duration);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        view.getMcf().getRecord_ip().getEcp().getGetRecordBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Get Record Details Clicked");
                String txt_record_idx = view.getMcf().getRecord_ip().getEcp().getTxt_get_record_idx().getText();
                model.getMc().readRecordJsonFile("Model/Records/Records.json");
                int record_id = model.getMc().getTable().get(Integer.valueOf(txt_record_idx)).getRecord_id();
                String record_name = model.getMc().getTable().get(Integer.valueOf(txt_record_idx)).getRecord_name();
                String record_dura = model.getMc().getTable().get(Integer.valueOf(txt_record_idx)).getRecord_duration();
                view.getMcf().getRecord_ip().getEcp().getTxt_record_id().setText(String.valueOf(record_id));
                view.getMcf().getRecord_ip().getEcp().getTxt_record_name().setText(record_name);
                view.getMcf().getRecord_ip().getEcp().getTxt_record_duration().setText(record_dura);
            }
        });

        view.getMcf().getRecord_ip().getEcp().getEditRecordBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Edit Record Button Clicked");
                String txt_record_idx = view.getMcf().getRecord_ip().getEcp().getTxt_get_record_idx().getText();
                String txt_record_id = view.getMcf().getRecord_ip().getEcp().getTxt_record_id().getText();
                String txt_record_name = view.getMcf().getRecord_ip().getEcp().getTxt_record_name().getText();
                String txt_record_duration = view.getMcf().getRecord_ip().getEcp().getTxt_record_duration().getText();
                try {
                    model.getMc().editNewRecord(Integer.valueOf(txt_record_idx), Integer.valueOf(txt_record_id), txt_record_name, txt_record_duration);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        view.getMcf().getRecord_ip().getDcp().getDeleteRecordBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Delete Record Button Clicked");
                String txt_record_idx = view.getMcf().getRecord_ip().getDcp().getTxt_del_record_id().getText();
                try {
                    model.getMc().deleteRecord(Integer.valueOf(txt_record_idx));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
