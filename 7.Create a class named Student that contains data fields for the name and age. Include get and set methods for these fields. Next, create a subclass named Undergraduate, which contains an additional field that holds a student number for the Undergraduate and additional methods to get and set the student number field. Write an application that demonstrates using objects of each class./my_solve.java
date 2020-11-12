//Student - CLASS
class Student
{
   private String name;
   private String age;
//SET
   public void setName(String name)
   {
      this.name = name;
   }
   public void setAge(String age)
   {
      this.age = age;
   }
//GET
   public String getName()
   {
       return name;
   }
   public String getAge()
   {
       return age;
   }
}
//Undergraduate - SUBCLASS
class Undergraduate extends Student{
    private String num;
    public void setNum(String num)
    {
        this.num = num;
    }
    public String getNum()
    {
        return num;
    }
}
//MAIN METHOD
public class Main  {
    public static void main(String[] args) {
        Student s1 = new Student();
        Undergraduate un = new Undergraduate();
        s1.setName("Nayem");
        s1.setAge("20");
        un.setNum("10");
        System.out.println("The name of the student is "
                +s1.getName()+". He is "+s1.getAge()+" years old \nand "
                +s1.getName()+" has taken "+un.getNum()+" undergraduate cources.");
    }
}
