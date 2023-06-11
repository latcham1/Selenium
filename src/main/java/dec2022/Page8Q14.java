package dec2022;

abstract class A3 //A
{private static int i;
public void doStuff(){}public A3(){}}

final class A1  //B
{public A1(){}}

private class Page8Q14   //Class A2
//Illegal modifier for the class A2; only public, abstract & final are permitted
{private static int i;private Page8Q14(){}}



class A4   //D  Final fields must be initialized immediately after declaration.
{
protected static final int i=0;
private void doStuff(){}}

final abstract class A5   //E   Abstract class can never be final.
{
	protected static int i;
	void doStuff(){}
	abstract void doIt();
	}




