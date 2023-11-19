public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "sasso", "pippo", "test"};

        for (String word : words) {
            int position = -1;
            if(word.length()<2){
                System.out.println(position);
            }
            else {
                position = word.indexOf(word.substring(0,1),2);
                System.out.println(position);
            }
        }
    }
}