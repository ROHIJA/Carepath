import java.util.*;  
class ArrayListDemo{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  
 
  
  list.add("Ravi");//Adding object in arraylist  
  list.add("Vijay");  
  list.add("Ravi");  
  list.add("Ajay");  
  //Traversing list through Iterator  
  /*Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  } */ 
  
 /* for (String obj : list) 
  {
	  System.out.println(obj);
  }*/
  
  System.out.println("arraylist: " +list);
  
 }  
}  