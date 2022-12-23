public class Treasure {
    private static final String GEM="Gems";
    private static final String TROPHY="the Trophy";
    private static final String CROWN="the Crown";
    private static final String DUST="Dust";
    private String treasure;
    public Treasure(){
        int num=(int)(Math.random()*4+1);
        if(num==1){
            treasure=GEM;
        }
        if(num==2){
            treasure=TROPHY;
        }
        if(num==3){
            treasure=CROWN;
        }
        if(num==4){
            treasure=DUST;
        }
    }

    public static boolean collectionHasAllTreasures(String collection){
        boolean hasGem=collection.contains(GEM);
        boolean hasTrophy=collection.contains(TROPHY);
        boolean hasCrown=collection.contains(CROWN);
        return hasGem&&hasTrophy&&hasCrown;
    }

    public String getTreasure(){
        return treasure;
    }

}



