package Study;

class Rectangle{
	int x,y,width,height;
	
	Rectangle(int x, int y, int width, int height){
		this.x = x; this.y = y; this.width = width; this.height = height;
	}
	
	void setX(int x) {this.x = x;}
	void setY(int y) {this.y = y;}
	void setWidth(int width) {this.width = width;}
	void setHeight(int height) {this.height = height;}
	
	int square() {
		return this.width * this.height;
	}
	
	void show() {
		System.out.printf("(%d, %d)���� ũ�Ⱑ %dx%d�� �簢��\n",x,y,width,height);
	}
	
	boolean contains(Rectangle r) {
		if(this.x < r.x && this.x+width > r.x+r.width) {
			if (this.y < r.y && this.y+height > r.y+r.height) {
				return true;
			}
		}
		return false;
	}
}

public class Rec_242_4 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}
}
