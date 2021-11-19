package DZ;

public class Wall implements Obstacles {

    private int height;

    public Wall(int height){
        this.height = height;
    }

    public boolean wallJump(int limit){

        if(height <= limit){
            System.out.printf("The wall(%s) is jumped over!!!\n", height);
            return true;
        }

        System.out.printf("The wall(%s) is not passed(((((\n", height);
        return false;

    }
}
