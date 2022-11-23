package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List <String> wishList = new ArrayList();
		Scanner sc= new Scanner(System.in);
		String firstChoose="";
		String gift="";
		
		while(true) {
			System.out.println("\nChoose one option:\n 1- Insert a wish\n 2- See your wish list");
			firstChoose=sc.nextLine();
			
			if(firstChoose.equals("1")) {
				System.out.println("\nInsert your wish, then press enter. Otherwise type exit to stop.");
				while(true) {
					gift=sc.nextLine();
					if(gift.equals("exit")) {
						break;
					}
					wishList.add(gift);
				}
			}
			else if(firstChoose.equals("2")) {
				wishList.sort(null);
				System.out.println("\nThis is your wish list:");

				for(String element:wishList)
				{
					System.out.println("-"+element);
				}
				
			}
			else
			{
				System.out.println("\nWrong choose....\n");

			}
		}


		
	}

}
