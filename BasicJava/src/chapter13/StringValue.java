package chapter13;

public class StringValue {
	String value;

	public StringValue(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("StringValue [value=%s]", value);
	}
	
}
