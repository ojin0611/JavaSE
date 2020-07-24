public class ForDemo{
	public static void main(String[] args) {
	    // 1.
		for (int i=1;i<=100;i++){
		    if (i%7==0) System.out.print(i + " ");
		}
		
		// 2.
		int cnt = 0;
        System.out.println();
		for (int i=1;i<=100;i++){
		    if (i%7==0) {
		        System.out.printf("%4d",i);
		        cnt += 1;
		        if (cnt==3){
		            cnt=0;
		            System.out.println();
		        }
		    }   
		}
		
		// 3.
		cnt = 0;
		System.out.println();
		for (int i=65; i<=90; i++){
		    cnt += 1;
		    if (i%10 >=5){
		        System.out.print((char)i + "  ");
		    }else{
		        System.out.print((char)(i+32) + "  ");
		    }
		    
		    if (cnt==5) {
		        System.out.println();
		        cnt = 0;
		    }        
		}
	}
}
