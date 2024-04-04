package Model;

import Model.Clients.manageClient;

public class Model {
    manageClient mc;

    public Model() {
        mc = new manageClient();
    }

    public manageClient getMc() {
        return mc;
    }

    public void setMc(manageClient mc) {
        this.mc = mc;
    }
}
