package Study;

import java.util.Scanner; 

abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}

class Line extends Shape{
	String name = "Line";

	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	String name = "Rect";

	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	String name = "Circle";

	@Override
	public void draw() {
		System.out.println("Circle");
	}
}


class Func{
	
}

public class GraphicEditor {
	private Shape head, tail;

	public static void main(String[] args) {
		GraphicEditor editor = new GraphicEditor();
		editor.run();
	}
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			int select = scan.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				select = scan.nextInt();
				insert(select);
				break;
			case 2:
				System.out.print("삭제할 도형의 위치 ");
				select = scan.nextInt();
				delete(select);
				break;
			case 3:
				show();
				break;
			case 4:
				System.exit(0);
				break;
			} // switch end
		} // while end
	} // run end
	
	public void insert(int draw) {
		Shape shape;
		switch(draw) {
		case 1:
			shape = new Line();
			break;
		case 2:
			shape = new Rect();
			break;
		case 3:
			shape = new Circle();
			break;
		default:
			System.out.println("다시 입력!");
			return;
		} // switch end
		
		if(head == null) {
			head = shape;
			tail = shape;
		}
		else {
			tail.setNext(shape);
			tail = shape;
		}
	} // insert end
	
	public void delete(int draw) {
		int count=1;
		Shape now = head.getNext();
		Shape temp = head;
		
		while(temp != null) {
			if(draw == 1) {
				// 1번을 삭제하면서 갯수가 1개밖에 없을 때
				if(count == 1 && temp.getNext() == null) {
					head = null; tail = null;
				}
				else {
					head = now; temp = null;
				}
				return;
			}
			
			else if(draw > 1 && draw == count) {
				if(now.getNext() == null) {
					tail = temp; temp.setNext(null); now = null;
				}
				else {
					temp.setNext(now.getNext());
					now = null;
				}
				return;
			}
			
			if(count > 1) {
				now = now.getNext();
				temp = temp.getNext();
			}
			count++;
		} // while end
		System.out.println("삭제할 위치의 노드가 없습니다.");
	} // delete end
	
	public void show() {
		Shape now = head;
		while(now != null) {
			now.draw();
			now = now.getNext();
		}
	} // show end
}
