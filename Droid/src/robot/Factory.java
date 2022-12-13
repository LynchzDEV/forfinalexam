package robot;

public class Factory {
    private Droid[] Droids;
    private int Capacity=10;
    private String Company;
    private int count;

    public Factory(String company) {
        if (isNotNB(company)) Company = company;
        Droids = new Droid[Capacity];
    }
    public boolean isNotNB(String string){
        return string != null && !string.isBlank();
    }

    public Droid[] getDroids() {
        return Droids;
    }

    public int getCapacity() {
        return Capacity;
    }

    public String getCompany() {
        return Company;
    }

    public boolean Create_Droid(String name){
        if (isNotNB(name)|| Droids.length == count ) return false;
        Droids[count++] = new Droid(name);
        return true;
    }
    public int[] getAllVersion(){
        int[] allVersion = new int[count];
        for (int i =0,k=0; i<count;i++){
            if (Droids[i] != null){
                allVersion[k++] = Droids[i].getVersion();
            }
        }
        return allVersion;
    }
    public Droid getDroidVersion(int version){
        for (int i =0;i<count;i++){
            if (Droids[i].getVersion() == version){
                return Droids[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("(%s : %d)",Company,Capacity);
    }
}
