package collections.binarytree;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/* Class BTNode */
@Data
@Builder
@AllArgsConstructor
public class BTNode {
    private BTNode left;
    private BTNode right;
    private int data;
}
