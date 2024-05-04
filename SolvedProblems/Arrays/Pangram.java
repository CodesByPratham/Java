package SolvedProblems.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!sentence.contains(String.valueOf(ch))) {
                System.out.println("false");
                ;
            }
        }
        System.out.println("true");
        ;
        // for(char c='a';c<='z';c++)
        // {
        // if(!sentence.contains(String.valueOf(c)))
        // {
        // return false;
        // }
        // }
        // return true;

        // Set<Character> set = new HashSet<Character>();
        // char[] charArr = sentence.toCharArray();
        // for(char c : charArr){
        // if(!set.contains(c)){
        // set.add(c);
        // }
        // }
        // return set.size() == 26;
    }
}
