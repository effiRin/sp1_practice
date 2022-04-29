package org.zerock.sp1_practice.dto;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class ListDTO {

    private int page;
    private int size;
    private String type;
    private String keyword;

    public ListDTO(){
        this.page = 1;
        this.size = 10;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String[] getTypes(){
        if (type == null){
            return new String[]{}; // 빈 배열
        }
        return type.split("");
    }

    public String getKeyword(){
        return keyword;
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
