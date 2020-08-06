
class Graduate extends Student {
    private String assistantType;
    private double rate;
	public Graduate(String name, String hakbun, String dept, int grade, int point, String assistantType, double rate) {
		super(name, hakbun, dept, grade, point);
		this.assistantType = assistantType;
		this.rate = rate;
	}
	public String getAssistantType() {
		return assistantType;
	}
	public void setAssistantType(String assistantType) {
		this.assistantType = assistantType;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return super.toString() + String.format("%s\t%.1f%n", this.assistantType, this.rate);
	}
    
}