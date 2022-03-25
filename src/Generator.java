import java.util.Random;

public class Generator {
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
    private static String gender;

    // Generates a first name
    private static String getFirstName() {
        Random random = new Random();

        if (generateGender().equals("Female"))
            return FEMALE_NAMES[random.nextInt(FEMALE_NAMES.length)];
        else
            return MALE_NAMES[random.nextInt(MALE_NAMES.length)];
    }

    // Generates a last name
    private static String getLastName() {
        Random random = new Random();

        return LAST_NAMES[random.nextInt(LAST_NAMES.length)];
    }

    // Generates a gender
    private static String generateGender() {
        Random random = new Random();

        return gender = GENDER[random.nextInt(GENDER.length)];
    }

    // Generates a Priority
    private static int generatePriority() {
        return (int) (Math.random() * (2) + 1);
    }

    // Generates a Flight Number
    private static int generateFlightNo() {
        return (int) (Math.random() * (1000) + 1);
    }

    // Generates an Id
    private static int generateId() {
        return (int) (Math.random() * (1000) + 1);
    }

    // Generates a list of customers
    public static void generateCustomers(LinkedList customerList) {
        System.out.println("Generating Customers...\n");
        for (int time = 0; time <= 2; time++) {
            System.out.println("Arrivals at t = " + time);

            // Generate a random number of customers from 1 to 6
            for (int i = 0; i < (int) (Math.random() * (6) + 1); i++) {
                customerList.insert(new Customer(generateId(), getFirstName(), getLastName(),
                        getGender(), generateFlightNo(), generatePriority(), time));
            }
            System.out.println();
        }
        System.out.println("Sorting...\n");
        Sorting.sortByPriority(customerList);
        Sorting.sortByTime(customerList);
    }

    // Getters
    public static String getGender() {
        return gender;
    }
}
