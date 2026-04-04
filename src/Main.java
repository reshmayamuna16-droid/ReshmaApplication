import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        LoginSystem login=new LoginSystem();

        if(!login.login()){

            System.out.println("Login Failed");
            return;
        }

        AddStudent add=new AddStudent();
        UpdateStudent update=new UpdateStudent();
        DeleteStudent delete=new DeleteStudent();
        DisplayStudents display=new DisplayStudents();
        AddMarks marks=new AddMarks();
        ResultReport report=new ResultReport();
        RankGenerator rank=new RankGenerator();
        AdminDashboard menu=new AdminDashboard();

        while(true){

            menu.show();

            int ch=sc.nextInt();

            if(ch==1){

                System.out.println("ID");
                int id=sc.nextInt();
                sc.nextLine();

                System.out.println("Name");
                String name=sc.nextLine();

                System.out.println("Department");
                String dept=sc.nextLine();

                add.addStudent(id,name,dept);
            }

            else if(ch==2){

                System.out.println("ID");
                int id=sc.nextInt();
                sc.nextLine();

                System.out.println("New Name");
                String name=sc.nextLine();

                update.updateName(id,name);
            }

            else if(ch==3){

                System.out.println("ID");
                int id=sc.nextInt();

                delete.delete(id);
            }

            else if(ch==4){

                display.display();
            }

            else if(ch==5){

                System.out.println("ID");
                int id=sc.nextInt();

                System.out.println("English");
                int e=sc.nextInt();

                System.out.println("Hindi");
                int h=sc.nextInt();

                System.out.println("Physics");
                int p=sc.nextInt();

                System.out.println("Math");
                int m=sc.nextInt();

                System.out.println("Chemistry");
                int c=sc.nextInt();

                System.out.println("Science");
                int s=sc.nextInt();

                marks.addMarks(id,e,h,p,m,c,s);
            }

            else if(ch==6){

                report.show();
            }

            else if(ch==7){

                rank.showTopper();
            }

            else{

                break;
            }
        }
    }
}
