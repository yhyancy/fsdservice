package com.fsd.data.mapper;

import com.fsd.data.entity.UserInfoDB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserInfoMapper {
    UserInfoDB selectUserByName(String userName);
}
