package org.gregm.builder;

import org.gregm.builder.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.function.Consumer;

public class AmericanPersonBuilder01 {

    public static final SimpleDateFormat ENGLISH_DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

    private Person person;

    public static double convertCmToFeet(double heightInCm){
        double heightInFeet = heightInCm / 30.48;
        return heightInFeet;
    }
    public enum EnglishTitle{
        Mr,
        Mrs,
        Ms,
        Miss
    }

    public AmericanPersonBuilder01 withName(String name){
        person.setName(name);
        return this;
    }

    public AmericanPersonBuilder01 withBirthday(String birthday){
        try {
            person.setBirthday(ENGLISH_DATE_FORMAT.parse(birthday));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return this;
    }
    public AmericanPersonBuilder01 setTitle(EnglishTitle title){
        person.setTitle(title.name());
        return this;
    }

    public AmericanPersonBuilder01 withSize(String size){
        person.setSize(convertCmToFeet(Double.parseDouble(size)));
        return this;
    }

    public AmericanPersonBuilder01 create(){
        person = new Person();
        return this;
    }
    public Person build(){
        return person;
    }

    public AmericanPersonBuilder01 with(Consumer<AmericanPersonBuilder01> builder){
        builder.accept(this);
        return this;
    }
    /*
1. L'usage de 'with' permet d'initialialiser le builder de l'objet AmericanPersonBuilder .

2. La méthode 'with' prend ensuite en paramètre un objet 'Consumer<AmericanPersonBuilder> builder', comportant l'interface
fonctionnelle Consumer prennant en entrée le type AmericanPersonBuilder et ne renvoie rien en sortie.

3. Par la suite, en utilisant la méthode 'accept' de l'objet builder créer précédemment et transmis à 'with' pour y
appliquer les modifications liés à l'objet AmericanPersonBuilder.

4. La méthode 'accept' récupère en paramètre l'objet 'AmericanPersonBuilder', qui est modifié par la méthode accept elle-même.

5. Cette méthode 'accept' ne renvoie rien en sortie, mais les modifications apportées à l'objet AmericanPersonBuilder sont
prises en compte

6. Enfin, 'with' renvoie de nouveau l'objet 'AmericanPersonBuilder', où de nouvelles modifications peuvent être appliqué
en faisant de nouveau appel à la méthode 'with'.
     */
}
