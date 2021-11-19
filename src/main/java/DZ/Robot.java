package DZ;

public class Robot implements Participants {

    private String name;
    private int limitRun, limitJump;

    public Robot(String name, int limitRun, int limitJump){
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    public boolean run(Track track){
        System.out.printf("%s run\n", name);
        return track.runTrack(limitRun);
    }

    public boolean jump(Wall wall){
        System.out.printf("%s jump\n", name);
        return wall.wallJump(limitJump);
    }
}
