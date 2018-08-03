package com.haomostudio.SpringMVCTemplate.service.common.service.impl;

import com.haomostudio.SpringMVCTemplate.common.domain.AuthToken;

import java.util.List;

/**
 * Created by admin on 2018/8/3.
 */

public interface IAuthTokenService {

    AuthToken selectOneByObject(AuthToken AuthToken);

    List<AuthToken> selectListByObject(AuthToken AuthToken);

    void insert(AuthToken authToken);

    void update(AuthToken authToken);

}