/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func reverseBetween(head *ListNode, left int, right int) *ListNode {
    if head == nil || left >= right {
        return head
    }
    var helper func(node *ListNode, m int) *ListNode
    helper = func(node *ListNode, m int) * ListNode {
        if m == left {
            var prev, current *ListNode = nil, node
            for m <= right {
                current.Next, prev, current = prev, current, current.Next
                m++
            }
            node.Next = current
            return prev
        } else if m < left {
            node.Next = helper(node.Next, m+1)
        }
        return node
    }
    return helper(head, 1)
}