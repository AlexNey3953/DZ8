package DZ;

public class App {

    public static void main(String[] args) {

        Participants[] participants = {
                new Human("Arnold", 200, 200),
                new Human("Belov", 30, 20),
                new Cat("Kati", 5, 10),
                new Cat("Myrka", 6, 8),
                new Robot("Android", 150, 150),
                new Robot("Robot", 120, 120),
        };

        Obstacles[] obstacles =  {
                        new Track(1),
                        new Wall(1),
                        new Track(5),
                        new Wall(5),
                        new Track(10),
                        new Wall(10),
                        new Track(20),
                        new Wall(20),
                        new Track(40),
                        new Wall(40),
                        new Track(80),
                        new Wall(80),
                        new Track(100),
                        new Wall(100),
                        new Track(130),
                        new Wall(130),
                        new Track(160),
                        new Wall(160),
                        new Track(199),
                        new Wall(199),

        };

        for (Participants participant : participants) {

            for(int i=0; i<obstacles.length-1; i++){

               if (obstacles[i] instanceof Track) {
                   if (!participant.run((Track) obstacles[i])) break;
               }

               if (obstacles[i] instanceof Wall) {
                   if(!participant.jump((Wall) obstacles[i])) break;
               }

            }

        }


    }
}
