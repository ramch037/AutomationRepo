package SW1.Selenium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PracticePrograms{
	public static void secondLargestNumInArray(int[] arr) {
		int firstLargeNum = Integer.MIN_VALUE;
		int secondLargeNum = Integer.MIN_VALUE;
		for(int num: arr) {
			if(num>firstLargeNum) {
				secondLargeNum = firstLargeNum;
				firstLargeNum = num;
			}else if((num>secondLargeNum)&&(num!=firstLargeNum)){
				secondLargeNum = num;
			}
		}
		System.out.println("First Largest Number is: "+firstLargeNum);
		System.out.println("Second Largest Number is: "+secondLargeNum);
	}
	
	public static void primeNumber(int num) {
	    boolean isPrime = true;

	    for (int i = 2; i < num; i++) {
	        if (num % i == 0) {
	            System.out.println(num + " is not a Prime Number.");
	            isPrime = false;
	            break;
	        }
	    }

	    if (isPrime) {
	        System.out.println(num + " is a Prime Number.");
	    }
	}

	public static void revrseNum(int num) {
		int revNum = 0;
		while(num>0) {
			revNum = 10*revNum+(num%10);
			num/=10;
		}
		System.out.println("The reverse number is: "+revNum);
	}
	
	public static void swapNumbers(int num1, int num2) {
		System.out.println("Numbers before swapping are a= "+num1+" and "+num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("Numbers before swapping are a= "+num1+" and "+num2);
		
	}
	
	public static void palindromeNum(int num) {
		int revNum = 0;
		int dupNum = num;
		while(dupNum>0) {
			revNum =revNum*10+dupNum%10;
			dupNum/=10;
		}
		if(num==revNum) {
			System.out.println(num+" is a palindrome Number");
		}else {
			System.out.println(num+" is not a palindrome Number");
		}
		
	}
	
	public static void palindromeString(String string) {
		String dupString = string;
		String revString = "";
		for(int i=0; i<string.length();i++) {
			char character = dupString.charAt(i);
			revString = character+revString;
		}
		if(string.equals(revString)) {
			System.out.println(string+" is a palindrome string.");
		}
		else {
			System.out.println(string+" is not a palindrome string.");
		}
	}
	public static void ArmstromgNumber(int num) {
		int trailNum = num;
		int digits = 0;
		while(trailNum >0) {
			trailNum/=10;
			digits++;
		}
		trailNum = num;
		int armNum =0;
		while(trailNum>0) {
			
			armNum+=Math.pow((trailNum%10), digits); 
			trailNum /=10;
		}
		if(num==armNum) {
			System.out.println(num+" is an Armstrong Number.");
		}else {
			System.out.println(num+" is not an Armstrong Number.");
		}
	}
	public static void countEvenOddNums(int num) {
		
		int dupNum=num, evenCount = 0, oddCount= 0;
		while(dupNum>0) {
			if((dupNum%10)%2 ==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			dupNum/=10;
		}
		System.out.println("Count of Even digits is :"+evenCount);
		System.out.println("Count of Odd digits is :"+oddCount);
	}
	public static void largestOfThreeNumbers(int a, int b, int c) {
		int largeNum = a;
		if((b>a)&&(b>c)) {
			largeNum = b;
		}else if((c>a)&&(c>b)) {
			largeNum = c;
		}
		System.out.println(largeNum+" is the Largest number");
	}
	public static void sumOfTwoNums() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Number: ");
		int a = scan.nextInt();
		System.out.println("Enter the second Number: ");
		int b = scan.nextInt();
		scan.close();
		System.out.println("The Sum of numbers "+a+" and "+b+" is "+(a+b));
		
	}
	public static void multiplicationTableOfANum(int num, int range) {
		for(int i=1; i<=range; i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}
	public static void leapYearCheck(int num) {
	    if ((num % 400 == 0) || ((num % 4 == 0) && (num % 100 != 0))) {
	        System.out.println(num + " is a Leap year.");
	    } else {
	        System.out.println(num + " is not a Leap year.");
	    }
	}
	public static void isVowel(char letter) {
		String let = String.valueOf(letter);
		if(let.equalsIgnoreCase("a")||let.equalsIgnoreCase("e")||let.equalsIgnoreCase("i")||let.equalsIgnoreCase("o")||let.equalsIgnoreCase("u")) {
			System.out.println(letter+" is an vowel.");
		}else {
			System.out.println(letter+" is not an vowel.");
		}
	}
	public static void circleArea(int radius) {
		double area = (Math.PI)*(Math.pow(radius, 2));
		System.out.println(area);
	}
	public static void sumOfFirstNNumbers(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void averageOf3Numbers(int a, int b, int c) {
		double avg = (a+b+c)/3.0;
		System.out.println(avg);
	}
	public static void sumOfAllEvenNumbersInARange(int range) {
		int evenSum=0;
		for(int i =1; i<=range; i++) {
			if(i%2==0) {
				evenSum+=i;
			}
		}
		System.out.println("Even numbers sum from 1 to "+range+" is: "+evenSum);
	}
	public static void stringToInteger(String string) {
		System.out.println(Integer.parseInt(string));
		System.out.println(23+"");
	}
	public static void duplicateCharactersInString(String string) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<string.length(); i++) {
			set.add(string.charAt(i));
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character letter: set) {
			int count = 0;
			for(int i=0; i<string.length();i++) {
				if(letter.equals(string.charAt(i))){
					count++;
				}
			}
			map.put(letter, count);
		}
		System.out.println(map);
	}
	public static void trainagleShape(int base) {
		int midpoint = base/2+1;
		System.out.println(midpoint);
		for(int i=1; i<=midpoint; i++) {
			for(int j=1; j<=midpoint-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	
	}

	
	public static void main(String[] args) {
//		secondLargestNumInArray(new int[] {24,11,21,24,9,13});
//		primeNumber(17);
//		revrseNum(123456);
//		swapNumbers(5,7);
//		palindromeNum(12321);
//		palindromeString("MADAM");
//		ArmstromgNumber(153);
//		countEvenOddNums(246);
//		largestOfThreeNumbers(5,4,3);
//		sumOfTwoNums();
//		multiplicationTableOfANum(3,12);
//		leapYearCheck(2000);
//		isVowel('A');
//		circleArea(3);
//		sumOfFirstNNumbers(100);
//		averageOf3Numbers(3,6,8);
//		sumOfAllEvenNumbersInARange(10);
//		stringToInteger("23");
//		duplicateCharactersInString("rama krishna");
		trainagleShape(7);
		
		
		
		
		
		
	}
	
}