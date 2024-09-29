import java.unil.Objects;

public class Author {
    private String firstName;
    private String lastName;
    public Author(String firstName, String lastName) {
    }
    public String getFirstName {
        return firstName;
    }
    public String getFirstName {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return Object.equals(firstName, author.firstName) && Object.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Object.hash(firstName, lastName);
    }

    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName'" + lastName + '\'' +
                '+';
    }

}