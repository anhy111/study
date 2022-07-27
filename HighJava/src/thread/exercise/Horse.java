package thread.exercise;

public class Horse implements Comparable<Horse>{
	private String name;
	private int rank;
	
	public Horse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public int compareTo(Horse o) {
		return new Integer(rank).compareTo(o.getRank());
	}
}
