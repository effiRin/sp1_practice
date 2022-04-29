package org.zerock.sp1_practice.mapper;

import java.util.List;
import org.zerock.sp1_practice.domain.Board;
import org.zerock.sp1_practice.dto.ListDTO;

public interface GenericMapper <E, K> {

    void insert (E board);

    List<Board> selectList(ListDTO listDTO);

    int getTotal (ListDTO listDTO);

    void delete (K bno);

    Board SelectOne(K bno);

    void update (E board);

}
