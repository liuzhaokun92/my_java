package xuetang;

import java.util.Arrays;

public class Test_mk {
	    //��� main ����
	    public static void main(String[] args) {
	        int[] scores={89,-23,64,91,119,52,73};
	        paixu(scores);
	    }   
	    //���巽����ɳɼ��������ǰ�����Ĺ���
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
		       	System.out.println("���Գɼ����Գɼ�ǰ����Ϊ:");
		       	for(int m=0;m<3;m++){
		       		System.out.println(a[m]);
		       	}
		    }	
	    }
}
	 
	    
