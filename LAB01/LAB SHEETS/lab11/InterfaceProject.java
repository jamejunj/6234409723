package interfaceproject;
import java.util.ArrayList;
public class InterfaceProject {
    public static void main(String[] args) {
        Ground ground1 = new Ground("Bangkok Ground");
        Pool pool1 = new Pool("Chula swimming pool");
        Sky sky1 = new Sky("Japan Sky");
// 1. ���ͧ�ѹ��дټ��Ѿ��      
        System.out.println("**************1*************");
        Fish fish1 = new Fish("Nemo");
        fish1.swim(ground1);
        fish1.swim(pool1);
        fish1.swim(sky1);  
        System.out.println("****************************");
        
// 2. ���ҧ object �ҡ class Cat �����ҹ method � CanWalk �ٵ�����ҧ�ҡ Fish
//  �������Ǽ��Ѿ���ͧ�ç�Ѻ���ѹ
        System.out.println("**************2*************");
//      �����鴵ç���
        System.out.println("****************************");

// 3. ���ҧ object �ҡ class Bird �����ҹ method � CanWalk ��� CanFly 
//  �������Ǽ��Ѿ���ͧ�ç�Ѻ���ѹ
        System.out.println("**************3*************");
//      �����鴵ç���
        System.out.println("****************************");
        
// 4.   ���ҧ ArrayList Terrain ��� add ground1, pool1 ��� sky1 ŧ仵���ӴѺ
//      ���ҧ ArrayList Animal ��� add cat1, fish1 ��� bird1 ŧ仵���ӴѺ
//      �����鴵ç���
        System.out.println("**************4*************");        
//      Uncomment code ��ҹ��ҧ �ͧ��ҹ code ��зӤ������� �ټ��Ѿ�����Դ���        
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
