package DZ;

public class Cat implements Participants {

    private String name;
    private int limitRun, limitJump;

    public Cat(String name, int limitRun, int limitJump){
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public boolean run(Track track){
        System.out.printf("%s run\n", name);
        return track.runTrack(limitRun);
    }

    @Override
    public boolean jump(Wall wall){
        System.out.printf("%s jump\n", name);
        return wall.wallJump(limitJump);
    }
}
