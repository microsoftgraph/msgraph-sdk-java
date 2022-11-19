package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Shared implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The identity of the owner of the shared item. Read-only. */
    private IdentitySet _owner;
    /** Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only. */
    private String _scope;
    /** The identity of the user who shared the item. Read-only. */
    private IdentitySet _sharedBy;
    /** The UTC date and time when the item was shared. Read-only. */
    private OffsetDateTime _sharedDateTime;
    /**
     * Instantiates a new shared and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Shared() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.shared");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a shared
     */
    @javax.annotation.Nonnull
    public static Shared createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Shared();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Shared currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { currentObject.setOwner(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("scope", (n) -> { currentObject.setScope(n.getStringValue()); });
        deserializerMap.put("sharedBy", (n) -> { currentObject.setSharedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedDateTime", (n) -> { currentObject.setSharedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the owner property value. The identity of the owner of the shared item. Read-only.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getOwner() {
        return this._owner;
    }
    /**
     * Gets the scope property value. Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScope() {
        return this._scope;
    }
    /**
     * Gets the sharedBy property value. The identity of the user who shared the item. Read-only.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getSharedBy() {
        return this._sharedBy;
    }
    /**
     * Gets the sharedDateTime property value. The UTC date and time when the item was shared. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSharedDateTime() {
        return this._sharedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the owner property value. The identity of the owner of the shared item. Read-only.
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final IdentitySet value) {
        this._owner = value;
    }
    /**
     * Sets the scope property value. Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only.
     * @param value Value to set for the scope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScope(@javax.annotation.Nullable final String value) {
        this._scope = value;
    }
    /**
     * Sets the sharedBy property value. The identity of the user who shared the item. Read-only.
     * @param value Value to set for the sharedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._sharedBy = value;
    }
    /**
     * Sets the sharedDateTime property value. The UTC date and time when the item was shared. Read-only.
     * @param value Value to set for the sharedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._sharedDateTime = value;
    }
}
