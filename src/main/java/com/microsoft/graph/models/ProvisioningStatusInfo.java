package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProvisioningStatusInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The errorInformation property */
    private ProvisioningErrorInfo _errorInformation;
    /** The OdataType property */
    private String _odataType;
    /** Possible values are: success, warning, failure, skipped, unknownFutureValue. */
    private ProvisioningResult _status;
    /**
     * Instantiates a new provisioningStatusInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProvisioningStatusInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.provisioningStatusInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a provisioningStatusInfo
     */
    @javax.annotation.Nonnull
    public static ProvisioningStatusInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisioningStatusInfo();
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
     * Gets the errorInformation property value. The errorInformation property
     * @return a provisioningErrorInfo
     */
    @javax.annotation.Nullable
    public ProvisioningErrorInfo getErrorInformation() {
        return this._errorInformation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProvisioningStatusInfo currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("errorInformation", (n) -> { currentObject.setErrorInformation(n.getObjectValue(ProvisioningErrorInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ProvisioningResult.class)); });
        return deserializerMap;
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
     * Gets the status property value. Possible values are: success, warning, failure, skipped, unknownFutureValue.
     * @return a provisioningResult
     */
    @javax.annotation.Nullable
    public ProvisioningResult getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("errorInformation", this.getErrorInformation());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the errorInformation property value. The errorInformation property
     * @param value Value to set for the errorInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorInformation(@javax.annotation.Nullable final ProvisioningErrorInfo value) {
        this._errorInformation = value;
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
     * Sets the status property value. Possible values are: success, warning, failure, skipped, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ProvisioningResult value) {
        this._status = value;
    }
}
