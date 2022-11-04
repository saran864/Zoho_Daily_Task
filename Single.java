
public class Single {
          private Single(){};
          
         static Single object =null;
         
         public static Single getInstance()
         {
        	 if(object==null)
        		return object=new Single();
        	 else
        		 return object;
         }
}
