package exam;

import java.util.Arrays;

public class Department {

    private final int code;
    private static int nextCode = 400;
    private String title;
    public Person[] staff;
    private int count;

    public Department(String title) {
        this.code = nextCode++;
        if (title == null || title.isBlank()) {
            title = "OLD_SCHOOL_NAME";
        } else {
            this.title = title;
        }
        staff = new Person[12];
    }

    public int getCode() {
        return code;
    }

    public Person[] getStaffs() {
        return staff;
    }

    public int getCount() {
        return count;
    }

    public boolean addStaff(String firstname, String lastname, int type) {
        if (count == staff.length || firstname == null || firstname.isBlank() || lastname == null || lastname.isBlank()) {
            return false;
        }
        staff[count++] = new Person(firstname, lastname, type);
        return true;
    }

    public int getTypeCount(int type) {
        for (int i = 0; i < count; i++) {
            if (staff[i].getType() == type) {
                return i;
            }
        }
        return -1;
    }

    public int[] getAllCodes() {
        int[] temp = new int[count];
        for (int i = 0; i < count; i++) {
            temp[i] = staff[i].getCode();
        }
        return temp;
    }

    public Person getStaff(int code) {
        for (int i = 0; i < count; i++) {
            if (staff[i].getCode() == code) {
                return staff[i];
            }
        }
        return null;
    }

    public int getCodeTest(int i) {
        return staff[i].getCode();
    }

    @Override
    public String toString() {
        return "Department{" + "code=" + code + ", title=" + title + ", staff=" + Arrays.toString(staff) + ", count=" + count + '}';
    }

    public int[] getAllType() {
        int[] temp = new int[count];
        int tempCount = 0;
        for (int i = 0; i < count; i++) {
            temp[i] = staff[i].getType();
            tempCount++;
        }
        Arrays.sort(temp);
        int size = 0;
        for (int i = 1; i < count; i++) {
            if (temp[size] != temp[i]) {
                temp[++size] = temp[i];
            }
        }
        return Arrays.copyOfRange(temp, 0, ++size);
    }

}
