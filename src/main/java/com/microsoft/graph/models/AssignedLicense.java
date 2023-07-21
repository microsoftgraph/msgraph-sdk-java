package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class AssignedLicense implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A collection of the unique identifiers for plans that have been disabled.
     */
    private java.util.List<UUID> disabledPlans;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The unique identifier for the SKU.
     */
    private UUID skuId;
    /**
     * Instantiates a new assignedLicense and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AssignedLicense() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignedLicense
     */
    @javax.annotation.Nonnull
    public static AssignedLicense createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignedLicense();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the disabledPlans property value. A collection of the unique identifiers for plans that have been disabled.
     * @return a UUID
     */
    @javax.annotation.Nullable
    public java.util.List<UUID> getDisabledPlans() {
        return this.disabledPlans;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("disabledPlans", (n) -> { this.setDisabledPlans(n.getCollectionOfPrimitiveValues(UUID.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("skuId", (n) -> { this.setSkuId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the skuId property value. The unique identifier for the SKU.
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getSkuId() {
        return this.skuId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("disabledPlans", this.getDisabledPlans());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeUUIDValue("skuId", this.getSkuId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the disabledPlans property value. A collection of the unique identifiers for plans that have been disabled.
     * @param value Value to set for the disabledPlans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisabledPlans(@javax.annotation.Nullable final java.util.List<UUID> value) {
        this.disabledPlans = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the skuId property value. The unique identifier for the SKU.
     * @param value Value to set for the skuId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuId(@javax.annotation.Nullable final UUID value) {
        this.skuId = value;
    }
}
