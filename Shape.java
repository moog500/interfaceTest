
public abstract class Shape implements Area, Volume{

  private String name;

  public Shape(){
    name = "";
  }

  public Shape(String name){
     this.name = name;
  }

  public String getName(){
    return name;
  }

  public abstract String toString();

  public double getArea(){
	return 0;
  }
  public double getVolume(){
	return 0;
  }
}
