package Model.Clients;

import Model.Records.Records;
import Model.Clients.Client;

import java.io.IOException;
import java.util.ArrayList;

public abstract class FileHandlingClient {
    protected abstract ArrayList<Client> readClientJsonFile(String file_path);
    protected abstract void writeClientJsonFile(String file_path, ArrayList<Client> students) throws IOException;
}
