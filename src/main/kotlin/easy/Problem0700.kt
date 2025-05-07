package easy

class Problem0700 {

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if(root == null) {
            return null
        }
        if (root.`val` == `val`) {
            return root
        }
        if (root.`val` > `val`) {
            return searchBST(root.left, `val`)
        }
        return searchBST(root.right, `val`)
    }
}

