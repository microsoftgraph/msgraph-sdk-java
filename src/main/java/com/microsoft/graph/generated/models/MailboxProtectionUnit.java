package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailboxProtectionUnit extends ProtectionUnitBase implements Parsable {
    /**
     * Instantiates a new {@link MailboxProtectionUnit} and sets the default values.
     */
    public MailboxProtectionUnit() {
        super();
        this.setOdataType("#microsoft.graph.mailboxProtectionUnit");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MailboxProtectionUnit}
     */
    @jakarta.annotation.Nonnull
    public static MailboxProtectionUnit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailboxProtectionUnit();
    }
    /**
     * Gets the directoryObjectId property value. The ID of the directory object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirectoryObjectId() {
        return this.backingStore.get("directoryObjectId");
    }
    /**
     * Gets the displayName property value. Display name of the directory object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the email property value. Email address associated with the directory object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("directoryObjectId", (n) -> { this.setDirectoryObjectId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("directoryObjectId", this.getDirectoryObjectId());
    }
    /**
     * Sets the directoryObjectId property value. The ID of the directory object.
     * @param value Value to set for the directoryObjectId property.
     */
    public void setDirectoryObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("directoryObjectId", value);
    }
    /**
     * Sets the displayName property value. Display name of the directory object.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the email property value. Email address associated with the directory object.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
}
