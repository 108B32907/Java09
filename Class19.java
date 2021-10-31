package Java09.src;

class Data{
	private static String name;
	private static Test score; 
	class Test{ //�������O
		static int English;
		static int Math;
		public Test(int eng,int m) { //�������O�غc��
			English=eng;
			Math=m;
		}
		public double avg() { //�������O���
			return (English+Math)/2.0;
		}
	}
	public Data(String n,int eng,int m) {
		name=n;
		score=new Test(eng,m); //�~�����O�ϥΤ������O���
	}
	public void show() {
		System.out.println(name+" "+score.English+" "+score.Math+" "+score.avg());
	}
	
}

public class Class19 {

	public static void main(String[] args) {
		Data stu=new Data("Annie",85,92);
		stu.show();
	}
}
