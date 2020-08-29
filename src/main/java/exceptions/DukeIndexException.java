package exceptions;

/**
 * Error type for Index Errors that appear when trying to perform a command.
 */
public class DukeIndexException extends DukeException {
    int size;
    /**
     * Constructor for a DukeIndexException to indicate that the given command or index is invalid
     * @param cmd Command or Index that is invalid
     * @param size The actual or given size of the list
     */
    public DukeIndexException(String cmd, int size){
        super(cmd,5);
        this.size = size;
    }

    /**
     * Takes in the given bad input and the code
     * @return String message
     */
    public String message(String s) {
        StringBuilder b = new StringBuilder("");
        b.append("\t Oops you requested for a index ourside the list range or a non numeric index:\n");
        b.append("\t ").append(bad_cmd).append("\n");
        b.append("\t ").append(s);
        b.append(": ").append(code.toString()).append(" out of ").append(size).append("\n");
        b.append("\t Heres a tip, use the 'list' command to see the current tasks!\n");
        return b.toString();
    }
}
