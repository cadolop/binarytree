package com.masivian.binarytree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masivian.binarytree.model.TreeNode;

/**
 * This inteface is the JPA repository to create a Binary Tree
 * @author cadolop@gmail.com
 * @version 1.0
 *
 */
public interface TreeNodeRepository extends JpaRepository<TreeNode, Long> {
}
