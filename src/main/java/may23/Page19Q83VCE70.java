package may23;

public class Page19Q83VCE70 {
		int x;
		int y;

		public void doStuff(int x, int y) {
		this.x = x;
		y = this.y;
		}
		public void display () {
		System.out.print(x + " " + y + " : " );
		}
		public static void main(String[] args) {
		Page19Q83VCE70 m1 = new Page19Q83VCE70 ();
		m1.x = 100;
		m1.y = 200;
		Page19Q83VCE70 m2 = new Page19Q83VCE70 ();
		m2.doStuff(m1.x, m1.y);
		m1.display();
		m2.display();
		}
		}

