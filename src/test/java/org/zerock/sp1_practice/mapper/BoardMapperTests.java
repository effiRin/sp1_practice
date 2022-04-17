package org.zerock.sp1_practice.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.sp1_practice.domain.Board;

import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations ="file:src/main/webapp/WEB-INF/root-context.xml")
public class BoardMapperTests {

    @Autowired(required = false)
    private BoardMapper boardMapper;

    @Test
    public void testInsert(){

        Board board = Board.builder()
                .title("제목")
                .content("내용")
                .writer("user1")
                .build();

        boardMapper.insert(board);
        log.info(board);
    }

    @Test
    public void testSelectList(){

        List<Board> boardList = boardMapper.selectList(0,10);
        boardList.forEach(board -> log.info(board));
    }

    @Test
    public void testSelectOne(){
        int bno = 50;
        Board board = boardMapper.selectOne(bno);
        log.info(board);
    }

    @Test
    public void testDelete(){
        int bno = 50;
        boardMapper.delete(bno);
    }


}
