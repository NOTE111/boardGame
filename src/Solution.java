import java.util.*;
public class Solution {
    public static Integer boardGame(int[][] board, String operation) {
        //메인메소드에서 참조하기 위해 static modifier 추가했습니다.
        // TODO:
        //[0][0] 현재위치
        //U == [현재행 - 1][동일], D == [행 + 1][동일], L == [동일][열 - 1] R == [동일][열 + 1]
        //방문한 곳을 그대로 두면 된다.
        operation = operation.toLowerCase();
        //테이스케이스에선 operation 문자열이 모두 대문자로 들어왔다. 하지만 대소문자 섞여 들어오는 상황을 염두에 두고 toLowerCase()를 호출해줬다.
        Integer bowl = 0;
        //결과리턴할 그릇 만들자!
        int curLine = 0;
        int curRow = 0;
        //행과 열의 인덱스를 각각 선언해주고 현재위치인 0로 초기화해준다.
        int current = board[curLine][curRow];
        //[0][0] 현재위치
        for(int i = 0; i < operation.length(); i++) {
            //for문을 돌려서 문자열 하나하나 뽑아내보자
            switch(operation.charAt(i)) {
                case 'u':
                    curLine--;
                    if(curLine < 0 || curRow < 0 || curLine >= board.length || curRow >= board.length) {
                        return null;
                    }
                    //배열의 indexoutOfBounds를 막기위해 curLine이나 curRow 증감식 후엔 반드시 if문으로 검사해주자.
                    //그래서 주어진 배열의 사이즈를 벗어났다면 null을 반환케하자.
                    current = board[curLine][curRow];
                    break;

                case 'd':
                    curLine++;
                    if(curLine < 0 || curRow < 0 || curLine >= board.length || curRow >= board.length) {
                        return null;
                    }
                    current = board[curLine][curRow];
                    break;

                case 'l':
                    curRow--;
                    if(curLine < 0 || curRow < 0 || curLine >= board.length || curRow >= board.length) {
                        return null;
                    }
                    current = board[curLine][curRow];
                    break;

                case 'r':
                    curRow++;
                    if(curLine < 0 || curRow < 0 || curLine >= board.length || curRow >= board.length) {
                        return null;
                    }
                    current = board[curLine][curRow];
                    break;
            }
            if(board[curLine][curRow] == 1) {
                bowl = bowl + 1;
            }
            //이제 스위치문을 통과해서 어떤 지점에 말이 이동했을거란 말이지 그럼 그 위치 값이 1혹은 0일 것이다.
            //1이라면 처음 만들어놓은 Integer 그릇 bowl에 누적되게 1을 더해준다.
        }
        return bowl;
    }
}
