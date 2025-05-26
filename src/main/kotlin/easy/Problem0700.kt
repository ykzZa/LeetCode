package easy

import helper.TreeNode

class Problem0700 {

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

