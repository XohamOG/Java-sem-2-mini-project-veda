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
