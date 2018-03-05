public class League {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.playerName = "Ibraghimovici";

        Player player2 = new Player();
        player2.playerName = "Lincoln";

        Player player3 = new Player();
        player3.playerName = "Ivashka";

        Player[] thePlayer = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "Arsenal";
        team1.playerArray = thePlayer;

        Team team2 = new Team();
        team2.teamName = "Sheriff";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Avganistan";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Lavandos";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Ochikazavr";

        System.out.println( "" );
        System.out.println( team1.teamName + ":" );
        for (Player thePlayers : team1.playerArray) {
            System.out.println( thePlayers.playerName );
        }
        System.out.println( "" );
        System.out.println( team2.teamName + ":" );
        for (Player thePlayers : team2.playerArray) {
            System.out.println( thePlayers.playerName );
        }

        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 12;

        Goal goal2 = new Goal();
        goal2.thePlayer = currGame.homeTeam.playerArray[1];
        goal2.theTeam = currGame.homeTeam;
        goal2.theTime = 23;

        Goal goal3 = new Goal();
        goal3.thePlayer = currGame.homeTeam.playerArray[0];
        goal3.theTeam = currGame.awayTeam;
        goal3.theTime = 55;

        Goal[] theGoals = {goal1, goal2, goal3};
        currGame.goals = theGoals;

        System.out.println( "" );
        System.out.println( "Goals:" );
        for (Goal theGoal : currGame.goals) {
            System.out.println( "Goal scored after " +
                    theGoal.theTime + " mins by " +
                    theGoal.thePlayer.playerName + " of " +
                    theGoal.theTeam.teamName );
        }
    }
}
