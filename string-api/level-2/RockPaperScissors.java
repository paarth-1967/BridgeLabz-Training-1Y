import java.util.Scanner;

public class RockPaperScissors {

    // b. Method to find computer choice
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);

        if (choice == 0)
            return "rock";
        else if (choice == 1)
            return "paper";
        else
            return "scissors";
    }

    // c. Method to find winner
    // Returns: "User", "Computer", or "Draw"
    public static String findWinner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if (user.equals("rock") && computer.equals("scissors") ||
            user.equals("paper") && computer.equals("rock") ||
            user.equals("scissors") && computer.equals("paper"))
            return "User";

        return "Computer";
    }

    // d. Method to calculate average and percentage
    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", compPercent) + "%";

        return stats;
    }

    // e. Method to display game results and stats
    public static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("----------------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                games[i][0] + "\t" +
                games[i][1] + "\t\t" +
                games[i][2]
            );
        }

        System.out.println("\nWin Statistics:");
        System.out.println("Player\tWins\tWinning %");
        System.out.println("----------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                stats[i][2]
            );
        }
    }

    // f. Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int gamesCount = sc.nextInt();

        String[][] games = new String[gamesCount][3];

        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < gamesCount; i++) {

            System.out.print("\nGame " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) compWins++;

            games[i][0] = userChoice;
            games[i][1] = computerChoice;
            games[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, gamesCount);

        displayResults(games, stats);

        sc.close();
    }
}
