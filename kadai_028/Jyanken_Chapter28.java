package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	HashMap<String,String> JyankenHashMap = new HashMap<String,String>();
	
	Jyanken_Chapter28(){
		 this.JyankenHashMap.put("r","グー");
		 this.JyankenHashMap.put("s","チョキ");
		 this.JyankenHashMap.put("p","パー");
	}
	
	//自分のじゃんけんの手を入力する
	
	public String getMyChoice() {
		
		while(true){
			
			System.out.println("自分のじゃんけんの手を入力しましょう\n"
					+ "グーはrockのrを入力しましょう\n"
					+ "チョキはscissorsのsを入力しましょう\n"
					+ "パーはpaperのpを入力しましょう");
			
			String input= null;
			
			try (Scanner scanner = new Scanner(System.in)) {
				 input= scanner.next();
			}
			 
			 if(input.equals("r") || input.equals("s") || input.equals("p") ) {
				// scanner.close();
				 return this.JyankenHashMap.get(input);
			 }
			 else {
				 System.out.println("入力値に誤りがあります。");
			 }
			 
		}
	}
	
	public String getRandom() {
			int r = (int)Math.floor(Math.random()*3);
			String result = "";
			
			switch(r){
				case 0 ->	result = this.JyankenHashMap.get("r");
				case 1 ->	result = this.JyankenHashMap.get("s");
				case 2 ->	result = this.JyankenHashMap.get("p");
			}
			return result;
		}
	
	public void playGame() {
		
		String myChoice = this.getMyChoice();
		String enemyChoice	 = this.getRandom();
		
		System.out.println("自分の手は" + myChoice + ",対戦相手の手は" + enemyChoice);
		
		if(myChoice.equals(enemyChoice) ) {
			System.out.println("あいこです");
		}
		else if( (myChoice.equals("グー")  && enemyChoice.equals("チョキ")) ||
				  (myChoice.equals("チョキ")&& enemyChoice.equals("パー")) ||
				  (myChoice.equals("パー")  && enemyChoice.equals("グー"))  ){
			
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
	}

}
