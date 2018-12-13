import java.util.*;

public class Table {
	public static final int MAXPLAYER = 4;// 最多一張牌桌能坐幾個人
	private Deck deck;// 存放所有的牌
	private Player[] player;// 存放所有的玩家
	private Dealer dealer;// 存放一個莊家
	private int[] pos_betArray;// 存放每個玩家在一局下的注

	public Table(int nDeck) {
		deck = new Deck(nDeck);
		player = new Player[MAXPLAYER];
	}

	public void set_player(int pos, Player p) {
		// 將Player放到牌桌上
		// (意即放到型別為Player[]的變數(instance field)中，為setter)，
		// pos為牌桌位置，最多MAXPLAYER人，
		// p則為Player instance。
		if (pos >= 0 && pos < MAXPLAYER) {
			player[pos] = p;
		}
	}

	public Player[] get_player() {
		// 回傳所有在牌桌上的player，
		// 意即回傳型別為Player[]的變數(instance field)變數，
		// 為getter
		return player;
	}

	public void set_dealer(Dealer d) {
		// 將Dealer放到牌桌上
		// (意即將Dealer放到 型別為Dealer 的變數(instance field) 中，
		// 為變數之setter)
		dealer = d;
	}

	public Card get_face_up_card_of_dealer() {
		// 回傳dealer打開的那張牌，也就是第二張牌
	}

	private void ask_each_player_about_bets() {
		// 請每個玩家打招呼 (提示 say_hello())
		// 請每個玩家下注 (提示 make_bet())
		// 每個玩家下的注要存在pos_betArray供之後使用

	}

	private void distribute_cards_to_dealer_and_players() {
		// 發牌給玩家跟莊家，先發兩張打開的牌給玩家
		// 再一張蓋著的牌，以及一張打開的牌給莊家。(提示: setOneRoundCard())
		// 發牌給莊家後，在畫面上印出莊家打開的牌
		// "Dealer's face up card is " (提示: printCard())

	}

	private void ask_each_player_about_hits() {
		// 問每個玩家要不要牌 (提示: hit_me(Table tbl))
		// 請參照HW4.java，使用do while迴圈詢問各個玩家
		// 詢問順序: 按照加入牌局的順序而定 (位置)
		// 如果玩家要牌，請在畫面上印出"Hit! "+ 玩家的名字+ "’s cards now: "，
		// 並把玩家要牌後的完整牌印出。最後將新的牌用setOneRoundCard()設定回玩家物件。
		// 如果爆了，請不要再問玩家是否要牌
		// 如果玩家不要牌了，請在畫面上印出 玩家的名字+"Pass hit!"

	}

	private void ask_dealer_about_hits() {
		// 詢問莊家是否要牌，完成後，印出"Dealer's hit is over!"
	}

	private void calculate_chips() {
		// 印出莊家的點數和牌"Dealer's card value is "+總點數+" ,Cards:"+牌們 (提示: printAllCard())
		// 莊家跟每一個玩家的牌比
		// 針對每個玩家，先印出 玩家姓名+" card value is "+玩家總點數
		// 看誰贏，要是莊家贏，把玩家籌碼沒收，印出", Loss "+下注籌碼數+
		// " Chips, the Chips now is: "+玩家最新籌碼數(提示: get_current_chips())

		// 要是莊家輸，則賠玩家與下注籌碼相符之籌碼，印出",Get "+下注籌碼數+
		// " Chips, the Chips now is: "+玩家最新籌碼數(提示: get_current_chips())
		// 不輸不贏，印出",chips have no change! The Chips now is: "+玩家最新籌碼數(提示:
		// get_current_chips())
	}

	public int[] get_players_bet() {
		return pos_betArray;
	}

	public void play() {
		ask_each_player_about_bets();
		distribute_cards_to_dealer_and_players();
		ask_each_player_about_hits();
		ask_dealer_about_hits();
		calculate_chips();
	}

}
