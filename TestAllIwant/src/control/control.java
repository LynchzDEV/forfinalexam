package control;

public class control {
    private int row,column;
    private static String check;

    public control(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public static String getCheck() {
        return check;
    }

    public void moveup(){
        if (row > 7){
            check = "Fail";
        } row++;
    }

    public void movedown(){
         row--;
    }

    public void moveright(){
        if (column > 7){
            check = "Fail";
        } column++;
    }

    public void moveleft(){
         column--;
    }

    public String Canrun(){
        if (row < 0 && row > 7 && column < 0 && column > 0){
            return "Fail";
        } else
        return "Yes";
    }

    @Override
    public String toString() {
        return "control{" +
                "row=" + row +
                ", column=" + column +
                ", check='" + check + '\'' +
                '}';
    }
}
