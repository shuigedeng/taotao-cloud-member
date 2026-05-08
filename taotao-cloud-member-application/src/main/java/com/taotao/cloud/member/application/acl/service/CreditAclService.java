package com.taotao.cloud.member.application.acl.service;

import com.taotao.cloud.goods.application.dto.credit.req.CreditReq;
import com.taotao.cloud.goods.application.dto.credit.res.CreditRes;

public interface CreditAclService {
	CreditRes credit(CreditReq creditReq);
}
