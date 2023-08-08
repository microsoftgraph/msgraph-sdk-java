package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Shared implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The identity of the owner of the shared item. Read-only.
     */
    private IdentitySet owner;
    /**
     * Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only.
     */
    private String scope;
    /**
     * The identity of the user who shared the item. Read-only.
     */
    private IdentitySet sharedBy;
    /**
     * The UTC date and time when the item was shared. Read-only.
     */
    private OffsetDateTime sharedDateTime;
    /**
     * Instantiates a new shared and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Shared() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a shared
     */
    @jakarta.annotation.Nonnull
    public static Shared createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Shared();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getStringValue()); });
        deserializerMap.put("sharedBy", (n) -> { this.setSharedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedDateTime", (n) -> { this.setSharedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the owner property value. The identity of the owner of the shared item. Read-only.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getOwner() {
        return this.owner;
    }
    /**
     * Gets the scope property value. Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getScope() {
        return this.scope;
    }
    /**
     * Gets the sharedBy property value. The identity of the user who shared the item. Read-only.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getSharedBy() {
        return this.sharedBy;
    }
    /**
     * Gets the sharedDateTime property value. The UTC date and time when the item was shared. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSharedDateTime() {
        return this.sharedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("owner", this.getOwner());
        writer.writeStringValue("scope", this.getScope());
        writer.writeObjectValue("sharedBy", this.getSharedBy());
        writer.writeOffsetDateTimeValue("sharedDateTime", this.getSharedDateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the owner property value. The identity of the owner of the shared item. Read-only.
     * @param value Value to set for the owner property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOwner(@jakarta.annotation.Nullable final IdentitySet value) {
        this.owner = value;
    }
    /**
     * Sets the scope property value. Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only.
     * @param value Value to set for the scope property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setScope(@jakarta.annotation.Nullable final String value) {
        this.scope = value;
    }
    /**
     * Sets the sharedBy property value. The identity of the user who shared the item. Read-only.
     * @param value Value to set for the sharedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSharedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.sharedBy = value;
    }
    /**
     * Sets the sharedDateTime property value. The UTC date and time when the item was shared. Read-only.
     * @param value Value to set for the sharedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSharedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.sharedDateTime = value;
    }
}
