package chapter13;

import java.util.Objects;

public class Board {
	private String subject;
	private String content;
	private String writer;
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s", subject, content, writer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, subject, writer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Board)) {
			return false;
		}
		Board other = (Board) obj;
		return Objects.equals(content, other.content) && Objects.equals(subject, other.subject)
				&& Objects.equals(writer, other.writer);
	}
	
	
}
