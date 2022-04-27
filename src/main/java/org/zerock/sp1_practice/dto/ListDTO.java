package org.zerock.sp1_practice.dto;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class ListDTO {

    private int page;
    private int size;

    public ListDTO(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public void setPage(int page){
        this.page = page <= 0 ? 1 : page;
    }

    public void setSize(int size){
        this.size = size < 10 ? 10 : size;
    }

    public int getSkip(){
        return (this.page - 1) * size;
    }
}
