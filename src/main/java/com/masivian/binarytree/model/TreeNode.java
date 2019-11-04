package com.masivian.binarytree.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class TreeNode {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	int data;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn
	TreeNode left;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn
	TreeNode right;

	public TreeNode() {
	}

}