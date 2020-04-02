package countries.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Cities {
	private String capital;
	private String secondLargest;
	
	public Cities() {
		super();
	}
	
	public Cities(String capital, String secondLargest) {
		this.capital = capital;
		this.secondLargest = secondLargest;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getSecondLargest() {
		return secondLargest;
	}

	public void setSecondLargest(String secondLargest) {
		this.secondLargest = secondLargest;
	}
	
	@Override
	public String toString() {
		return "Cities [capital=" + capital + ", second largest city=" + secondLargest + "]";
	}
}
