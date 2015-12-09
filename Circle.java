public class Circle extends Shape{
  private double radius;

  public Circle(double radius, String name){
    super(name);
    this.radius = radius;
  }

  public double getRadius(){
    return radius;
  }

  public String toString(){
    return "twould be where i tostringed if had tostring";
  }
  public double getArea(){
    return 3.14*radius*radius;
  }
  public static void main(String[]args){
	Circle dan = new Circle(5,"dan");
	System.out.println(dan.getArea());

  }
}

