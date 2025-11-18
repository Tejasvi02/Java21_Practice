package test_Nov10;

public enum Coffee {
	//ESPRESSO("Very Strong"), MOCHA, LATTE; 
	//-- mocha and latte needs to satisfy the overridden constructor of coffee
	//or we should explicitly write no arg constructor for coffee
	ESPRESSO("Very Strong"), MOCHA("abc"), LATTE("ghd"); 
    public String strength; 
    Coffee(String strength) 
    {
         this.strength = strength; 
    }
    public String toString(){   return strength + ordinal(); } 
}
