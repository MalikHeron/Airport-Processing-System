import java.util.Random;

public class NameGenerator {
    private static String[] MALE_NAMES = {
            "Liam",
            "Noah",
            "Oliver",
            "Elijah",
            "William",
            "James",
            "Benjamin",
            "Lucas",
            "Henry",
            "Alexander",
            "Mason",
            "Michael",
    };

    private static String[] FEMALE_NAMES = {
        "Emma",
        "Ava",
        "Charlotte",
        "Sophia",
        "Amelia",
        "Isabella",
        "Mia",
        "Evelyn",
        "Harper",
        "Camila",
        "Gianna",
        "Abigail",
    };

    private static String[] LAST_NAMES = {
        "Smith",
        "Johnson",
        "Williams",
        "Brown",
        "Jones",
        "Garcia",
        "Miller",
        "Davis",
        "Rodriguez",
        "Martinez",
        "Hernandez",
        "Lopez",
    };

    // generates a first name
    public static String getFirstName(String gender) {
        Random random = new Random();

        if (gender.equals("Female"))
            return FEMALE_NAMES[random.nextInt(FEMALE_NAMES.length - 1)];
        else
            return MALE_NAMES[random.nextInt(MALE_NAMES.length - 1)];
    }

    // generates a last name
    public static String getLastName() {
        Random random = new Random();

        return LAST_NAMES[random.nextInt(LAST_NAMES.length - 1)];
    }
    
}
