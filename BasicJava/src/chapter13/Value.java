package chapter13;

public class Value {
	private Object value1;
	private Object value2;
	
	public Value(Object value) {
		super();
		this.value1 = value;
	}
	public Value(Object value1, Object value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}

	public Object getValue() {
		return value1;
	}

	public void setValue(Object value) {
		this.value1 = value;
	}
	
	public Object getValue2() {
		return value2;
	}

	public void setValue2(Object value2) {
		this.value2 = value2;
	}

	@Override
	public String toString() {
		return String.format("Value [value1=%s, value2=%s]", value1, value2);
	}

	
	
}
