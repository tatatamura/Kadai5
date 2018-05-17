import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

	}
	
    static String translateEng(int n) {
    	String[] Eng = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	String[] Eng10 = {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    	String[] Eng100 = {"hundred","thousand"};
    	
    	StringBuffer sb =new StringBuffer("");
    	
    	if(n==0){
    		sb.append(Eng[n]);
    		return sb.toString();
    	}
    	
    	if(n!=0&&n<10){
    		sb.append(Eng[n]);
    	}
    	if(n>=10&&n<100){
    		int s = n/10;
    		sb.append(Eng10[s]);
    		int m = n%10;
    		sb.append(Eng[m]);
    		return sb.toString();
    	}
    	
    	
    	sb.append(Eng[n]);
    	
    
    	
        return sb.toString();
    }

}
