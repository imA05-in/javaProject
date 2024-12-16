package ch8;
class cirlceDetails {
    private int radius;
    public float area(){
        float area = radius*radius*(22/7f);
        return area;
    }

    public int setRadius(int r) {
        radius = r;
        return radius;
    }

    public int getRadius(){
        System.out.println(radius);
        return radius;
    }

    public static void main(String[] args) {
//        cirleDetails cd1 = new cirleDetails();
//        cd1.setRadius(6);
//        cd1.getRadius();
//        cirleDetails printDet = new cirleDetails();

        circle2 circle2 = new circle2();
    }
}
class circle2{
    public circle2(){
        cirlceDetails obj_cd1 = new cirlceDetails();
        int radius = obj_cd1.setRadius(5);
        float area = radius*radius*(22/7f);
        System.out.println(area);
    }
}

public class circle1 {
//    public static void main(String[] args) {
//        cirleDetails cd = new cirleDetails();
//        cd.getRadius(5);
//    }
}
