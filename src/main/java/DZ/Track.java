package DZ;

public class Track implements Obstacles {

    private int length;

    public Track (int length) {
        this.length = length;
    }

    public boolean runTrack(int limit){

        if(length <= limit){
            System.out.printf("The track(%s)  was run!!!\n", length);
            return true;
        }

        System.out.printf("The track(%s) did not run(((((\n", length);
        return false;

    }

}
