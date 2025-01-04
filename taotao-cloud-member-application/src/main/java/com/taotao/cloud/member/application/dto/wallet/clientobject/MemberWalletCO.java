

package com.taotao.cloud.member.application.dto.wallet.clientobject;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
@Data
@Schema(name = "DeptCO", description = "部门")
//public class DeptCO extends TreeUtil.TreeNode<DeptCO> {
public class MemberWalletCO {

	@Serial
	private static final long serialVersionUID = 4116703987840123059L;

	@Schema(name = "sort", description = "部门排序")
	private Integer sort;

}
