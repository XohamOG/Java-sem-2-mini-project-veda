import Controller.Controller;
import Model.Records.Record;
import Model.Model;
import Model.Clients.Client;
import Model.Clients.manageClient;
import View.View;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Identification comments:
 *   Name: Richard Joseph
 *   Experiment No: 04
 *   Experiment Title:
 *   Experiment Date:
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Main.java
 * @author:  Richard Joseph
 * Overview: This is the main class used to created objects for Student Class and Course Class. In this file we have achieved the following
 * - Menu Driven Program to create Student and Courses
 * - String Manipulation by using split function for Full name
 *
 */

public class Main {
    public static void main(String[] args) throws IOException {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
    }
}