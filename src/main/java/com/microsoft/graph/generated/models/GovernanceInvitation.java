package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GovernanceInvitation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GovernanceInvitation} and sets the default values.
     */
    public GovernanceInvitation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GovernanceInvitation}
     */
    @jakarta.annotation.Nonnull
    public static GovernanceInvitation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceInvitation();
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("governedTenantId", (n) -> { this.setGovernedTenantId(n.getStringValue()); });
        deserializerMap.put("governedTenantName", (n) -> { this.setGovernedTenantName(n.getStringValue()); });
        deserializerMap.put("governingTenantId", (n) -> { this.setGoverningTenantId(n.getStringValue()); });
        deserializerMap.put("governingTenantName", (n) -> { this.setGoverningTenantName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the governedTenantId property value. The governedTenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGovernedTenantId() {
        return this.backingStore.get("governedTenantId");
    }
    /**
     * Gets the governedTenantName property value. The governedTenantName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGovernedTenantName() {
        return this.backingStore.get("governedTenantName");
    }
    /**
     * Gets the governingTenantId property value. The governingTenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGoverningTenantId() {
        return this.backingStore.get("governingTenantId");
    }
    /**
     * Gets the governingTenantName property value. The governingTenantName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGoverningTenantName() {
        return this.backingStore.get("governingTenantName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("governedTenantId", this.getGovernedTenantId());
        writer.writeStringValue("governedTenantName", this.getGovernedTenantName());
        writer.writeStringValue("governingTenantId", this.getGoverningTenantId());
        writer.writeStringValue("governingTenantName", this.getGoverningTenantName());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the governedTenantId property value. The governedTenantId property
     * @param value Value to set for the governedTenantId property.
     */
    public void setGovernedTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("governedTenantId", value);
    }
    /**
     * Sets the governedTenantName property value. The governedTenantName property
     * @param value Value to set for the governedTenantName property.
     */
    public void setGovernedTenantName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("governedTenantName", value);
    }
    /**
     * Sets the governingTenantId property value. The governingTenantId property
     * @param value Value to set for the governingTenantId property.
     */
    public void setGoverningTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("governingTenantId", value);
    }
    /**
     * Sets the governingTenantName property value. The governingTenantName property
     * @param value Value to set for the governingTenantName property.
     */
    public void setGoverningTenantName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("governingTenantName", value);
    }
}
