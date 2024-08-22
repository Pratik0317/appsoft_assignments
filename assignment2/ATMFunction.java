package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class ATMFunction {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

public void authentication(List<Users> userList) throws NumberFormatException, IOException{
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	for(int i=0;i<3;i++) {
		System.out.println("Enter your pin number: ");
		int pin = Integer.parseInt(reader.readLine());
		for(Users user: userList) {
			if(user.getPassword()==pin) {
				System.out.println("Welcome "+user.getName());
				while(true) {
					System.out.println("Enter your choice!!");
					System.out.println("1. Balance Inquiry");
					System.out.println("2. Cash WithDraw");
					System.out.println("3. Fund Transfer");
					System.out.println("4. Exit");
					
					int choice = Integer.parseInt(reader.readLine());
					switch (choice) {
					case 1:
						System.out.println("Your Current Balance is: "+user.getBalance());
						System.out.println("Do you want to print receipt or proceed without yse/no?");
						String status = reader.readLine().toLowerCase(); 
						if(status.equals("yes")) {
							System.out.println("Your receipt is being printed."
									+ "\n Thank You for you Time.");
						}else {
							System.out.println("Thank you for your participate");
						}
						break;
					case 2:
						System.out.println("Enter the amount you want to withdraw.");
						long amount = Long.parseLong(reader.readLine());
						if(user.getBalance()>=amount) {
							user.setBalance(user.getBalance()-amount);
							System.out.println("Your Remaining balance is: "+user.getBalance());
							System.out.println(amount+" has ben debited form your "
							+user.getAccountNumber()+" account");
						}else {
							System.out.println("Insufficient Balance!!!"
									+ "\n try again!!");
						}
						break;
						
					case 3:
						System.out.println("Enter destination account number");
						
						String ac_number = reader.readLine();
						
						boolean accountFound = false;
						
						for(Users users : userList) {
							//System.out.println(users.getAccountNumber());
							if(ac_number.equals(users.getAccountNumber())) {
								
								accountFound = true;
								
								System.out.println("Enter amount you want to trasnfer.");
								long amt = Long.parseLong(reader.readLine());
								if(user.getBalance()>=amt) {
									user.setBalance(user.getBalance()-amt);
									users.setBalance(users.getBalance()+amt);
									System.out.println("Fund Transfer Successfull");
								}else {
									System.out.println("Insufficient Balance");
								}	
								break;
							}
						}
						if(!accountFound) {
							System.out.println("Invalid Account Number!!");
						}
						break;
					case 4:
						System.out.println("Thank you for you time!!");
						System.exit(0);
					default:
						System.out.println("Please enter a valid choice!!");
					}
				}
			}
		}
	}
	
}
}
