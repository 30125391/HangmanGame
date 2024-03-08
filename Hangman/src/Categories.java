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
        swE = new String[]{"Jedi", "Yoda", "Luke", "Hoth"};
        swM = new String[]{"Jabba", "Han Solo", "Endor", "Droid"};
        swH = new String[]{"Darth Vader", "Republic", "Skywalker", "Tatooine"};

        animalsE = new String[]{""};
        animalsM = new String[]{""};
        animalsH = new String[]{""};

        cartoonE = new String[]{""};
        cartoonM = new String[]{"J"};
        cartoonH = new String[]{""};

        marvelE = new String[]{""};
        marvelM = new String[]{""};
        marvelH = new String[]{""};


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
