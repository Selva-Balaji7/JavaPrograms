import java.util.Scanner;

class Employee extends Object{
    int id;
    String name;
    int sal;
    String dec;
    long mobno;
    String email;

    public Employee(int id,String name,int sal,String dec,long mobno,String email){
    this.id=id;
    this.name=name;
    this.sal=sal;
    this.dec=dec;
    this.mobno=mobno;
    this.email=email;
    }
}

class collector {
    Scanner sc = new Scanner(System.in);
    Employee[] arr = new Employee[10];
    int count=0;
    public void save(Employee e){
        arr[count]=e;
         System.out.println("count : "+count);
        count++;
    }
    public void update(int id){
        for (int i = 0; i<count; i++) {
            if (arr[i].id==id){
                System.out.println("1.id\n 2.salary\n 3.mobno\n 4.designation\n 5.email\n 6.exit\n" );
                System.out.println("Enter the option that you want to update:");
                int option=sc.nextInt();
                switch(option)
                {
                case 1:
                    {
                     System.out.print("Emp ID : ");
                     arr[i].id = sc.nextInt(); 
                    }
                    break;
                case 2:
                    {
                    System.out.print("Emp sal: ");
                    arr[i].sal = sc.nextInt();
                    }
                    break;
                case 3:
                    {
                    System.out.print("Emp destination : ");
                    arr[i].dec = sc.next();
                    }
                    break;
                case 4:
                    {
                    System.out.print("Emp mobileNumber : ");
                    arr[i].mobno = sc.nextLong();
                    }
                    break;
                case 5:
                    {
                     System.out.print("Emp mailId : ");
                    arr[i].email = sc.next();
                    }
                    break;
                }
            }
            else{
                if(i==(count-1))
                {
                System.out.println("Enter valid ID!");
                }

            }
        }
    }
    public void GetAllData(){
        for (int i = 0; i<count; i++) {
            System.out.println("Emp ID : "+arr[i].id);
            System.out.println("Emp Name : "+arr[i].name);
            System.out.println("Emp sal : "+arr[i].sal);
            System.out.println("Emp destination : "+arr[i].dec);
            System.out.println("Emp mobileNumber : "+arr[i].mobno);
            System.out.println("Emp email : "+arr[i].email);
            System.out.println();
        }
    }  
    public void GetDataById(int id){
        for (int i = 0; i<count; i++) {
            if (arr[i].id==id) {
                
                System.out.println("empoyee detail : "+ (i+1));
                System.out.println("Emp ID :"+arr[i].id);
                System.out.println("Emp Name :"+arr[i].name);
                System.out.println("Emp sal :"+arr[i].sal);
                System.out.println("Emp destination:"+arr[i].dec);
                System.out.println("Emp mobileNumber:"+arr[i].mobno);
                System.out.println("Emp email:"+arr[i].email);

            }
        }
    }
}


public class Main extends collector {
    
    // int id = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main a1 = new Main();
        while (true) {
            System.out.println(" 1: save \n 2: update \n 3: GetAllData \n 4: GetDataById \n 5:Exit\n");
            System.out.print("select the option : ");
            int n =sc.nextInt();
            switch (n) {
                case 1:{
                    System.out.println();
                    System.out.println("enter the employee data");
                    System.out.print("Emp ID : ");
                    int id = sc.nextInt();
                    System.out.print("Emp Name : ");
                    String name = sc.next();
                    System.out.print("Emp sal : ");
                    int sal = sc.nextInt();
                    System.out.print("Emp destination : ");
                    String dec = sc.next();
                    System.out.print("Emp mobileNumber : ");
                    long mobno = sc.nextLong();
                    System.out.print("Emp email : ");
                    String email = sc.next();

                    Employee e = new Employee(id,name,sal,dec,mobno,email);
                    // collector c = new collector();
                    
                    a1.save(e);

                }
                break;
                
                case 2:{
                    System.out.print("Enter the employee ID you want to update : ");
                    a1.update(sc.nextInt());
                }
                break;

                case 3:{
                    a1.GetAllData();
                }
                break;

                case 4:{
                    System.out.print("Enter the employee ID : ");
                    a1.GetDataById(sc.nextInt());
                }
                break;
                case 5:{
                    System.out.println("thank you!!!");
                    System.exit(0);
                }

                default: {
                    System.out.println("Enter the Valid option...!");
                }
                    break;
            }

        }

    }
}