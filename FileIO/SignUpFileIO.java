package FileIO;

import java.io.*;

public class SignUpFileIO {

    public static void writeNewUser(String username, String password, String fullName, String phoneNumber,
            String gender) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./FileIO/UserData.txt", true))) {

            writer.write(username + ";" + password);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Cannot Write in File");

        }
    }

    public static void writeNewUserInfo(String fullName, String username, String email, String phoneNumber,
            String gender, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./FileIO/UserInformation.txt", true))) {

            writer.write(fullName + ";" + username + ";" + email + ";" + phoneNumber + ";" + password);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Cannot Write in File");
        }
    }
}
