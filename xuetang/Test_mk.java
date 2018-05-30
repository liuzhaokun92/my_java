package xuetang;

import java.util.Arrays;

public class Test_mk {
	    //完成 main 方法
	    public static void main(String[] args) {
	        int[] scores={89,-23,64,91,119,52,73};
	        paixu(scores);
	    }   
	    //定义方法完成成绩排序并输出前三名的功能
	    public static void paixu(int scores[]){
	        int k=0,j=0;
	        int a[]=new int[7];
	        Arrays.sort(scores);
	        for(int i=scores.length-1;i>=0;i--){
	            if(scores[i]<0||scores[i]>100){
	                continue;
	            }
	            else{
	            	k++;
	      			a[j]=scores[i];j++;
	            }
	       }
	        if(k>=3){    
		       	System.out.println("考试成绩考试成绩前三名为:");
		       	for(int m=0;m<3;m++){
		       		System.out.println(a[m]);
		       	}
		    }	
	    }
}
	 
	    
