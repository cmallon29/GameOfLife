package gameOfLife;

public class Player 
{
	private String name;
	private String carColour;
	private String job;
	private boolean gender;
	private int position;
	private int money;
	private int salary;
	private boolean uni;
	
	public void payDay()
	{
		money =+ salary;
	}
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public boolean isUni() {
		return uni;
	}

	public void setUni(boolean uni) {
		this.uni = uni;
	}

	public String getName() {
		return name;
	}

	public String getCarColour() {
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getPosition() {
		return position;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = this.money + money;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Player()
	{
		money = 10000;
		position = 1;
		if (gender)
		{
			
		}
		else
		{
			
		}
	}

	public void setPosition(int position) 
	{
		this.position = position;
	}
}
