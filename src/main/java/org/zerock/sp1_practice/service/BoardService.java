package org.zerock.sp1_practice.service;

import org.zerock.sp1_practice.dto.BoardDTO;
import org.zerock.sp1_practice.dto.ListDTO;
import org.zerock.sp1_practice.dto.ListResponseDTO;

public interface BoardService {

    ListResponseDTO<BoardDTO> getList(ListDTO listDTO);  // 목록 데이터 처리할 때 얘를 이용

    BoardDTO getOne(Integer bno);

}
