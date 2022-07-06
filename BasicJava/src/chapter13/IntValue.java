package chapter13;

public class IntValue {
	private int value;

	public IntValue(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("IntValue [value=%s]", value);
	}
	
}
