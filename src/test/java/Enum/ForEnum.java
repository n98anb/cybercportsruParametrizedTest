package Enum;

import static Enum.HeadersEnum.*;

public class ForEnum {

    public static String testWithEnum(HeadersEnum header) {
        return switch (header) {
            case MATCHES -> MATCHES.getHeader();
            case TOURNAMENTS -> TOURNAMENTS.getHeader();
            case TEAMS -> TEAMS.getHeader();
            case BLOG -> BLOG.getHeader();
            case GAMES -> GAMES.getHeader();
        };
    }
}
