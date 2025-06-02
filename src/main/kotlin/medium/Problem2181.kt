package medium

import helper.ListNode

class Problem2181 {

    fun mergeNodes(head: ListNode?): ListNode? {
        if(head == null) return null

        val ans = ListNode(0)
        var curr = head.next
        var last = ans
        var counter = 0

        while (curr != null) {
            if (curr.`val` == 0) {
                val node = ListNode(counter)
                last.next = node
                last = node
                counter = 0
            } else {
                counter += curr.`val`
            }
            curr = curr.next
        }
        return ans.next
    }
}