package assignment2;

import java.io.IOException;
import java.util.List;

public class AtmExecutor {

	public static void main(String[] args) throws IOException {
		ATMIO atmio = new ATMIO();
		List<Users> userList = atmio.readUser();
		
		atmio.displayUser(userList);
		
		ATMFunction func = new ATMFunction();
	    func.authentication(userList);
	}
}
