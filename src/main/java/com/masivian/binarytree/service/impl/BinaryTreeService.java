package com.masivian.binarytree.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masivian.binarytree.model.TreeNode;
import com.masivian.binarytree.repository.TreeNodeRepository;
import com.masivian.binarytree.service.IBinaryTreeService;

@Service
public class BinaryTreeService implements IBinaryTreeService {
	@Autowired
	private TreeNodeRepository treeNodeRespository;

	@Override
	public TreeNode createBinaryTree(TreeNode tree) {
		return treeNodeRespository.save(tree);
	}

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