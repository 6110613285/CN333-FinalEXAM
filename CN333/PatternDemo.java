public class PatternDemo {

    public static void main(String[] args) {
      LoginFactory loginFactory = new LoginFactory();
 
      //get an object of Circle and call its draw method.
      Login account1 = loginFactory.getaccount("Google");
 
      //call draw method of Circle
      account1.signin();
      Room room = new BestRoom();
      room.book();
     }
}