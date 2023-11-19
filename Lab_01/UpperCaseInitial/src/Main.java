public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};

        for (String word : words) {
            String result=word;
            if(!word.isEmpty()){
                String maiusc=word.substring(0,1);
                maiusc=maiusc.toUpperCase();
                result=maiusc.concat(word.substring(1));
            }
            System.out.println(result);
        }
    }
}