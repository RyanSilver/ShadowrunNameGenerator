package com.example.ryan.shadowrunnamegenerator;

/**
 * Created by Ryan on 11/3/2017.
 */

public class nameGenModel{
    //names stored in these fields. fields with extra colums are for a field that can have a different sex.
    private String [][] SovCas={{"Casmale 1","Casmale 2","Casmale 3"},
            {"Casfemale 1","Casfemale 2","Casfemale 3"}};
    private String [][] SovUcas={{"UCasmale 1","UCasmale 2","UCasmale 3"},
            {"UCasfemale 1","UCasfemale 2","UCasfemale 3"}};
    private String [][] SovAgs={{"Agsmale 1","Agsmale 2","Agsmale 3"},
            {"Agsfemale 1","Agsfemale 2","Agsfemale 3"}};
    private String [][] SovAztlan={{"Aztlanmale 1","Aztlanmale 2","Aztlanmale 3"},
            {"Aztlanfemale 1","Aztlanfemale 2","Aztlanfemale 3"}};
    private String [][] SovHongKong={{"HonKongmale 1","HonKongmale 2","HonKongmale 3"},
            {"HonKongfemale 1","HonKongfemale 2","HonKongfemale 3"}};
    private String [][] OriArabic={{"Aribicmale 1","Aribicmale 2","Aribicmale 3"},
            {"Aribicfemale 1","Aribicfemale 2","Aribicfemale 3"}};
    private String [][] OriBritish={{"Britishmale 1","Britishmale 2","Britishmale 3"},
            {"Britishfemale 1","Britishfemale 2","Britishfemale 3"}};
    private String [][] OriFrench={{"Frenchmale 1","Frenchmale 2","Frenchmale 3"},
            {"Frenchfemale 1","Frenchfemale 2","Frenchfemale 3"}};
    private String [][] OriItalian={{"Italianmale 1","Italianmale 2","Italianmale 3"},
            {"Italianfemale 1","Italianfemale 2","Italianfemale 3"}};
    private String [][] OriPolish={{"Polishmale 1","Polishmale 2","Polishmale 3"},
            {"Polishfemale 1","Polishfemale 2","Polishfemale 3"}};
    private String [][] OriSpanish={{"Spanishmale 1","Spanishmale 2","Spanishmale 3"},
            {"Spanishfemale 1","Spanishfemale 2","Spanishfemale 3"}};
    private String [][] OriChinese={{"Chinesemale 1","Chinesemale 2","Chinesemale 3"},
            {"Chinesefemale 1","Chinesefemale 2","Chinesefemale 3"}};
    private String [][] OriAmerican={{"Americanmale 1","Americanmale 2","Americanmale 3"},
            {"Americanfemale 1","Americanfemale 2","Americanfemale 3"}};
    private String [][] OriGerman={{"Germanmale 1","Germanmale 2","Germanmale 3"},
            {"Germanfemale 1","Germanfemale 2","Germanfemale 3"}};
    private String [][] OriJapanese={{"Japanesemale 1","Japanesemale 2","Japanesemale 3"},
            {"Japanesefemale 1","Japanesefemale 2","Japanesefemale 3"}};
    private String [][] OriRussian={{"Russianmale 1","Russianmale 2","Russianmale 3"},
            {"Russianfemale 1","Russianfemale 2","Russianfemale 3"}};
    private String [] Artists={"Artist 1","Artist 2","Artist 3"};
    private String [] Corporations={"corp 1","corp 2","corp 3"};
    private String [] FastFood={"FF 1","FF 2","FF 3"};
    private String [] MrJohnson={"MRJ 1","MRJ 2","MRJ 3"};
    private String [] Runners={"Runner 1","Runner 2","Runner 3"};
    private String [] Bars={"Bar 1","Bar 2","Bar 3"};
    private String [] Esoteric={"BS 1","BS 2","BS 3"};
    private String [] Gangs={"Gang 1","Gang 2","Gang 3"};
    private String [] Triads={"Movie 1","Movie 2","Movie 3"};
    private String [] Shops={"Shop 1","Shop 2","Shop 3"};

    private boolean isSexed(String context){
        boolean isSexed=false;
        if(context.charAt(0)=='S' && context.charAt(1)=='o'){
            isSexed=true;
        }
        if(context.charAt(0)=='O' && context.charAt(1)=='r'){
            isSexed=true;
        }
        return isSexed;
    }
    private String[] getArray(String context){
        switch (context){
            case "Artists":
                return Artists;
            case "Corporations":
                return Corporations;
            case "FastFood":
                return FastFood;
            case "MrJohnson":
                return MrJohnson;
            case "Runners":
                return Runners;
            case "Bars":
                return Bars;
            case "Esoteric":
                return Esoteric;
            case "Gangs":
                return Gangs;
            case "Triads":
                return Triads;
            case "Shops":
                return Shops;
        }
        return null;
    }
    private String [][] getNestedArray(String context){
        String[]splitContext;
        try{
            splitContext=context.split(" ");
        }catch(Exception e){
            System.out.println("There was a problem");
            return null;
        }
        switch (splitContext[0]){
            case "SovCas":
                return SovCas;
            case "SovAgs":
                return SovAgs;
            case "SovUcas":
                return SovUcas;
            case "SovAztlan":
                return SovAztlan;
            case "SovHongKong":
                return SovHongKong;
            case "OriGerman":
                return OriGerman;
            case "OriRussian":
                return OriRussian;
            case "OriPolish":
                return OriPolish;
            case "OriJapanese":
                return OriJapanese;
            case "OriChinese":
                return OriChinese;
            case "OriFrench":
                return OriFrench;
            case "OriArabic":
                return OriArabic;
            case "OriSpanish":
                return OriSpanish;
            case "OriItalian":
                return OriItalian;
            case "OriAmerican":
                return OriAmerican;
            case "OriBritish":
                return OriBritish;
        }
        return null;
    }
    /*
    Method generateName:
    requires context= "some context" + "0" || "1" || "2" if the context is possibly sexed/gendered.
    ex: OriItalian 0
    ex:artists
    returns a name  based on given context variable. 0 for either male or female, 1 for male, and 2 for female.
    */
    public String generateName(String context){
        String name="";
        if (isSexed(context)){
            try{
                String []splitContext=context.split(" ");
                String[][] workingArray = getNestedArray(context);
                int maleOrFemale= Integer.parseInt(splitContext[1]) -1;
                if(maleOrFemale==-1){
                    maleOrFemale= (int) (Math.random() * 2);
                }
                name = workingArray [maleOrFemale] [(int) (Math.random()*workingArray[maleOrFemale].length)];
            }catch (Exception e){
                System.out.println("There was a problem");
                return name;}
        }
        else{
            try {
                String [] workingArray= getArray(context);
                name=workingArray[(int)(Math.random()* workingArray.length)];
            }catch(Exception e){
                System.out.println("There was a problem");
                return name;}
        }
        return name;
    }

    public static void main(String[] args) {
        nameGenModel a = new nameGenModel();
        System.out.println(a.generateName("OriItalian 0"));
    }
}
