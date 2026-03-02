/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */



function deleteNode(root: TreeNode | null, key: number): TreeNode | null {
    if (root?.val == null) {
        return null;
    }

    if (root.val > key) {
        root.left = deleteNode(root.left, key);
    } else if (root.val < key) {
        root.right = deleteNode(root.right, key);
    } else {
        if (root.left == null) return root.right;
        if (root.right == null) return root.left;

        // Find the smallest in the right node
        const successor = findSuccessor(root.right);

        // Make it the new node
        root.val = successor.val;
        
        // Delete the successor
        root.right = deleteNode(root.right, successor.val);
    }

    return root;
};

// Find the smallest in the node
function findSuccessor(node: TreeNode): TreeNode {
    while (node.left != null) {
        node = node.left;
    }

    return node;
}
