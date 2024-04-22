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
        swE = new String[]{"jedi", "yoda", "luke", "hoth","leia"};
        swM = new String[]{ "jabba", "darth vader", "endor", "droid", "x wing"};
        swH = new String[]{"emperor", "republic", "skywalker", "light saber","coruscant"};

        animalsE = new String[]{"cat", "duck", "monkey", "hamster", "goat"};
        animalsM = new String[]{"koala", "beluga whale", "shark", "dolphin", "budgie"};
        animalsH = new String[]{"orca", "goblin shark", "aardvark", "wild boar", "elephant"};

        cartoonE = new String[]{"rex", "bambi", "simba", "nemo", "pingu"};
        cartoonM = new String[]{"yogi bear", "edna", "pluto", " garfield", "elmo"};
        cartoonH = new String[]{"flounder", "mufasa", "daleks", "candice", "olaf" };

        marvelE = new String[]{"spider man", "hulk", "iron man", "blade", "the falcon", "stan lee"};
        marvelM = new String[]{"cyclops", "storm", "iceman", "gambit", "nick fury", };
        marvelH = new String[]{"human torch", "steve ditko", "loki", "nebula", "thanos", "jack kirby"};

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