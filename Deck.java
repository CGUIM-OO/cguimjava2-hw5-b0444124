import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;
	private ArrayList<Card> usedCard;
	private ArrayList<Card> openCard;// �s�񦹰ƵP���Ҧ����}���P�A�~�P�ɭn���m
	public int nUsed;

	// TODO: Please implement the constructor
	/**
	 * �ϥΤT�h�j��A�N���J�P�g�icards�� �Ĥ@�h�j��:�ϥΪ̿�J�����J�P�Ƽ�(nDeck) 
	 * �ĤG�h�j��:���(Suit) �ĤT�h�j��:�Ʀr(1~13)
	 * �ϥ�for�j�魫�ƨϥ�printCard method in Card class�����cards�]��
	 */
	public Deck(int nDeck) {
		cards = new ArrayList<Card>();
		usedCard = new ArrayList<Card>();
		openCard = new ArrayList<Card>();
		for (int n = 0; n < nDeck; n++) {
			for (Card.Suit s : Card.Suit.values()) {
				for (int y = 1; y < 14; y++) {
					Card card = new Card(s, y);
					cards.add(card);
				}
			}
		}
		shuffle();
	}

	// TODO: Please implement the method to print all cards on screen
	public void printDeck() {
		// TODO: please implement and reuse printCard method in Card class
		for (Card cardss : cards) {
			cardss.printCard();
		}
	}

	public ArrayList<Card> getAllCards() {
		return cards;
	}

	public void shuffle() {
		if (usedCard.size() > 0) {
			for (Card recycle : usedCard) {
				cards.add(recycle);
			}
			usedCard.clear();
			openCard.clear();
			nUsed = 0;
		}
		Random rnd = new Random();
		for (int i = 0; i < cards.size(); i++) {
			int j = rnd.nextInt(i + 1);
			Card newCard = cards.get(j);
			cards.set(j, cards.get(i));
			cards.set(i, newCard);
		}
		// �~�P�ɰO�o���mprivate ArrayList<Card> openCard
	}

	public Card getOneCard(boolean isOpened) {
		if (cards.size() == 0) {
			shuffle();
		}

		Card record = cards.get(0);

		if (isOpened != true) {
			openCard.add(record);
		}

		usedCard.add(record);
		nUsed++;
		cards.remove(record);
		return record;
		// ����@�i�P�A�ק�즳method�A�[�JisOpened�ѼơA
		// �M�w�o�X�h���P�O�}���٬O�\�_�Ӫ��A�Y�O�}�۪��P�A�[�JopenCard
	}

	public ArrayList<Card> getOpenedCard() {
		// �^�Ǧ��ƵP���Ҧ����}�L���P�A�N�YopenCard
		return openCard;
	}
}
