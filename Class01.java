class cRectangle{
	int height;
	int width;
	public  cRectangle(int w,int h) { //�I�s����ƻݵ��ww,h����
		height=h;  
		width=w;
	}
	public cRectangle() { //�I�s����ƪ����Nheight,width���O�]�w��8,10
		height=8;
		width=10;
	}
	/* public cRectangle() {
		this.(10,8); // �ϥ�cRectangle(10,8)��� 
		
	}*/
	public void show() {
		System.out.println(height +" "+width);
	}
}
public class Class01 {

	public static void main(String[] args) {
		cRectangle cR1=new cRectangle(); 
		cRectangle cR2=new cRectangle(8,10);
		cR1.show(); 
		cR2.show();
	}

}
