public class Student {

    //data member
    String studentName;
    int studentId;
    String studentCity;
    //creating constructor

    public Student() {
        System.out.println("creating constructor");
    }
    public Student(int i,String c, String n){
        studentId=i;
        studentCity=c;
        studentName=n;
    }

    public void study()
    {
        System.out.println(studentName +" "+ "is studying");
        System.out.println("he is from " + studentCity);
        System.out.println("his id is " + studentId);
    }
    public int st()
    {
      int a=10;
      return a++;
    }



}
