public class AnagramTest{
	public static void main(String args[]){
		System.out.println("\t\t\t*************************************");
        System.out.println("\t\t\t*        Anagram Testing...         *");
        System.out.println("\t\t\t*************************************");     
		boolean pass = true;
			String str = "Let's try: anagram1* is Fun3";
			for (int i = 0; i < 10; i++) {
				pass = pass && Anagram.isAnagram(str, Anagram.randomAnagram(str));
			  
			}
			System.out.println("Result is :" + pass + ", rendomAnagram is: "+ str);			  
	
			str = "&^&$#$@@!   !!!";
			for (int i = 0; i < 10; i++) {
				pass = pass && Anagram.isAnagram(str, Anagram.randomAnagram(str));
			} 	
			System.out.println("Result is :" + pass + ", rendomAnagram is: "+ str);			  
			  
			str = "Happy8Hippo";
			for (int i = 0; i < 10; i++) {
				pass = pass && Anagram.isAnagram(str, Anagram.randomAnagram(str));
			}
			System.out.println("Result is :" + pass + ", rendomAnagram is: "+ str);			  
			str = "Jav@ is SO MucH fun65634";
			for (int i = 0; i < 10; i++) {
				pass = pass && Anagram.isAnagram(str, Anagram.randomAnagram(str));
			}
			System.out.println("Result is :" + pass + ", rendomAnagram is: "+ str);
			if(pass){
			System.out.println("All the tests are GREAT!");
			}
			else
			System.out.println("Something is wrong...");
}
}