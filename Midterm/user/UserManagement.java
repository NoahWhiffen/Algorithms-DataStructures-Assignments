package Midterm.user;

public class UserManagement {
    private User[] users;
    private int userCount;

    private boolean isUserNameUnique(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        for (int i = 0; i < userCount; i++) {
            if (users[i].getFullName().equalsIgnoreCase(fullName)) {
                return false;
            }
        }
        return true;
    }

    public boolean addUser(String firstName, String lastName) {
        if (isUserNameUnique(firstName, lastName)) {
            users[userCount++] = new User(firstName, lastName);
            System.out.println("User added: " + user.getFullName);
            return true;
        } else {
            System.out.println("User with name " + user.getFullName + "already exists.");
            return false;
        }
    }

    public void printUsers() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public User getUserByName(String firstName, String lastName) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
