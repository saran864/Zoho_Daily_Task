package leetcode;

public class StringImmutable {
	 public static void main(String[] args) {  
	        String st1 = "Saran";  
	        String st2 = "Saran";  
	        System.out.println("Before Modification");
	       System.out.println(st1==st2);
	       System.out.println(st1.hashCode()+"="+st2.hashCode());
	        st1 += " Ramasamy";  
	        System.out.println("After Modification");  
	        System.out.println(st1==st2);
		       System.out.println(st1.hashCode()+"!="+st2.hashCode());
	     
	    }  
}
