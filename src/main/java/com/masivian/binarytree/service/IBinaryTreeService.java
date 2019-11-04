package com.masivian.binarytree.service;

import com.masivian.binarytree.model.TreeNode;

public interface IBinaryTreeService {
	public TreeNode createBinaryTree(TreeNode tree);

	public TreeNode lowestCommonAncestor(TreeNode tree, int firstNode, int secondNode);
}
