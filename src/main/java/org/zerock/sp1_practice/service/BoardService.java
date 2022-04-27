package org.zerock.sp1_practice.service;


import org.zerock.sp1_practice.dto.BoardDTO;
import org.zerock.sp1_practice.dto.ListDTO;

import java.util.List;

public interface BoardService {

    List<BoardDTO> getList(ListDTO listDTO);

}
