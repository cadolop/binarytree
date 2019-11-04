package com.masivian.binarytree.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masivian.binarytree.model.TreeNode;
import com.masivian.binarytree.repository.TreeNodeRepository;
import com.masivian.binarytree.service.IBinaryTreeService;

/**
 * This class is the service to create a Binary Tree and calculate
 * the Lowest Common Ancestor (LCA)
 * @author cadolop@gmail.com
 * @version 1.0
 *
 */
@Service
public class BinaryTreeService implements IBinaryTreeService {
	@Autowired
	private TreeNodeRepository treeNodeRespository;

	/**
	 * This function create and persists a Binary Tree
	 * @param tree TreeNode a Tree to save
	 * @return A TreeNode created and saved
	 */
	@Override
	public TreeNode createBinaryTree(TreeNode tree) {
		return treeNodeRespository.save(tree);
	}

	/**
	 * This function calculate the Lowest Common Ancestor
	 * (LCA) given a TreeNode, data of the firstNode and the 
	 * value of the secondNode
	 * @param tree TreeNode a Tree to calculated LCA
	 * @param firstNode Data of First Node
	 * @param secondNode Data of Second Node
	 * @return A Node with the result
	 */
	@Override
	public TreeNode lowestCommonAncestor(TreeNode tree, int firstNode, int secondNode) {
		if (tree == null)
			return null;
		if (tree.getData() == firstNode || tree.getData() == secondNode)
			return tree;

		TreeNode left = lowestCommonAncestor(tree.getLeft(), firstNode, secondNode);
		TreeNode right = lowestCommonAncestor(tree.getRight(), firstNode, secondNode);

		if (left != null && right != null)
			return tree;
		if (left == null)
			return right;
		else
			return left;
	}
}