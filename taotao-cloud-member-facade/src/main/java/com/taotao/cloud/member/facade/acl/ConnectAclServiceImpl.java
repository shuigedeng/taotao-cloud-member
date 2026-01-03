package com.taotao.cloud.member.facade.acl;

import com.taotao.cloud.goods.application.acl.ConnectAclService;
import com.taotao.cloud.goods.application.dto.connect.req.ConnectReq;
import com.taotao.cloud.goods.application.dto.connect.res.ConnectRes;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * ConnectAclServiceImpl
 *
 * @author shuigedeng
 * @version 2026.02
 * @since 2025-12-19 09:30:45
 */
@AllArgsConstructor
@Service
public class ConnectAclServiceImpl implements ConnectAclService {

    @Override
    public ConnectRes connect( ConnectReq connectReq ) {
        return null;
    }
}
