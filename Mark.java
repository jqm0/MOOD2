package firstTask;

import java.io.Serializable;

public class Mark implements MarkGui, Serializable {
	private double midTerm;
	private double finalMark;
	public double grade;

	public Mark() {

		this.midTerm = 60;
		this.finalMark = 70;
	}

	public double getMidMark() {
		return midTerm;
	}

	public void setMidMark(double midMark) {
		this.midTerm = midMark;
	}

	public double getFinal() {
		return finalMark;
	}

	public void setFinal(double finalMark) {
		this.finalMark = finalMark;
	}

	@Override
	public void countGrade() {
		grade = getFinal() + getMidMark();
		System.out.println(grade);
	}

	@Override
	public double getGrade() {
		return grade;
	}

}
