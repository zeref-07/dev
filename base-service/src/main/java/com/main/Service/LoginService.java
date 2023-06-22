package com.main.Service;

import com.main.Dao.UserinfoDao;
import com.main.Entity.UserinfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private UserinfoDao userinfoDao;

    public UserinfoEntity getUserinfo(long id){
        return userinfoDao.getId(id);
    }
}
