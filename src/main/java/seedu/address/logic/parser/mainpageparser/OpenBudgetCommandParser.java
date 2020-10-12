package seedu.address.logic.parser.mainpageparser;

import java.util.stream.Stream;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.main.OpenBudgetCommand;
import seedu.address.logic.parser.ArgumentMultimap;
import seedu.address.logic.parser.Parser;
import seedu.address.logic.parser.ParserUtil;
import seedu.address.logic.parser.Prefix;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.state.budgetindex.BudgetIndex;
import seedu.address.state.budgetindex.BudgetIndexManager;

public class OpenBudgetCommandParser implements Parser<OpenBudgetCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the OpenBudgetCommand
     * and returns an OpenBudgetCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public OpenBudgetCommand parse(String args) throws ParseException {
        BudgetIndex budgetIndex = ParserUtil.parseBudgetIndex(args);
        return new OpenBudgetCommand(budgetIndex);
    }

    /**
     * Returns true if none of the prefixes contains empty {@code Optional} values in the given
     * {@code ArgumentMultimap}.
     */
    private static boolean arePrefixesPresent(ArgumentMultimap argumentMultimap, Prefix... prefixes) {
        return Stream.of(prefixes).allMatch(prefix -> argumentMultimap.getValue(prefix).isPresent());
    }

}
