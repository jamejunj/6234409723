package interfaceproject;
import java.util.ArrayList;
public class InterfaceProject {
    public static void main(String[] args) {
        Ground ground1 = new Ground("Bangkok Ground");
        Pool pool1 = new Pool("Chula swimming pool");
        Sky sky1 = new Sky("Japan Sky");
// 1. ทดลองรันและดูผลลัพธ์      
        System.out.println("**************1*************");
        Fish fish1 = new Fish("Nemo");
        fish1.swim(ground1);
        fish1.swim(pool1);
        fish1.swim(sky1);  
        System.out.println("****************************");
        
// 2. สร้าง object จาก class Cat และใช้งาน method ใน CanWalk ดูตัวอย่างจาก Fish
//  เสร็จแล้วผลลัพธ์ต้องตรงกับผลรัน
        System.out.println("**************2*************");
//      เพิ่มโค้ดตรงนี้
        System.out.println("****************************");

// 3. สร้าง object จาก class Bird และใช้งาน method ใน CanWalk และ CanFly 
//  เสร็จแล้วผลลัพธ์ต้องตรงกับผลรัน
        System.out.println("**************3*************");
//      เพิ่มโค้ดตรงนี้
        System.out.println("****************************");
        
// 4.   สร้าง ArrayList Terrain และ add ground1, pool1 และ sky1 ลงไปตามลำดับ
//      สร้าง ArrayList Animal และ add cat1, fish1 และ bird1 ลงไปตามลำดับ
//      เพิ่มโค้ดตรงนี้
        System.out.println("**************4*************");        
//      Uncomment code ด้านล่าง ลองอ่าน code และทำความเข้าใจ ดูผลลัพธ์ที่เกิดขึ้น        
//        for(Animal animal:animals) {
//            for(Terrain terrain:terrains) {
//                if (animal instanceof CanWalk) {
//                    ((CanWalk) animal).walk(terrain);
//                    ((CanWalk) animal).run(terrain);
//                } 
//                if (animal instanceof CanSwim) {
//                    ((CanSwim) animal).swim(terrain);
//                }
//                if (animal instanceof CanFly) {
//                    ((CanFly) animal).fly(terrain);
//                }               
//            }
//            System.out.println("****************************");
//        }     
    }
}
