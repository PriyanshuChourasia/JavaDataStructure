package JavaTut.Polymorphism.interfaces;

interface Shape{
    void area(int radius);
}

class Circle implements Shape{
    float pie = 3.14F;
    public void area(int radius){
        float area = pie * radius * radius;
        System.out.println("Area of Circle: "+area);
    }
}

class Square implements Shape{
    public void area(int area1){
        int area = area1 * area1;
        System.out.println("Area of square: "+area);
    }
}


class Rectangle implements Shape{
    public void area(int length){
        int area = length * 4;
        System.out.println("Area of Rectangle: "+area);
    }
}


public class Mathematics {
    public static void main(String[] args){
        Shape cir = new Circle();
        cir.area(4);
        Shape sq = new Square();
        sq.area(12);
        Shape rec = new Rectangle();
        rec.area(34);
    }
}
