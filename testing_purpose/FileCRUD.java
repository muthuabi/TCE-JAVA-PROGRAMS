import java.util.*;
import java.io.*;
class FileControl
{
    String FNAME;
    File fp;
    public FileControl(String fname)throws IOException
    {
        this.FNAME = fname;
        fp=new File(fname);
        fp.createNewFile();
    }
    public void writeStudent(Student stud)throws IOException
    {
        FileWriter fw=new FileWriter(this.fp,true);
        fw.write(stud.toCSV()+"\n");
        fw.close();
    }
    public String readStudent()throws IOException //First Student
    {
        FileReader fr=new FileReader(this.fp);
        BufferedReader br=new BufferedReader(fr);
        // if((stud=br.readLine())!=null)
        //     return stud;
        String stud=br.readLine();
        br.close();
        return stud;
        
    }
    public int find(String regno) throws IOException
    {
        FileReader fr=new FileReader(this.fp);
        BufferedReader br=new BufferedReader(fr);
        String stud;
        int index=0;
        while((stud=br.readLine())!=null)
        {
            if(Student.fromCSV(stud).regno.equals(regno))
                return index;
            index++;
        }
        br.close();
        return -1;
    }
    public void updateStudent(String regno,Student newStud)throws IOException
    {
        int index=find(regno);
        if(index==-1)
        {
            System.out.println("No Data Update Failed");
            return;
        }
        List<String> students=readStudents();
        String oldStudent=students.get(index);
        students.set(index,newStud.toCSV());
        FileWriter fr=new FileWriter(this.fp,false);
        for(String str:students)
            fr.write(str+"\n");
        fr.close();
        System.out.println("Updated");

    }
    public void deleteStudents(String confirmText)throws IOException
    {
        if(!confirmText.equals(this.FNAME))
        {
            System.out.println("Confirmation Failed");
            return;
        }
        FileWriter fr=new FileWriter(this.fp,false);
        fr.close();
    }
    public void delete(String confirmText) throws IOException
    {
        if(!confirmText.equals(this.FNAME))
        {
            System.out.println("Confirmation Failed");
            return;
        }
        fp.delete();
    }
    public List<String> readStudents()throws IOException
    {
        FileReader fr=new FileReader(this.fp);
        BufferedReader br=new BufferedReader(fr);
        List<String> studs=new ArrayList<>();
        String stud;
        while((stud=br.readLine())!=null)
        {
            studs.add(stud);
        }
        br.close();
        return studs;
    }


}
class Student{
    String name;
    String regno;
    char gender;
    int percentage;
    public Student()
    {
        this.name="unknown";
        this.regno="unknown";
        this.gender='U';
        this.percentage=0;
    }
    public Student(String name,String regno,char gender,int percentage)
    {
        this.name=name;
        this.regno=regno;
        this.gender=gender;
        this.percentage=percentage;
    }
    public String toCSV()
    {
        StringBuilder sb=new StringBuilder();
        sb.append(this.gender);
        String gender=sb.toString();
        return name+","+regno+","+gender+","+percentage;
    }
    public static Student fromCSV(String csv)
    {
        String strArr[]=csv.trim().split(",");
        return new Student(strArr[0],strArr[1],strArr[2].charAt(0),Integer.parseInt(strArr[3]));
    }
    public void show()
    {
        System.out.println("\n------------------");
        System.out.println("Student Detail");
        System.out.println("-------------------");
        System.out.println("Name:"+this.name);
        System.out.println("Regno:"+this.regno);
        System.out.println("Gender:"+this.gender);
        System.out.println("Percentage:"+this.percentage+"%");
        System.out.println("-------------------");
    }
    public String toString()
    {
        String str="\n------------------\nStudent Detail\n-------------------\nName:"+this.name+"\nRegno:"+this.regno+"\nGender:"+this.gender+"\nPercentage:"+this.percentage+"%\n--------------------\n";
        return str;
    }
}
class FileCRUD
{
    public static void main(String arg[])
    {
        // FileControl fc=new FileControl("data.csv");
        try{
        Scanner sc=new Scanner(System.in);
        Student stud=new Student();
        FileControl fc=new FileControl("students.csv");
        int ch;
        do{
            System.out.println("\nEnter the Choice");
            ch=sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter Student Name:");
                    String name=sc.nextLine();
                    System.out.println("Enter the Regno");
                    String regno=sc.nextLine();
                    System.out.println("Enter the Gender");
                    char gender=sc.next().charAt(0);
                    System.out.println("Enter Percentage");
                    int percentage=sc.nextInt();
                    stud=new Student(name,regno,gender,percentage);
                    break;
                case 2:
                    System.out.println(stud);
                    break;
                case 3:
                    System.out.println("Add to File");
                    fc.writeStudent(stud);
                    break;
                case 4:
                    System.out.println("All Students");
                    List<String> students=fc.readStudents();
                    for(String str:students)
                    {
                        Student.fromCSV(str).show();
                    }
                    break;
                case 5:
                    System.out.println("Enter the Regno to Search");
                    String searchReg=sc.nextLine();
                    int lineNo=fc.find(searchReg);
                    if(lineNo==-1)
                    {
                        System.out.println("No Data Found");
                        break;
                    }
                    System.out.println("Data Found At Line "+lineNo);
                    break;  

                case 6:
                    System.out.println("Enter the Regno to Update");
                    searchReg=sc.nextLine();
                    lineNo=fc.find(searchReg);
                    if(lineNo==-1)
                    {
                        System.out.println("No Data Found");
                        break;
                    }
                    System.out.println("New Details");
                    System.out.println("Enter Student Name:");
                    name=sc.nextLine();
                    System.out.println("Enter the Regno");
                    regno=sc.nextLine();
                    System.out.println("Enter the Gender");
                    gender=sc.next().charAt(0);
                    System.out.println("Enter Percentage");
                    percentage=sc.nextInt();
                    Student temp=new Student(name,regno,gender,percentage);
                    fc.updateStudent(searchReg,temp);
                    break;
                case 7:
                    System.out.println("Type the File Name With Extension to Delete Contents:");
                    String confirmation=sc.nextLine();
                    fc.deleteStudents(confirmation);
                    break;
                case 8:
                    System.out.println("Type the File Name With Extension to Delete File:");
                    confirmation=sc.nextLine();
                    fc.delete(confirmation);
                case 10:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    
            }
        }while(ch!=10);
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e.getMessage());
        }
        finally
        {
            System.out.println("Application Closed");
        }
    }
}