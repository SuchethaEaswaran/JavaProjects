package testA;

public class SampleC {

	public static void main(String[] args) {
		sub(9,3);
		sub(9,3,2);

	}
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void sub(int x,int y, int z)
	{
		System.out.println(x-y-z);
	}

}
