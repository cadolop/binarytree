package com.masivian.binarytree.service;

import com.masivian.binarytree.model.TreeNode;

/**
 * This interface service to create a Binary Tree and calculate
 * the Lowest Common Ancestor (LCA)
 * @author cadolop@gmail.com
 * @version 1.0
 *
 */
public interface IBinaryTreeService {
	public TreeNode createBinaryTree(TreeNode tree);

	public TreeNode lowestCommonAncestor(TreeNode tree, int firstNode, int secondNode);
}
