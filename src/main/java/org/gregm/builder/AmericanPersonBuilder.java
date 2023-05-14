package org.gregm.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AmericanPersonBuilder extends PersonBuilder {

    public static final String AMERICAN_DATE_FORMAT = "MM/dd/yyyy";

    public enum EnglishTitle{
        Mr,
        Mrs,
        Ms,
        Miss
    }
    public static double convertCmToFeet(double heightInCm) {
        double heightInFeet = heightInCm / 30.48;
        return heightInFeet;
    }

    @Override
    protected AmericanPersonBuilder withTitle(Enum title) {
        person.setTitle(((EnglishTitle)title).name());
        return this;
    }

    @Override
    protected AmericanPersonBuilder withSize(String size) {
        person.setSize(convertCmToFeet(Double.parseDouble(size)));
        return this;
    }

    @Override
    protected SimpleDateFormat getDateFormat() {
        return  new SimpleDateFormat(AMERICAN_DATE_FORMAT);
    }
}
