package RocketLeague;
public class Game {
    int time;
    int blueScoreBoard;
    int redScoreBoard;
    Car carOneRed;
    Car carTwoRed;
    Car carThreeBlue;
    Car carFourBlue;

    public Game(int time, int blueScoreBoard, int redScoreBoard, Car carOneRed, Car carTwoRed, Car carThreeBlue, Car carFourBlue ) {
        this.time = 300;
        this.blueScoreBoard = 0;
        this.redScoreBoard = 0;
        this.carOneRed = carOneRed;
        this.carTwoRed = carTwoRed;
        this.carThreeBlue = carThreeBlue;
        this.carFourBlue = carFourBlue;
        carOneRed.changeAlianceColor("Red");
        carTwoRed.changeAlianceColor("Red");
        carThreeBlue.changeAlianceColor("Blue");
        carFourBlue.changeAlianceColor("Blue")
    }
}