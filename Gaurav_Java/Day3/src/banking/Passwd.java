package banking;

public class Passwd {
	private int pin;
	private static int adminPass;
	static {
		adminPass = 1234;
	}
	public Passwd(int pin) {
		this.pin=pin;
	}
	public boolean checkPass(int pin) {
		return this.pin==pin;
	}
	public static boolean checkAdminPass(int pass) {
		return adminPass==pass;
	}
	
}