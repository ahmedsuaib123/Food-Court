package FileIO;

import java.io.*;
import java.util.*;

public class UserFileIO {
    public static boolean checkUserFromFile(String userName, String userPass) {
        try {
            Scanner sc = new Scanner(new File("./FileIO/UserData.txt"));
            while (sc.hasNextLine()) {
                String data[] = sc.nextLine().split(";");
                if (data[0].equals(userName) && data[1].equals(userPass)) {
                    sc.close();
                    return true;
                }
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String[][] loadFromFile(String filePath) {
        String[][] userData = null;
        try {
            Scanner sc = new Scanner(new File(filePath));
            int lines = 0;
            while (sc.hasNextLine()) {
                sc.nextLine();
                lines++;
            }
            sc.close();

            userData = new String[lines][];
            sc = new Scanner(new File(filePath));
            int index = 0;
            while (sc.hasNextLine()) {
                userData[index++] = sc.nextLine().split(";");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        return userData;
    }
}