package studentmangement;

public class StudentMangement
{
      public boolean sameGroup( Student s1, Student s2)
  {
      return s1.getGroup().equals(s2.getGroup());
  }
      public Student[] students=new Student[10];
      void studentsByGroup()
      {
          int size=students.length;
         int[]list=new int[size];
         for(int i=0;i<size;i++)
         {
             list[i]=0;
         }
         for(int i=0;i<size;i++)
         {
             if(list[i]==0)
             {
                 System.out.println("group "+students[i].getGroup());
                 for(int j=i;j<size;j++)
                 {
                     if(students[j].getGroup().equals(students[i].getGroup()))
                     {
                         System.out.println(students[j].getInfo());
                         list[j]=1;
                     }
                 }
             }
         }
      }
      void removeStudent(String id)
      {       
        int size=students.length;
          int c=0;
          for(int i=0;i<size;i++)
          {
              if(!students[i].getId().equals(id))
              {
                  students[c]=students[i];
                          c++;
              }
          }
          size=c;
          System.out.println("danh sach lop sau khi xoa phan tu id");
          for(int i=0;i<size;i++)
              System.out.println(students[i].getInfo());
      }
    public static void main(String[] args) {
         Student stu1;
      stu1=new  Student();
      stu1.setName("Quang");
      stu1.setGroup("k62CD");
      stu1.setId("17020977");
      stu1.setEmail("quang.dovan0202@gmail.com");
        System.out.println("ten la "+stu1.getName());
        System.out.println("thông tin sinh vien :"+stu1.getInfo());
        String n,sid,em;
        n="Quang";
        sid="17020977";
        em="quang.dovan0202@gmail.com";
        Student stu2;
        stu2=new Student(n,sid,em);
         System.out.println("thông tin sinh vien :"+stu2.getInfo());
          Student stu3;
           Student stu4;
            Student stu5;
            Student stu6;
            stu6=new Student();
           StudentMangement stu0;
           stu0=new StudentMangement();
           stu3 =new  Student();
           stu4= new  Student();
           stu5=new Student();
           stu3.setEmail("quang.dovan@gnail.com");
           stu3.setName("quang");
           stu3.setId("17020977");
           stu3.setGroup("INT22042");
           stu4.setEmail("thangninh@gmail.com");
           stu4.setId("17020999");
           stu4.setName("thang");
           stu4.setGroup("INT22042");
           stu6.setEmail("thieu@gmail.com");
           stu6.setId("17020666");
           stu6.setName("thieu");
           stu6.setGroup("INT22043");
            stu5.setEmail("manhning@gmail.com");
           stu5.setId("17020777");
           stu5.setName("Manh");
           stu5.setGroup("INT22042");
          System.out.println(stu0.sameGroup(stu3,stu4));
          for(int i=0;i<stu0.students.length;i++)
          {
              stu0.students[i]=new Student();
          }
          stu0.students[0]=stu3;
          stu0.students[1]=stu4;
          stu0.students[2]=stu6;
          stu0.students[3]=stu5;
          
          stu0.studentsByGroup();
          stu0.removeStudent("000");
          
     }
}
  