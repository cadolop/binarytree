package com.masivian.binarytree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masivian.binarytree.model.TreeNode;

public interface TreeNodeRepository extends JpaRepository<TreeNode, Long> {
}
