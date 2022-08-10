class Box
{
 double width;
 double height;
 double depth;
Box()
{
 width=10.0;
 height=20.0;
 depth=30.0;
}
}


public class Constructor
{
 public static void main(String args[])
{
 Box mybox1= new Box();
System.out.println(mybox1.width+"\n" + mybox1.height +"\n" + mybox1.depth);
Box mybox2= new Box();
System.out.println(mybox2.width+"\n" + mybox2.height +"\n" + mybox2.depth);
}
}
