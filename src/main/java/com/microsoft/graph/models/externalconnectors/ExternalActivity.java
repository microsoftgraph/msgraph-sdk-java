package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExternalActivity extends Entity implements Parsable {
    /**
     * Represents an identity used to identify who is responsible for the activity.
     */
    private Identity performedBy;
    /**
     * The date and time when the particular activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime startDateTime;
    /**
     * The type property
     */
    private ExternalActivityType type;
    /**
     * Instantiates a new externalActivity and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ExternalActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a externalActivity
     */
    @jakarta.annotation.Nonnull
    public static ExternalActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.externalConnectors.externalActivityResult": return new ExternalActivityResult();
            }
        }
        return new ExternalActivity();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("performedBy", (n) -> { this.setPerformedBy(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ExternalActivityType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the performedBy property value. Represents an identity used to identify who is responsible for the activity.
     * @return a identity
     */
    @jakarta.annotation.Nullable
    public Identity getPerformedBy() {
        return this.performedBy;
    }
    /**
     * Gets the startDateTime property value. The date and time when the particular activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the type property value. The type property
     * @return a externalActivityType
     */
    @jakarta.annotation.Nullable
    public ExternalActivityType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("performedBy", this.getPerformedBy());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the performedBy property value. Represents an identity used to identify who is responsible for the activity.
     * @param value Value to set for the performedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPerformedBy(@jakarta.annotation.Nullable final Identity value) {
        this.performedBy = value;
    }
    /**
     * Sets the startDateTime property value. The date and time when the particular activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setType(@jakarta.annotation.Nullable final ExternalActivityType value) {
        this.type = value;
    }
}
