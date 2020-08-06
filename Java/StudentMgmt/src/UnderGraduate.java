

class UnderGraduate extends Student {
    private String club;

	public UnderGraduate(String name, String hakbun, String dept, int grade, int point, String club) {
		super(name, hakbun, dept, grade, point);
		this.club = club;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%s%n", this.club);
	}
    
	
}