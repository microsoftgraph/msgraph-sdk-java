package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OutlookCategory extends Entity implements Parsable {
    /** A pre-set color constant that characterizes a category, and that is mapped to one of 25 predefined colors. See the note below.  */
    private CategoryColor _color;
    /** A unique name that identifies a category in the user's mailbox. After a category is created, the name cannot be changed. Read-only.  */
    private String _displayName;
    /**
     * Instantiates a new outlookCategory and sets the default values.
     * @return a void
     */
    public OutlookCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a outlookCategory
     */
    @javax.annotation.Nonnull
    public static OutlookCategory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookCategory();
    }
    /**
     * Gets the color property value. A pre-set color constant that characterizes a category, and that is mapped to one of 25 predefined colors. See the note below.
     * @return a categoryColor
     */
    @javax.annotation.Nullable
    public CategoryColor getColor() {
        return this._color;
    }
    /**
     * Gets the displayName property value. A unique name that identifies a category in the user's mailbox. After a category is created, the name cannot be changed. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OutlookCategory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("color", (n) -> { currentObject.setColor(n.getEnumValue(CategoryColor.class)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("color", this.getColor());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the color property value. A pre-set color constant that characterizes a category, and that is mapped to one of 25 predefined colors. See the note below.
     * @param value Value to set for the color property.
     * @return a void
     */
    public void setColor(@javax.annotation.Nullable final CategoryColor value) {
        this._color = value;
    }
    /**
     * Sets the displayName property value. A unique name that identifies a category in the user's mailbox. After a category is created, the name cannot be changed. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
}
