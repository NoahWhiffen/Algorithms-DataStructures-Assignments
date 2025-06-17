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
            User newUser = new User(firstName, lastName);
            users[userCount++] = newUser;
            System.out.println("User added: " + newUser.getFullName());
            return true;
        } else {
            System.out.println("User with name " + firstName + " " + lastName + "already exists.");
            return false;
        }
    }

    public void printUsers() {
        for (int i = 0; i < userCount; i++) {
            System.out.println(users[i].toString());
        }
    }

    public User getUserByName(String firstName, String lastName) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
