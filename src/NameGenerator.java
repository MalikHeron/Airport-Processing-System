import java.util.Random;

public class NameGenerator {
    private static String gender;

    private static final String[] MALE_NAMES = {
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

    private static final String[] FEMALE_NAMES = {
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

    private static final String[] LAST_NAMES = {
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

    private static final String[] GENDER = {"Female", "Male"};

    // Generates a first name
    public static String getFirstName() {
        Random random = new Random();

        if (generateGender().equals("Female"))
            return FEMALE_NAMES[random.nextInt(FEMALE_NAMES.length - 1)];
        else
            return MALE_NAMES[random.nextInt(MALE_NAMES.length - 1)];
    }

    // Generates a last name
    public static String getLastName() {
        Random random = new Random();

        return LAST_NAMES[random.nextInt(LAST_NAMES.length - 1)];
    }

    // Generates a gender
    private static String generateGender() {
        Random random = new Random();

        return gender = GENDER[random.nextInt(GENDER.length)];
    }

    //Getter
    public static String getGender() {
        return gender;
    }
}
