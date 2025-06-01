package medium

import helper.ListNode

class Problem2807 {

    fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
        return if (head?.next == null) {
            head
        } else {
            val gcd = findGCD(head.`val`, head.next!!.`val`)
            val gcdNode = ListNode(gcd)
            val temp = head.next

            head.next = gcdNode

            gcdNode.next = insertGreatestCommonDivisors(temp)
            head
        }
    }

    private fun findGCD(a: Int, b: Int): Int {
        if (b == 0) return a
        return findGCD(b, a % b)
    }
}