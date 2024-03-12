package testA;

public class SampleA {

	public static void main(String[] args) {
		addTwoValues(10,30);
		addThreeValues(10,20,30);
		addTwoValues(10,30);
		addThreeValues(255,230,330);
		addTwoValues(110,340);
		addThreeValues(160,290,310);
		addTwoValues(110,830);
		addThreeValues(150,220,930);
		addTwoValues(102,340);
		addThreeValues(510,260,320);
		addTwoValues(130,330);
		addThreeValues(210,520,350);
		addTwoValues(110,300);
		addThreeValues(410,250,630);
		addFourValues(1,2,3,4);

	}
	public static void addTwoValues(int a, int b)
	{
		System.out.println("Adding...");
		System.out.println(a+b);
	}
	public static void addThreeValues(int a, int b, int c)
	{
		System.out.println("Adding...");
		System.out.println(a+b+c);
	}
	public static void addFourValues(int p, int q, int r, int s)
	{
		System.out.println("Adding...");
		System.out.println(p+q+r+s);
	}

}
