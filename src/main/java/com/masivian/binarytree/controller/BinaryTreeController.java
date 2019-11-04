package com.masivian.binarytree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masivian.binarytree.model.TreeNode;
import com.masivian.binarytree.service.IBinaryTreeService;

/**
 * This class is the Rest controller to create a Binary Tree and calculate
 * the Lowest Common Ancestor (LCA)
 * @author cadolop@gmail.com
 * @version 1.0
 *
 */
@RestController
public class BinaryTreeController {
	@Autowired
	private IBinaryTreeService binaryTreeService;

	/**
	 * This Rest Put (/lca) function permits create and persists a 
	 * Binary Tree
	 * @param tree TreeNode a Tree to save
	 * @return A TreeNode created and saved
	 */
	@PutMapping("/lca")
	public TreeNode createBinaryTree(@RequestBody TreeNode tree) {
		return binaryTreeService.createBinaryTree(tree);
	}

	/**
	 * This Rest Post function calculate the Lowest Common Ancestor
	 * (LCA) given a TreeNode, data of the firstNode and the 
	 * value of the secondNode
	 * @param tree TreeNode a Tree to calculated LCA
	 * @param firstNode Data of First Node
	 * @param secondNode Data of Second Node
	 * @return A Node with the result
	 */
	@PostMapping("/lca/{firstNode}/{secondNode}")
	public TreeNode lowestCommonAncestor(@RequestBody TreeNode tree, @PathVariable int firstNode, @PathVariable int secondNode) {
		return binaryTreeService.lowestCommonAncestor(tree, firstNode, secondNode);
	}
}