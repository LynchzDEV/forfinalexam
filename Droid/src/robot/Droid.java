package robot;

public class Droid {
    private String name;
    private int version;
    private static int NextVersion=0;
    private int Battery_Level;

    public Droid(String name) {
        this.name = isValid(name) ? name: "Codey";
        this.version = ++NextVersion;
        this.Battery_Level =100;
    }
    static boolean isValid(String string){
        return string != null && !string.isBlank();
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }

    public int getBattery_Level() {
        return Battery_Level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String Perform_Task(String task){
        this.Battery_Level -= 20;
        if (Battery_Level >= 20){
            return String.format("%s is performing %s",name,task);
        }
        if (Battery_Level <= 20 && Battery_Level >=0) {
            return String.format("%s is performing %s : batter is running low", name, task);
        }
        if (Battery_Level < 0){
            this.Battery_Level = 0;
            return String.format("Error, %s is out of battery",name);
        }return "";
    }

    public void Charge_Battery(int battery){
        int remain = Battery_Level;
        if (remain <= 100){
            Battery_Level = battery - Battery_Level;
            remain += Battery_Level;
        }
        Battery_Level = remain;
    }

    @Override
    public String toString() {
        return String.format("DROID : %d(%s)%d",version,name,Battery_Level);
    }
}
