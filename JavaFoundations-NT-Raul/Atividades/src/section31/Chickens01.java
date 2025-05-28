package section31;

public class Chickens01 {
    public static void main(String[] args) {
    	int eggsPerChicken=5;
        int chickenCount=3;
        //segunda
        int totalEggs = eggsPerChicken*chickenCount;
        //terça
        totalEggs =totalEggs + (++chickenCount*eggsPerChicken);
        //quarta
        chickenCount = chickenCount/2;
        totalEggs =totalEggs+ eggsPerChicken * chickenCount;
        System.out.println(totalEggs);
        //------------------------------------------
         eggsPerChicken=4;
         chickenCount=8;
        //segunda
         totalEggs = eggsPerChicken*chickenCount;
        //terça
        totalEggs =totalEggs + (++chickenCount*eggsPerChicken);
        //quarta
        chickenCount = chickenCount/2;
        totalEggs =totalEggs+ eggsPerChicken * chickenCount;
        System.out.println(totalEggs);
    }    
}
