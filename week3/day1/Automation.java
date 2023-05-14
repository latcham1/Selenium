package week3.day1;

public class Automation extends MultipleLangauge {

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium from Automation class");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java from Automation class");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby from Automation class");
	}
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.python();auto.ruby();auto.Java();auto.Selenium();
	}

}
