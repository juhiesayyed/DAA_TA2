import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TestTreeSet {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int typeChoice,methodChoice;
        boolean ch=true;
        System.out.println("Which type of TreeSet would you like to make");
        System.out.println("1-->  Integer");
        System.out.println("2-->  String");
        System.out.println("3-->  Float");
        System.out.println("4-->  Double");
        typeChoice=sc.nextInt();
        TreeSet t;
        switch(typeChoice)
        {
            case 1:
                t=new TreeSet<Integer>();
                while(true)
                {
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Which Operation Would you like to perform in TreeSet");
                    System.out.println("1--> Add data");
                    System.out.println("2--> Add a collection od data");
                    System.out.println("3--> Display");
                    System.out.println("4--> Display Max Element");
                    System.out.println("5--> Display Min Element");
                    System.out.println("6--> Exit");
                    System.out.println("7--> check data is present already or not");
                    System.out.println("8--> delete a node");
                    System.out.println("9--> see root data");
                    System.out.println("10--> clear all data");
                    
                    methodChoice=sc.nextInt();
                    System.out.println("----------------------------------------------------------");
                    switch(methodChoice)
                    {
                        case 1:
                            System.out.println("Enter element to add in tree set");
                            t.add(sc.nextInt());
                            break;
                        case 2:
                            System.out.println("Enter the total-number of elements you want to add");
                            int size=sc.nextInt();
                            List<Integer> a=new ArrayList<>(size);
                            System.out.println("Enter data");
                            for(int i=0;i<size;i++)
                            {
                                a.add(sc.nextInt());
                            }
                            t.addAll(a);
                            System.out.println("Data stored successfully");
                            break;
                        case 3:
                            t.iterator();
                            break;
                        case 4:
                        System.out.println(t.getMax());
                        break;
                        case 5:
                        System.out.println(t.getMin());
                        break;
                        case 6:
                            System.out.println("Thank you for using our TreeSet package");
                            ch = false;
                            System.out.println("----------------------------------------------------------");
                            break;
                            case 7:
                            System.out.println("Enter data to search");
                            if(t.contains(sc.nextInt()))
                            {
                                System.out.println("data already Present");
                            }
                            else{
                                System.out.println("data not Present");
                            }
                            break;
                            case 8:
                            System.out.println("Enter data to delete");
                                t.remove(sc.nextInt());
                                break;
                            case 9:
                            t.rootValue();
                            break;
                            case 10:
                            t.empty();
                            break;
                        default:
                            break;
                    }
                    if(!ch)
                        break;
                }
                break;
            case 2:
                t=new TreeSet<String>();
                while(true)
                {
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Which Operation Would you like to perform in TreeSet");
                    System.out.println("1--> Add data");
                    System.out.println("2--> Add a collection od data");
                    System.out.println("3--> Display");
                    System.out.println("4--> Display Max Element");
                    System.out.println("5--> Display Min Element");
                    System.out.println("6--> Exit");
                    System.out.println("7--> check data is present already or not");
                    System.out.println("8--> delete a node");
                    System.out.println("9--> see root data");
                    System.out.println("10--> clear all data");
                    
                    methodChoice=sc.nextInt();
                    System.out.println("----------------------------------------------------------");
                    switch(methodChoice)
                    {
                        case 1:
                            System.out.println("Enter element to add in tree set");
                            t.add(sc.next());
                            break;
                        case 2:
                            System.out.println("Enter the total-number of elements you want to add");
                            int size=sc.nextInt();
                            List<String> a=new ArrayList<>(size);
                            System.out.println("Enter data");
                            for(int i=0;i<size;i++)
                            {
                                a.add(sc.next());
                            }
                            t.addAll(a);
                            System.out.println("Data stored successfully");
                            break;
                        case 3:
                            t.iterator();
                            break;
                        case 4:
                        System.out.println(t.getMax());
                        break;
                        case 5:
                        System.out.println(t.getMin());
                        break;
                        case 6:
                            System.out.println("Thank you for using our TreeSet package");
                            ch = false;
                            System.out.println("----------------------------------------------------------");
                            break;
                            case 7:
                            System.out.println("Enter data to search");
                            if(t.contains(sc.next()))
                            {
                                System.out.println("data already Present");
                            }
                            else{
                                System.out.println("data not Present");
                            }
                            break;
                            case 8:
                            System.out.println("Enter data to delete");
                                t.remove(sc.next());
                                break;
                            case 9:
                            t.rootValue();
                            break;
                            case 10:
                            t.empty();
                            break;
                        default:
                            break;
                    }
                    if(!ch)
                        break;
                }
                break;
                    
            case 3:
                t=new TreeSet<Float>();
                while(true)
                {
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Which Operation Would you like to perform in TreeSet");
                    System.out.println("1--> Add data");
                    System.out.println("2--> Add a collection od data");
                    System.out.println("3--> Display");
                    System.out.println("4--> Display Max Element");
                    System.out.println("5--> Display Min Element");
                    System.out.println("6--> Exit");
                    System.out.println("7--> check data is present already or not");
                    System.out.println("8--> delete a node");
                    System.out.println("9--> see root data");
                    System.out.println("10--> clear all data");
                    
                    methodChoice=sc.nextInt();
                    System.out.println("----------------------------------------------------------");
                    switch(methodChoice)
                    {
                        case 1:
                            System.out.println("Enter element to add in tree set");
                            t.add(sc.nextFloat());
                            break;
                        case 2:
                            System.out.println("Enter the total-number of elements you want to add");
                            int size=sc.nextInt();
                            List<Float> a=new ArrayList<>(size);
                            System.out.println("Enter data");
                            for(int i=0;i<size;i++)
                            {
                                a.add(sc.nextFloat());
                            }
                            t.addAll(a);
                            System.out.println("Data stored successfully");
                            break;
                        case 3:
                            t.iterator();
                            break;
                        case 4:
                        System.out.println(t.getMax());
                        break;
                        case 5:
                        System.out.println(t.getMin());
                        break;
                        case 6:
                            System.out.println("Thank you for using our TreeSet package");
                            ch = false;
                            System.out.println("----------------------------------------------------------");
                            break;
                            case 7:
                            System.out.println("Enter data to search");
                            if(t.contains(sc.nextFloat()))
                            {
                                System.out.println("data already Present");
                            }
                            else{
                                System.out.println("data not Present");
                            }
                            break;
                            case 8:
                            System.out.println("Enter data to delete");
                                t.remove(sc.nextFloat());
                                break;
                            case 9:
                            t.rootValue();
                            break;
                            case 10:
                            t.empty();
                            break;
                        default:
                            break;
                    }
                    if(!ch)
                        break;
                }
                break;
            case 4:
                t=new TreeSet<Double>();
                while(true)
                {
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Which Operation Would you like to perform in TreeSet");
                    System.out.println("1--> Add data");
                    System.out.println("2--> Add a collection od data");
                    System.out.println("3--> Display");
                    System.out.println("4--> Display Max Element");
                    System.out.println("5--> Display Min Element");
                    System.out.println("6--> Exit");
                    System.out.println("7--> check data is present already or not");
                    System.out.println("8--> delete a node");
                    System.out.println("9--> see root data");
                    System.out.println("10--> clear all data");
                    
                    methodChoice=sc.nextInt();
                    System.out.println("----------------------------------------------------------");
                    switch(methodChoice)
                    {
                        case 1:
                            System.out.println("Enter element to add in tree set");
                            t.add(sc.nextDouble());
                            break;
                        case 2:
                            System.out.println("Enter the total-number of elements you want to add");
                            int size=sc.nextInt();
                            List<Double> a=new ArrayList<>(size);
                            System.out.println("Enter data");
                            for(int i=0;i<size;i++)
                            {
                                a.add(sc.nextDouble());
                            }
                            t.addAll(a);
                            System.out.println("Data stored successfully");
                            break;
                        case 3:
                            t.iterator();
                            break;
                        case 4:
                        System.out.println(t.getMax());
                        break;
                        case 5:
                        System.out.println(t.getMin());
                        break;
                        case 6:
                            System.out.println("Thank you for using our TreeSet package");
                            ch = false;
                            System.out.println("----------------------------------------------------------");
                            break;
                            case 7:
                            System.out.println("Enter data to search");
                            if(t.contains(sc.nextDouble()))
                            {
                                System.out.println("data already Present");
                            }
                            else{
                                System.out.println("data not Present");
                            }
                            break;
                            case 8:
                            System.out.println("Enter data to delete");
                                t.remove(sc.nextDouble());
                                break;
                            case 9:
                            t.rootValue();
                            break;
                            case 10:
                            t.empty();
                            break;
                        default:
                            break;
                    }
                    if(!ch)
                        break;
                }
                break;

        }
       
        
    }
}
