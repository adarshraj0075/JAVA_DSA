public class OOPS_acess_mod {
    public static void main(String[] args){
        BankAccount myacc=new BankAccount();
        myacc.username="Adarsh Raj";
        //myacc.password="1234"; This will Through error 
        myacc.setpassword("1235");
    }
    
}

class BankAccount{
    public String username;
    private String password;
    public void setpassword(String pwd){
        password=pwd;
    }

}
