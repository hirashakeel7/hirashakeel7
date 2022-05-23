class Box{
 double width;
  double height;
  double depth;

Box(double w, double h, double d)
{
 width= w;
 height= h;
 depth =d;
}
double volume()
{
 return width*height*depth;
}
}
 public class ParametriseConstr
{
 public static void main(String args[])
{
   Box obj1= new Box(2,3,4);
   Box obj2= new Box(2.5,5,6);
 double vol;
 vol= obj1.volume();
 System.out.println("volume is"+vol);
 vol= obj2.volume();
 System.out.println("volume is"+vol);
}
}
 
 
