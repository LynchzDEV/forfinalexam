package Method;

import java.util.Arrays;

public class OS {

    private int id;
    private static int lastestId;
    private String name;
    private Application[] apps;
    private int storageSize;
    private int usedStorage;
    private int count;
    private int rand;

    public OS(int id, String name, int storageSize) {
        this.id = id;
        this.name = name;
        this.storageSize = storageSize;
        this.apps = new Application[0];
        id = lastestId++;
        

        this.count = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Application[] getApps() {
        return apps;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public int getUsedStorage() {
        return usedStorage;
    }

    public boolean addApplication(Application newApp) {
        if (newApp.getSize() <= (storageSize - usedStorage)) {
            Application[] temp = new Application[apps.length + 1];
            for (int i = 0; i < apps.length; i++) {
                temp[i] = apps[i];
            }
            temp[temp.length - 1] = newApp;
            apps = temp;
            usedStorage += newApp.getSize();
            count++;
            return true;
        }
        return false;
    }

    public int getLength() {
        return apps.length;
    }

    public void removeApplication(int id) {
        if (count <= 0) {
            return;
        }

        int tempCount = 0;
        Application[] temp = new Application[--count];
        for (int i = 0; i <= count; i++) {
            if (id == apps[i].getId()) {
                usedStorage -= apps[i].getSize();
                continue;
            }

            temp[tempCount++] = apps[i];
        }
        apps = temp;
    }

    public void removeApplicationRand() {
        int max = 3;
        int min = 1;
        int range = max - min + 1;

        for (int y = 0; y < max; y++) {
            int rand = (int) (Math.random() * range) + min;
            this.rand = rand;
        }
        
        int tempCount = 0;
        Application[] temp = new Application[--count];
        for (int i = 0; i <= count; i++) {
            if (rand == apps[i].getId()) {
                usedStorage -= apps[i].getSize();
                continue;
            }

            temp[tempCount++] = apps[i];
        }
        apps = temp;
    }

    @Override
    public String toString() {
        return "OS{" + "apps=" + Arrays.toString(apps) + '}';
    }

}
