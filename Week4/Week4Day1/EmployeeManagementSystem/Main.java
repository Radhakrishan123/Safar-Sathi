import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID to Delete: ");
        int id = sc.nextInt();

        EmployeeDAO dao = new EmployeeDAOImpl();
        dao.deleteEmployee(id);

        sc.close();
    }
}
public class Main {
    public static void main(String[] args) {

        EmployeeDAO dao = new EmployeeDAOImpl();
        dao.createTable();
    }
}

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
       EmployeeDb e = new EmployeeDb();
  System.out.print("Enter Email: ");
       e.setEmail(sc.nextLine());

     System.out.print("Enter ID: ");
   e.setId(sc.nextInt());
//
      EmployeeDAO dao = new EmployeeDAOImpl();
    dao.updateEmployee(e.getEmail(), e.getId());
//
      sc.close();
   }
}




import java.util.Scanner;

public class Main {
//
    public static void main(String[] args) {
//
        Scanner sc = new Scanner(System.in);
//
        EmployeeDb e = new EmployeeDb();
////
        System.out.print("Enter Email: ");
        e.setEmail(sc.nextLine());
        String Email = e.getEmail();
//        
   System.out.print("Enter ID: ");
//   
   e.setId(sc.nextInt());
   int id = e.getId();
  sc.nextLine();
////
        System.out.print("Enter Name: ");
       e.setName(sc.nextLine());
////
//  
////
     System.out.print("Enter Department: ");
     e.setDepartment(sc.nextLine());
////
     System.out.print("Enter Salary: ");
     e.setSalary(sc.nextDouble());
////       
//
        EmployeeDAO dao1 = new EmployeeDAOImpl();
        dao1.updateEmployee( Email,id);
//        
//
      sc.close();
//    }
//}
import java.util.Scanner;
//
public class Main {
//
 public static void main(String[] args) {
//
     Scanner sc = new Scanner(System.in);
//
    EmployeeDb e = new EmployeeDb();
//
        System.out.print("Enter ID: ");
        e.setId(sc.nextInt());
        sc.nextLine();
//
        System.out.print("Enter Name: ");
        e.setName(sc.nextLine());
//
        System.out.print("Enter Email: ");
        e.setEmail(sc.nextLine());
//
        System.out.print("Enter Department: ");
        e.setDepartment(sc.nextLine());
//
        System.out.print("Enter Salary: ");
        e.setSalary(sc.nextDouble());
//
        EmployeeDAO dao = new EmployeeDAOImpl();
        dao.addEmployee(e);
//
        sc.close();
//    }
}
