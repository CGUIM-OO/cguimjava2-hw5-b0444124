public abstract class Player extends Person {
	private String name;// ���a�m�W
	private int chips;// ���a�����w�X
	private int bet;// ���a�����U�`���w�X

	public Player(String name, int chips) {
		this.name = name;
		this.chips = chips;
		// Player constructor�A�s�WPlayer����ɡA�ݭn�m�W�B�֦����w�X����ӰѼ�
	}

	public String getName() {
		return name;// name��getter
	}

	public int makeBet() {
		if (chips >= 1) {
			bet = bet;
		} else {
			bet = 0;
		}
		return bet;
		// �U�`�A�^�ǹw�p�U�`���w�X
		// �򥻤U�`�G�@��1��
		// �`�N�G�n�ˬd�O�_�٦����A�S���F�N����A�~��U�`
	}

	public int getCurrentChips() {
		// �^�Ǫ��a�{���w�X
		return chips;
	}

	public void increaseChips(int diff) {
		// ���a�w�X�ܰʡAsetter
		bet=diff;
	}

	public void sayHello() {
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
		// ���aSay Hello
	}
}
