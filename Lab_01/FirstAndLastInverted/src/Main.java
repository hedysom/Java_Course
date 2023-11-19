public class Main {
    public static void main(String[] args) {
        String[] words = {"c", "ac", "pippo"};

        for (String word : words) {
            int l=word.length();
            if(l<2)
                System.out.println("Stringa corta");
            else
            {
                String result=word.substring(l-1,l).concat(word.substring(1,l-1)).concat(word.substring(0,1));
                System.out.println(result);
            }





        }
    }
}