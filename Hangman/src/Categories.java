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
        swM = new String[]{"jabba", "vader", "endor", "droid", "xwing"};
        swH = new String[]{"emperor", "republic", "skywalker", "lightsaber","coruscant"};

        animalsE = new String[]{"cat", "duck", "monkey", "hamster", "goat"};
        animalsM = new String[]{"koala", "belugawhale", "shark", "dolphin", "budgie"};
        animalsH = new String[]{"orca", "goblinshark", "aardvark", "wildboar", "elephant"};

        cartoonE = new String[]{"rex", "bambi", "simba", "nemo", "pingu"};
        cartoonM = new String[]{"yogibear", "endnd", "pluto", " garfield", "elmo"};
        cartoonH = new String[]{"flounder", "mufasa", "daleks", "candice", "olaf" };

        marvelE = new String[]{"spiderman", "hulk", "ironman", "blade", "samwilson"};
        marvelM = new String[]{"cyclops", "storm", "iceman", "gambit", "nickfury" };
        marvelH = new String[]{"humantorch", "wonderman", "loki", "nebula", "thanos"};


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