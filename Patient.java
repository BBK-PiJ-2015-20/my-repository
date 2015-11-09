public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getIllness() {
		return illness;
	}
	
	public int getCount(int count) {
			count++;
		if(this.nextPatient != null) {
			count = this.nextPatient.getCount(count);
		}
		return count;
	}
	
	public void addPatient(Patient newPatient) {
		if(this.nextPatient == null) {
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public boolean deletePatient(Patient patient) {
		if(this.nextPatient == null) {
			return false;
		} else if(this.nextPatient.name.equals(patient.name)) {
			this.nextPatient = nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}
	
	public void printAll() {
		System.out.println(this.getName() + "; " + this.getAge() + "; " + this.getIllness());
		if(this.nextPatient != null) {
			this.nextPatient.printAll();
		}
	}
	
	public static void main(String[] args) {
		Patient firstPatient = new Patient("Amy", 33, "Tuberculosis");
		firstPatient.addPatient(new Patient("Bob", 6, "Flu"));
		firstPatient.addPatient(new Patient("Charles", 12, "Flu"));
		firstPatient.addPatient(new Patient("David", 6, "Flu"));
		firstPatient.addPatient(new Patient("Ellie", 12, "Flu"));
		firstPatient.addPatient(new Patient("Fred", 6, "Flu"));
		firstPatient.addPatient(new Patient("George", 12, "Flu"));
		firstPatient.addPatient(new Patient("Hector", 12, "Flu"));
		firstPatient.addPatient(new Patient("Ingrid", 6, "Flu"));
		firstPatient.addPatient(new Patient("Jack", 12, "Flu"));
		int count = 0;
		System.out.println("There are " + firstPatient.getCount(count) + " patients now.");
		firstPatient.printAll();
	}
}