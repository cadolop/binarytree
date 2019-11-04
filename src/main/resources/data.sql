DROP TABLE IF EXISTS tree_node;

CREATE TABLE tree_node (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  data INT NOT NULL,
  left_id BIGINT,
  right_id BIGINT
);

ALTER TABLE tree_node
ADD FOREIGN KEY (left_id)
REFERENCES tree_node(id);

ALTER TABLE tree_node
ADD FOREIGN KEY (right_id)
REFERENCES tree_node(id);