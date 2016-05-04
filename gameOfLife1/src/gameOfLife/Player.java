package gameOfLife;

public class Player 
{
	private String name;
	private String carColour;
	private String carImage;
	private String job;
	private boolean spinForMoney = false;
	private boolean gender;
	private boolean token1 = false;
	private boolean token2 = false;
	private boolean token3 = false;
	private boolean token4 = false;
	private boolean married = false;
	private boolean pet = false;
	private boolean son = false;
	private boolean daughter = false;
	private boolean fame = false;
	private boolean speak = false;
	private boolean award = false;
	private String House;
	private int family;
	private int loans;
	private int position;
	private int money;
	private int salary;
	private boolean uni;
	
	public String getChildren()
	{
		String family = "No children";
		if(daughter || son)
		{
			if(daughter && son)
			{
				family = "A son and a daughter.";
			}
			if(son && !daughter)
			{
				family = "A son.";
			}
			if(daughter && !son)
			{
				family = "A daughter.";
			}
		}
		return family;
	}
	
	public String getRelationship()
	{
		if(married)
		{
			return "Married";
		}
		else
		{
			return "Single";
		}
	}
	public int endGame()
	{
		int totMoney = money;
		if (token1)
		{
			totMoney = totMoney + 25000;
		}
		if (token2)
		{
			totMoney = totMoney + 25000;
		}
		if (token3)
		{
			totMoney = totMoney + 25000;
		}
		if (token4)
		{
			totMoney = totMoney + 25000;
		}
		if (married)
		{
			totMoney = totMoney + 50000;
		}
		if (pet)
		{
			totMoney = totMoney + 10000;
		}
		if (daughter)
		{
			totMoney = totMoney + 20000;
		}
		if (son)
		{
			totMoney = totMoney + 20000;
		}
		if (fame)
		{
			totMoney = totMoney + 150000;
		}
		if (speak)
		{
			totMoney = totMoney + 10000;
		}
		if (award)
		{
			totMoney = totMoney + 10000;
		}
		totMoney = (int) (totMoney - (loans*1.25));
		return totMoney;
	}
	
	public boolean isFame() {
		return fame;
	}

	public void setFame(boolean fame) {
		this.fame = fame;
	}

	public boolean isSpeak() {
		return speak;
	}

	public void setSpeak(boolean speak) {
		this.speak = speak;
	}

	public boolean isAward() {
		return award;
	}

	public void setAward(boolean award) {
		this.award = award;
	}

	public String getCarImage() {
		return carImage;
	}

	public void setPromotion()
	{
		salary = (int) (salary * 1.25);
	}
	
	public int getLoans() {
		return loans;
	}

	public void setLoans(int loans) {
		this.loans = loans + this.loans;
	}

	public void setCarImage(String carImage) {
		this.carImage = carImage;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public boolean isPet() {
		return pet;
	}

	public void setPet(boolean pet) {
		this.pet = pet;
	}

	public boolean isSon() {
		return son;
	}

	public void setSon(boolean son) {
		this.son = son;
	}

	public boolean isDaughter() {
		return daughter;
	}

	public void setDaughter(boolean daughter) {
		this.daughter = daughter;
	}

	public int getFamily() {
		return family;
	}

	public void setFamily(int family) {
		this.family = family;
	}
	
	public boolean isSpinForMoney() {
		return spinForMoney;
	}

	public void setSpinForMoney(boolean spinForMoney) {
		this.spinForMoney = spinForMoney;
	}

	public String getHouse() {
		if(House == null)
		{
			return "Homeless";
		}
		return House;
	}

	public void setHouse(String house) {
		House = house;
	}

	public void payDay()
	{
		money = money + salary;
	}
	
	public boolean isToken1() {
		return token1;
	}

	public void setToken1(boolean token1) {
		this.token1 = token1;
	}

	public boolean isToken2() {
		return token2;
	}

	public void setToken2(boolean token2) {
		this.token2 = token2;
	}

	public boolean isToken3() {
		return token3;
	}

	public void setToken3(boolean token3) {
		this.token3 = token3;
	}

	public boolean isToken4() {
		return token4;
	}

	public void setToken4(boolean token4) {
		this.token4 = token4;
	}

	public String getJob() {
		if (job == null)
		{
			job = "Unemployed";
		}
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
		family = family + 1;
	}

	public void setPosition(int position) 
	{
		this.position = position;
	}
}
