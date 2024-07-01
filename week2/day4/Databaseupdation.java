package week2.day4;

public class Databaseupdation extends Database {

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Processing");
	}
	
	public static void main(String[] args) {
		
		Databaseupdation du = new Databaseupdation();
		du.connect();
		du.disconnect();
		du.executeUpdate();
		du.process();
	}

}
