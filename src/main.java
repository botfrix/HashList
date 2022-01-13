import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        HashMapi<String, Float> hashListExe = new HashMapi<>();
        System.out.println(hashListExe.size());
        hashListExe.add("a", 12f);
        hashListExe.add("a", 12f);
        hashListExe.add("a", 12f);
        hashListExe.add("a", 12f);
        System.out.println(hashListExe.size());

    }

}
