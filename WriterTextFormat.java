public class WriterTextFormat {

    public static String menu() {
        String menu = "\n\n" +
                "********************************************************************************\n\n" +
                "1. Start to fill out your \nupcoming week's schedule \n\n" +
                "2. More info about this program \nand how can this program can help you\n\n" +
                "3. Quit out of the menu and \nprogram without making a schedule" +
                "\n\n********************************************************************************"
                + "\n\n\n\n";
        return menu;
    }

    public static String why() {
        String why = "********************************************************************************\n" +
                "Any modern piece of technology that has some sort of online connectivity can make a\n" +
                "calendar/ schedule. Even a stock phone and even windows and Apple computers come bundled\n" +
                "in with a text app. So why? Well it's the exact same reason why I still prefer cash even though\n" +
                "cards are significantly more convenient. Convenience takes out the struggle. Having to hand type\n" +
                "in your schedule could give you the mental clarity and give your actual schedule significance since\n"
                +
                "you tediously typed it in yourself. Hopefully this application can help you as well.\n\n" +
                "This will now return you to the main menu.\n" +
                "********************************************************************************";
        return why;
    }

    public static void howTo() {
        System.out.println("This program will ask you many questions for your upcoming week's schedule\n");
        System.out.println("When inputing the week dates it would look like (01/06), with the month and then the day");
        System.out.println(
                "All you have to type in is the start date (Monday) and then end date (Sunday)\nEx. \"01/06\" for monday and then \"01/12\" for sunday\n\n");
    }

    public static String breaker() {
        String breaker = "**********************************************************************************";
        return breaker;
    }

    public static String monday() {
        String monday = "********************************** ~~ Monday ~~ **********************************";
        return monday;
    }

    public static String tuesday() {
        String tuesday = "********************************* ~~ Tuesday ~~ **********************************";
        return tuesday;
    }

    public static String wednesday() {
        String wednesday = "******************************** ~~ Wednesday ~~ *********************************";
        return wednesday;
    }

    public static String thursday() {
        String thursday = "********************************* ~~ Thursday ~~ *********************************";
        return thursday;
    }

    public static String friday() {
        String friday = "********************************** ~~ Friday ~~ **********************************";
        return friday;
    }

    public static String saturday() {
        String saturday = "********************************* ~~ Saturday ~~ *********************************";
        return saturday;
    }

    public static String sunday() {
        String sunday = "********************************** ~~ Sunday ~~ **********************************";
        return sunday;
    }

}