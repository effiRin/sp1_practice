package org.zerock.sp1_practice.mapper;

import org.apache.ibatis.annotations.Param;
import org.zerock.sp1_practice.domain.Board;
import org.zerock.sp1_practice.dto.ListDTO;

import java.util.List;

public interface BoardMapper {

    void insert(Board board);

    void delete(Integer bno);

    Board selectOne(Integer bno);

    void update(Board board);

        List<Board> selectList(ListDTO listDTO);

        int getTotal(ListDTO listDTO);
    }
