package ch09;
class prop_1{
    cylinder cylinder_obj1 = new cylinder();
    double pi = Math.PI;
    private double area;

    public double surface_area(){
    cylinder_obj1.setRadius(5);
    cylinder_obj1.setHeight(6);
    int height = cylinder_obj1.getHeight();
    int radius = cylinder_obj1.getRadius();
    area = 2*pi*radius*(radius+ height);
    return area;
    }
    public double volume(){
        cylinder_obj1.setRadius(5);
        cylinder_obj1.setHeight(6);
        double vol = pi* cylinder_obj1.getRadius()* cylinder_obj1.getRadius()* cylinder_obj1.getHeight();
        return vol;
    }
}
public class prop {
    public static void main(String[] args) {
        prop_1 prop_1_obj1 = new prop_1();
        double area = prop_1_obj1.surface_area();
        System.out.println(area);
        System.out.println(prop_1_obj1.volume());
    }
}
