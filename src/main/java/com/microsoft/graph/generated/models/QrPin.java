package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QrPin extends Entity implements Parsable {
    /**
     * Instantiates a new {@link QrPin} and sets the default values.
     */
    public QrPin() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QrPin}
     */
    @jakarta.annotation.Nonnull
    public static QrPin createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QrPin();
    }
    /**
     * Gets the code property value. The PIN code value. This property is only returned at the time of creating or resetting the PIN. For GET operations, this property returns null. The PIN must be between 8-20 digits.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.backingStore.get("code");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the PIN was created. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("forceChangePinNextSignIn", (n) -> { this.setForceChangePinNextSignIn(n.getBooleanValue()); });
        deserializerMap.put("updatedDateTime", (n) -> { this.setUpdatedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the forceChangePinNextSignIn property value. Indicates whether the user must change the PIN on their next sign-in. This is true when an admin creates or resets the PIN, and false after the user changes it.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getForceChangePinNextSignIn() {
        return this.backingStore.get("forceChangePinNextSignIn");
    }
    /**
     * Gets the updatedDateTime property value. The date and time when the PIN was last updated. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedDateTime() {
        return this.backingStore.get("updatedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("code", this.getCode());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeBooleanValue("forceChangePinNextSignIn", this.getForceChangePinNextSignIn());
        writer.writeOffsetDateTimeValue("updatedDateTime", this.getUpdatedDateTime());
    }
    /**
     * Sets the code property value. The PIN code value. This property is only returned at the time of creating or resetting the PIN. For GET operations, this property returns null. The PIN must be between 8-20 digits.
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("code", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the PIN was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the forceChangePinNextSignIn property value. Indicates whether the user must change the PIN on their next sign-in. This is true when an admin creates or resets the PIN, and false after the user changes it.
     * @param value Value to set for the forceChangePinNextSignIn property.
     */
    public void setForceChangePinNextSignIn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("forceChangePinNextSignIn", value);
    }
    /**
     * Sets the updatedDateTime property value. The date and time when the PIN was last updated. Read-only.
     * @param value Value to set for the updatedDateTime property.
     */
    public void setUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("updatedDateTime", value);
    }
}
