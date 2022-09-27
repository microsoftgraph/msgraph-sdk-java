package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProvisioningErrorInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Additional details in case of error. */
    private String _additionalDetails;
    /** Categorizes the error code. Possible values are failure, nonServiceFailure, success, unknownFutureValue */
    private ProvisioningStatusErrorCategory _errorCategory;
    /** Unique error code if any occurred. Learn more */
    private String _errorCode;
    /** The OdataType property */
    private String _odataType;
    /** Summarizes the status and describes why the status happened. */
    private String _reason;
    /** Provides the resolution for the corresponding error. */
    private String _recommendedAction;
    /**
     * Instantiates a new provisioningErrorInfo and sets the default values.
     * @return a void
     */
    public ProvisioningErrorInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.provisioningErrorInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a provisioningErrorInfo
     */
    @javax.annotation.Nonnull
    public static ProvisioningErrorInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisioningErrorInfo();
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
     * Gets the additionalDetails property value. Additional details in case of error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdditionalDetails() {
        return this._additionalDetails;
    }
    /**
     * Gets the errorCategory property value. Categorizes the error code. Possible values are failure, nonServiceFailure, success, unknownFutureValue
     * @return a provisioningStatusErrorCategory
     */
    @javax.annotation.Nullable
    public ProvisioningStatusErrorCategory getErrorCategory() {
        return this._errorCategory;
    }
    /**
     * Gets the errorCode property value. Unique error code if any occurred. Learn more
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProvisioningErrorInfo currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("additionalDetails", (n) -> { currentObject.setAdditionalDetails(n.getStringValue()); });
            this.put("errorCategory", (n) -> { currentObject.setErrorCategory(n.getEnumValue(ProvisioningStatusErrorCategory.class)); });
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("reason", (n) -> { currentObject.setReason(n.getStringValue()); });
            this.put("recommendedAction", (n) -> { currentObject.setRecommendedAction(n.getStringValue()); });
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
     * Gets the reason property value. Summarizes the status and describes why the status happened.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReason() {
        return this._reason;
    }
    /**
     * Gets the recommendedAction property value. Provides the resolution for the corresponding error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecommendedAction() {
        return this._recommendedAction;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("additionalDetails", this.getAdditionalDetails());
        writer.writeEnumValue("errorCategory", this.getErrorCategory());
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("recommendedAction", this.getRecommendedAction());
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
     * Sets the additionalDetails property value. Additional details in case of error.
     * @param value Value to set for the additionalDetails property.
     * @return a void
     */
    public void setAdditionalDetails(@javax.annotation.Nullable final String value) {
        this._additionalDetails = value;
    }
    /**
     * Sets the errorCategory property value. Categorizes the error code. Possible values are failure, nonServiceFailure, success, unknownFutureValue
     * @param value Value to set for the errorCategory property.
     * @return a void
     */
    public void setErrorCategory(@javax.annotation.Nullable final ProvisioningStatusErrorCategory value) {
        this._errorCategory = value;
    }
    /**
     * Sets the errorCode property value. Unique error code if any occurred. Learn more
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    public void setErrorCode(@javax.annotation.Nullable final String value) {
        this._errorCode = value;
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
     * Sets the reason property value. Summarizes the status and describes why the status happened.
     * @param value Value to set for the reason property.
     * @return a void
     */
    public void setReason(@javax.annotation.Nullable final String value) {
        this._reason = value;
    }
    /**
     * Sets the recommendedAction property value. Provides the resolution for the corresponding error.
     * @param value Value to set for the recommendedAction property.
     * @return a void
     */
    public void setRecommendedAction(@javax.annotation.Nullable final String value) {
        this._recommendedAction = value;
    }
}
