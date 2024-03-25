public class Categories {
    private String[] swE;
    private String[] swM;
    private String[] swH;
    private String[] animalsE;
    private String[] animalsM;
    private String[] animalsH;
    private String[] cartoonE;
    private String[] cartoonM;
    private String[] cartoonH;
    private String[] marvelE;
    private String[] marvelM;
    private String[] marvelH;


    public void SetCategories() {
        swE = new String[]{"Jedi", "Yoda", "Luke", "Hoth","R2D2"};
        swM = new String[]{"Jabba", "Han Solo", "Endor", "Droid", "Chopper"};
        swH = new String[]{"Darth Vader", "Republic", "Skywalker", "Tatooine","Coruscant"};

        animalsE = new String[]{"Cat", "Duck", "Monkey", "Hamster", "Goat"};
        animalsM = new String[]{"Koala", "Parrot", "Shark", "Dolphin", "Budgie"};
        animalsH = new String[]{"Orca", "Alligator", "Aardvark", "Axolotl", "Grizzly Bear"};

        cartoonE = new String[]{"Bugs Bunny", "Bambi", "Bob The Builder", "Nemo", "Peppa Pig"};
        cartoonM = new String[]{"Mickey Mouse", "Muppets", "Scooby Doo", "Simpsons", "Dora The Explorer"};
        cartoonH = new String[]{"Sebastian", "Mufasa", "Anastasia", "Lightening McQueen", "Buzz Lightyear" };

        marvelE = new String[]{"Spider-man", "Hulk", "Ironman", "Antman", "Ms Marvel"};
        marvelM = new String[]{"Doctor Strange", "Wolverine", "Peter Parker", "Doctor Octopus", "Black Panther" };
        marvelH = new String[]{"Crimson Crusder", "Hawkeye", "Loki", "Nebula", "Thanos"};

    }

    public String[][] getCategories() {
        String[][] categories = new String[12][];
        categories[0] = swE;
        categories[1] = swM;
        categories[2] = swH;
        categories[3] = animalsE;
        categories[4] = animalsM;
        categories[5] = animalsH;
        categories[6] = cartoonE;
        categories[7] = cartoonM;
        categories[8] = cartoonH;
        categories[9] = marvelE;
        categories[10] = marvelM;
        categories[11] = marvelH;
        return categories;
    }

    public static void main(String[] args) {


    }
}
