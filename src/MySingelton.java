public class MySingelton {
    private static MySingelton mySingelton;
    private MySingelton() {
    }
    public static MySingelton getIstance (){
        if(mySingelton== null){
            mySingelton= new MySingelton();
        }
      return mySingelton;
    }
}
