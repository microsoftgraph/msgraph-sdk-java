package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LicenseUnitsDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of units that are enabled for the active subscription of the service SKU. */
    private Integer _enabled;
    /** The OdataType property */
    private String _odataType;
    /** The number of units that are suspended because the subscription of the service SKU has been cancelled. The units cannot be assigned but can still be reactivated before they are deleted. */
    private Integer _suspended;
    /** The number of units that are in warning status. When the subscription of the service SKU has expired, the customer has a grace period to renew their subscription before it is cancelled (moved to a suspended state). */
    private Integer _warning;
    /**
     * Instantiates a new licenseUnitsDetail and sets the default values.
     * @return a void
     */
    public LicenseUnitsDetail() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.licenseUnitsDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a licenseUnitsDetail
     */
    @javax.annotation.Nonnull
    public static LicenseUnitsDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LicenseUnitsDetail();
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
     * Gets the enabled property value. The number of units that are enabled for the active subscription of the service SKU.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnabled() {
        return this._enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LicenseUnitsDetail currentObject = this;
        return new HashMap<>(4) {{
            this.put("enabled", (n) -> { currentObject.setEnabled(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("suspended", (n) -> { currentObject.setSuspended(n.getIntegerValue()); });
            this.put("warning", (n) -> { currentObject.setWarning(n.getIntegerValue()); });
        }};
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
     * Gets the suspended property value. The number of units that are suspended because the subscription of the service SKU has been cancelled. The units cannot be assigned but can still be reactivated before they are deleted.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuspended() {
        return this._suspended;
    }
    /**
     * Gets the warning property value. The number of units that are in warning status. When the subscription of the service SKU has expired, the customer has a grace period to renew their subscription before it is cancelled (moved to a suspended state).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWarning() {
        return this._warning;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("enabled", this.getEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("suspended", this.getSuspended());
        writer.writeIntegerValue("warning", this.getWarning());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the enabled property value. The number of units that are enabled for the active subscription of the service SKU.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    public void setEnabled(@javax.annotation.Nullable final Integer value) {
        this._enabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the suspended property value. The number of units that are suspended because the subscription of the service SKU has been cancelled. The units cannot be assigned but can still be reactivated before they are deleted.
     * @param value Value to set for the suspended property.
     * @return a void
     */
    public void setSuspended(@javax.annotation.Nullable final Integer value) {
        this._suspended = value;
    }
    /**
     * Sets the warning property value. The number of units that are in warning status. When the subscription of the service SKU has expired, the customer has a grace period to renew their subscription before it is cancelled (moved to a suspended state).
     * @param value Value to set for the warning property.
     * @return a void
     */
    public void setWarning(@javax.annotation.Nullable final Integer value) {
        this._warning = value;
    }
}
