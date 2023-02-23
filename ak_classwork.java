public enum ak_casswork {north, south, east, west, northEast, northWest, southWest;}
public class ak_classwork {
    public static void main (String args[]) {
        for (ak_casswork dir : ak_casswork.values())      System.out.prinln(dir);
    }
}
