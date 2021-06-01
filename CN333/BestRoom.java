public class BestRoom extends Room {

    @Override
    void size() {
       System.out.println("This room size 96x58");
    }
 
    @Override
    void bed() {
       System.out.println("1 bed : 8 FT ");
    }
 
    @Override
    void people() {
       System.out.println("เข้าพัก 20 ท่าน");
    }

    @Override
    void checkin() {
       System.out.println("เช็คอิน 26/05/2021 ");
    }

    @Override
    void checkout() {
       System.out.println("เช็คเอ้า 05/06/2021 ");
    }

    @Override
    void anyoption() {
       System.out.println("เหล้า Gold label และ ที่เขียบุหรี่");
    }

    @Override
    void price() {
       System.out.println("ราคา : 64,500 บาท");
    }
    

}