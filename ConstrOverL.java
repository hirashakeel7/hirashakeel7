class Box
{
 double width,height,depth;
 Box(double w, double h, double d)
{
 width =w;
 height=h;
 depth=d;
}
 Box(double c)
{ 
 width=height=depth=c;
}
Box()
{
 width=-1;
 height=-1;
 depth=-1;
}
}
public class ConstrOverL
{
 public static void main(String args[])
{ 
 Box obj1=new Box(2,3,4);
 Box obj2=new Box(4);
 Box obj3=new Box();
 System.out.println(obj1);
 System.out.println(obj2);
 System.out.println(obj3);
}
}
 
