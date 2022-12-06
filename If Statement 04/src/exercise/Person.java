package exercise;

public class Person {

    int age;
    public Person(){
        int random = (int) Math.floor(Math.random()*(80-5+1)+5);
        System.out.println(random);
        age = random;
    }

    public void getLifeStage(){
        if(age <= 12){
            System.out.println("Is a child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Is a teen");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Is an adult");
        } else if (age >= 60) {
            System.out.println("Is a senior adult");
        }
    }


}

    /*define a class called exercise.Person that has:
        1 instance variable:
        an integer age
        a constructor method that:
        generates and prints a random value using Math.floor(Math.random()*(max-min+1)+min), where min=5 and max=80
        assigns the random value to the instance variable (remember to do a narrowing casting)
        a method getLifeStage that returns a string about the life stage of the exercise.Person:
        <=12 is a Child
        13-19 is a Teen
        20-59 is an Adult
        +60 is a Senior Adult
        define a testing class where you:
        create a Person
        call the getLifeStage method and print the result: The person is in the X stage of life*/
