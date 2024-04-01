package Model.Clients;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

import Model.Displayable;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class manageClient extends FileHandlingClient implements Displayable {

    ArrayList<Client> students = new ArrayList<Client>();

    ObjectMapper objectMapper = new ObjectMapper();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    public manageStudent(){
        readStudentJsonFile("src/Model/Students/Students.json");
    }
    public ArrayList<Student> readStudentJsonFile(String file_path)
    {
        try {
            JsonNode rootNode = objectMapper.readTree(new File(file_path));

            // Iterate through JSON array
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    int student_id = node.get("student_id").asInt();
                    String fname = node.get("fname").asText();
                    String lname = node.get("lname").asText();
                    String email = node.get("email").asText();
                    String address = node.get("address").asText();
                    String mobile = node.get("mobile").asText();
                    double cet_percentage = node.get("cet_percentage").asDouble();
                    Student stud = new Student(student_id, cet_percentage, fname, lname, email, address, mobile);
                    students.add(stud);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
    public void writeStudentJsonFile(String file_path, ArrayList<Student> students) throws IOException {
        //objectMapper.writeValue(Paths.get("src/Model/Students/students.json").toFile(), students);
        objectMapper.writeValue(Paths.get(file_path).toFile(), students);
    }

    public void setStudentsTable(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("Id");
        headers.add("First Name");
        headers.add("Last Email");
        headers.add("Email");
        headers.add("Address");
        headers.add("Mobile");
        headers.add("CET Percentage");

        return headers;
    }
    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> student_details = new ArrayList<String>();

        student_details.add(String.valueOf(students.get(line).getStudent_id()));
        student_details.add(students.get(line).getFname());
        student_details.add(students.get(line).getLname());
        student_details.add(students.get(line).getEmail());
        student_details.add(students.get(line).getAddress());
        student_details.add(students.get(line).getMobile());
        student_details.add(String.valueOf(students.get(line).getCet_percentage()));

        return student_details;
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> students_subset = new ArrayList<ArrayList<String>>();

        for (int i = firstLine; i <= lastLine; i++) {
            students_subset.add(getLine(i));
        }
        return students_subset;
    }

    @Override
    public int getFirstLineToDisplay() {
        return firstLineIndex;
    }

    @Override
    public int getLineToHighlight() {
        return highlightedLine;
    }

    @Override
    public int getLastLineToDisplay() {
        setLastLineToDisplay(getFirstLineToDisplay() + getLinesBeingDisplayed() - 1);
        return lastLineIndex;
    }

    @Override
    public int getLinesBeingDisplayed() {
        return linesBeingDisplayed;
    }

    @Override
    public void setFirstLineToDisplay(int firstLine) {
        this.firstLineIndex = firstLine;
    }

    @Override
    public void setLineToHighlight(int highlightedLine) {
        this.highlightedLine = highlightedLine;
    }

    @Override
    public void setLastLineToDisplay(int lastLine) {
        this.lastLineIndex = lastLine;
    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
        this.linesBeingDisplayed = numberOfLines;
    }

    public ArrayList getTable() {
        return students;
    }
}
