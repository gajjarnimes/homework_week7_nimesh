package nimesh_week7;

public class Person {
    private String getFullName;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); //firstName is set to empty string
        person.setLastName(""); //lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName="+person.getFullName);
        System.out.println("teen="+person.isTeen());
        person.setFirstName("John");//firstName is set to john
        person.setAge(18);
        System.out.println("fullName="+person.getFullName);
        System.out.println("teen="+person.isTeen());
        person.setFirstName("Smith");//lastName is set to smith
        System.out.println("fullName="+ person.getFullName());

    }
    public String firstName;
    public String lastName;
    public  int age;

    public String getFirstName() {
        return firstName;
    }
        public String getLastName() {
            return lastName;
        }    public int getAge() {
        return age;
    } public void setFirstName(String firstName){
        this.firstName = firstName;
    }public void setLastName(String lastName){
        this.lastName = lastName;
    }public void setAge(int age){
        if (age>0 && age<=100){
            this.age = age;
        }else {
            this.age = 0;
        }
    }
   public boolean isTeen() {
       if ((age > 12 && age < 20)) {
           return true;
       }
       return false;
   }

    public String getFullName(){
        if(firstName.isEmpty()){
            return lastName;
        }
        if (firstName.isEmpty()){
            return firstName;
        }
        if(firstName.isEmpty()&& lastName.isEmpty()){
            return " ";
        }else {
            return firstName+ " "+ lastName;
        }
    }
}
