public class Data{
    int x;
    Data(int y) {
        x=y;
    }
}
public static void main (String[] args){
    Data myObj = new Data (5);
    System.out.println(myObj.x);
}