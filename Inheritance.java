class A{
 int i,j;
void show()
{
 System.out.println("i="+i+"j="+j);
}
int sum()
{
 return i+j;
}
}
class B extends A
{
 int k;
 void showk()
{
 System.out.println("k="+k);
}
int sumk()
{
 return sum()+k;
}
}
public class Inheritance
{
 public static void main(String args[])
{
 A obj1= new A();
 B obj2= new B();


obj1.i=10;
obj1.j=20;
obj1.show();
obj2.i=60;
obj2.j=70;
obj2.k=80;
obj2.show();
obj2.showk();
int ans1=obj1.sum();
int ans2=obj2.sum();
int ans3=obj2.sumk();
System.out.println("ans1"+ans1);
System.out.println("ans2"+ans2);
System.out.println("ans3"+ans3);
}
}



