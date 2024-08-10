import java.lang.*;
import java.util.*;

public class UserList {
    private User users[];

    public UserList() {
        users = new User[100];
    }

    public UserList(int size) {
        users = new User[size];
    }

    public void insert(User user) {
        boolean flag = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Insertion Successful");
        } else {
            System.out.println("Insertion Failed");
        }
    }

    public User getById(String id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getUsername().equals(id)) {
                return users[i];
            }
        }
        return null;
    }

    public void deleteById(String id) {
        boolean flag = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getUsername().equals(id)) {
                users[i] = null;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Deletion Successful");
        } else {
            System.out.println("Deletion Failed");
        }
    }

    public String showAll() {
        System.out.println("++++++ List of All Available Users ++++++");
        StringBuilder allUserInfo = new StringBuilder();
        for (User user : users) {
            if (user != null) {
                allUserInfo.append("-------------------------------------------------------------------------------\n");
                allUserInfo.append(user.getUserInfoAsString()).append("\n");
            }
        }
        allUserInfo.append("--------------------------------------------------------------------------------------------\n");
        return allUserInfo.toString();
    }

    public User[] getAllUsers() {
        return users;
    }

    public void updateById(String id, User updatedUser) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getUsername().equals(id)) {
                users[i] = updatedUser;
                System.out.println("Update Successful");
                return;
            }
        }
        System.out.println("Update Failed: User not found");
    }
}
