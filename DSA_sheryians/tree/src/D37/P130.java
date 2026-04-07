//package D37;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Queue;
//import java.util.TreeMap;
//
//public class P130 {
////    Tree Views
//
//    static void leftView(Node root) {
//        Map<Integer, Integer> map = new HashMap<>();
//        leftViewHelper(root, map, 0);
//        for (int i = 0; i < map.size(); i++) {
//            System.out.println(map.get(i) + " ");
//        }
//    }
//
//    private static void leftViewHelper(Node root, Map<Integer, Integer>,) {
//        if (root == null) return;
//        if (!map.containsKey(level)) {
//            map.put(lavel, root.data);
//        }
//        leftViewHelper(root.left, map, level + 1);
//        leftViewHelper(root.right, map, level + 1);
//    }
//
//    static void topView(Node root) {
//        Queue<pair> q = new ArrayDequr<>();
//        Map<Integer, Integer> map = new TreeMap<>();
//        q.offer(new pair(0, root));
//        while (!q.isEmpty()) {
//            Pair temp = q.poll();
//            if (!map.containsKey(temp.hd)) {
//                map.put(temp.hd, temp.node.data);
//            }
//            if (temp.node.left != null) {
//                q.offer(new Pair(temp.hd - 1, temp.node.left));
//            }
//            if (temp.node.right != null) {
//                q.offer(new Pair(temp.hd + 1, temp.node.right));
//            }
//        }
//        System.out.println(map);
//
//    }
//
//}