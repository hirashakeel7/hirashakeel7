

public class MainArray
{
 public static void main(String args[])
{
int j;
double sum=0;
 int[] i= new int[5];
i[0]=2;
i[1]=4;
i[2]=6;
i[3]=8;
i[4]=10;
for(j=0;j<i.length;j++)
{
 sum= sum+j;
}
System.out.println("sum is"+sum);
}
}
