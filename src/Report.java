public class Report {

    private static final int[][] maleCounter = new int[3][3];
    private static final int[][] femaleCounter = new int[3][3];

    public static void generateReport(LinkedList customerList) {
        Node currNode = customerList.head;

        if (customerList.head != null) {
            while (currNode != null) {
                // Check gender of customer
                if (currNode.data.getGender().equals("Male")) {
                    // Increase male count by 1 for respective level and time
                    maleCounter[currNode.data.getPriorityNo()][currNode.data.getTime()]++;
                } else {
                    // Increase female count by 1 for respective level and time
                    femaleCounter[currNode.data.getPriorityNo()][currNode.data.getTime()]++;
                }
                // Go to next node
                currNode = currNode.next;
            }

            System.out.println("Generating Report...\n");
            // Display calculations for each level at each time
            for (int level = 1; level <= 2; level++) {
                System.out.println("Number of level " + level + " males on each flight");

                for (int time = 0; time <= 2; time++) {
                    System.out.println("Time " + time + ": " + maleCounter[level][time]);
                }

                System.out.println("\nNumber of level " + level + " females on each flight");

                for (int time = 0; time <= 2; time++) {
                    System.out.println("Time " + time + ": " + femaleCounter[level][time]);
                }

                System.out.println();
            }
        }
    }
}
