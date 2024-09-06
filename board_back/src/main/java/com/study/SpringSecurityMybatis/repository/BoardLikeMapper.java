package com.study.SpringSecurityMybatis.repository;

import com.study.SpringSecurityMybatis.entity.BoardLike;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardLikeMapper {
    int save(BoardLike boardLike);
    int deleteById(Long id);
    BoardLike findByBoardIdAndUserId(@Param("boardId") Long boardId,@Param("userId") Long UserId);  // 매개변수가 여러개일경우 @Param추가
    int getLikeCountByBoardId(Long boardId);
}
