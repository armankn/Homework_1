package Exercise_3;

enum Gender {
    MEAL,
    FEMALE,
    OTHER
}

public class Author {
    private String name;
    private String surname;

    void setName(String name){this.name = name;}
    String getName(){return this.name;}

    void setSurname(String surname){this.surname = surname;}
    String getSurname(){return this.surname;}

    void addAuthor(Author author){

    }
}
