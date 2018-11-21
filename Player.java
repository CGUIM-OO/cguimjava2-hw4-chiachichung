import java.util.ArrayList;

public class Player {

	private String name; //玩家姓名
	private int chips; //玩家籌碼
	private int bet; //玩家此局已下注的籌碼
	private ArrayList oneRoundCard; //此局的卡
	
	public Player(String name, int chips) { //新增玩家姓名以及籌碼
		
		this.name = name;
		this.chips = chips;
		
	}
	
	public String getName() { //玩家姓名的getter
		return name;
	}
	
	public int makeBet() {//下注，並回傳預計要下注的籌碼
		bet=1; //基本下注		
		chips = chips-bet; //手上籌碼-已下注的籌碼
		if(chips<=0) {
			//若手上沒有籌碼，結束下注
			bet = 0;
		} 
		return bet;
			}
	
	public void setOneRoundCard(ArrayList cards) {
	
		oneRoundCard = cards; //此局所得到的牌
	}
	
	public boolean hitMe() { //是否要不要牌
		
		int sum = 0;		
		for(int i=0;i<oneRoundCard.size();i++) {//計算已打開的牌的點數總和
		      Card myroundcard = (Card) oneRoundCard.get(i);
		      sum += myroundcard.getRank();
		      }
		      if(sum>=17) {//如果打開的牌點數超過或等於17，則不繼續要牌
		    	  return false;
		    	  
		    	  }else {
		    		  return true;}
		    		  }
	
	
	public int getTotalValue() {//此局所得的牌點數總和
		int totalval=0;
		for(int t=0;t<oneRoundCard.size();t++) {
			Card totalroundcard = (Card)oneRoundCard.get(t);
			totalval +=totalroundcard.getRank();
		}
		return totalval;
		}
	
	public int getCurrentChips() {//回傳玩家手上現有籌碼
		return chips;
	}
	public void increaseChips (int diff) {//玩家籌碼變動
		chips = chips + diff;
	}
	public void sayHello() { //玩家打招呼
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
}
