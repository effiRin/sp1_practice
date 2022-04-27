package org.zerock.sp1_practice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zerock.sp1_practice.dto.BoardDTO;
import org.zerock.sp1_practice.dto.ListDTO;
import org.zerock.sp1_practice.mapper.BoardMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getList(ListDTO listDTO) {
        return null;
    }
}
