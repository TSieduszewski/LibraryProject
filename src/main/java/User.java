
public class User {
    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name.toUpperCase();
        this.surname = surname.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getSurname() {
        return surname.toUpperCase();
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }

    // Walidacja imienia
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-ZąćęłńóśźżĄĘŁŃÓŚŹŻ][a-zA-ZąćęłńóśźżĄĘŁŃÓŚŹŻ]*");
    }

    // Walidacja nazwiska
    public static boolean validateLastName(String lastName) {
        return lastName.matches("[a-zA-ząćęłńóśźżĄĘŁŃÓŚŹŻ]+(['-][a-zA-ZąćęłńóśźżĄĘŁŃÓŚŹŻ]+)*");
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}