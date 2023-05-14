package org.gregm.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class PersonBuilder {
    public static final SimpleDateFormat FRENCH_DATE_FORMAT = new SimpleDateFormat( "dd/MM/yyyy");
    public static final SimpleDateFormat ENGLISH_DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

    protected Person person;

    public PersonBuilder withName(String name){
        person.setName(name);
        return this;
    }
    public PersonBuilder withBirthday(String birthday) {
        try {
            SimpleDateFormat dateFormat = getDateFormat();
            person.setBirthday(dateFormat.parse(birthday));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public PersonBuilder withTitle(String title){
        person.setTitle(title);
        return this;
    }
    public PersonBuilder create(){
        person = new Person();
        return this;
    }
    public Person build(){
        return person;
    }

    protected abstract PersonBuilder withTitle(Enum title);

    protected abstract PersonBuilder withSize(String size);

    protected abstract SimpleDateFormat getDateFormat();

    public enum FrenchTitle {
        M("M."),
        Mme("Mme."),
        Mlle("Mlle.");

        private final String label;

        FrenchTitle(String label) {
            this.label = label;
        }

        public String label() {
            return label;
        }
    }

    public enum EnglishTitle {
        Mr("Mr."),
        Mrs("Mrs."),
        Ms("Ms."),
        Miss("Miss.");

        private final String label;

        EnglishTitle(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
}
