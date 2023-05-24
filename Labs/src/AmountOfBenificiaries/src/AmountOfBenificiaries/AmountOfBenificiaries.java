package AmountOfBenificiaries;

import java.util.Scanner;

public class AmountOfBenificiaries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int houseHoldSize;
		int AmountOfBeneficiaries;
		double income;
		System.out.println("Humanitiran Parole Program");
		System.out.println("What is your household size?");
		houseHoldSize = input.nextInt();
		System.out.println("What is your Adjusted Gross Income?");
		income = input.nextInt();
		
		if(income > 63200) {
			AmountOfBeneficiaries = (8+ (int)(income-63200)/6425) - houseHoldSize;
			if(AmountOfBeneficiaries > 0) {
				System.out.println("Based on your householsize and income intered, you are eligible to file for "+ AmountOfBeneficiaries + " people.");
				
			}else {
				System.out.println("Based on your householsize and income intered, you are not eligible to file for any people.");
			}
		} else if(income == 63200) {
			AmountOfBeneficiaries = 8 - houseHoldSize;
			if(AmountOfBeneficiaries > 0) {
				System.out.println("Based on your householsize and income intered, you are eligible to file for "+ AmountOfBeneficiaries + " people.");
				
			}else {
				System.out.println("Based on your householsize and income intered, you are not eligible to file for any people.");
			}
		} else if(income >= 56775) {
			AmountOfBeneficiaries = 7 - houseHoldSize;
			if(AmountOfBeneficiaries > 0) {
				System.out.println("Based on your householsize and income intered, you are eligible to file for "+ AmountOfBeneficiaries + " people.");
				
			}else {
				System.out.println("Based on your householsize and income intered, you are not eligible to file for any people.");
			}
		} else if(income >= 50350) {
			AmountOfBeneficiaries = 6 - houseHoldSize;
			if(AmountOfBeneficiaries > 0) {
				System.out.println("Based on your householsize and income intered, you are eligible to file for "+ AmountOfBeneficiaries + " people.");
				
			}else {
				System.out.println("Based on your householsize and income intered, you are not eligible to file for any people.");
			}
		} else if(income >= 43945) {
			AmountOfBeneficiaries = 5 - houseHoldSize;
			if(AmountOfBeneficiaries > 0) {
				System.out.println("Based on your householsize and income intered, you are eligible to file for "+ AmountOfBeneficiaries + " people.");
				
			}else {
				System.out.println("Based on your householsize and income intered, you are not eligible to file for any people.");
			}
		} else if(income >= 31075) {
			AmountOfBeneficiaries = 3 - houseHoldSize;
			if(AmountOfBeneficiaries > 0) {
				System.out.println("Based on your householsize and income intered, you are eligible to file for "+ AmountOfBeneficiaries + " people.");
				
			}else {
				System.out.println("Based on your householsize and income intered, you are not eligible to file for any people.");
			}
		}else if(income >= 37500) {
			AmountOfBeneficiaries = 4 - houseHoldSize;
			if(AmountOfBeneficiaries > 0) {
				System.out.println("Based on your householsize and income intered, you are eligible to file for "+ AmountOfBeneficiaries + " people.");
				
			}else {
				System.out.println("Based on your householsize and income intered, you are not eligible to file for any people.");
			}
		} else if(income >= 31075) {
			AmountOfBeneficiaries = 3 - houseHoldSize;
			if(AmountOfBeneficiaries > 0) {
				System.out.println("Based on your householsize and income intered, you are eligible to file for "+ AmountOfBeneficiaries + " people.");
				
			}else {
				System.out.println("Based on your householsize and income intered, you are not eligible to file for any people.");
			}
			
		} else if(income >= 24650) {
			AmountOfBeneficiaries = 2 - houseHoldSize;
			if(AmountOfBeneficiaries > 0) {
				System.out.println("Based on your householsize and income intered, you are eligible to file for "+ AmountOfBeneficiaries + " people.");
				
			}else {
				System.out.println("Based on your householsize and income intered, you are not eligible to file for any people.");
			}
			
			
		}
		
		
		
		

	}

}
