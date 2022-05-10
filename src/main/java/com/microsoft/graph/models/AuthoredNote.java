package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthoredNote extends Entity implements Parsable {
    /** Identity information about the note's author. */
    private Identity _author;
    /** The content of the note. */
    private ItemBody _content;
    /** The date and time when the entity was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _createdDateTime;
    /**
     * Instantiates a new authoredNote and sets the default values.
     * @return a void
     */
    public AuthoredNote() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authoredNote
     */
    @javax.annotation.Nonnull
    public static AuthoredNote createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthoredNote();
    }
    /**
     * Gets the author property value. Identity information about the note's author.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getAuthor() {
        return this._author;
    }
    /**
     * Gets the content property value. The content of the note.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getContent() {
        return this._content;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the entity was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthoredNote currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("author", (n) -> { currentObject.setAuthor(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("content", (n) -> { currentObject.setContent(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
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
        writer.writeObjectValue("author", this.getAuthor());
        writer.writeObjectValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
    }
    /**
     * Sets the author property value. Identity information about the note's author.
     * @param value Value to set for the author property.
     * @return a void
     */
    public void setAuthor(@javax.annotation.Nullable final Identity value) {
        this._author = value;
    }
    /**
     * Sets the content property value. The content of the note.
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final ItemBody value) {
        this._content = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the entity was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
}
