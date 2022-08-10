public class MainArrayMax
{
public static void main(String args[])
{
int i;
int max=0;
 int[] m= new int[5];
m[0]=2;
m[1]=4;
m[2]=6;
m[3]=8;
m[4]=10;
 for(i=0;i<m.length;i++)
{
 if(max<m[i])
 max= m[i];
}
System.out.println("max no. is"+max);
}
}
