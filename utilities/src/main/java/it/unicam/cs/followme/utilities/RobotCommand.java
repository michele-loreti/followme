package it.unicam.cs.followme.utilities;

import java.util.Optional;
import java.util.stream.Stream;

public enum RobotCommand {




    MOVE("MOVE"),
    SIGNAL("SIGNAL"),
    UNSIGNAL("UNSIGNAL"),
    FOLLOW("FOLLOW"),
    STOP("STOP"),
    SKIP("SKIP"),
    REPEAT("REPEAT"),
    UNTIL("UNTIL"),
    FOREVER("DO FOREVER"),
    DONE("DONE")
    ;

    private final String code;

    RobotCommand(String code) {
        this.code = code;
    }

    boolean isCommandOfLine(String line) {
        return line.startsWith(this.code);
    }

    static Optional<RobotCommand> selectCommand(String line) {
        return Stream.of(RobotCommand.values()).filter(c -> c.isCommandOfLine(line)).findFirst();
    }

}
