package firstTask;

import java.io.Serializable;

public class Course implements Serializable {
	private String name;
	private String type;
	Mark markCourse = new Mark();


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
