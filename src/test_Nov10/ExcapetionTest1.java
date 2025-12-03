package test_Nov10;

import java.io.IOException;

class MyException extends Exception {
	  private final int code;
	  public MyException(int code, Throwable actualEx){
	    super(actualEx);
	    this.code = code;
	  }
	  
	  public MyException(int code, String message, Throwable actualEx){
	    super(message, actualEx);//1
	    this.code = code;
	  }
	  
	  public String getMessage(){
	      return String.format("Exception - Code=%d, Msg=%s, OrigMsg=%s",
	                            code, super.getMessage(), this.getCause().getMessage()); //2
	  }
	}

	public class ExcapetionTest1 {
	    public static void main(String[] args) {
	        try{
	            throw new MyException(404, "NOT FOUND",
	                                       new IOException("FILE UNREADABLE")); //3
	        }catch(Exception e){
	            System.out.println(e.getMessage());
	        }
	    }
	}
