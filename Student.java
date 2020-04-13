class Student {
	String index;
	String firstName;
	String lastName;
        List<Integer> labPoints = new ArrayList<>();

	public Student(String index,String firstName,String lastName){
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
}

	String getIndex(void){
		return this.index;
}
	String getFirstName(void){
		return this.firstName;
}
	String getLastName(void){
		return this.lastName;
}

	public double getAverage() {
		//Ne sum dobar vo rabota so listi.
	}

	public boolean hasSignature() {
		//Ne sum dobar vo rabota si listi.
	}
}
