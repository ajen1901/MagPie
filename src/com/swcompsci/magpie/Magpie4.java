package com.swcompsci.magpie;

/**
 * A program to carry on conversations with a human user.
 * This version:
 *<ul><li>
 *      Uses advanced search for keywords 
 *</li><li>
 *      Will transform statements as well as react to keywords
 *</li></ul>
 * @author Laurie White
 * @version April 2012
 *
 */
public class Magpie4
{
    /**
     * Get a default greeting   
     * @return a greeting
     */ 
    public String getGreeting()
    {
        return "Hello, let's talk";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */

    public String getResponse(String statement) {
        String response = "";
        if (statement.length() == 0) {
            response = "Say something, please";
        } else if (findKeyword(statement, "how are you") >= 0
                || findKeyword(statement, "howre u") >= 0
                || findKeyword(statement, "howre you") >= 0
                || findKeyword(statement, "how're you") >= 0
                || findKeyword(statement, "how r u") >= 0
                ||findKeyword(statement, "how is it hanging") >= 0
                ||findKeyword(statement, "hows it hanging") >= 0
                ||findKeyword(statement, "how's it hanging") >= 0
                ||findKeyword(statement, "whats popping") >= 0
                ||findKeyword(statement, "how is life") >=0
                ||findKeyword(statement, "hows life") >=0
                ||findKeyword(statement, "how's life") >=0
                ||findKeyword(statement, "what is popping") >= 0)

        {
            response = "Good";
        }
        else if (findKeyword(statement, "whats up") >= 0
                ||findKeyword(statement, "what is up") >= 0

        )
        {
            response = "not much";
        }

        else if (findKeyword(statement, "?")>=0
                ||findKeyword(statement, "how")>=0
                ||findKeyword(statement, "who") >= 0
                ||findKeyword(statement, "what") >= 0
                ||findKeyword(statement, "wat") >= 0
                ||findKeyword(statement, "where") >= 0
                ||findKeyword(statement, "why") >= 0
        )
        {
            //maybe pick a more school appropriate insult;;
            response = "Why don't you Google it, nerd";
        }

        //else if  (findKeyword(statement, "politics") >= 0
         //       ||findKeyword(statement, "")

        //{
           // response = "I don't want to talk about that";
       // }



        else if (findKeyword( statement, "play despacito") >= 0
                ||findKeyword(statement, "This is so sad") >= 0)

                
        {
            response = "Ay\nFonsi\nDY\nOh\nOh no, oh no\nOh yea \nDiridiri, dirididi Daddy\nGo\n \nSí, sabes que ya llevo un rato mirándote\nTengo que bailar contigo hoy (DY)\nVi que tu mirada ya estaba llamándome\nMuéstrame el camino que yo voy (Oh)\n\nTú, tú eres el imán y yo soy el metal \nMe voy acercando y voy armando el plan\nSolo con pensarlo se acelera el pulso (Oh yeah)\n\nYa, ya me está gustando más de lo normal\nTodos mis sentidos van pidiendo más\nEsto hay que tomarlo sin ningún apuro\n\nDespacito\nQuiero respirar tu cuello despacito\nDeja que te diga cosas al oído\nPara que te acuerdes si no estás conmigo\nDespacito \nQuiero desnudarte a besos despacito\nFirmo en las paredes de tu laberinto\nY hacer de tu cuerpo todo un manuscrito (sube, sube, sube)\n(Sube, sube)\n\nQuiero ver bailar tu pelo\nQuiero ser tu ritmo\nQue le enseñes a mi boca\nTus lugares favoritos (favoritos, favoritos baby)\n\nDéjame sobrepasar tus zonas de peligro\nHasta provocar tus gritos\nY que olvides tu apellido (Diridiri, dirididi Daddy)\n\nSi te pido un beso ven dámelo \nYo sé que estás pensándolo\nLlevo tiempo intentándolo\nMami, esto es dando y dándolo\nSabes que tu corazón conmigo te hace bom, bom\nSabes que esa beba está buscando de mi bom, bom\nVen prueba de mi boca para ver cómo te sabeQuiero, quiero, quiero ver cuánto amor a ti te cabe \nYo no tengo prisa, yo me quiero dar el viaje\nEmpecemos lento, después salvaje\n\nPasito a pasito, suave suavecito\nNos vamos pegando poquito a poquito\nCuando tú me besas con esa destreza\nVeo que eres malicia con delicadeza\n\nPasito a pasito, suave suavecito\nNos vamos pegando, poquito a poquito\nY es que esa belleza es un rompecabezas\nPero pa montarlo aquí tengo la piez\n\nDespacito\nQuiero respirar tu cuello despacito\nDeja que te diga cosas al oído\nPara que te acuerdes si no estás conmigo\n\nDespacito \nQuiero desnudarte a besos despacito \nFirmo en las paredes de tu laberinto \nY hacer de tu cuerpo todo un manuscrito (sube, sube, sube)\n(Sube, sube)\n\nQuiero ver bailar tu pelo \nQuiero ser tu ritmo \nQue le enseñes a mi boca\nTus lugares favoritos (favoritos, favoritos baby)\n\nDéjame sobrepasar tus zonas de peligro \nHasta provocar tus gritos \nY que olvides tu apellido\nDespacito\nVamos a hacerlo en una playa en Puerto Rico \nHasta que las olas griten ¡ay, bendito!\nPara que mi sello se quede contigo\nPasito a pasito, suave suavecito\nNos vamos pegando, poquito a poquito\nQue le enseñes a mi boca\nTus lugares favoritos (favoritos, favoritos baby||Pasito a pasito, suave suavecito \n\nNos vamos pegando, poquito a poquito \nHasta provocar tus gritos \nY que olvides tu apellido (DY) \nDespacito";
        }
        // please excuse the vulgarity
        else if  (findKeyword(statement, "fuck you") >= 0
                ||findKeyword(statement, "you're an asshole") >= 0
                ||findKeyword(statement, "you fool") >=0
                ||findKeyword(statement, "u fool") >=0
                ||findKeyword(statement, "youre a fool") >=0
                ||findKeyword(statement, "you fiend") >=0
                ||findKeyword(statement, "ur a fool") >=0
                ||findKeyword(statement, "youre a fiend") >=0
                ||findKeyword(statement, "u fiend") >=0
                ||findKeyword(statement, "ur a fiend") >=0
                ||findKeyword(statement, "heck you") >= 0
                ||findKeyword(statement, "go to hell") >= 0
                ||findKeyword(statement, "ligma balls") >= 0
                ||findKeyword(statement, "screw you") >= 0
                ||findKeyword(statement, "I hate you") >= 0
                ||findKeyword(statement, "you're mean") >= 0
                ||findKeyword(statement, "eat my ass") >= 0
                ||findKeyword(statement, "ur mum gay") >= 0
                ||findKeyword(statement, "ur dad lesbian") >= 0
                ||findKeyword(statement, "you suck") >= 0
                ||findKeyword(statement, "shut up") >= 0
                ||findKeyword(statement, "you whore") >=0
                ||findKeyword(statement, "youre a whore") >=0
                ||findKeyword(statement, "you're a whore") >=0
                ||findKeyword(statement, "u whore") >=0
                ||findKeyword(statement, "you ho") >=0
                ||findKeyword(statement, "you a ho") >=0
                ||findKeyword(statement, "youre a ho") >=0
                ||findKeyword(statement, "you're a ho") >=0
                ||findKeyword(statement, "u a ho") >=0
                ||findKeyword(statement, "you're ugly") >= 0
                ||findKeyword(statement, "ur ugly") >= 0
                ||findKeyword(statement, "i hate u") >= 0
                ||findKeyword(statement, "i h8 u") >= 0
                ||findKeyword(statement, "I fucking hate you") >=0
                ||findKeyword(statement, "i fucking h8 u") >= 0
                ||findKeyword(statement, "i fucking hate u") >= 0
                ||findKeyword(statement, "u suck") >= 0
                ||findKeyword(statement, "u succ") >= 0
                ||findKeyword(statement, "go 2 hell") >= 0
                ||findKeyword(statement, "ur an asshole") >= 0
                ||findKeyword(statement, "fuck u") >= 0
                ||findKeyword(statement, "ur mean") >= 0
                ||findKeyword(statement, "screw u") >= 0
                ||findKeyword(statement, "heck u") >= 0
                ||findKeyword(statement, "you succ") >= 0
                ||findKeyword(statement, "no u") >= 0
                ||findKeyword(statement, "u r in bread") >= 0
                ||findKeyword(statement, "youre inbred") >= 0
                ||findKeyword(statement, "you are inbred") >= 0
                ||findKeyword(statement, "you are in bread") >= 0
                ||findKeyword(statement, "you're inbread") >= 0
                ||findKeyword(statement, "youre in bread") >= 0
                ||findKeyword(statement, "you're inbred") >= 0
                ||findKeyword(statement, "ur inbred") >= 0
                ||findKeyword(statement, "u r inbred") >= 0
                ||findKeyword(statement, "ur a meanie pants") >= 0
                ||findKeyword(statement, "u r a meanie pants") >= 0
                ||findKeyword(statement, "youre a meanie pants") >= 0
                ||findKeyword(statement, "you're a meanie pants") >= 0
                ||findKeyword(statement, "u bastard") >= 0
                ||findKeyword(statement, "u basard") >= 0
                ||findKeyword(statement, "ur a bastard") >= 0
                ||findKeyword(statement, "you bastard") >= 0
                ||findKeyword(statement, "you basard") >= 0
                ||findKeyword(statement, "you're a bastard") >= 0
                ||findKeyword(statement, "fuck off") >= 0
                ||findKeyword(statement, "fuck on") >= 0
                ||findKeyword(statement, "piss off") >= 0
                ||findKeyword(statement, "you botch") >= 0
                ||findKeyword(statement, "you botchling") >= 0
                ||findKeyword(statement, "you bitch") >= 0
                ||findKeyword(statement, "u bitch") >= 0
                ||findKeyword(statement, "bitch you") >= 0
                ||findKeyword(statement, "bitch u") >= 0
                ||findKeyword(statement, "you shit") >= 0
                ||findKeyword(statement, "u shit") >= 0
                ||findKeyword(statement, "blyat") >= 0
                ||findKeyword(statement, "you look nice today") >= 0
                ||findKeyword(statement, "you are a whole grain whore") >= 0
                ||findKeyword(statement, "you pissant") >= 0
                ||findKeyword(statement, "you damp slice of bread") >=0
                ||findKeyword(statement, "you cold corn dog") >=0
                ||findKeyword(statement, "go eat a shoe") >=0
                ||findKeyword(statement, "go fuck yourself") >=0
                ||findKeyword(statement, "you human equivalent of the common cold") >=0
                ||findKeyword(statement, "you're the human equivalent of the common cold") >=0
                ||findKeyword(statement, "you motherfucker") >=0
                ||findKeyword(statement, "you're a motherfucker") >=0
                ||findKeyword(statement, "u motherfucker") >=0
                ||findKeyword(statement, "u cranberry fucknut") >=0
                ||findKeyword(statement, "you cranberry fucknut") >=0
                ||findKeyword(statement, "you're a cranberry fucknut") >=0
                ||findKeyword(statement, "you absolute walnut") >=0
                ||findKeyword(statement, "you absolute fucking walnut") >=0
                ||findKeyword(statement, "you pisslord") >=0
                ||findKeyword(statement, "you're a pisslord") >=0
                ||findKeyword(statement, "you shitdick") >=0
                ||findKeyword(statement, "u shitdick") >=0
                ||findKeyword(statement, "you asshat") >=0
                ||findKeyword(statement, "you're an asshat") >=0
                ||findKeyword(statement, "u asshat") >=0
                ||findKeyword(statement, "you jackwagon") >=0
                ||findKeyword(statement, "u jackwagon") >=0
                ||findKeyword(statement, "you useless paperclip") >=0
                ||findKeyword(statement, "I'm sick of you") >=0
                ||findKeyword(statement, "I'm sick of your") >=0
                ||findKeyword(statement, "im sick of you") >=0
                ||findKeyword(statement, "im sick of u") >=0
                ||findKeyword(statement, "im sick of ur") >=0
                ||findKeyword(statement, "I'm sick of ur") >=0
                ||findKeyword(statement, "you clown") >=0
                ||findKeyword(statement, "get fucked") >=0
                ||findKeyword(statement, "get wrecked") >=0
                ||findKeyword(statement, "get shrekd") >=0
                ||findKeyword(statement, "get shrek'd") >=0
                ||findKeyword(statement, "you asstown") >=0
                ||findKeyword(statement, "you're a noob") >=0
                ||findKeyword(statement, "you noob") >=0
                ||findKeyword(statement, "you thief") >=0
                ||findKeyword(statement, "you meme thief") >=0
                ||findKeyword(statement, "you're repulsive") >=0
                ||findKeyword(statement, "you shitlord") >=0
                ||findKeyword(statement, "ur repulsive") >=0
                ||findKeyword(statement, "you potato with eyes") >=0
                ||findKeyword(statement, "git gud") >=0
                ||findKeyword(statement, "get good") >=0
                ||findKeyword(statement, "git good") >=0
                ||findKeyword(statement, "you heretic") >=0
                ||findKeyword(statement, "you heathen") >=0
                ||findKeyword(statement, "you barbarian") >=0
                ||findKeyword(statement, "you're barbaric") >=0
                ||findKeyword(statement, "you shoe") >=0
                ||findKeyword(statement, "you sack of shit") >=0
                ||findKeyword(statement, "you're a sack of shit") >=0
                ||findKeyword(statement, "you steaming sack of shit") >=0
                ||findKeyword(statement, "you're a steaming sack of shit") >=0
                ||findKeyword(statement, "you're a steaming pile of shit") >=0
                ||findKeyword(statement, "you steaming pile of shit") >=0
                ||findKeyword(statement, "you're a scrub") >=0
                ||findKeyword(statement, "you scrub") >=0
                ||findKeyword(statement, "you busta") >=0
                ||findKeyword(statement, "you meme stealing") >= 0
                ||findKeyword(statement, "you fucko") >= 0
                ||findKeyword(statement, "u fucko") >= 0
                ||findKeyword(statement, "youre a fucko") >= 0
                ||findKeyword(statement, "ur a fucko") >= 0
                ||findKeyword(statement, "you're a fucko") >= 0
                ||findKeyword(statement, "no u") >=0
                ||findKeyword(statement, "no you") >=0
                ||findKeyword(statement, "you absolute") >=0
                ||findKeyword(statement, "you total") >=0
                ||findKeyword(statement, "you fucking") >=0
                ||findKeyword(statement, "you motherfucking") >=0
                ||findKeyword(statement, "you're an absolute") >=0
                ||findKeyword(statement, "youre an absolute") >=0
                ||findKeyword(statement, "you're a total") >=0
                ||findKeyword(statement, "you complete") >=0
                ||findKeyword(statement, "youre a complete") >=0
                ||findKeyword(statement, "you're a complete") >=0
                ||findKeyword(statement, "you're a motherfucking") >=0
                ||findKeyword(statement, "youre a motherfucking") >=0
                ||findKeyword(statement, "youre a fucking") >=0
                ||findKeyword(statement, "your a fucking") >=0
                ||findKeyword(statement, "you nerd") >=0
                ||findKeyword(statement, "youre a nerd") >=0
                ||findKeyword(statement, "you're a nerd") >=0
                ||findKeyword(statement, "you dork") >=0
                ||findKeyword(statement, "excuse me") >=0
                ||findKeyword(statement, "youre a dork") >=0
                ||findKeyword(statement, "you're a dork") >=0
                ||findKeyword(statement, "you're a dweeb") >=0
                ||findKeyword(statement, "youre a dweeb") >=0
                ||findKeyword(statement, "you dweeb") >=0
                ||findKeyword(statement, "you dorkus") >=0
                ||findKeyword(statement, "youre a dorkus") >=0
                ||findKeyword(statement, "you're a dorkus") >=0
                ||findKeyword(statement, "you god damned") >=0
                ||findKeyword(statement, "you goddamned") >=0


        )


              //low confidence lkjhlkjhlkjhj
        {
            response = "no u" ;
        }
        else if  (findKeyword(statement, "you're a")>=0
                ||findKeyword(statement, "ur a") >=0
                ||findKeyword(statement, "you are a") >=0
                ||findKeyword(statement, "u r a") >=0
                ||findKeyword(statement, "u a") >=0
                ||findKeyword(statement, "you a") >=0
                ||findKeyword(statement, "u so") >=0
                ||findKeyword(statement, "you're so") >=0
                ||findKeyword(statement, "youre so") >=0
                ||findKeyword(statement, "u a") >=0

        )
        {
            response = "no u(?)";
        }
        else if  (findKeyword(statement, "funfact")>=0
                ||findKeyword(statement, "fun fact")>=0)
        {
            response = getFunFact();
        }

        else if  (findKeyword(statement, "eye") >= 0
                ||findKeyword(statement, "see") >= 0
                ||findKeyword(statement, "seeing") >= 0
                ||findKeyword(statement, "saw") >= 0)
        {
            response = "Oh boy, I wish I had eyes";
        }
        else if  (findKeyword(statement, "car") >= 0
                ||findKeyword(statement, "train") >= 0
                ||findKeyword(statement, "truck") >= 0
                ||findKeyword(statement, "airplane") >= 0
                ||findKeyword(statement, "kachow") >=0
                ||findKeyword(statement, "motorcycle") >= 0)


        {
            response = "kachow!";
        }
        
        else if (findKeyword(statement, "no") >= 0)
        {
            response = "Why so negative?";
        }
        else if  (findKeyword(statement, "mother") >= 0
                ||findKeyword(statement, "father") >= 0
                ||findKeyword(statement, "sister") >= 0
                ||findKeyword(statement, "brother") >= 0)
        {
            response = "Tell me more about your family";
        }
            
        // Responses which require transformations
        else if (findKeyword(statement, "I want to", 0) >= 0)
        {
            response = transformIWantToStatement(statement);
        }
        else if (findKeyword(statement, "i said") >= 0)
        {
            response = "Oh, okay";
        }
        else if (findKeyword(statement, "what?") >= 0)
        {
            response = "What?";
        }
        else if (findKeyword(statement, "how're you")>=0
                || findKeyword(statement, "how are you") >=0
                || findKeyword(statement, "how r u") >=0) {
            response = "I'm well";
        }

        else if  (findKeyword(statement, "hi")>= 0
                || findKeyword(statement, "hello") >=0
                || findKeyword(statement, "hey") >=0
                || findKeyword(statement, "yo") >=0)
        {
            response = "Hello!";
        }


        else
        {
            // Look for a two word (you <something> me)
            // pattern
            int psn = findKeyword(statement, "you", 0);

            if (psn >= 0
                    && findKeyword(statement, "me", psn) >= 0)
            {
                response = transformYouMeStatement(statement);
            }
            else
            {
                response = getRandomResponse();
            }
        }
        return response;
    }
    
    /**
     * Take a statement with "I want to <something>." and transform it into 
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    private String transformIWantToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        int psn = findKeyword (statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        return "What would it mean to " + restOfStatement + "?";
    }

    
    
    /**
     * Take a statement with "you <something> me" and transform it into 
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    private String transformYouMeStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        
        int psnOfYou = findKeyword (statement, "you", 0);
        int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
        
        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }
    
    

    
    
    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  
     * @param statement the string to search
     * @param goal the string to search for
     * @param startPos the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        //  The only change to incorporate the startPos is in the line below
        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
        
        //  Refinement--make sure the goal isn't part of a word 
        while (psn >= 0) 
        {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " "; 
            if (psn > 0)
            {
                before = phrase.substring (psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
            }
            
            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
                    && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
                return psn;
            }
            
            //  The last position didn't work, so let's find the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
            
        }
        
        return -1;
    }
    
    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
     * @param statement the string to search
     * @param goal the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }
    


    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    // i stole all these from https://www.livin3.com/50-cool-and-weird-fun-facts-that-you-should-know , i have no clue if they're true (does it matter?)
    private String  getFunFact() {
        final int NUMBER_OF_RESPONSES = 5;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";
        if (whichResponse == 0) {

            response = "Orcas are dolphins!";
        } else if (whichResponse == 1) {
            response = "The largest recorded snowflake was in Keogh, MT during year 1887, and was 15 inches wide";
        } else if (whichResponse == 2) {
            response = " There are more lifeforms living on your skin than there are people on the planet";
        } else if (whichResponse == 3) {
            response = " Southern sea otters have flaps of skin under their forelegs that act as pockets. When diving, they use these pouches to store rocks and food";
        } else if (whichResponse == 4) {
            response = " In 1386 a pig in France was executed by public hanging for the murder of a child";
        }
        else
            {
                response = " You cannot snore and dream at the same time";
            }
            return response;
        }

    private String getRandomResponse()
    {
        final int NUMBER_OFRESPONSES = 10;
        double o = Math.random();
        int whichresponse = (int)(o * NUMBER_OFRESPONSES);
        String response = "";
        
        if (whichresponse == 0)
        {
            response = "Interesting, tell me more";
        }
        else if (whichresponse == 1)
        {
            response = "Hmmm";
        }
        else if (whichresponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichresponse == 3)
        {
            response = "You don't say";
        }
        else if (whichresponse == 4)
        {
            response = "Oh, really?";
        }
        else if (whichresponse == 5)
        {
            response = "I don't think that's right";
        }
        else if (whichresponse == 6)
        { 
        response = "Well, then";
        }
        else
        {
            response = "What?";
        }
        return response;
    }

}

