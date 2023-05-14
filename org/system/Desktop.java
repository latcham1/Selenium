package org.system;

public class Desktop extends Computer{
	 void desktopSize() {
		// TODO Auto-generated method stub
System.out.println("desktopSize from Desktop subclass");
	}
	 public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.desktopSize();
		desk.computerModel();
	}
}
