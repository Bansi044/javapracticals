public class prac19 {
    public static void main(String[] args) {
        Square s = new Square();
      s.printShape();
        s.printRectangle();
        s.printSquare();
        System.out.println("23DIT022");
    }
}
 class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

 class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

 class circle extends Shape{
    public void printCircle(){
        System.out.println("This is circular shape");
    }
 }

 class Square extends Rectangle {
public Square() {}  
   void printSquare() {
        System.out.println("Square is a rectangle");
    }
}