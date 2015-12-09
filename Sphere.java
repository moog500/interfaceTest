public class Sphere extends Circle{

  public Sphere(double radius, String name){
    super(radius,name);
  }

  public String toString(){
    return "FIXME!";
  }
  public double getVolume(){
    return super.getArea() * super.getRadius() * 4/3;
  }
}
