package com.example.ryan.shadowrunnamegenerator;

/**
 * Created by Ryan on 11/3/2017.
 */

public class nameGenModel{
    //names stored in these fields. fields with extra colums are for a field that can have a different sex.
    private String [][] SovCas={{"Senor Mihai Abdelkarim Larsen", "Hugh Jackson-Giles", "Emilio Jose Nabil Peralta", "Cody Antonio Boyer-Beltran", "George Andrews", "Ryan Tapia-Julian", "Luis Carlos Martinez", "Erik Lee Barrientos-Boyd", "Senor Francisco Rafael Sepulveda", "Senor Rayco Cherry-Briggs", "Joan Carles Turner-Torres", "Roberto Carlos Cohen-Ortiz", "Volodymyr Tudela", "Senor Laureano Valls", "Tyrone Moses", "Theodore Camara", "Guy Ford", "Juan Pedro Lin-Bautista", "Jorge Munoz", "Senor Enrique Jose Stout-Roca", "Cory Nicanor Lara", "Alvin Alejo Dunlap-Sacristan", "Jose Juan Alvarado", "Angel Francisco Jose Javier Schultz", "Eric Atanasio Egea", "Senor Joaquin Roca", "Juan Cruz Sancho", "Marion Francisco Juan Lozano", "Isaac Curtis", "Senor Gustavo Adolfo Gallardo", "Manuel Jesus Petersen", "Gines Wong-Camino", "Gerardo Mcdaniel", "Marvin Ruben Madden", "Cecil Castilla", "Leopoldo Kent-Angulo", "Jose Daniel Victor Manuel Costa", "Rodney Candido Chen", "Antonio Francisco Toribio-Perkins", "Christopher Rico-Puig", "Viorel Manas    Andrea Kirk", "Dwayne Ponce-Moran", "Ronald Reeves-Davidson", "Reginald Kelly Patton", "Josep Antoni Montoya", "Daniel Buchanan-Frost", "Craig Vaca-Carr", "Fortunato Jordi Maldonado", "Beltran Gonzalez", "Delfin Jordan Clark", "Eric Sanchis", "Heliodoro Quiroga-Parker", "Danny Branch-Allen", "Senor Angel Antonio Ball", "Randall Aguilar", "Ricky Herbert Baena", "Derek Marcelino Cobos", "Dwight Espejo", "Sean Gaines-Potter", "Senor Pablo Jose Florian Santiago", "Guy Ricardo Jose Paris", "Jesus Francisco Stein-Tucker", "Julio Escudero-Toro", "Jay Castaneda", "Dean Hawkins-Castro", "Franklin Luis Fernando Cordova-Quinones", "Javier Antonio Kramer", "Eugene Muniz-Figueroa", "Tommy Roy Castillo", "Bill Beltran Summers", "Chris Fernandez", "Roland Hill", "Arnold Tapia", "Justin Angel Jose Calatayud", "Sean Sampedro", "Kirk Frances", "Lucio Ochoa", "Abdelaziz Gisbert", "Jamie Snyder", "Senor Eder Amador", "Adam Ripoll", "Jose Mariano Gordillo", "Arnau Sergio Vicente", "Eduard White", "Ismail Olmos", "Yahya Mena", "Emilio Zaragoza", "Clarence Mclaughlin-Dawson", "Florin Willis", "Brad Abdoulaye Alonso", "Senor Miguel Antonio Olivares-Echeverria", "Clayton Henry Trujillo-Lang", "Gilbert Eugene Russell", "Willie Del Campo-Estevez", "Mihai Baeza", "Rick Kennedy", "Harold Mcdaniel", "Raul Fritz", "Charlie Robertson", "Silverio Marin", "Amin Tapia-Waller", "Unai Collins-Cerdan", "Abdelaziz Joyce", "Eduard Montenegro", "Senor Bogdan Walter Osborn-Latorre", "Bernard Mohamed", "Jeremy Troy Mathews-Sebastian", "Roland Bass", "Franklin Jamie Monteagudo", "Dustin Montero", "Ioan Ballard", "Guillermo Francisco Jose Short", "Joe Rafael Popa-Fletcher", "Chester Venancio Sanders", "Adil Carpio", "Alexander Angel Maria Hendrix", "Salah Micheal Peiro", "Edward Corral", "Victor Henry Terry"},
            {"Mariola Gumersinda Fuller", "SenoraRosario Maria Gardner", "Cleo Gimenez-Walters", "Agnes Bridges", "Katrina Blankenship-Souto", "Carolina Lynne Beck-Izquierdo", "Agnes Eulogia Cuellar", "Maria Marta Marlene Soler", "Gwendolyn Combs", "Sylvia Joana Prince-Jerez", "Mayra Ana Victoria Sacristan", "Ericka Segura", "Rose Llanos", "Juliana Abril", "Bernardina Alvarez", "Elena Maria Cherie Arteaga", "Lesley Lozano-Vazquez", "Melissa Freire", "Keisha Ashlee Herrero", "Julieta Revuelta", "Therese Bennett-Torralba", "Gracia Adela Booker", "SenoraMarta Maria Hermoso-Cole", "Carmen Maria Patterson-Castano", "Brenda Maria Dolors Burton-Mejia", "Leyre Genoveva Wolf", "Florica Gisbert-Sims", "Alberta Miranda Gordillo-Hunt", "Lidia Valle", "Samanta Felipe", "Leyre Burgos-Molina", "SenoraMaria Angustias Cornelia Cubero", "Maria Amparo Barbra Espin", "Luz Divina Frey", "Maria Cinta Rodenas-Morillas", "Shana Velasquez", "Katelyn Lois Chamorro-Spears", "Maria Azucena Matthews-Mesa", "Maria Sol Parsons", "Oksana Marti-Brandt", "Caitlin Gordo-Richard", "Leanna Castellano-Murillo", "Nerea Mcguire", "Tania Holt-Carro", "Herminia Victoriana Hensley", "SenoraEstela Barron-Dickerson", "Erica Newton-Angulo", "Kristi Reid", "Daisy Willa Ochoa-Galindo", "Edwina Martinez", "Isabel Gibson", "Catalina Gordon", "Maria Merce Travis-Moral", "Della Esmeralda Khan", "Gilda Wilkerson-Quiroga", "SenoraAurea Madge Palomino", "Maria Alejandra Sondra Morrison-Sparks", "SenoraNahia Lawson", "Sadie Prat-Curry", "Cora Ruiz", "Merle Blanca Esther Waller", "Jill Cooke", "Bianca Escobar-Borja", "Martha Cole-Huff", "Maribel Gordo-Stuart", "SenoraLatifa Patel", "Camelia Mayoral-Mccormick", "Uxue Maria Reyes Pavon", "Eneritz Rovira", "Maria Luisa Amado", "Najat Felipa Huber", "Kerri Laurel Oliveira", "Lindsay Roberson", "Colette Duran", "Roberta Tomas-Aguado", "Lawanda Reilly-Bastida", "Yasmin Ordonez", "Valerie Guadalupe Ingram", "Paige Vaca-Hayden", "Celeste Vilches", "Candida Maria Julia Serrano", "Ascension Alicia Maria Roig", "Modesta Monroe-Gisbert", "SenoraHilaria Alegre", "Bouchra Alvarado", "Reyna Nora Molinero", "Kellie Jennifer Maroto", "Dorina Felipe", "Viola Lessie De La Cruz", "Angelique Aragon", "Emma Valiente", "Elizabeth Cohen", "Leola Vega-Pavon", "Monica Burgos", "Jeanine Morris", "Eva Maria Courtney Bennett", "Graciela Mcgrath", "Ivet Real", "Maria Vicenta Blackwell-Hammond", "Eider Marianne Salazar", "Rosa Elena Duran", "Earlene Montesinos", "Louisa Mills-Boix", "Nicoleta Maria Monserrat Alfonso", "Maria Loreto Exposito", "Thelma Maximina Dillon", "SenoraMaria Begona Ana Rosa Mata-Velasco", "June Kristina Carro", "Barbara Soriano", "Iluminada Lorraine Howe", "Palmira Maria Estrella Suarez", "Karen Mariya Cooley", "Adriana Reeves", "Aileen Mathis-Bilbao", "Camelia Roberson", "SenoraMaria Ines Ana Lucia Pellicer-Bishop", "Melanie Richmond-Macia", "Caroline Bruce", "Amina Saez", "Manuela Espinosa", "SenoraAurea Segura", "Christine Isidra Cuadrado", "Josefina Wood-Checa", "SenoraDesire Compton", "Reyes Baird-Carrascosa", "Juliana Carr-Ferrera", "SenoraMiren Edurne Alcazar", "Jeanine Valentine-Stevens", "Iris Mcneil", "Irati Charmaine Canales", "SenoraNerea Barea", "Daria Roy-Sanchis", "Anastasia Lauri Baker-Stephenson", "Frances Cabrera", "Consuelo Melgar-Holder", "Patsy Tucker-Afonso", "Robyn Coleman", "SenoraMaria Adoracion Maria Celeste Escobar", "SenoraBouchra Polo-De La Rosa", "Beth Mirella Watson", "Aldara Short-Echevarria", "Polly Maria Estela Mcdaniel-Bermejo", "Emilia Angelia Schmitt", "SenoraAina Lane-Cooper", "Minerva Yague", "Maria Lorena Hunt", "Bianca Valls", "Yara Bolton-Bustamante", "Maria Milagrosa Eulogia Caamano-Horne", "SenoraOlga Damaris Luis-Good", "Mirela Martha Cecilia Mckee", "Leola Ortiz", "Stacie Serra-Beltran", "Bibiana Woods-Richards", "Beverly Casares", "Modesta Zhou", "Lilly Desiree Barros-Gordon", "Dominique Morrow", "Annette Davenport-Sala", "Taylor Juana Maria Gimeno-Knight", "Annette Novak", "SenoraZoraida Gamero-Hunt", "Tracie Palomares-Francisco", "Maria Pino Emma Cordoba", "Rosetta Gilmore-Myers", "Habiba Mann-Frost", "SenoraMaria Paloma Torrejon-Callahan", "Zaida Celia Maria Whitney", "Ileana Lia Chase-Sacristan", "Jeronima Frederick", "SenoraGina Serrano-Pelaez", "SenoraJanire Canas-Luis", "Mariona Alma Ritter-Mclaughlin", "Alisha Nieves", "Belen Jimenez", "Dolores Maria Sexton-Abril", "Selene Sarmiento-Carretero", "Gumersinda Palmer", "Nona Espana", "SenoraYolanda Maria Glenna Guerrero", "Izaskun Sabater", "Therese Olsen", "Anne Campillo-Salas", "Delfina Walton", "Jodie Padilla-Shannon", "SenoraEmma Francisca Maria Amoros", "Marianne Black", "Gema Ocana-Duran", "Eider Matthews", "Estella Felecia Mas-Leon", "Maya House-Bradshaw", "Francesca Juliette Saez-Shields", "Raquel Roldan-Calderon", "Kathryn Terrie Popa", "Rosanna Padron"}};
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
    private String [] Trids={"Movie 1","Movie 2","Movie 3"};
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
            case "Trids":
                return Trids;
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
            case "SovUca":
                return SovUcas;
            case "SovAzt":
                return SovAztlan;
            case "SovHon":
                return SovHongKong;
            case "OriGer":
                return OriGerman;
            case "OriRus":
                return OriRussian;
            case "OriPol":
                return OriPolish;
            case "OriJap":
                return OriJapanese;
            case "OriChi":
                return OriChinese;
            case "OriFre":
                return OriFrench;
            case "OriAra":
                return OriArabic;
            case "OriSpa":
                return OriSpanish;
            case "OriIta":
                return OriItalian;
            case "OriAme":
                return OriAmerican;
            case "OriBri":
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
