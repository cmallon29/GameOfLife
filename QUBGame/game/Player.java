package game;

public class Player 
{
	private String name;
	private boolean gender;
	private int[] position;
	private int money;
	private int salary;
	
	public String getName() {
		return name;
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

	public int[] getPosition() {
		return position;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Player(Boolean gender)
	{
		salary = 10000;
		if (gender)
		{
			
		}
		else
		{
			
		}
	}

	public void setPosition(int i, int j, int k, int l) 
	{
		position[0] = i;
		position[1] = j;
		position[2] = k;
		position[3] = l;
	}
}
