package org.gregm.builder;

public class Main {
    public static void main(String[] args) {
        Person frenchman = new FrenchPersonBuilder()
                .create()
                .withName("Tony")
                .withBirthday("22/03/2001")
                .withSize(String.valueOf(175))
                .withTitle(String.valueOf(FrenchPersonBuilder.FrenchTitle.Mme))
                .build();


        System.out.println(frenchman);



        Person americanman = new AmericanPersonBuilder()
                .create()
                .withName("Pablo")
                .withBirthday("11/03/2001")
                .withTitle(AmericanPersonBuilder.EnglishTitle.Mr)
                .withSize(String.valueOf(180))
                .build();

        System.out.println(americanman);
        System.out.println();

        //-----------BUILDER-----------//

        Person americanPerson = new AmericanPersonBuilder01()
                .create()
                .with(builder -> {
                    builder.withName("John Cena");
                    builder.withBirthday("05/20/1985");
                    builder.setTitle(AmericanPersonBuilder01.EnglishTitle.Mr);
                    builder.withSize("175");
                })
                .build();

        System.out.println(americanPerson);

        /*
        L'utilisation de "with(Consumer<AmericanPersonBuilder> builder)" est brillante car elle permet grâce à
        l'usage de l'interface 'Consumer' d'appliquer facilement des modifications à un objet en une unique ligne de
        code. Ce qui permet de rendre le code plus lisible et facile à comprendre
         */
    }
}
