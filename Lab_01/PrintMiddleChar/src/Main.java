public class Main {
    public static void main(String[] args) {
        String[] words = {"pippo", "pluto", "alice", "bob"};

        for (String word : words) {
            int mid=word.length()/2;
            String middleChar=word.substring(mid,mid+1);

            System.out.println(middleChar);
        }
    }
}