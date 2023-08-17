package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class LicenseAssignmentState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The assignedByGroup property
     */
    private String assignedByGroup;
    /**
     * The disabledPlans property
     */
    private java.util.List<UUID> disabledPlans;
    /**
     * The error property
     */
    private String error;
    /**
     * The lastUpdatedDateTime property
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The skuId property
     */
    private UUID skuId;
    /**
     * The state property
     */
    private String state;
    /**
     * Instantiates a new licenseAssignmentState and sets the default values.
     */
    public LicenseAssignmentState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a licenseAssignmentState
     */
    @jakarta.annotation.Nonnull
    public static LicenseAssignmentState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LicenseAssignmentState();
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
     * Gets the assignedByGroup property value. The assignedByGroup property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignedByGroup() {
        return this.assignedByGroup;
    }
    /**
     * Gets the disabledPlans property value. The disabledPlans property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getDisabledPlans() {
        return this.disabledPlans;
    }
    /**
     * Gets the error property value. The error property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("assignedByGroup", (n) -> { this.setAssignedByGroup(n.getStringValue()); });
        deserializerMap.put("disabledPlans", (n) -> { this.setDisabledPlans(n.getCollectionOfPrimitiveValues(UUID.class)); });
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("skuId", (n) -> { this.setSkuId(n.getUUIDValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
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
     * Gets the skuId property value. The skuId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getSkuId() {
        return this.skuId;
    }
    /**
     * Gets the state property value. The state property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assignedByGroup", this.getAssignedByGroup());
        writer.writeCollectionOfPrimitiveValues("disabledPlans", this.getDisabledPlans());
        writer.writeStringValue("error", this.getError());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeUUIDValue("skuId", this.getSkuId());
        writer.writeStringValue("state", this.getState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the assignedByGroup property value. The assignedByGroup property
     * @param value Value to set for the assignedByGroup property.
     */
    public void setAssignedByGroup(@jakarta.annotation.Nullable final String value) {
        this.assignedByGroup = value;
    }
    /**
     * Sets the disabledPlans property value. The disabledPlans property
     * @param value Value to set for the disabledPlans property.
     */
    public void setDisabledPlans(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.disabledPlans = value;
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the skuId property value. The skuId property
     * @param value Value to set for the skuId property.
     */
    public void setSkuId(@jakarta.annotation.Nullable final UUID value) {
        this.skuId = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
}
