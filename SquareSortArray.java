import java.util.Arrays;
public class SquareSortArray{

	public static void main(String [] arg){

		int [] number = {-10,3,6,4,7,2};
		for(int i = 0;i<number.length-1;i++){
			number[i]*=number[i];
		}

		int minimum = 0;
		int total =0;
		for (int count = 0; count<number.length-1 ; count++){
			for (int counter =count+1; counter<number.length; counter++){
				if(number[count] > number[counter]){
					total = number[count];
					number[count] = number[counter];
					number[counter]=total;
				}
			
		
			}
		
		}
		
		System.out.print(Arrays.toString(number));



	}



}