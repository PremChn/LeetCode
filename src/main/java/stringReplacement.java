public class stringReplacement {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        String regex = "[^a-zA-Z0-9]";
        s = s.replaceAll(regex, " ");
        s = s.replaceAll("\\s+", " ");
        String[] sArray = s.split(" ");
        System.out.println(sArray.length);
        for(String temp : sArray){
            System.out.println(temp);
        }
    }
}
