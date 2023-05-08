import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet earth = new Earth();
        Planet jupiter = new Jupiter();
        Planet mars = new Mars();
        Planet mercury = new Mercury();
        Planet neptune = new Neptune();
        Planet saturn = new Saturn();
        Planet uranus = new Uranus();
        Planet venus = new Venus();
        

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer rocket = new RocketExplorer();

        earth.accept(astronaut);
        jupiter.accept(astronaut);
        mars.accept(astronaut);
        mercury.accept(astronaut);
        neptune.accept(astronaut);
        saturn.accept(astronaut);
        uranus.accept(astronaut);
        venus.accept(astronaut);

        earth.accept(rover);
        jupiter.accept(rover);
        mars.accept(rover);
        mercury.accept(rover);
        neptune.accept(rover);
        saturn.accept(rover);
        uranus.accept(rover);
        venus.accept(rover);

        earth.accept(rocket);
        jupiter.accept(rocket);
        mars.accept(rocket);
        mercury.accept(rocket);
        neptune.accept(rocket);
        saturn.accept(rocket);
        uranus.accept(rocket);
        venus.accept(rocket);
    }
}