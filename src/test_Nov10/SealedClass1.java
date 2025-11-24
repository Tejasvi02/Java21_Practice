package test_Nov10;

sealed interface Member permits Person{ //LINE A
    String role();
    void role(String role);
}

final record Person(String role) implements Member{ //LINE B
    public void role(String r){
    }
};

record Student(int id,  Person person)
{
   public String getRole(){ return person.role(); }
   
   public void setRole(String role){ person.role(role); } //LINE C
}

public  class SealedClass1{
    
    public static void m(Student m){
        if(m instanceof Student(var id, Person(var role))){ //LINE D
            System.out.println("role = "+role);
        }
    }
    
    public static void main(String[] args) {
        Student s = new Student(123, new Person("student")); //LINE E
        m(s);
    }
}