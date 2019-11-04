package com.masivian.binarytree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masivian.binarytree.model.TreeNode;
import com.masivian.binarytree.service.IBinaryTreeService;

@RestController
public class BinaryTreeController {
	@Autowired
	private IBinaryTreeService binaryTreeService;

	@PutMapping("/lca")
	public TreeNode createBinaryTree(@RequestBody TreeNode tree) {
		return binaryTreeService.createBinaryTree(tree);
	}

	@PostMapping("/lca/{firstNode}/{secondNode}")
	public TreeNode lowestCommonAncestor(@RequestBody TreeNode tree, @PathVariable int firstNode, @PathVariable int secondNode) {
		return binaryTreeService.lowestCommonAncestor(tree, firstNode, secondNode);
	}
}