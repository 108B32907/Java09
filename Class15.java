package Java09.src;

class CCircle        // �w�q���OCCircle
{
	private static double pi=3.14;
   private double radius;

   public CCircle(double r)
   {
      radius=r;
   }
   public static double compare(CCircle c[])  // compare() method
   {
      double max=0.0;
      for(int i=0;i<c.length;i++)
         if(c[i].radius>max)
            max=c[i].radius;
      return max;
   }
   public static double average(CCircle c[]) {
	   double sum=0;
	   for(int i=0;i<c.length;i++) {
		   sum+=c[i].radius;	//�N�}�C�̪��ȥ[�`
	   }
	   sum=sum/c.length; //��X������
	   return sum;	//�^�ǥ�����
   }
}

public class Class15
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[3];
      cir[0]=new CCircle(1.0);
      cir[1]=new CCircle(4.0);
      cir[2]=new CCircle(2.0);
      
      System.out.println("Largest radius = "+CCircle.compare(cir));
      System.out.println(CCircle.average(cir)); //�I�s���OCCircle�̪�average���
   }
}