public class Room1 extends Room {

    @Override
    void size() {
       System.out.println("This room size 28x48");
    }
 
    @Override
    void bed() {
       System.out.println("1 bed : 6 FT ");
    }
 
    @Override
    void people() {
       System.out.println("เข้าพัก 5 ท่าน");
    }

    @Override
    void checkin() {
       System.out.println("เช็คอิน 31/05/2021 ");
    }

    @Override
    void checkout() {
       System.out.println("เช็คเอ้า 01/06/2021 ");
    }

    @Override
    void anyoption() {
       System.out.println("เตียงเสริม 2 เตียง");
    }

    @Override
    void price() {
       System.out.println("ราคา : 35,999 บาท");
    }
    

}