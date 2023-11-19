public class Main {
    public static void main(String[] args) {
        String[] words = {"c", "ac", "ciao", "pippo"};

        for (String word : words) {
            String result;
            if(word.length()<2)
                System.out.println("Stringa corta");
            else {
                String left=word.substring(0,word.length()/2);
                String right=word.substring(word.length()/2, word.length());
                result=right.concat(left);
                System.out.println(result);
            }
        }
    }
}