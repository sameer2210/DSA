import java.util.HashSet;
import java.util.Set;

public class CycleDetectionExtraSpace {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set =new HashSet<>();
        while (head != null) {
            if(set.contains(head.next)){
                return true;
            } else
                set.add(head.next);
            head = head.next;
        }
        return false;
    }

}
