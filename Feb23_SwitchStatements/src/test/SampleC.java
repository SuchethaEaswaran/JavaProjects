package test;

public class SampleC {

	public static void main(String[] args) {
		//Switch only uses int and string datatype
		String Month="Nov";
		switch(Month)
		{
		case "Jan":
			System.out.println("1st month");
			break;
		case "Feb":
			System.out.println("2nd month");
			break;
		case "Mar":
			System.out.println("3rd month");
			break;
		case "Apr":
			System.out.println("4th month");
			break;
		case "May":
			System.out.println("5th month");
			break;
		case "Jun":
			System.out.println("6th month");
			break;
		case "Jul":
			System.out.println("7th month");
			break;
		case "Aug":
			System.out.println("8th month");
			break;
		case "Sept":
			System.out.println("9th month");
			break;
		case "Oct":
			System.out.println("10th month");
			break;
		case "Nov":
			System.out.println("11th month");
			break;
		case "Dec":
			System.out.println("12th month");
			break;
		default:
			System.out.println("Invalid");
			break;
		}

	}

}
