package onefour;

public class Program extends Node{
    public Block block;

    @Override
    public java.lang.String toString() {
        return "public static void main(java.lang.String[] args)\n"+block.toString();
    }
}
