package View.Record;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RecordTablePanel extends JPanel {

    ArrayList<JButton> record_buttons = new ArrayList<>();

    public RecordTablePanel()
    {
        super();
    }

    public void createButtons(int count)
    {
        for (int i = 1; i <= count; i++)
        {
            JButton b = new JButton();
            b.setBackground(Color.cyan);
            b.setSize(500,50);
            record_buttons.add(b);
            this.add(b);
            validate();
            repaint();
        }

    }

    public void setButtonText(int button_no, String button_text) {
        record_buttons.get(button_no).setText(button_text);
    }

    public ArrayList<JButton> getAllButtons()
    {
        return record_buttons;
    }

}
