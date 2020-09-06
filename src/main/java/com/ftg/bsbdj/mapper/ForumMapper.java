package com.ftg.bsbdj.mapper;

import com.ftg.bsbdj.entity.Forum;

public interface ForumMapper {
    int deleteByPrimaryKey(Long forumId);

    int insert(Forum record);

    int insertSelective(Forum record);

    Forum selectByPrimaryKey(Long forumId);

    int updateByPrimaryKeySelective(Forum record);

    int updateByPrimaryKeyWithBLOBs(Forum record);

    int updateByPrimaryKey(Forum record);
}