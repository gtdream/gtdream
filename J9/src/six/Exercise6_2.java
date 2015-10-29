package six;
//page 33
class Exercise6_2 {
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard {
   int num =1;
   boolean ikKwang = true;
   SutdaCard(int num, boolean ikKwang){
	   this.num=num;
	   this.ikKwang=ikKwang;
   }
   SutdaCard(){
	   
   }
   String info(){
	   String str="";
	   str+=num;
	   if(ikKwang==true){
		   str+="k";
	   }
	   return str;
   }
}
