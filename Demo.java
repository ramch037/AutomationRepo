package SW1.Selenium;

public class Demo {
	static int a= 21;
	public static void main(String[] args) {

//		rev_Num(1234);
//		swapNums(10, 15);
//		palindromeNum(12321);
//		palindromeNum(1234);
//		countDigitsInNum(1234);
//		System.out.println(revString("Rama krishna"));
//		palindromeString("ASHS");
//		evenOddDigitsCount(12345);
//		sumOfDigits(123456);
//		largeOfThree(2,1,3);
//		factorial(1);
//		fibbinoSeries(8);
//		arraySum(new int[]{1,2,3,4,5});
//		arrayEvenOdd(new int[] {1,2,3,4,5,7, 9});
//		arrMinMax(new int[] {4, 34,22, 16});
//		arrayDup(new int[] {4,6,6,8,3,8,3});
//		armstrongNum(153);
//		countCharInString("Hi ramakrishna.", 'd');
//		wordCount("Hi ramakrishna.");
//		reverseWordsinString("Ramakrishna is a good boy");
//		reverseWordsonly("Ramakrishna is a good boy");
//		secondLargestInArray(new int[] {77,33,32,21,5,42,76});
//		smallestNumber(new int[] {11,2,3,5,4,12});
//		System.out.println(switch1(2));
//		dowhileloop(11);
//		forloop(1);
//		System.out.println(additionOf2Nums(2,5)*2);
		
		
	}
	

	public static void rev_Num(int num) {

		int revNum = 0;
		while (num != 0) {
			revNum = revNum * 10 + (num % 10);
			num /= 10;
		}
		System.out.println(revNum);
	}

	public static void swapNums(int a, int b) {
		System.out.println("Numbers before swap a=" + a + " b=" + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("Numbers after swap a=" + a + " b=" + b);
	}

	public static void palindromeNum(int a) {
		int num = a;
		int revNum = 0;
		while (num != 0) {
			revNum = revNum * 10 + (num % 10);
			num /= 10;
		}
		System.out.println("Reversed Number is " + revNum);
		if (revNum == a) {
			System.out.println(a + " is a palindrome number.");
		} else {
			System.out.println(a + " is not a palindrome number.");
		}
	}

	public static void countDigitsInNum(int num) {
		int counter = 0;
		while (num != 0) {
			num /= 10;
			counter++;
		}
		System.out.println("No of Digits is " + counter);
	}

	public static String revString(String string) {
		String rev_string = "";
		for (int i = 0; i < string.length(); i++) {
			rev_string = string.charAt(i) + rev_string;
		}
		return rev_string;
	}

	public static void palindromeString(String string) {
		String revString = "";
		for (int i = 0; i < string.length(); i++) {
			revString = string.charAt(i) + revString;
		}
		if (string.equals(revString)) {
			System.out.println(string + " is a Palindrome");
		} else {
			System.out.println(string + " is not a Palindrome");
		}
	}

	public static void evenOddDigitsCount(int num) {
		int evenCount = 0;
		int oddCount = 0;
		int digit;
		while (num != 0) {
			digit = num % 10;
			if ((digit % 2) == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num /= 10;
		}
		System.out.println("Number of Even digits is : " + evenCount);
		System.out.println("Number of Odd digits is : " + oddCount);
	}

	public static void sumOfDigits(int num1) {
		int num = num1;
		int sum = 0;
		int digit;
		while (num > 0) {
			digit = num % 10;
			sum += digit;
			num /= 10;
		}
		System.out.println("The sum of digits in " + num1 + " is :" + sum);
	}

	public static void largeOfThree(int a, int b, int c) {
		int largeNum = a;
		if (b > largeNum) {
			largeNum = b;
		}
		if (c > largeNum) {
			largeNum = c;
		}
		System.out.println("The largest amoung " + a + "," + b + "," + c + " is: " + largeNum);
	}

	public static void factorial(int num) {
		System.out.print("The factorial of " + num + " is: ");
		int product = 1;
		while (num > 0) {
			product *= num;
			num--;
		}
		System.out.println(product);
	}

	public static void fibbinoSeries(int range) {
		int count = 2;
		System.out.print("0, " + "1");
		int a = 0, b = 1;
		while (count < range) {
			int nextNum = a + b;
			System.out.print(", " + nextNum);
			a = b;
			b = nextNum;
			count++;

		}

	}

	public static void arraySum(int[] ar) {
		int sum = 0;
		for (int num : ar) {
			sum += num;
		}
		System.err.println(sum);
	}

	public static void arrayEvenOdd(int[] ar) {
		for (int num : ar) {
			if (num % 2 == 0) {
				System.out.println(num + " is an even number");
			} else {
				System.out.println(num + " is an odd number");
			}
		}
	}

	public static void arrMinMax(int[] arr) {
		int max = arr[0], min = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}

		System.err.println("Max number is " + max);
		System.out.println("Min number is " + min);
	}

	public static void arrayDup(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " is a duplicate element.");
				}
			}
		}
	}

	public static void armstrongNum(int num) {
		int dupNum = num;
		int power = 0;
		while (dupNum > 0) {
			dupNum /= 10;
			power++;
		}
		dupNum = num;
		int digit;
		int numMod = 0;
		while (dupNum > 0) {
			digit = dupNum % 10;
			numMod += Math.pow(digit, power);
			dupNum /= 10;
		}
		if (numMod == num) {
			System.out.println(num + " is a fibbinocci Number");
		} else {
			System.out.println(num + " is not a fibbinocci Number");
		}
	}

	public static void countCharInString(String str, char ch) {
		int charCount = 0;
		String c = Character.toString(ch);
		for(int i=0; i<str.length(); i++) {
			String charAtindex = Character.toString(str.charAt(i));
			if (charAtindex.equals(c)) {
			charCount++;
			}
		}
		System.out.println(c+" is repeated "+charCount+" times in the string.");
	}
	public static void wordCount(String str) {
		int count=1;
		for(int i=0; i<str.length();i++) {
			String s = Character.toString(str.charAt(i));
			if(s.equals(" ")) {
				count++;
			}
		}
		System.out.println("The number of words is :"+count);
	}
	public static void reverseWordsinString(String str) {
		String[] list = str.split(" ");
		String revString="";
		for(String s: list) {
			revString = (s+" "+revString);
		}
		System.out.println("The reversed string is "+revString);
	}
	public static void reverseWordsonly(String str) {
		String[] list = str.split(" ");
		String revString = "";
		for(String word: list) {
			String revWord = "";
			for(int i=0; i<word.length(); i++) {
				revWord =word.charAt(i)+revWord;
			}
			revString+=revWord+" ";
		}
		String outString = revString.trim();
		System.out.println(outString);
	}
	public static void secondLargestInArray(int[] arr) {
		int largeNum = Integer.MIN_VALUE;
		int secondLargeNum = Integer.MIN_VALUE;
		for(int num: arr) {
			if(num>largeNum) {
				secondLargeNum=largeNum;
				largeNum = num;
			}
			else if((num>secondLargeNum) && (num!=largeNum)){
				secondLargeNum=num;
			}
		}
		System.out.println("The largest number is "+largeNum);
		System.out.println("The second largest number is "+secondLargeNum);
	}
	public static void smallestNumber(int[] arr) {
		int smallNum = arr[0];
		for(int i:arr) {
			if(i<smallNum) {
				smallNum = i;
			}
		}
		System.out.println(smallNum+" is the smallest Number.");
	}
	
	public static boolean switch1(int num) {
		boolean result = false;
		switch(num) {
		case 1:
			System.out.println("Not default in 1");
			result = true;
			break;
		case 2:
			System.out.println("Not default in 2");
			result = true;
			break;
		default:
			System.out.println("Yes default");
			break;
		}
		return result;
		
	}
	public static void dowhileloop(int num) {
		do {
			System.out.println(num);
		}while(num<11);
		
	}
	public static void forloop(int num) {
		for(num=1; num<3; num*=2) {
			System.out.println(num);
		}
		
	}
	public static double additionOf2Nums(double num1, double num2) {
		double result = num1 + num2;
		return result;
		
	}
	
}
