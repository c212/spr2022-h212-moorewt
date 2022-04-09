/**
 This program demonstrates a decision tree for an animal
 guessing game.
 */
public class DecisionTreeDemo2
{
    public static void main(String[] args)
    {
        BinaryTree questionTree = new BinaryTree(1, new BinaryTree(2), new BinaryTree(5));

        boolean done = false;
        BinaryTree.Searcher searcher1 = new BinaryTree.Searcher();
        questionTree.inorder(questionTree, searcher1);
        System.out.println();
        System.out.println(questionTree.total);
        System.out.println(questionTree.count);
        System.out.println((float)questionTree.total / (float)questionTree.count);
            }
}
