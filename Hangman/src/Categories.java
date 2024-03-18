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
        animalsM = new String[]{"koala", "Parrot", "Shark", "Dolphin", "Budgie"};
        animalsH = new String[]{"Orca", "Alligator", "Aardvark", "Axlotl", "Grizzle bear"};

        cartoonE = new String[]{"Bugs bunny", "Bambi", "Bob the builder", "Nemo", "Peppa pig"};
        cartoonM = new String[]{"Mickey mouse", "Muppets", "Scooby Doo", "Simpsons", "Dora the explorer"};
        cartoonH = new String[]{"Sebastian", "Mufasa", "Anastasia", "Lightening Mcqueen", "Buzz Lightyear" };

        marvelE = new String[]{"Spiderman", "Hulk", "Ironman", "Antman", "Miss marvel"};
        marvelM = new String[]{"Doctor Strange", "Wolverine", "Peter Parker", "Doc Octupus", "Black Panther" };
        marvelH = new String[]{"Crimson crusder", "Hawkeye", "Loki", "nebula", "Thanos"};


        C:\Users\30096255\IdeaProjects\HangmanGame\Hangman\src\Categories.java
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
