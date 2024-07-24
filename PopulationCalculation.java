import java.util.Scanner;

public class PopulationCalculation{

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	double growth = 0.91;
	int population = 810_000;
	System.out.println("Year     populationCalculation             population");
		for (int count = 1; count <=75; count ++){

			double populationCalculation =Math.pow(1+ growth,count);
			double result = populationCalculation+ population;
			//System.out.println(count+"     " +populationCalculation);
			System.out.printf("%d           %.4f                        %.2f%n", count, populationCalculation, result);

		}


	}



}