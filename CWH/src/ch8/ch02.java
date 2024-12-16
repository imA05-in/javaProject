package ch8;

public class ch02 {
    public static void main(String[] args) {
square sq_obj1 = new square();
sq_obj1.setSide(5);
//sq_obj1.printDetails();
        System.out.println(sq_obj1.setSide(6));
    }
}
class square {
    int side;
    int area;
    int perimeter;

    public int setSide(int side) {
        this.side = side;
        return side;
    }
    public int getArea(){
        area = side*side;
        return area;
    }
    public int getPerimeter(){
        perimeter = 4*side;
        return perimeter;
    }

    public void printDetails() {
        System.out.println(side);
        System.out.println("area is: "+getArea());
        System.out.println("perimeter is: "+getPerimeter());
    }
}
