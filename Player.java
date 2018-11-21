import java.util.ArrayList;

public class Player {

	private String name; //���a�m�W
	private int chips; //���a�w�X
	private int bet; //���a�����w�U�`���w�X
	private ArrayList oneRoundCard; //�������d
	
	public Player(String name, int chips) { //�s�W���a�m�W�H���w�X
		
		this.name = name;
		this.chips = chips;
		
	}
	
	public String getName() { //���a�m�W��getter
		return name;
	}
	
	public int makeBet() {//�U�`�A�æ^�ǹw�p�n�U�`���w�X
		bet=1; //�򥻤U�`		
		chips = chips-bet; //��W�w�X-�w�U�`���w�X
		if(chips<=0) {
			//�Y��W�S���w�X�A�����U�`
			bet = 0;
		} 
		return bet;
			}
	
	public void setOneRoundCard(ArrayList cards) {
	
		oneRoundCard = cards; //�����ұo�쪺�P
	}
	
	public boolean hitMe() { //�O�_�n���n�P
		
		int sum = 0;		
		for(int i=0;i<oneRoundCard.size();i++) {//�p��w���}���P���I���`�M
		      Card myroundcard = (Card) oneRoundCard.get(i);
		      sum += myroundcard.getRank();
		      }
		      if(sum>=17) {//�p�G���}���P�I�ƶW�L�ε���17�A�h���~��n�P
		    	  return false;
		    	  
		    	  }else {
		    		  return true;}
		    		  }
	
	
	public int getTotalValue() {//�����ұo���P�I���`�M
		int totalval=0;
		for(int t=0;t<oneRoundCard.size();t++) {
			Card totalroundcard = (Card)oneRoundCard.get(t);
			totalval +=totalroundcard.getRank();
		}
		return totalval;
		}
	
	public int getCurrentChips() {//�^�Ǫ��a��W�{���w�X
		return chips;
	}
	public void increaseChips (int diff) {//���a�w�X�ܰ�
		chips = chips + diff;
	}
	public void sayHello() { //���a���۩I
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
}
