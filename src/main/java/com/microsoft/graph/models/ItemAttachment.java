package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemAttachment extends Attachment implements Parsable {
    /** The attached contact, message or event. Navigation property. */
    private OutlookItem _item;
    /**
     * Instantiates a new ItemAttachment and sets the default values.
     * @return a void
     */
    public ItemAttachment() {
        super();
        this.setOdataType("#microsoft.graph.itemAttachment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ItemAttachment
     */
    @javax.annotation.Nonnull
    public static ItemAttachment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemAttachment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ItemAttachment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("item", (n) -> { currentObject.setItem(n.getObjectValue(OutlookItem::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the item property value. The attached contact, message or event. Navigation property.
     * @return a outlookItem
     */
    @javax.annotation.Nullable
    public OutlookItem getItem() {
        return this._item;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("item", this.getItem());
    }
    /**
     * Sets the item property value. The attached contact, message or event. Navigation property.
     * @param value Value to set for the item property.
     * @return a void
     */
    public void setItem(@javax.annotation.Nullable final OutlookItem value) {
        this._item = value;
    }
}
