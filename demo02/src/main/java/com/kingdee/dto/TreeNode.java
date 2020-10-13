package com.kingdee.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 树结构
 *
 * @author qy
 * @date 2020/10/13
 */
@Getter
@Setter
class TreeNode {
    private String id;
    private String code;
    private String text;
    private List<TreeNode> children;
}
