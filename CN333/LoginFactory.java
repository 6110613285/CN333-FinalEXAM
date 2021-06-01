public class LoginFactory {
	
    //use getShape method to get object of type shape 
    public Login getaccount(String account){
       if(account == null){
          return null;
       }		
       if(account.equalsIgnoreCase("Google")){
          return new googleaccount();
          
       } else if(account.equalsIgnoreCase("Facebook")){
          return new facebookaccount();
          
       } else if(account.equalsIgnoreCase("Normal")){
          return new Normalaccount();
       }
       
       return null;
    }
 }