package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DistributionListMember extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DistributionListMember} and sets the default values.
     */
    public DistributionListMember() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DistributionListMember}
     */
    @jakarta.annotation.Nonnull
    public static DistributionListMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DistributionListMember();
    }
    /**
     * Gets the contact property value. The contact associated with the distribution list member. Read-only.
     * @return a {@link Contact}
     */
    @jakarta.annotation.Nullable
    public Contact getContact() {
        return this.backingStore.get("contact");
    }
    /**
     * Gets the displayName property value. The display name of the member. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contact", (n) -> { this.setContact(n.getObjectValue(Contact::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("memberId", (n) -> { this.setMemberId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RecipientType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the memberId property value. A system-generated unique identifier. Nonempty for contact, privateDL, and mailbox members. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMemberId() {
        return this.backingStore.get("memberId");
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link RecipientType}
     */
    @jakarta.annotation.Nullable
    public RecipientType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("contact", this.getContact());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("memberId", this.getMemberId());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the contact property value. The contact associated with the distribution list member. Read-only.
     * @param value Value to set for the contact property.
     */
    public void setContact(@jakarta.annotation.Nullable final Contact value) {
        this.backingStore.set("contact", value);
    }
    /**
     * Sets the displayName property value. The display name of the member. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the memberId property value. A system-generated unique identifier. Nonempty for contact, privateDL, and mailbox members. Read-only.
     * @param value Value to set for the memberId property.
     */
    public void setMemberId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("memberId", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final RecipientType value) {
        this.backingStore.set("type", value);
    }
}
