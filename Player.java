public abstract class Player extends Person {
	private String name;// 玩家姓名
	private int chips;// 玩家有的籌碼
	private int bet;// 玩家此局下注的籌碼

	public Player(String name, int chips) {
		this.name = name;
		this.chips = chips;
		// Player constructor，新增Player物件時，需要姓名、擁有的籌碼等兩個參數
	}

	public String getName() {
		return name;// name的getter
	}

	public int makeBet() {
		if (chips >= 1) {
			bet = bet;
		} else {
			bet = 0;
		}
		return bet;
		// 下注，回傳預計下注的籌碼
		// 基本下注：一次1元
		// 注意：要檢查是否還有錢，沒錢了就不能再繼續下注
	}

	public int getCurrentChips() {
		// 回傳玩家現有籌碼
		return chips;
	}

	public void increaseChips(int diff) {
		// 玩家籌碼變動，setter
		bet=diff;
	}

	public void sayHello() {
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
		// 玩家Say Hello
	}
}
