package Enum;

/*
Енам, содержащий в себе ожидаемые заголовки
 */
public enum HeadersEnum {
    MATCHES("Матчи"),
    TOURNAMENTS("Турниры"),
    TEAMS("Команды"),
    BLOG("Блоги"),
    GAMES("Игры");

    private final String header;

    HeadersEnum(String header){
        this.header = header;

    }

    public String getHeader(){
        return header;
    }
}

