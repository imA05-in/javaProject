package ch10;
class circle{
    private int radius;
    public void SetRadius(int rad){
        this.radius = rad;
    }
    public int GetRadius(){
        return radius;
    }
}
class cylinder extends circle{
    public void SetRadius(int rad){
        super.SetRadius(rad);
    }
    public void printDet(){
        System.out.println("radius: "+GetRadius());
    }
}
public class a01 {
    public static void main(String[] args) {
        circle cir = new circle();
        cylinder cy = new cylinder();
//        cir.SetRadius(5);
        cy.SetRadius(5);
        cy.printDet();

    }
}
