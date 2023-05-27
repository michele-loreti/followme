package it.unicam.cs.followme.utilities;

/**
 * This interface is implemented to handle parsing of robot programs. Instances of this interface
 * will be used as follows:
 * <ol>
 *     <li>at the beginning of the parsing method {@link #parsingStarted()} parsingStarted()}</li>
 *     <li>each time the parser recognise a command, the corresponding method is invoked</li>
 *     <li>at the end of the parsing procedure method {@link #parsingDone()} is invoked</li>
 * </ol>
 *
 * @see FollowMeParser
 *
 */
public interface FollowMeParserHandler {


    /**
     * This method is the method that is invoked ad the beginning of the parse procedure.
     */
    void parsingStarted();

    /**
     * This method is the method that is invoked ad the end of the parse procedure.
     */
    void parsingDone();

    /**
     * Method invoked when a command "MOVE" is parsed.
     *
     * @param args argomenti del comando.
     */
    void moveCommand(double[] args);

    /**
     * Method invoked when a command "MOVE RANDOM" is parsed.
     *
     * @param args argomenti del comando.
     */
    void moveRandomCommand(double[] args);

    /**
     * Method invoked when a command "SIGNAL" is parsed.
     *
     * @param label label to signal
     */
    void signalCommand(String label);

    /**
     * Method invoked when a command "UNSIGNAL" is parsed.
     *
     * @param label label to unsignal
     */
    void unsignalCommand(String label);

    /**
     * Method invoked when a command "FOLLOW" is parsed.
     *
     * @param label label to follow
     * @param args command arguments
     */
    void followCommand(String label, double[] args);

    /**
     * Method invoked when a command "STOP" is parsed.
     */
    void stopCommand();

    /**
     * Method invoked when a command "WAIT" is parsed.
     *
     * @param s number of seconds;
     */
    void waitCommand(int s);

    /**
     * Method invoked when a command "REPEAT" is parsed.
     *
     * @param n number of iterations.
     */
    void repeatCommandStart(int n);

    /**
     * Method invoked when a command "UNTIL" is parsed.
     *
     * @param label name of a label
     */
    void untilCommandStart(String label);

    /**
     * Method invoked when a command "DO FOREVER" is parsed.
     */
    void doForeverStart();


    /**
     * Method invoked when a command "DONE" is parsed.
     */
    void doneCommand();
}
