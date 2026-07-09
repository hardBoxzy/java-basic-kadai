package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> words = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {
		
		String[] EnglihsWords = {"apple","peach","banana","lemon","pear","kiwi","strawberry","grape","muscat","cherry"};
		String[] JapaneseWords = {"りんご","桃","バナナ","レモン ","  梨 ","キウィ"," いちご ","ぶどう","マスカット","さくらんぼ"};
		for(int i=0; i < EnglihsWords.length ; i++) {
			this.words.put(EnglihsWords[i] , JapaneseWords[i]);
		}
		
	}
	
	
	public void findWord(String targetWord) {
		if(words.get(targetWord) != null) {
			 System.out.println(targetWord + "の意味は" + words.get(targetWord));
		 }else {
			 System.out.println(targetWord + "は辞書に存在しません");
		 }
	}
	

}
