import java.util.Arrays;
import java.util.Random;

public class BetterSlot {
	
	public static void main(String[] args)
	{
		System.out.println("starting...");
		BetterSlot b = new BetterSlot();
		b.pullTheLever();
		System.out.println("done.");
		
	}
	
	//required methods
	int[] pullTheLever()
	{
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++)
		{
			Random r = new Random();
			arr[i] = r.nextInt(50) + 1;
		}
		payOff(arr);
		//int[] arr = new int[] {1, 2, 1, 1, 1};
		
		return arr;
	}
	int payOff(int[] values)
	{
		
		int pay = 0;
		Arrays.sort(values);
		
		//conditions 1-5 -- only 1 may apply
		if(allFive(values))
			pay += 1000000;
		else if (fourMatch(values))
			pay += 10000;
		else if(threeAndTwoMatch(values))
			pay += 5000;
		else if(onlyThreeMatch(values))
			pay += 100;
		else if(onlyTwoMatch(values))
			pay += 10;
		
		//conditions 6-8 -- all may apply, but once each
		if(perfectSquare(values))
			pay += 7;
		if(fortyTwo(values))
			pay += 2;
		if(powerOfTwo(values))
			pay += 3;
		
		//return total payoff
		
		return pay;
	}
	
	//conditions 1-5
	
	//1
	boolean allFive(int[] values)
	{
		for(int i = 1; i < values.length; i++)
		{
			if(values[0] != values[i])
				return false;
		}
		return true;
	}
	
	//2
	boolean fourMatch(int[] values)
	{
		int matches = 0;
		int i = 0;
		while(i < values.length && values[0] == values[i] && matches < 4)
		{
			matches++;
			i++;
		}
		if(matches == 4) //first 4 elements match
			return true;
		
		//repeat to check if last 4 match instead
		
		int matches2 = 0;
		int j = 1;
		while(j < values.length && values[1] == values[j] && matches2 < 4)
		{
			matches2++;
			j++;
		}
		if(matches2 == 4)
			return true;
		
		return false;
	}
	
	//3
	boolean threeAndTwoMatch(int[] values)
	{
		int matches = 0;
		int i = 0;
		while(i < values.length && values[0] == values[i] && matches < 3)
		{
			matches++;
			i++;
		}
		if(matches <= 1)
			return false; //since array is in order
		
		if(matches == 2) //first 2 match, check last 3
		{
			int matches2 = 0;
			int j = 2;
			while(j < values.length && values[2] == values[j] && matches2 < 3)
			{
				matches2++;
				j++;
			}
			if(matches2 <= 2)
				return false;
			if(matches2 == 3)
				return true; //first 2 match and last 3 match
		}
		
		else if(matches == 3) //first 3 match, check last 2
		{
			int matches3 = 0;
			int k = 3;
			while(k < values.length && values[3] == values[k] && matches3 < 2)
			{
				matches3++;
				k++;
			}
			if(matches3 <= 1)
				return false;
			if(matches3 == 2)
				return true; //first 3 match and last 2 match
		}
		return false;
	}
	
	//4
	boolean onlyThreeMatch(int[] values)
	{
		//check if first 3 match
		int matches = 0;
		int i = 0;
		while(i < values.length && values[0] == values[i] && matches < 3)
		{
			matches++;
			i++;
		}
		
		if(matches == 3) //first 3 match
			return true;
		
		//check if middle 3 match
		int matches2 = 0;
		int j = 1;
		while(j < values.length && values[1] == values[j] && matches2 < 3)
		{
			matches2++;
			j++;
		}
		
		if(matches2 == 3) //middle 3 match
			return true;
		
		//check if last 3 match
		int matches3 = 0;
		int k = 2;
		while(k < values.length && values[2] == values[k] && matches3 < 3)
		{
			matches3++;
			k++;
		}
		
		if(matches3 == 3) //last 3 match
			return true;
		
		return false;
	}
	
	//5
	boolean onlyTwoMatch(int[] values)
	{
		int i = 0;
		for(int j = 1; j < values.length; j++)
		{
			if(values[i] == values[j])
				return true;
			i++;
		}
		return false;
	}
	
	//conditions 6-8
	
	//6
	boolean perfectSquare(int[] values)
	{
		for(int i = 0; i < values.length; i++)
		{
			double y = Math.sqrt(values[i]);
			
			if(Math.floor(y) == Math.ceil(y))
				return true;
		}
		return false;
	}
	
	//7
	boolean fortyTwo(int[] values)
	{
		for(int i = 0; i < values.length; i++)
		{
			if(values[i] == 42)
				return true;
		}
		return false;
	}
	
	//8
	boolean powerOfTwo(int[] values)
	{
		for(int i = 0; i < values.length; i++)
		{
			if(powerOfTwoHelper(values[i]))
				return true;
		}
		return false;
	}
	
	//8 cont.
	boolean powerOfTwoHelper(int n)
	{
		while(n != 1)
		{
			if(n%2 != 0)
				return false;
			n = n/2;
		}
		return true;
	}
}
