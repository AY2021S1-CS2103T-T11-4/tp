package seedu.address.state.budgetindex;

import java.util.Optional;

public class BudgetIndexManager implements BudgetIndex {
    private int budgetIndex;

    /**
     * Constructor for BudgetIndexManager.
     * @param budgetIndex the index of the current budget.
     */
    public BudgetIndexManager(int budgetIndex) {
        assert budgetIndex >= 0;
        this.budgetIndex = budgetIndex;
    }

    @Override
    public void setIndex(int index) {
        assert index >= 0;
        this.budgetIndex = index;
    }

    @Override
    public Optional<Integer> getBudgetIndex() {
        return Optional.of(this.budgetIndex);
    }
}
