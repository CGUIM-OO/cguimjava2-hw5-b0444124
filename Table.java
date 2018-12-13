import java.util.*;

public class Table {
	public static final int MAXPLAYER = 4;// �̦h�@�i�P��৤�X�ӤH
	private Deck deck;// �s��Ҧ����P
	private Player[] player;// �s��Ҧ������a
	private Dealer dealer;// �s��@�Ӳ��a
	private int[] pos_betArray;// �s��C�Ӫ��a�b�@���U���`

	public Table(int nDeck) {
		deck = new Deck(nDeck);
		player = new Player[MAXPLAYER];
	}

	public void set_player(int pos, Player p) {
		// �NPlayer���P��W
		// (�N�Y��쫬�O��Player[]���ܼ�(instance field)���A��setter)�A
		// pos���P���m�A�̦hMAXPLAYER�H�A
		// p�h��Player instance�C
		if (pos >= 0 && pos < MAXPLAYER) {
			player[pos] = p;
		}
	}

	public Player[] get_player() {
		// �^�ǩҦ��b�P��W��player�A
		// �N�Y�^�ǫ��O��Player[]���ܼ�(instance field)�ܼơA
		// ��getter
		return player;
	}

	public void set_dealer(Dealer d) {
		// �NDealer���P��W
		// (�N�Y�NDealer��� ���O��Dealer ���ܼ�(instance field) ���A
		// ���ܼƤ�setter)
		dealer = d;
	}

	public Card get_face_up_card_of_dealer() {
		// �^��dealer���}�����i�P�A�]�N�O�ĤG�i�P
	}

	private void ask_each_player_about_bets() {
		// �ШC�Ӫ��a���۩I (���� say_hello())
		// �ШC�Ӫ��a�U�` (���� make_bet())
		// �C�Ӫ��a�U���`�n�s�bpos_betArray�Ѥ���ϥ�

	}

	private void distribute_cards_to_dealer_and_players() {
		// �o�P�����a����a�A���o��i���}���P�����a
		// �A�@�i�\�۪��P�A�H�Τ@�i���}���P�����a�C(����: setOneRoundCard())
		// �o�P�����a��A�b�e���W�L�X���a���}���P
		// "Dealer's face up card is " (����: printCard())

	}

	private void ask_each_player_about_hits() {
		// �ݨC�Ӫ��a�n���n�P (����: hit_me(Table tbl))
		// �аѷ�HW4.java�A�ϥ�do while�j��߰ݦU�Ӫ��a
		// �߰ݶ���: ���ӥ[�J�P�������Ǧөw (��m)
		// �p�G���a�n�P�A�Цb�e���W�L�X"Hit! "+ ���a���W�r+ "��s cards now: "�A
		// �ç⪱�a�n�P�᪺����P�L�X�C�̫�N�s���P��setOneRoundCard()�]�w�^���a����C
		// �p�G�z�F�A�Ф��n�A�ݪ��a�O�_�n�P
		// �p�G���a���n�P�F�A�Цb�e���W�L�X ���a���W�r+"Pass hit!"

	}

	private void ask_dealer_about_hits() {
		// �߰ݲ��a�O�_�n�P�A������A�L�X"Dealer's hit is over!"
	}

	private void calculate_chips() {
		// �L�X���a���I�ƩM�P"Dealer's card value is "+�`�I��+" ,Cards:"+�P�� (����: printAllCard())
		// ���a��C�@�Ӫ��a���P��
		// �w��C�Ӫ��a�A���L�X ���a�m�W+" card value is "+���a�`�I��
		// �ݽ�Ĺ�A�n�O���aĹ�A�⪱�a�w�X�S���A�L�X", Loss "+�U�`�w�X��+
		// " Chips, the Chips now is: "+���a�̷s�w�X��(����: get_current_chips())

		// �n�O���a��A�h�ߪ��a�P�U�`�w�X�۲Ť��w�X�A�L�X",Get "+�U�`�w�X��+
		// " Chips, the Chips now is: "+���a�̷s�w�X��(����: get_current_chips())
		// ���餣Ĺ�A�L�X",chips have no change! The Chips now is: "+���a�̷s�w�X��(����:
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
