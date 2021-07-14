package org.erusu.jhtp.chapter14.exercises._1405;

public class RandomSentences {
    public static void main(String[] args) {
        String[] article = {"the", "a", "one", "some", "any"},
            noun = {"boy", "girl", "dog", "town", "car"},
            verb = {"drove", "jumped", "ran", "walked", "skipped"},
            preposition = {"to", "from", "over", "under", "on"};

        StringBuilder mySentenceMaker = new StringBuilder();
        
        for(int counter = 0; counter < 20; counter++) {
            mySentenceMaker.append(String.format("%s %s %s %s %s %s.",
                capitalizeFirstChar(article[(int)(Math.random() * article.length)]),
                noun[(int)(Math.random() * noun.length)],
                verb[(int)(Math.random() * verb.length)],
                preposition[(int)(Math.random() * preposition.length)],
                article[(int)(Math.random() * article.length)],
                noun[(int)(Math.random() * noun.length)]));
            System.out.printf("%s\n", mySentenceMaker.toString());
            mySentenceMaker.delete(0, mySentenceMaker.length());
        }
    }

    public static String capitalizeFirstChar(String str) {
        return Character.toUpperCase(str.charAt(0)) + "" + str.substring(1, str.length());
    }
}