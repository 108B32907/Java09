class cRectangle{
	int height;
	int width;
	public  cRectangle(int w,int h) { //呼叫此函數需給定w,h的值
		height=h;  
		width=w;
	}
	public cRectangle() { //呼叫此函數直接將height,width分別設定為8,10
		height=8;
		width=10;
	}
	/* public cRectangle() {
		this.(10,8); // 使用cRectangle(10,8)函數 
		
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
