package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "TenFiveZero.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        //change this
        //List listOfStudents = programObject. loadCSVFile(student_source);
        List listOfStudents = programObject.handWrittenLoadOfData();

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        //Person newPerson = new Person(values[0], values[1], values[2], values[3], values[4], values[5]);
        //return newPerson;
        return null;
    }
    // copy from here...
    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        Person newPerson1 = new Person("Peter", "Van Beever");
        newPerson1.setColor("Purple");
        newPerson1.setMonth("February");
        newPerson1.setBeverage("Latte");
        newPerson1.setPets(true);
        students.add(newPerson1);

        Person newPerson2 = new Person("Teddy", "Archibald");
        newPerson2.setColor("Red");
        newPerson2.setMonth("September");
        newPerson2.setBeverage("Water");
        newPerson2.setPets(false);
        students.add(newPerson2);

        Person newPerson3 = new Person("Tim", "Linkous");
        newPerson3.setColor("Green");
        newPerson3.setMonth("March");
        newPerson3.setBeverage("Water");
        newPerson3.setPets(false);
        students.add(newPerson3);

        Person newPerson4 = new Person("Qian", "Wang");
        newPerson4.setColor("Blue");
        newPerson4.setMonth("October");
        newPerson4.setBeverage("Water");
        newPerson4.setPets(false);
        students.add(newPerson4);

        Person newPerson5 = new Person("Jonathan", "Diehl");
        newPerson5.setColor("Green");
        newPerson5.setMonth("February");
        newPerson5.setBeverage("Coffee");
        newPerson5.setPets(true);
        students.add(newPerson5);

        Person newPerson6 = new Person("Diptika", "Devi");
        newPerson6.setColor("Orange");
        newPerson6.setMonth("June");
        newPerson6.setBeverage("Tea");
        newPerson6.setPets(false);
        students.add(newPerson6);

        Person newPerson7 = new Person("Ian", "Gordon");
        newPerson7.setColor("Green");
        newPerson7.setMonth("April");
        newPerson7.setBeverage("Water");
        newPerson7.setPets(true);
        students.add(newPerson7);

        Person newPerson8 = new Person("Tim", "Nguyen");
        newPerson8.setColor("White");
        newPerson8.setMonth("November");
        newPerson8.setBeverage("Bubble Tea");
        newPerson8.setPets(true);
        students.add(newPerson8);

        Person newPerson9 = new Person("Bryan", "Smith");
        newPerson9.setColor("Brown");
        newPerson9.setMonth("November");
        newPerson9.setBeverage("Water");
        newPerson9.setPets(false);
        students.add(newPerson9);

        Person newPerson10 = new Person("Jared", "Thacker");
        newPerson10.setColor("Green");
        newPerson10.setMonth("December");
        newPerson10.setBeverage("Water");
        newPerson10.setPets(true);
        students.add(newPerson10);

        Person newPerson11 = new Person("Robbie", "Niemeyer");
        newPerson11.setColor("Blue");
        newPerson11.setMonth("January");
        newPerson11.setBeverage("Water");
        newPerson11.setPets(false);
        students.add(newPerson11);

        Person newPerson12 = new Person("Mohammed", "N");
        newPerson12.setColor("Blue");
        newPerson12.setMonth("Janurary");
        newPerson12.setBeverage("Water");
        newPerson12.setPets(false);
        students.add(newPerson12);

        Person newPerson13 = new Person("Josue", "Castro");
        newPerson13.setColor("Blue");
        newPerson13.setMonth("Janurary");
        newPerson13.setBeverage("Coffee");
        newPerson13.setPets(true);
        students.add(newPerson13);

        Person newPerson14 = new Person("Coreye", "Ross");
        newPerson14.setColor("Black");
        newPerson14.setMonth("October");
        newPerson14.setBeverage("Water");
        newPerson14.setPets(false);
        students.add(newPerson14);

        Person newPerson15 = new Person("Will", "Chapman");
        newPerson15.setColor("Purple");
        newPerson15.setMonth("December");
        newPerson15.setBeverage("Water");
        newPerson15.setPets(false);
        students.add(newPerson15);
//        Will, Chapman,Water,Purple,December,No

         //and so on for EACH person in the cohort.

        return students;
    }
    //...to here. Paste below the `getRecordFromLine()` method in Main.java
}
