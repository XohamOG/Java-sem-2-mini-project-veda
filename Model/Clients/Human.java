package Model.Clients;

/**
 * Identification comments:
 *   Name: Soham patil
 *   Experiment No: 02
 *   Experiment Title: Client Class
 *   Experiment Date:08-02-2024
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Client.java
 * @author:  Soham patil
 * Overview: This is the Client class.In this file we have achieved the following
 * - Created Attributes
 * --- int client_id
 * --- String client_name
 * --- String client_email
 * --- int client_age
 * --- String client_gender; 
 *
 * - Created Setters and Getters
 * - Created a Display Function to call the getters and display Instance data
 * - This class extends the Human class 
 * - to inherit common attributes and behaviors of a human
 * - Created static variable to keep track of total no of client objects  
 *
 */
public class Human {
    String f_name;
    int f_age;
    String f_gender;

public Human()
{
    System.out.println("Creating a Human:");
}

public Human(String f_name, int f_age, String f_gender)
{
    this.setf_name(f_name);
    this.setf_age(f_age);
    this.setf_gender(f_gender);
}

public void setf_name(String f_name) {
    this.f_name = f_name; 
}

public void setf_age(int f_age) {
    this.f_age= f_age;
} 

public void setf_gender(String f_gender) {
    this.f_gender = f_gender;
}

public String getf_name() {
    return f_name;
}

public int getf_age() {
    return f_age;
}

public String getf_gender() {
    return f_gender;
}

public void display()
    {
        System.out.println("name: "+getf_name());
        System.out.println("age: "+getf_age());
        System.out.println("gender: "+getf_gender());
    }

}