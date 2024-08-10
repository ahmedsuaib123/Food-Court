package FileIO;

import java.io.*;
import java.util.*;

public class AdminFileIO{
public static boolean checkUserFromFile(String userName,String userPass){
		try{
			Scanner sc = new Scanner(new File("./FileIO/AdminData.txt"));
			while(sc.hasNextLine()){
				String data[] = sc.nextLine().split(";");
				if(data[0].equals(userName) && data[1].equals(userPass)){
					sc.close();
					return true;
				}				
			}
			sc.close();
		}
		catch(Exception e){
			
		}
		return false;
	}
}