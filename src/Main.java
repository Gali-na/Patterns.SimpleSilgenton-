public class Main {
    public static void main(String[] args) {
       MySingelton mySingelton1 = MySingelton.getIstance();
        MySingelton mySingelton2 = MySingelton.getIstance();
        System.out.println(mySingelton2.equals(mySingelton1));
    }
}