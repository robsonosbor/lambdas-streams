package entities;

public class User {
	private String name;
	private Integer points;
	private Boolean moderator;
	 
	public User(String name, Integer points) {
		this.name = name;
		this.points = points;
	}
	
	public String getName() {
		return name;
	}

	public Integer getPoints() {
		return points;
	}

	public Boolean isModerator() {
		return moderator;
	}

	public void changeModerator() {
		this.moderator = true;
	}
}