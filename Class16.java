class CCircle        // 定義類別CCircle
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)       // CCircle建構元
   {
      radius=r;
   }
   public void show()
   {
	  System.out.println(radius);
      System.out.println("area="+pi*radius*radius);
   }
}
public class Class16
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[6];
      for(int i=0;i<cir.length;i++) {
    	  cir[i]=new CCircle(i); //將輸入的值依序放到陣列裡面
    	  cir[i].show(); 
      }
   }
}