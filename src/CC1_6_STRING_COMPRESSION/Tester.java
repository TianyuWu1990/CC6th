package CC1_6_STRING_COMPRESSION;

public class Tester {

    public static void main(String[] args) {
        String str = "aaaaabbbbaaaabbddc";
        System.out.println(str);
        System.out.println(BAD.compressBad(str));
        System.out.println(BAD_STRING_BUILDER.compress(str));
        System.out.println(CHECK_IF_SHORTER.compress(str));
    }

}
