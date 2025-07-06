package com.taotao.cloud.member.api.feign.request;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Setter
@Getter
@ToString
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "会员收货地址DTO")
public class MemberRechargeQueryApiRequest implements Serializable {

	@Serial
	private static final long serialVersionUID = -7605952923416404638L;

	private String sn;
}
