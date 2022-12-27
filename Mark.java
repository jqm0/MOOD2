package firstTask;

public class Mark {
	private double midTerm ;
	private double finalMark ;
	
	public Mark() {
		
		this.midTerm = 60;
		this.finalMark = 70;
	}
	


	public double getMidMark() {
		return midTerm ;
	}

	public void setMidMark(double midMark) {
		this.midTerm  = midMark;
	}

	public double getFinal() {
		return finalMark;
	}

	
	public void setFinal(double finalMark) {
		this.finalMark = finalMark;
	}
	
}
