package patterns;

import enums.DesignPatternsTypes;

public class Builder implements DesignPattern {

	private String first;
	private String second;
	private String third;
	private String forth;
	
	public Builder addFirst(String s) {
		first = s;
		return this;
	}
	
	public Builder addsecond(String s) {
		second = s;
		return this;
	}
	
	public Builder addThird(String s) {
		third = s;
		return this;
	}
	
	public Builder addForth(String s) {
		forth = s;
		return this;
	}
	
	
	@Override
	public DesignPatternsTypes getType() {
		return DesignPatternsTypes.BUILDER;
	}

}
