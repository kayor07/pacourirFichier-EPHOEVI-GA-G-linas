package tg.developement.efficace;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

    private static String[] BW = {"fuck","merde","putain","ass"};
    private static String[] EMOJI = {"ð","ð","ð¡"};
    private static String[] TW = {"amen","akpÃ©","merci","nagode","imela","thanks","thank you","alhamdulillah","shukran"};


    public static void main(String[] args) {

        System.out.println("saisir le nom  de l'utilisateur ");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();


        try {
            File doc = new File("Discussion.txt");
            Scanner obj = new Scanner(doc);
            int nbrTotal = 0;
            int lolCompteur = 0;
            int compte = 0;
            int imaoCompteur = 0;
            int emojiCompt = 0;
            int emojiCompteur = 0;
            int bwCompteur = 0;
            int twCompteur = 0;
            while (obj.hasNext()) {
                String mot = obj.next();
                String lin = obj.nextLine();

                if (lin.contains(user)) {
                    nbrTotal++;

                    if (mot.equals("lol")) {
                        lolCompteur++;
                    }
                    if (mot.equals("imao")) {
                        imaoCompteur++;
                    }

                    for (String emoji : EMOJI) {
                        if (lin.contains(emoji)) {
                            emojiCompt++;
                        }
                    }
                    for (String bw : BW) {
                        if (lin.contains(bw)) {
                            bwCompteur++;
                        }
                    }

                }else{
                    if (lin.contains("ð¡")) {
                        compte++;
                    }
                    for (String emoji : EMOJI) {
                        if (lin.contains(emoji)) {
                            emojiCompteur++;
                        }
                    }
                    for (String tw : TW) {
                        if (lin.contains(tw)) {
                            twCompteur++;
                        }
                    }

                }
            }

            //  System.out.println("nombre de ligne:"+i);
            System.out.println("nombre total de message envoyer par l'utilisateur:" +nbrTotal);
            System.out.println("le mot lol se rÃ©pÃ¨te " + lolCompteur + " fois dans le fichier");
            System.out.println("le mot imao se rÃ©pÃ¨te " + imaoCompteur + " fois dans le fichier");
            System.out.println("Nombre total de que l'utilisateur a envoyer des emojis:"+emojiCompt);
            System.out.println("Nombre total de que l'utilisateur a envoyer des bad word:"+bwCompteur);
            System.out.println("Nombre total de que l'utilisateur a reÃ§u des mot de remerciÃ©ment:"+twCompteur);
            System.out.println("Nombre total de que l'utilisateur a reÃ§u des emojis:"+emojiCompteur);
            System.out.println("Nombre total de que l'utilisateur a reÃ§u emoji ð¡ en colÃ¨re:"+compte);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

