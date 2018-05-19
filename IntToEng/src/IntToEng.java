import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

	}
	
    static String translateEng(int n) {
    	String[] Eng = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    	String[] Eng10 = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    	String[] Eng100 = {"hundred","thousand"};
    	
    	StringBuffer sb =new StringBuffer("");
  	if(n==1000) {
  		sb.append("one thousand");
  		return sb.toString();
  	}
    	if(n/100==1) { 
    		//100~199
        	sb.append("one "+Eng100[0]+" ");   
       		n = n%100; //上一桁を消す
       		if (n==0) { //100
       			return sb.toString();
       		}
   		}
    	else if(n/100>1) {
    		//200~999
   			int x = n/100; //100の位の数
   			sb.append(Eng[x]);
   			sb.append(" "+Eng100[0]+" ");
   			n = n%100; //上一桁を消す

   			//System.out.println(n);//test
    	}  //ここから下で10の位以下を考えている
    	if(n==00){
	   //下二桁が00のときは何もしない
    	}else if(n<20){ 
    		//1~19 
        	sb.append(Eng[n]);
    	}
   		else if(n/10>0) {
   			//20~99
    		int y = n/10;
    		sb.append(Eng10[y-2]);
   			n = n%10;
   			if(n!=0) { //1の位が0の場合
   				sb.append("-"+Eng[n%10]);
   			}
   		}
    	return sb.toString();
    }
}