package assignment2;


import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMIO {
	public List<Users> readUser() throws FileNotFoundException {
		
		List<Users> userList = new ArrayList<>();
		
		String path = "C:/Users/hp/Desktop/atm_simulation.txt";
		
		File file = Paths.get(path).toFile();
		
		Scanner scanner = new Scanner(file);
		
		
		
	    while(scanner.hasNext()) {
	    	
	    	String lineData = scanner.nextLine();
	    	
	    	String[] spliteData = lineData.split(",");
	    	
	    	Users users = new Users();
	    	users.setName(spliteData[0]);
	    	users.setAccountNumber(spliteData[1]);
	    	users.setPassword(Integer.parseInt(spliteData[2]));
	    	users.setBalance(Long.parseLong(spliteData[3]));
	    	userList.add(users);
	    }
	    scanner.close();
	    return userList;
	}
	
	public void displayUser(List<Users> userList) {
		for(Users user:userList) {
			System.out.println("Account Holder Name: "+user.getName()+
					" Account Number: "+user.getAccountNumber()
					+" Pin Number: "+user.getPassword()+
					" Balance: "+user.getBalance());
		}
	}
}
