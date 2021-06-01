public abstract class Room {
   abstract void size();
   abstract void price();
   abstract void bed();
   abstract void people();
   abstract void checkin();
   abstract void checkout();
   abstract void anyoption();


   //template method
   public final void book(){
      anyoption();
      checkin();
      checkout();
      size();
      price();
      bed();
      people();
   }
}