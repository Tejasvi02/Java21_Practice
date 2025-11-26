package test_Nov10;

import java.util.*;


public class ExceptionQuestion1 {
	  public static void main(String[] args) {
	    class NoSupportException extends RuntimeException{
	      NoSupportException(String message){
	        super(message);
	      }
	      NoSupportException(String message, Throwable cause){
	        super(message, cause);
	      }      
	    }
	    List<String> allOperations = List.of("subtract", "multiply", "add");
	    List<String> supportedOperations = new ArrayList<String>();
	    try{
	      try{
	        for(String s : allOperations){
	          if(s.length()<4) throw new NoSupportException("Operation not supported "+s);
	          else supportedOperations.add(s);
	        }
	      }catch(NoSupportException nse){
	        throw new NoSupportException("Unacceptable Operation", nse);
	      }
	    }catch(Exception e){
	      System.out.println("Exception caught : "+e.getMessage());
	    }
	    System.out.println(supportedOperations);
	  }
	}