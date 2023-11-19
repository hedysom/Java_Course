import java.awt.Rectangle;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int width = 10;
        int height = 20;

        int newX = 5;
        int newY = 5;

        Rectangle box = new Rectangle(x,y,width,height);
        box.setLocation(newX,newY);

        Rectangle box1 = new Rectangle(15,5,10,20);
        Rectangle box2 = new Rectangle(25,5,10,20);
        Rectangle box3 = new Rectangle(35,5,10,20);

        box.add(box1);
        box.add(box2);
        box.add(box3);

        double area = box.getHeight() * box.getWidth();
        double perimeter = box.getHeight()*2 + box.getWidth()*2;



        System.out.println(box);
        System.out.println(area);
        System.out.println(perimeter);

    }
}