class Figure
{
 double dim1;
 double dim2;
double area()
{
 System.out.println("Area of figure class");
return 0;
}
}
class Triangle extends Figure
{
 double area()
{
 return 1.0/2.0*dim1*dim2;
}
}
class MethOverride
{
 public static void main(String args[])
{
 Figure f= new Figure();
 Triangle t= new Triangle();
f.dim1=5;
f.dim2=4;
t.dim1=2.3;
t.dim2=4.5;
double at=t.area();
double af=f.area();
System.out.println("at="+at);
System.out.println("af="+af);
}
}
