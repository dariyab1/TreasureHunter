public class Treasure {
    private static final String POTION="Potions";
    private static final String SWORD="the Sword";
    private static final String TOME="the Ancient Tome";
    private static final String DUST="Dust";
    private String treasure;
    public Treasure(){
        int num=(int)(Math.random()*4+1);
        if(num==1){
            treasure=POTION;
        }
        if(num==2){
            treasure=SWORD;
        }
        if(num==3){
            treasure=TOME;
        }
        if(num==4){
            treasure=DUST;
        }
    }

    public static boolean collectionHasAllTreasures(String collection){
        boolean hasGem=collection.contains(POTION);
        boolean hasTrophy=collection.contains(SWORD);
        boolean hasCrown=collection.contains(TOME);
        return hasGem&&hasTrophy&&hasCrown;
    }

    public String getTreasure(){
        return treasure;
    }

}



