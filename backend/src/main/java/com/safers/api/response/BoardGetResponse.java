package com.safers.api.response;

import com.safers.db.entity.board.Board;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
public class BoardGetResponse {

    @ApiModelProperty
    String id;

    @ApiModelProperty
    String userId;

    @ApiModelProperty
    String title;

    @ApiModelProperty
    String content;

    @ApiModelProperty
    LocalDateTime regDt;

    @ApiModelProperty
    Boolean isDelete;

    @ApiModelProperty
    List<String> fileList;

    public BoardGetResponse of(Board board, List<String> boardImageList) {
        BoardGetResponse res = new BoardGetResponse();
        res.setId(board.getId());
        res.setUserId(board.getUser().getId());
        res.setTitle(board.getTitle());
        res.setContent(board.getContent());
        res.setRegDt(board.getRegDt());
        res.setFileList(boardImageList);
        res.setIsDelete(board.getIsDelete());
        return res;
    }
}