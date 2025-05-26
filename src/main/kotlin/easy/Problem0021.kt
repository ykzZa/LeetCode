package easy

import helper.ListNode

class Problem0021 {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        return if (list1 == null || list2 == null) {
            list1 ?: list2
        } else {
            return if (list1.`val` < list2.`val`) {
                ListNode(list1.`val`).apply {
                    next = mergeTwoLists(list1.next, list2)
                }
            } else {
                ListNode(list2.`val`).apply {
                    next = mergeTwoLists(list1, list2.next)
                }
            }
        }
    }
}