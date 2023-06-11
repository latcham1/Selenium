package vceguide;

import java.util.ArrayList;

interface Hunter{}
abstract class Animal{}
class Cat extends Animal implements Hunter{}
class Tiger extends Cat{}
public class Q84Cat
{
	public static void main(String[] args) {
		ArrayList<Animal> myList1 = new ArrayList<>();
		myList1.add(new Tiger());
		
		ArrayList<Hunter> myList2 = new ArrayList<>();
		myList2.add(new Cat());
		
		ArrayList<Hunter> myList3 = new ArrayList<>();
		myList3.add(new Tiger());
		
		ArrayList<Tiger> myList4 = new ArrayList<>();
		myList4.add(new Cat());
		
		ArrayList<Animal> myList5 = new ArrayList<>();
		myList5.add(new Cat());
	}}
