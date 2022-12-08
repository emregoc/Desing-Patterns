public class Main {
    public static void main(String[] args) {

        // Constructor ile ilk kullanim sekli

        // kaynak : https://tugrulbayrak.medium.com/builder-pattern-2f6fb1dbf4a0

        Person person = new Person.Builder().name("Emre").surname("Goc").address("Turkiye").build();
        System.out.println(person.getName() + " " + person.getSurname() +
                   " " + person.getAddress() + " " + person.getClass());
    }
}