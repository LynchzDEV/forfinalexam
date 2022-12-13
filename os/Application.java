package Method;

import java.util.Objects;

public class Application {
    private int id;
    private static int lastestId;
    private String name;
    private String description;
    private int size;

    public Application(int id, String name, String description, int size) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;       
        id = lastestId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Application{" + "id=" + id + ", name=" + name + ", description=" + description + ", size=" + size + '}';
    }
    
    
}
