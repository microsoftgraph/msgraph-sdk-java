package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PublicationFacet implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new PublicationFacet and sets the default values.
     */
    public PublicationFacet() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PublicationFacet
     */
    @jakarta.annotation.Nonnull
    public static PublicationFacet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PublicationFacet();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the checkedOutBy property value. User who has checked out the file.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCheckedOutBy() {
        return this.getBackingStore().get("checkedOutBy");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("checkedOutBy", (n) -> { this.setCheckedOutBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("level", (n) -> { this.setLevel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("versionId", (n) -> { this.setVersionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the level property value. The state of publication for this document. Either published or checkout. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLevel() {
        return this.getBackingStore().get("level");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the versionId property value. The unique identifier for the version that is visible to the current caller. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersionId() {
        return this.getBackingStore().get("versionId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("checkedOutBy", this.getCheckedOutBy());
        writer.writeStringValue("level", this.getLevel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("versionId", this.getVersionId());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the checkedOutBy property value. User who has checked out the file.
     * @param value Value to set for the checkedOutBy property.
     */
    public void setCheckedOutBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.getBackingStore().set("checkedOutBy", value);
    }
    /**
     * Sets the level property value. The state of publication for this document. Either published or checkout. Read-only.
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("level", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the versionId property value. The unique identifier for the version that is visible to the current caller. Read-only.
     * @param value Value to set for the versionId property.
     */
    public void setVersionId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("versionId", value);
    }
}
