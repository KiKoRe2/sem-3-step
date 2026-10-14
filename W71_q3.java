// Solution for: Nickname Tag
public class W71_q3 {static final class NameTag{private final String fullName,nickname;NameTag(String n){fullName=n.trim();String[] p=fullName.split("\\s+");nickname=p[0]+(p.length>1?" "+p[p.length-1].charAt(0)+".":"");}String getNickname(){return nickname;}}public static void main(String[]z){System.out.println(new NameTag("Leo Gerald").getNickname());}}
