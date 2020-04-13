
abstract class Person{
          String name;
          abstract void addlist();
          abstract void showlist();
}
class Doctor extends Person{
             java.util.ArrayList<String> DoctorList=new java.util.ArrayList<String>();
              void addlist()
              {
                  System.out.println("-->Enter how many doctors you wanted to add");
                  java.util.Scanner scan=new java.util.Scanner(System.in);
                  int n=scan.nextInt();
                  for(int i=0;i<n;i++){
                            System.out.println("-->Enter the name of the doctor you wanted to add");
                            java.util.Scanner scan1=new java.util.Scanner(System.in);
                            name=scan1.next();
                            DoctorList.add(name);
                 }
                            
               }
               void showlist()
               {
                        System.out.println("-->List of Doctors are:\n");
                         System.out.println(DoctorList);
               }
}
class Patient extends Person{
          java.util.ArrayList<String>PatientList=new java.util.ArrayList<String>();
          void addlist(){
                   System.out.println("-->Enter how many patients you want to add");
                   java.util.Scanner scan2=new java.util.Scanner(System.in);
                   int p=scan2.nextInt();
                   for(int j=0;j<p;j++){
                              System.out.println("-->Enter the name of the patient you want to add:");
                              java.util.Scanner scan3=new java.util.Scanner(System.in);
                              name=scan3.next();
                              PatientList.add(name);
                   }
            }
            void showlist(){
                             System.out.println("-->List of Patients are:");
                             System.out.println(PatientList);
           }
}
class HospitalDemo{
                    public static void main(String... args){
                                     Patient pa=new Patient();
                                     Doctor doc=new Doctor();
                                     System.out.println("--------------------------------------------------------------------------------------------------");
                                     System.out.println("<<<<<<<<<<<<<<<<      WELCOME TO ROHITH'S HOSPITAL MANAGEMENT SYSTEM    >>>>>>>>>>>>>>>>");
                                     System.out.println("---------------------------------------------------------------------------------------------------");
                                     System.out.println("--->Select the Category\n\n");
                                     System.out.println(" -->1.Doctors\n -->2.Patients\n");
                                      java.util.Scanner scan4=new java.util.Scanner(System.in);
                                      int q=scan4.nextInt();
                                      switch(q){
                                                    case 1:
                                                                  System.out.println(">>> You have selected doctors\n");
                                                                  System.out.println(" -->1.Add Doctors\n -->2.See Doctors list");
                                                                  java.util.Scanner s=new java.util.Scanner(System.in);
                                                                  int r=s.nextInt();
                                                                 
                                                                  if(r==1){
                                                                                doc.addlist();
                                                                               System.out.println("-->Do you wish to see Doctors list?\n");
                                                                              java.util.Scanner sqp=new java.util.Scanner(System.in);
                                                                              String qps=sqp.next();
                                                                              if(qps.equalsIgnoreCase("Yes")){
                                                                                                      doc.showlist();
                                                                              }
                                                                              else{
                                                                                      System.out.println("Thank you!!");
                                                                              }
                                                                   }
                                                                  else if(r==2){
                                                                                doc.showlist();
                                                                                System.out.println(">>> You have not added anything!!!");
                                                                   }
                                                                   else{
                                                                            System.out.println(">>> Enter valid option!!");
                                                                    }
                                                        
                                                                   break;    
                                                    case 2:
                                                                System.out.println(">>> You have selected patients\n");
                                                                System.out.println(" -->1.Add Patients\n -->2.See Patients list");
                                                                java.util.Scanner m=new java.util.Scanner(System.in);
                                                                int t=m.nextInt();
                                                                if(t==1){
                                                                              pa.addlist();
                                                                              System.out.println("-->Do you wish to see patients list?\n");
                                                                              java.util.Scanner sq=new java.util.Scanner(System.in);
                                                                              String qp=sq.next();
                                                                              if(qp.equalsIgnoreCase("Yes")){
                                                                                                      pa.showlist();
                                                                              }
                                                                              else{
                                                                                      System.out.println("Thank you!!");
                                                                              }
                                                                  }
                                                                else if(t==2){
                                                                              pa.showlist();
                                                                              System.out.println(">>> You have not added anything!!");
                                                                 }
                                                                 else{
                                                                          System.out.println(">>> Enter valid option!!");
                                                                   }
                                                                  break;
                                                    default:
                                                                    System.out.println(">>> Sorry!Try again");
                                                                    break;
                                           }
                            }
}
                                 