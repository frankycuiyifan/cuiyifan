package com.haomostudio.SpringMVCTemplate.service.common.service.impl;

import com.haomostudio.SpringMVCTemplate.common.domain.AuthToken;

import java.util.List;

/**
 *
 *
 * @author 崔弈凡
 * @date 2018-08-02 20:50:40
 */
public interface AuthTokenDao {
    public interface AuthTokenDao {

        AuthToken selectOneByObject(AuthToken AuthToken);

        List<AuthToken> selectListByObject(AuthToken AuthToken);

        void insert(AuthToken authToken);

        void update(AuthToken authToken);
    }
}

