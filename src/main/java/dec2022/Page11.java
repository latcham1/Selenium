package dec2022;


interface Readable
{
	public void readBook();
	public void setBookMark();
}
abstract class Book implements Readable
{
	public void readBook()
	{}
}
class Ebook extends Book
{

	public void readBook()
	{
		// TODO Auto-generated method stub
	}
//	public void setBookMark() 
//	{
//		// TODO Auto-generated method stub
//	}
}
public class Page11
{
	public static void main(String[] args) 
	{
		Book book=new Ebook();
		book.readBook();
	}
}

