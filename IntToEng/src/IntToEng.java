import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

	}
	
    static String translateEng(int n) {
    	String[] Eng = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	//String[] Engt = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    	//String[] Eng10 = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    	String[] Eng100 = {"hundred","thousand"};
    	
    	StringBuffer sb =new StringBuffer("");
    	
    	//分岐：200,300,400,500,600,700,800,900
    	if(n>100 && 1000>n){
    		//100の位の数
    		int y = n/100;
    		translateEb(y);
    		//hundredを出す
    		int g = n%100;
    		sb.append(Eng100[g]);
    		//10の位以下の数
    		translateEb(g);
    	}
      	if(n==100){
    		//100を変換
    		sb.append(Eng100[0]);
    	}else if(n==1000){
    		//1000変換
    		sb.append(Eng100[1]);
    	}
    	
        return sb.toString();
    }
    static String translateEb(int m) {
    	String[] Eng = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	String[] Engt = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    	String[] Eng10 = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    	StringBuffer sb =new StringBuffer("");
    	
    	if(m<10){
    		//0~9を変換
    		sb.append(Eng[m]);
    	}else if(m>10&&m<20){
    		sb.append(Engt[m-11]);
    	}else if(m>=10&&m<100){
    		//20~99を変換
    		//10の位の数
    		int s = m/10;
    		sb.append(Eng10[s]);
    		//1の位の数
    		int t = m%10;
    		sb.append(Eng[t]);
    	}
    	
    	return sb.toString();
    }

}
