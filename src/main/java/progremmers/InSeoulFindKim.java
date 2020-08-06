package progremmers;

import java.util.stream.IntStream;

public class InSeoulFindKim {

    public String solution(String[] seoul) {
        String answer = "";
        int index = IntStream.range(0, seoul.length).filter(i -> "Kim".equals(seoul[i])).findFirst().orElse(-1);
        answer = "김서방은 " + index + "에 있다";
        return answer;
    }
}
