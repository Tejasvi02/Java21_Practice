package test_Nov10;

interface Book{
  public default String getId(){
     return "ISBN123456";
  }
}

interface Encyclopedia extends Book{
   //INSERT CODE HERE, which code works below
	
//	static String getId(){
//	  return "AIN8888";
//	}  ------------can't do this cos it is conflicting with parent's default method

	
//	String getId();
//	default String getId(){
//	   return "AIN8888";
//	};  -----------duplicate getId();
	
	
//	String getId(); //valid
	
	
//	default String getId(){ //this works ,default method can be overridden too 
//	   return "AIN8888";
//	};
	
//	abstract static String getName(); //abstract and static can't be together
	
//	static String getName(); - static method need to have a body
	
//	static String getAuthor(); //static must have a body

//  default String getAuthor(); //needs to have a body
	
//	private String getId(){ //can't reduce visibility to private
//	    return "ISBN123456";
//	}
	
//	private String mymethod() {
//		return "abc";
//	} ------------------------valid cos new method can have private only public method can't be reduced
	
//	String getsome() { 
//		return "a";
//	}// -----abstract implicitly, so must be default or static to have body or make it private
}

