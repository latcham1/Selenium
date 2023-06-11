package vceguide;

import java.io.IOException;
 class X {
	 public void printFileContent () throws IOException{  //line 5 // A// add throws IOException
		 
				throw new IOException();
	}
}
public class Q12Exception{
	public static void main(String[] args) throws Exception {  // line 11 //c // add throws Exception
	X xobj=new X();
	xobj.printFileContent();	
}
}
