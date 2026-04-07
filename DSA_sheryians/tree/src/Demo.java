import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Demo {
    static Scanner sc;
    static int i = 0;

    static {
        sc = new Scanner(System.in);
    }

    private static TreeNode buildTree() {
        System.out.println("Enter val");
        int val = sc.nextInt();
        if (val == -1)
            return null;
        TreeNode root = new TreeNode(val);
        System.out.println("Enter left for " + val);
        root.left = buildTree();
        System.out.println("Enter right for " + val);
        root.right = buildTree();
        return root;
    }

    public static TreeNode buildTreeArray(int[] arr) {
        if (i == arr.length)
            return null;
        int val = arr[i++];
        if (val == -1)
            return null;
        TreeNode root = new TreeNode(val);
        root.left = buildTreeArray(arr);
        root.right = buildTreeArray(arr);
        return root;
    }

    public static void dlr(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + "  ");
        dlr(root.left);
        dlr(root.right);
    }

    public static void ldr(TreeNode root) {
        if (root == null)
            return;

        ldr(root.left);
        System.out.print(root.val + "  ");
        ldr(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, -1, -1, -1, 25, 34, -1, 75, -1, -1, 86, -1, -1};
        TreeNode root = buildTreeArray(arr);
        dlr(root);
        System.out.println();
        ldr(root);
    }
}