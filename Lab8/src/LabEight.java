import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LabEight {
	 static Scanner scan = new Scanner(System.in);
	    static BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	    static int count = 0;
	    static String name []=new String[11];
	    static String food []=new String[11];
	    static String homeTown []=new String[11];
	    public static void fillStudent() {
	         
	        name[0]="Christan";
	        name[1]="James";
	        name[2]="Adan";
	        name[3]="Matt";
	        name[4]="Tia";
	        name[5]="Dejuan";
	        name[6]="Christopher";
	        name[7]="Pegy";
	        name[8]="Frank";
	        name[9]="Ann";
	        name[10]="Anjela";
	      
	        food[0]="burger";
	        food[1]="Tacoo";
	        food[2]="Candy";
	        food[3]="Chicken";
	        food[4]="Thi";
	        food[5]="rice";
	        food[6]="Stake";
	        food[7]="beaf";
	        food[8]="dal";
	        food[9]="potato";
	        food[10]="chiken";
	     

	        homeTown[0]="Detroit";
	        homeTown[1]="Detroit";
	        homeTown[2]="Detroit";
	        homeTown[3]="Detroit";
	        homeTown[4]="Detroit";
	        homeTown[5]="Detroit";
	        homeTown[6]="Detroit";
	        homeTown[7]="Detroit";
	        homeTown[8]="Detroit";
	        homeTown[9]="Detroit";
	        homeTown[10]="Detroit";
	        
	         
	    }

	    /**
	     * @param args the command line arguments
	     */
	    public static void showStudent(int studentNumber) {
	        
	        try {
	            if (count == 0) {
	                System.out.print("Student " + studentNumber + " is " +  name[(studentNumber - 1)]  + ".What would you like to know about " + name[(studentNumber - 1)]  + "?(enter or 'Hometown' or 'favourite food'):");
	            } else {
	                System.out.print("That data does not exit.Try again.(enter or 'Hometown' or 'favourite food'):");
	            }
	            String data;
				 
					data = reader.readLine();
				 
	            count++;
	            if (data.equals("Hometown") || data.equals("favourite food")) {
	                if (data.equals("Hometown")) {
	                    System.out.print( name[(studentNumber - 1)] +" is from "+homeTown[(studentNumber - 1)] + " would you like to more?(yes or no)");
	                } else if(data.equalsIgnoreCase("favourite food")) {
	                    System.out.print( name[(studentNumber - 1)] +",s favourate food is " +  food[(studentNumber - 1)] + " would you like to more?(yes or no)");
	                }
	                else{
	                    showStudent(studentNumber);
	                }
	                
	                String choice = "";
	                do {
	                     
	                        choice = reader.readLine();
	                        if (choice.equalsIgnoreCase("yes")) {
	                            count=0;
	                            showStudent(studentNumber);
	                            
	                        } else if (choice.equalsIgnoreCase("no")) {
	                            System.err.println("Thanks");
	                            System.exit(0);
	                        } else {
	                            System.out.println("That data is not correct try again  would you like to more?(yes or no)");
	                        }
	                    
	                } while (!choice.equalsIgnoreCase("yes") || !choice.equalsIgnoreCase("no"));
	            } else {
	                showStudent(studentNumber);
	            }
	        }catch (Exception e) {
				 
			}

	    }

	    public static void searchStudent() {
	        int count = 0;

	        int choice = 0;

	        do {

	            if (count == 0) {
	                System.out.print("which student would you like to learn more about?(enter a number 1-11):");
	            } else {
	                System.out.print("That Student does not exist.(enter a number 1-11):");
	            }
	            choice = scan.nextInt();
	            if (choice >= 1 && choice <= 20) {
	                showStudent(choice);
	            }
	            count++;
	        } while (choice > 20 || choice < 1);
	    }

	    public static void main(String[] args) {
	        fillStudent();
	        searchStudent();

	    }
}


