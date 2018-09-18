/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmangement;

/**
 *
 * @author Admin
 */
public class  Student {

    /**
     * @param args the command line arguments
     */
    private String name;
    private String id;
    private String group;
    private String email;
    public Student()
    {
        name="Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }
    public Student(String n,String sid, String em)
    {
        this.name=n;
        this.email=em;
        this.id=sid;
        this.group="INT22041";
    }
    public Student(Student s)
    {
       this.email=s.email;
       this.group=s.group;
       this.id=s.id;
       this.name=s.name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
  }
  public String getInfo()
   {
          String info;
          info=name+" "+group+" "+id+" "+email;
          return info;
    }

 }