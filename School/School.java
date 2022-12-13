package Method;

import java.util.Arrays;

public class School {

    private final int id;
    private static int lastestId;
    private String name;
    private Student[] students;
    private int size;

    public School(String name, int size) {
        id = lastestId++;
        this.name = name;
        this.size = size;
        students = new Student[size];
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addStudent(Student newStudent) {
        for (int i = 0; i < size; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                return true;
            }
        }
        return false;
    }

    public boolean removeStudent(int id) {
        Student[] temp = new Student[size];
        for (int i = 0; i < size; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    continue;
                }
                temp[i] = students[i];
            }         
        }
        students = temp;
        return true;
    }

    public Student[] getAllStudent() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (students[i] == null) {
                continue;
            }
            count++;
        }
        Student[] temp = new Student[count];
        System.arraycopy(students, 0, temp, 0, count);
        return temp;
    }

    public boolean resize(int newSize) {
        if (newSize <= size) {
            return false;
        }
        Student[] temp = new Student[newSize];
        for (int i = 0; i < size; i++) {
            temp[i] = students[i];
        }
        this.size = newSize;
        students = temp;
        return true;
    }

    @Override
    public String toString() {
        return "School{" + "id=" + id + ", lastestId=" + lastestId + ", name=" + name + ", students=" + Arrays.toString(students) + ", size=" + size + '}';
    }

}
