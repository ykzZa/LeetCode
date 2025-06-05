package easy

import helper.ListNode

class Problem0083 {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return null
        return head.apply {
            next = deleteDuplicate(head.next, head.`val`)
        }
    }

    private fun deleteDuplicate(head: ListNode?, duplicate: Int): ListNode? {
        if (head == null) return head

        if (head.`val` == duplicate) {
            return deleteDuplicate(head.next, duplicate)
        }

        return head.apply {
            next = deleteDuplicate(head.next, head.`val`)
        }
    }
}