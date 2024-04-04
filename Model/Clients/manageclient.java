package Model.Clients;

import Model.Displayable;
import Model.Clients.FileHandlingClient;
import Model.Clients.Client;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ManageClient extends FileHandlingClient implements Displayable {

    ArrayList<Client> clients = new ArrayList<Client>();

    ObjectMapper objectMapper = new ObjectMapper();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    public ManageClient() {
        readClientJsonFile("src/Model/Clients/Clients.json");
    }

    public ArrayList<Client> readClientJsonFile(String file_path)
    {
        clients.removeAll(clients);
        try {
            JsonNode rootNode = objectMapper.readTree(new File(file_path));

            // Iterate through JSON array
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    int client_id = node.get("client_id").asInt();
                    String client_email = node.get("client_email").asText();
                    String f_name = node.get("f_name").asText();
                    int f_age = node.get("f_age").asInt();
                    String f_gender = node.get("f_gender").asText();
                    Client client = new Client(client_id, client_email, f_name, f_age, f_gender);
                    clients.add(client);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return clients;
    }

    public void writeClientJsonFile(String file_path, ArrayList<Client> clients) throws IOException {
        objectMapper.writeValue(Paths.get(file_path).toFile(), clients);
    }

    public void setClientsTable(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<>();
        headers.add("Id");
        headers.add("Name");
        // Other headers
        return headers;
    }

    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> clientDetails = new ArrayList<>();

        clientDetails.add(String.valueOf(clients.get(line).getClient_id()));
        clientDetails.add(clients.get(line).getName());
        // Add other attributes

        return clientDetails;
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> clientsSubset = new ArrayList<>();

        for (int i = firstLine; i <= lastLine; i++) {
            clientsSubset.add(getLine(i));
        }
        return clientsSubset;
    }

    // Implement other methods required by the Displayable interface

    public ArrayList getTable() {
        return clients;
    }
}
