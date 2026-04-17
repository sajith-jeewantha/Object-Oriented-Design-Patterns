package sj.patterns.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

interface DrawableTree {
    void draw(int x, int y);
}

class TreeType implements DrawableTree {

    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Creating a " + this.name + "tree at (" + x + "," + y + ") with color " + this.color + " & texture " + this.texture + " - " + this.hashCode());
    }
}

class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static DrawableTree getTreeType(String name, String color, String texture) {
        String key = name + "_" + color + "_" + texture;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color, texture));
        }
        return treeTypes.get(key);
    }

    public static int getTreeTypeCount() {
        return treeTypes.size();
    }
}

class Tree {
    private final int x;
    private final int y;
    private final DrawableTree drawableTree;

    public Tree(int x, int y, DrawableTree drawableTree) {
        this.x = x;
        this.y = y;
        this.drawableTree = drawableTree;
    }

    public void draw() {
        drawableTree.draw(x, y);
    }
}

class Forest {
    private final List<Tree> trees = new ArrayList<>();

    public void placeTree(String name, String color, String texture, int x, int y) {
        DrawableTree treeType = TreeFactory.getTreeType(name, color, texture);
        trees.add(new Tree(x, y, treeType));
    }

    public void drawForest() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }

    public int getTreesCount() {
        return trees.size();
    }
}


public class FlyWeight {

    public static void main(String[] args) {
        Forest forest = new Forest();

        for (int i = 0; i < 10; i++) {
            forest.placeTree("Pine", "Yellow", "Smooth", getRandomXandY(), getRandomXandY());
        }

        for (int i = 0; i < 10; i++) {
            forest.placeTree("Oak", "Green", "Rough", getRandomXandY(), getRandomXandY());
        }

        forest.drawForest();

        System.out.println("\nTotal trees in the forest: " + forest.getTreesCount());
        System.out.println("\nTotal tree types: " + TreeFactory.getTreeTypeCount());
    }

    private static int getRandomXandY() {
        return ThreadLocalRandom.current().nextInt(0, 100);
    }
}
