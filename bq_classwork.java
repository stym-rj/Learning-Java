import java.util.*;
import java.lang.*;

public class bq_classwork {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = new String();
        char gender = 'M';
        long phoneNumber = 0;
        int roomNo = 100;
        int choice = 0;
        int mealType;
        System.out.println("Enter your choice : ");
        System.out.println("1 : Room Booking");
        System.out.println("2 : Meal");
        System.out.println("3 : Display Records");
        System.out.println("4 : Exit");
        choice = sc.nextInt();

        while(choice != 4) {
            switch (choice) {
                case 1 :
                    System.out.print("Enter your name : ");
                    name = sc.nextLine();
                    System.out.print("Enter your gender : ");
                    gender = sc.next().charAt(0);
                    System.out.print("Enter your phone number : ");
                    phoneNumber = sc.nextLong();
                    System.out.print("Room number is alloted and your room number is : " + (++roomNo));
                    break;
                case 2 :
                    System.out.println("Choose your meal type : ");
                    System.out.println("1 : Breakfast");
                    System.out.println("2 : Lunch");
                    System.out.println("3 : Dinner");
                    System.out.println("4 : Previous Menu");
                    mealType = sc.nextInt();

                    switch(mealType) {
                        case 1 :
                            System.out.println("1 : Bread Butter Jam");
                            System.out.println("2 : Paneer Paratha");
                            System.out.println("3 : Poha");
                            System.out.println("4 : Chai");
                            System.out.println("5 : Previous Menu");
                            int breakfast_choice = sc.nextInt();
                            switch(breakfast_choice) {
                                case 1 :
                                    System.out.println("4 Breads with Butter and Jam : Rs. 30");
                                    break;
                                case 2 :
                                    System.out.println("2 Paneer Paratha with Butter : Rs. 40");
                                    break;
                                case 3 :
                                    System.out.println("Full Plate Poha : Rs : 25");
                                    break;
                                case 4 :
                                    System.out.println("1 cup Garam Chai : Rs. 10");
                                    break;
                                case 5 :
                                    break;
                            }
                            break;
                        case 2 :
                            System.out.println("1 : Plain Chawal Daal");
                            System.out.println("2 : Paneer Paratha");
                            System.out.println("3 : Rajma Chawal");
                            System.out.println("4 : Chholey Bhature");
                            System.out.println("5 : Previous Menu");
                            int lunch_choice = sc.nextInt();
                            switch(lunch_choice) {
                                case 1 :
                                    System.out.println("1 Plate Plain Chawal Daal : Rs. 60");
                                    break;
                                case 2 :
                                    System.out.println("2 Paneer Paratha with Butter : Rs. 40");
                                    break;
                                case 3 :
                                    System.out.println("Rajma Chawal : Rs. 70");
                                    break;
                                case 4 :
                                    System.out.println("Chholey Bhature : Rs. 65");
                                    break;
                                case 5 :
                                    break;
                            }
                            break;
                        case 3 :
                            System.out.println("1 : Idli Sambhar");
                            System.out.println("2 : Paneer Kulcha");
                            System.out.println("3 : Super Delux Thali");
                            System.out.println("4 : Normal Thali");
                            System.out.println("5 : Previous Menu");
                            int dinner_choice = sc.nextInt();
                            switch(dinner_choice) {
                                case 1 :
                                    System.out.println("5 Pc. Idli with Sambhar : Rs. 50");
                                    break;
                                case 2 :
                                    System.out.println("2 Pc. Paneer Kulcha : Rs. 40");
                                    break;
                                case 3 :
                                    System.out.println("Super Delux Thali : Rs : 125");
                                    break;
                                case 4 :
                                    System.out.println("Normal Thali : Rs. 100");
                                    break;
                                case 5 :
                                    break;
                            }
                            break;
                        case 4 :
                            break;
                    }
                    break;
                case 3 :
                    System.out.println("Name : " + name);
                    System.out.println("Gender : " + gender);
                    System.out.println("Phone Number : " + phoneNumber);
                    System.out.println("Allotted Room Number : " + roomNo);
                    break;
                case 4 :
                    break;
            }
        }
    }
}
