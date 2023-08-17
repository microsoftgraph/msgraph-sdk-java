package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LicenseUnitsDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of units that are enabled for the active subscription of the service SKU.
     */
    private Integer enabled;
    /**
     * The number of units that are locked out because the customer cancelled their subscription of the service SKU.
     */
    private Integer lockedOut;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The number of units that are suspended because the subscription of the service SKU has been cancelled. The units cannot be assigned but can still be reactivated before they are deleted.
     */
    private Integer suspended;
    /**
     * The number of units that are in warning status. When the subscription of the service SKU has expired, the customer has a grace period to renew their subscription before it is cancelled (moved to a suspended state).
     */
    private Integer warning;
    /**
     * Instantiates a new licenseUnitsDetail and sets the default values.
     */
    public LicenseUnitsDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a licenseUnitsDetail
     */
    @jakarta.annotation.Nonnull
    public static LicenseUnitsDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LicenseUnitsDetail();
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
     * Gets the enabled property value. The number of units that are enabled for the active subscription of the service SKU.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getIntegerValue()); });
        deserializerMap.put("lockedOut", (n) -> { this.setLockedOut(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("suspended", (n) -> { this.setSuspended(n.getIntegerValue()); });
        deserializerMap.put("warning", (n) -> { this.setWarning(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lockedOut property value. The number of units that are locked out because the customer cancelled their subscription of the service SKU.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getLockedOut() {
        return this.lockedOut;
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
     * Gets the suspended property value. The number of units that are suspended because the subscription of the service SKU has been cancelled. The units cannot be assigned but can still be reactivated before they are deleted.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuspended() {
        return this.suspended;
    }
    /**
     * Gets the warning property value. The number of units that are in warning status. When the subscription of the service SKU has expired, the customer has a grace period to renew their subscription before it is cancelled (moved to a suspended state).
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWarning() {
        return this.warning;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("enabled", this.getEnabled());
        writer.writeIntegerValue("lockedOut", this.getLockedOut());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("suspended", this.getSuspended());
        writer.writeIntegerValue("warning", this.getWarning());
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
     * Sets the enabled property value. The number of units that are enabled for the active subscription of the service SKU.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Integer value) {
        this.enabled = value;
    }
    /**
     * Sets the lockedOut property value. The number of units that are locked out because the customer cancelled their subscription of the service SKU.
     * @param value Value to set for the lockedOut property.
     */
    public void setLockedOut(@jakarta.annotation.Nullable final Integer value) {
        this.lockedOut = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the suspended property value. The number of units that are suspended because the subscription of the service SKU has been cancelled. The units cannot be assigned but can still be reactivated before they are deleted.
     * @param value Value to set for the suspended property.
     */
    public void setSuspended(@jakarta.annotation.Nullable final Integer value) {
        this.suspended = value;
    }
    /**
     * Sets the warning property value. The number of units that are in warning status. When the subscription of the service SKU has expired, the customer has a grace period to renew their subscription before it is cancelled (moved to a suspended state).
     * @param value Value to set for the warning property.
     */
    public void setWarning(@jakarta.annotation.Nullable final Integer value) {
        this.warning = value;
    }
}
