package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoService {
    private final BoardDataDao boardDataDao;

    public BoardData get(long id) {

        BoardData data = boardDataDao.get(id);

        /** 조회된 게시글이 없는 경우 */
        if (data == null){
            throw new BoardDataNotFountException();
        }

        return data;
    }
}