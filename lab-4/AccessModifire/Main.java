class Test{
    public String name;
    private int pass;

    //Setter function
    void setpass(int i){
        pass=i;
    }
    //Getter function
    int getpass(){
        return pass;
    }
}
public class Main {
    public static void main(String args[]){
        Test user1 = new Test();
        user1.name="shailesh";

        // name are accessed dierctly
        System.out.println("Name : " + user1.name);

        // for pass we have to use setter and getter functions
        user1.setpass(1234);
        int res = user1.getpass();  
        System.out.println("Password : " + res);
    }

    
}
