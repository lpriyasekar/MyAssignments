package week2.day4;

public abstract class Database implements DatabseConnection {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Excecution done");
	}

	public abstract void process();
	
	
	
	
}
