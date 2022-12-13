package Method;

public class Student {

    private final int id;
    private static int lastestId;
    private String firstname;
    private String lastname;

    public Student(String firstname, String lastname) {
        id = lastestId++;
        if (!validString(firstname)) {
            this.firstname = "DEFAULT_FIRSTNAME";
        } else {
            this.firstname = firstname;
        }
        if (!validString(lastname)) {
            this.lastname = "DEFAULT_LASTNAME";
        } else {
            this.lastname = lastname;
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        if (validString(firstname)) {
            this.firstname = firstname;
        }
    }

    public void setLastname(String lastname) {
        if (validString(lastname)) {
            this.lastname = lastname;
        }
    }

    public static boolean validString(String input) {
        return input != null && !input.isBlank();
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", lastestId=" + lastestId + ", firstname=" + firstname + ", lastname=" + lastname + '}';
    }
    
}
