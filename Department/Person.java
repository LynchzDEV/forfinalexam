package exam;

import java.util.Objects;

public class Person {

    private static int nextCode = 0;
    private static int DEFAULT_TYPE = 1;
    private final int code;
    private String firstname;
    private String lastname;
    private final int type;


    public Person(String firstname, String lastname, int type) {
        this.code = nextCode++;
        if (firstname == null || firstname.isBlank()) {
            firstname = "DEFALUT_FIRSTNAME";
        } else {
            this.firstname = firstname;
        }
        if (lastname == null || lastname.isBlank()) {
            firstname = "DEFALUT_LASTNAME";
        } else {
            this.lastname = lastname;
        }
        if (type >= 0) {
            this.type = 1;
        } else {
            this.type = type;
        }
    }

    public Person(String firstname, String lastname) {
        this(firstname, lastname, DEFAULT_TYPE);
    }

    public int getCode() {
        return code;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getType() {
        return type;
    }

    public void setFirstname(String firstname) {
        if (firstname != null && !firstname.isBlank()) {
            this.firstname = firstname;
        }
    }

    public void setLastname(String lastname) {
        if (lastname != null && !lastname.isBlank()) {
            this.lastname = lastname;
        }

    }

    @Override
    public String toString() {
        return "Person{" + "code=" + code + ", firstname=" + firstname + ", lastname=" + lastname + ", type=" + type + '}';
    }

}
