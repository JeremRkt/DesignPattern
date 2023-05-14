package org.gregm.builder;

import java.text.SimpleDateFormat;

public class FrenchPersonBuilder extends  PersonBuilder{

    public static final String FRENCH_DATA_FORMAT = "dd/MM/yyyy";

    public enum FrenchTitle{
        M,
        Mme,
        Mlle;
    }

    @Override
    protected FrenchPersonBuilder withTitle(Enum title) {
        person.setTitle(((FrenchTitle) title).name());
        return this;
    }

    @Override
    protected FrenchPersonBuilder withSize(String size) {
        person.setSize(Double.parseDouble(size));
        return this;
    }

    @Override
    protected SimpleDateFormat getDateFormat() {
        return new SimpleDateFormat(FRENCH_DATA_FORMAT);
    }

}
