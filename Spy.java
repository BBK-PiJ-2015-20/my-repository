public class Spy {
	private static int spyCount = 0;
	public int spyID;
		
	public Spy(int spyID) {
		spyCount++;
		this.spyID = spyID;
		System.out.println("This spy ID: " + spyID + "; spy count: " + spyCount);
	}
	
	public static int getNumberOfSpies() {
		return spyCount;
	}
	
	public void die() {
		spyCount--;
		System.out.println("Spy " + spyID + " has been detected and eliminated");
		System.out.println("Spies remaining: " + spyCount);
	}
	
	public static void main(String[] args) 
	{
		Spy spy1 = new Spy(1);
		Spy spy2 = new Spy(2);
		Spy spy3 = new Spy(3);
		Spy spy4 = new Spy(4);
		Spy spy5 = new Spy(5);
		System.out.println(getNumberOfSpies());
		spy1.die();
		System.out.println(getNumberOfSpies());
	}
}