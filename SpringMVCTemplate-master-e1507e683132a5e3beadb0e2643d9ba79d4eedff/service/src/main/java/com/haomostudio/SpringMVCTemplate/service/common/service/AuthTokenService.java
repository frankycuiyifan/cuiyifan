package com.haomostudio.SpringMVCTemplate.service.common.service;

import com.haomostudio.SpringMVCTemplate.common.domain.AuthToken;
import com.haomostudio.SpringMVCTemplate.service.common.service.impl.AuthTokenDao;
import com.haomostudio.SpringMVCTemplate.service.common.service.impl.IAuthTokenService;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2018/8/3.
 */
@Service("authTokenService")
public class AuthTokenService implements IAuthTokenService {
    @Autowired
    private AuthTokenDao authTokenDao;
    @Override
    public void insert(AuthToken authToken){
        authTokenDao.insert(authToken);
    }

    @Override
    public void update(AuthToken authToken){
        authTokenDao.update(authToken);
    }
}
