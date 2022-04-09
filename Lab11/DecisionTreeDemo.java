import java.util.Scanner;

/**
 This program demonstrates a decision tree for an animal
 guessing game.
 */
public class DecisionTreeDemo
{
    public static void main(String[] args)
    {
        BinaryTree questionTree = new BinaryTree("Is it a mammal?",
                new BinaryTree("Does it have stripes?",
                        new BinaryTree("Is it a carnivore?",
                                new BinaryTree("It is a tiger."),
                                new BinaryTree("It is a zebra.")),
                        new BinaryTree("It is a pig.")),
                new BinaryTree("Does it fly?",
                        new BinaryTree("It is an eagle."),
                        new BinaryTree("Does it swim?",
                                new BinaryTree("It is a penguin."),
                                new BinaryTree("It is an ostrich."))));

        boolean done = false;
        BinaryTree.Searcher searcher1 = new BinaryTree.Searcher();
        questionTree.inorder(questionTree, searcher1);

            }
}
