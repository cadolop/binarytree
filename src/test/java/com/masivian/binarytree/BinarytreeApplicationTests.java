package com.masivian.binarytree;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.masivian.binarytree.model.TreeNode;
import com.masivian.binarytree.service.IBinaryTreeService;

/**
 * This class is the SpringBoot test
 * @author cadolop@gmail.com
 * @version 1.0
 *
 */
@SpringBootTest
class BinarytreeApplicationTests {
	@Autowired
	private IBinaryTreeService binaryTreeService;

	@Test
	void test1() {
		TreeNode root = new TreeNode();
		TreeNode left = new TreeNode();
		TreeNode right = new TreeNode();
		root.setData(1);
		left.setData(2);
		right.setData(3);
		root.setLeft(left);
		root.setRight(right);
		Assert.assertEquals(binaryTreeService.lowestCommonAncestor(root, 2, 3).getData(), 1);
	}

	@Test
	void test2() {
		TreeNode root = new TreeNode();
		TreeNode left = new TreeNode();
		TreeNode right = new TreeNode();
		TreeNode leftleft = new TreeNode();
		TreeNode leftright = new TreeNode();
		TreeNode leftleftright = new TreeNode();
		TreeNode rightleft = new TreeNode();
		TreeNode rightright = new TreeNode();
		TreeNode rightrightleft = new TreeNode();
		TreeNode rightrightright = new TreeNode();

		root.setData(67);
		left.setData(39);
		right.setData(76);
		leftleft.setData(28);
		leftright.setData(44);
		leftleftright.setData(29);
		rightleft.setData(74);
		rightright.setData(85);
		rightrightleft.setData(83);
		rightrightright.setData(87);
		
		root.setLeft(left);
		root.setRight(right);
		left.setLeft(leftleft);
		left.setRight(leftright);
		leftleft.setRight(leftleftright);
		right.setLeft(rightleft);
		right.setRight(rightright);
		rightright.setLeft(rightrightleft);
		rightright.setRight(rightrightright);
		
		Assert.assertEquals(binaryTreeService.lowestCommonAncestor(root, 29, 44).getData(), 39);
	}

	@Test
	void test3() {
		TreeNode root = new TreeNode();
		TreeNode left = new TreeNode();
		TreeNode right = new TreeNode();
		TreeNode leftleft = new TreeNode();
		TreeNode leftright = new TreeNode();
		TreeNode leftleftright = new TreeNode();
		TreeNode rightleft = new TreeNode();
		TreeNode rightright = new TreeNode();
		TreeNode rightrightleft = new TreeNode();
		TreeNode rightrightright = new TreeNode();

		root.setData(67);
		left.setData(39);
		right.setData(76);
		leftleft.setData(28);
		leftright.setData(44);
		leftleftright.setData(29);
		rightleft.setData(74);
		rightright.setData(85);
		rightrightleft.setData(83);
		rightrightright.setData(87);
		
		root.setLeft(left);
		root.setRight(right);
		left.setLeft(leftleft);
		left.setRight(leftright);
		leftleft.setRight(leftleftright);
		right.setLeft(rightleft);
		right.setRight(rightright);
		rightright.setLeft(rightrightleft);
		rightright.setRight(rightrightright);
		
		Assert.assertEquals(binaryTreeService.lowestCommonAncestor(root, 44, 85).getData(), 67);
	}

	@Test
	void test4() {
		TreeNode root = new TreeNode();
		TreeNode left = new TreeNode();
		TreeNode right = new TreeNode();
		TreeNode leftleft = new TreeNode();
		TreeNode leftright = new TreeNode();
		TreeNode leftleftright = new TreeNode();
		TreeNode rightleft = new TreeNode();
		TreeNode rightright = new TreeNode();
		TreeNode rightrightleft = new TreeNode();
		TreeNode rightrightright = new TreeNode();

		root.setData(67);
		left.setData(39);
		right.setData(76);
		leftleft.setData(28);
		leftright.setData(44);
		leftleftright.setData(29);
		rightleft.setData(74);
		rightright.setData(85);
		rightrightleft.setData(83);
		rightrightright.setData(87);
		
		root.setLeft(left);
		root.setRight(right);
		left.setLeft(leftleft);
		left.setRight(leftright);
		leftleft.setRight(leftleftright);
		right.setLeft(rightleft);
		right.setRight(rightright);
		rightright.setLeft(rightrightleft);
		rightright.setRight(rightrightright);
		
		Assert.assertEquals(binaryTreeService.lowestCommonAncestor(root, 83, 87).getData(), 85);
	}
}
