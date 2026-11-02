package AnimalShelter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

abstract class Animal
{
    protected String name;
    protected String color;
    protected String food;
    protected int age;
    public abstract void eat();
    public abstract void sound();

    public void setFood(String newFood) 
    {
        this.food = newFood;
    }

    public String getColor() 
    {
        return color;
    }
    
    public void setColor(String c) 
    {
        this.color = c;
    }

    public String getName() 
    {
        return name;
    }
    
    public void setName(String c) 
    {
        this.name = c;
    }

    public int getAge() 
    {
        return age;
    }
    
    public void setAge(int c) 
    {
        this.age = c;
    }
}

class Cat extends Animal
{
    public Cat()
    {
           
        this.name = "Oliver";
        this.color = "Orange";
        this.age = 3;
        this.food = "10 gr Whiskas";
    }
       
    @Override
    public void eat()
    {
        System.out.println(this.food);
    }
       
    @Override
    public void sound()
    {
        System.out.println("Meow");
    }
}

class Dog extends Animal
{
    public Dog()
    {
        this.name = "Charlie";
        this.color = "Brown";
        this.age = 4;
        this.food = "30 gr meat";
    }
       
    @Override
    public void eat()
    {
        System.out.println(this.food);
    }
       
    @Override
    public void sound()
    {
        System.out.println("Woof");
    }
}

public class main 
{
    public static void main(String[] args) 
    {
        int num = -1;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> shelterList = new ArrayList<Animal>();
        ArrayList<String> passwordList = new ArrayList<String>();

        while(num != 0)
        {
            System.out.println("1.Input new pet");
            System.out.println("2.Edit pet");
            System.out.println("3.Interact with pets");
            System.out.println("0.Exit");
            System.out.print("Input your options: ");

            num = sc.nextInt();
            sc.nextLine();

            while(num != 0 && num != 1 && num != 2 && num != 3)
            {
                System.out.print("Input invalid please try again: ");
                num = sc.nextInt(); 
                sc.nextLine();
            }

            if(num == 0)
            {
                System.out.println("See you again");
                break;
            }

            else if(num == 1)
            {
                System.out.println("1.Cat");
                System.out.println("2.Dog");
                System.out.print("Would you put a cat or a dog?");

                int pet = sc.nextInt();
                sc.nextLine();
                while(pet != 1 && pet != 2)
                {
                    System.out.print("Invalid option, please try again: ");
                    pet = sc.nextInt();
                    sc.nextLine();
                }

                if(pet == 1)
                {
                    System.out.print("Input animal password: ");
                    String pass = sc.nextLine();
                    passwordList.add(pass);
                    System.out.println("Animal no " + passwordList.size());

                    System.out.print("Input animal name: ");
                    String animalName = sc.nextLine();

                    System.out.print("Input animal color: ");
                    String animalColor = sc.nextLine();

                    System.out.print("Input animal age: ");
                    int animalAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Input animal food: ");
                    String animalFood = sc.nextLine();

                    Animal pet1 = new Cat();
                    shelterList.add(pet1);
                    pet1.setName(animalName);
                    pet1.setColor(animalColor);
                    pet1.setAge(animalAge);
                    pet1.setFood(animalFood);
                }

                else if(pet == 2)
                {
                    System.out.print("Input animal password: ");
                    String pass = sc.nextLine();
                    passwordList.add(pass);
                    System.out.println("Animal no " + passwordList.size());

                    System.out.print("Input animal name: ");
                    String animalName = sc.nextLine();

                    System.out.print("Input animal color: ");
                    String animalColor = sc.nextLine();

                    System.out.print("Input animal age: ");
                    int animalAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Input animal food: ");
                    String animalFood = sc.nextLine();

                    Animal pet1 = new Dog();
                    shelterList.add(pet1);
                    pet1.setName(animalName);
                    pet1.setColor(animalColor);
                    pet1.setAge(animalAge);
                    pet1.setFood(animalFood);
                }
            }

           else if(num == 2)
           {
                count = 0;
                while(true)
                {
                    int no;

                    while(true)
                    {
                        try
                        {
                            System.out.print("Animal number (type 0 to quit): ");
                            no = sc.nextInt();
                            sc.nextLine(); 

                            if(no == 0)
                            {
                               count++;
                               break;
                            }

                            String test = passwordList.get(no - 1);
                            break;
                        }

                        catch(Exception e)
                        {
                            System.out.print("Invalid input please try again: type 0 to quit ");
                            sc.nextLine();
                        }
                    }

                    if(count > 0)
                    {
                        break; 
                    }

                    System.out.print("Input animal password: type 0 to quit ");
                    String no1 = sc.nextLine();

                    while(!no1.equals(passwordList.get(no - 1)))
                    {
                        if(no1.equals("0"))
                        {
                           count++;
                           break;
                        }

                        System.out.print("Invalid input try again: type 0 to quit ");
                        no1 = sc.nextLine();
                    }
                    
                    if(count > 0)
                    {
                        count = 0;
                        break;
                    }

                    while(true)
                    {
                        Animal ex = shelterList.get(no - 1);
                        System.out.println("1.Name");
                        System.out.println("2.Color");
                        System.out.println("3.Food");
                        System.out.println("4.Age");
                        System.out.print("Which trait would you like to edit? type 0 to exit ");
                        int nom = sc.nextInt();
                        sc.nextLine();

                        if (nom == 0) 
                        {
                            count++;
                            break;
                        }

                        while(nom != 1 && nom != 2 && nom != 3 && nom != 4)
                        {
                           System.out.print("Invalid input, try again type 0 to exit: ");
                           nom = sc.nextInt();
                           sc.nextLine();

                           if(nom == 0)
                           {
                              count++;
                              break;
                           }
                        }

                        if(count > 0)
                        {
                            break; 
                        }

                        if(nom == 1)
                        {
                           System.out.print("Type new name here: ");
                           String nm = sc.nextLine();
                           ex.setName(nm);
                           shelterList.set(no - 1, ex);
                        }

                        else if(nom == 2)
                        {
                           System.out.print("Type new color here: ");
                           String nm = sc.nextLine();
                           ex.setColor(nm);
                           shelterList.set(no - 1, ex);
                        }

                        else if(nom == 3)
                        {
                           System.out.print("Type new diet here: ");
                           String nm = sc.nextLine();
                           ex.setFood(nm);
                           shelterList.set(no - 1, ex);
                        }

                        else if(nom == 4)
                        {
                           System.out.print("Type new age here: ");
                           int nm = sc.nextInt();
                           sc.nextLine();
                           ex.setAge(nm);
                           shelterList.set(no - 1, ex);
                        }
                        
                        System.out.println("Update successful!\n");
                    } 
                    
                    if(count > 0) 
                    {
                        count = 0; 
                        break; 
                    }
                }
            }

            else if(num == 3)
            {
                while(true)
                {
                    System.out.print("Animal number: type 0 to quit ");
                    int no;
        
                    while(true)
                    {
                        try
                        {
                            no = sc.nextInt();
                            sc.nextLine();

                            if(no == 0)
                            {
                               count++;
                               break;
                            }

                            String test = passwordList.get(no - 1);
                            break;
                        }

                        catch(Exception e)
                        {
                            System.out.print("Invalid input please try again: type 0 to quit ");
                            sc.nextLine();
                        }
                    }

                    if(count > 0)
                    {
                        count = 0;
                        break;
                    }

                    System.out.println("1.Feed");
                    System.out.println("2.Talk");
                    System.out.println("Choose interaction types: ");
                    int numb = sc.nextInt();
                    sc.nextLine();

                    while(numb != 1 && numb != 2)
                    {
                        System.out.print("Invalid input, please try again");
                        numb = sc.nextInt();
                        sc.nextLine();
                    }

                    if(numb == 1)
                    {
                        System.out.print("Input animal password: type 0 to quit ");
                        String no1 = sc.nextLine();

                        while(!no1.equals(passwordList.get(no - 1)))
                        {
                           if(no1.equals("0"))
                           {
                              count++;
                              break;
                           }

                           System.out.print("Invalid input try again: type 0 to quit ");
                           no1 = sc.nextLine();
                        }
                    
                        if(count > 0)
                        {
                           count = 0;
                           break;
                        }

                        System.out.println("Feed your pet: ");
                        String eat = sc.nextLine();
                        Animal ex = shelterList.get(no - 1);
                        String ex2 = ex.food;

                        while(!eat.equalsIgnoreCase(ex2))
                        {
                            System.out.println("Different diet, try again: ");
                            eat = sc.nextLine();
                        }
                        
                        System.out.print("Your pet ate");
                        ex.eat();
                    }

                    if(numb == 2)
                    {
                        Animal ex = shelterList.get(no - 1);
                        ex.sound();
                    }
                }
            }
        }
    }
}