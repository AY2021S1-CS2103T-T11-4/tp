package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.expenditure.Expenditure;

public class ExpenditureCard extends UiPart<Region> {
    private static final String FXML = "ExpenditureListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Expenditure expenditure;

    @javafx.fxml.FXML
    private HBox cardPane;
    @javafx.fxml.FXML
    private Label name;
    @FXML
    private Label id;

    //  @FXML
    //  private FlowPane tags;

    /**
     * Creates a {@code Expenditure} with the given {@code Expenditure} and index to display.
     */
    public ExpenditureCard(Expenditure expenditure, int displayedIndex) {
        super(FXML);
        this.expenditure = expenditure;
        id.setText(displayedIndex + ". ");
        name.setText(expenditure.getExpenditureName().value);
        //budget.getTags().stream()
        //        .sorted(Comparator.comparing(tag -> tag.tagName))
        //        .forEach(tag -> tags.getChildren().add(new Label(tag.tagName)));
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof PersonCard)) {
            return false;
        }

        // state check
        seedu.address.ui.ExpenditureCard card = (ExpenditureCard) other;
        return id.getText().equals(card.id.getText())
                && expenditure.equals(card.expenditure);
    }

}
