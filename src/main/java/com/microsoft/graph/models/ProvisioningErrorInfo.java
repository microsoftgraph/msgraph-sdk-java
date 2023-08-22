package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvisioningErrorInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Additional details in case of error.
     */
    private String additionalDetails;
    /**
     * Categorizes the error code. Possible values are failure, nonServiceFailure, success, unknownFutureValue
     */
    private ProvisioningStatusErrorCategory errorCategory;
    /**
     * Unique error code if any occurred. Learn more
     */
    private String errorCode;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Summarizes the status and describes why the status happened.
     */
    private String reason;
    /**
     * Provides the resolution for the corresponding error.
     */
    private String recommendedAction;
    /**
     * Instantiates a new provisioningErrorInfo and sets the default values.
     */
    public ProvisioningErrorInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a provisioningErrorInfo
     */
    @jakarta.annotation.Nonnull
    public static ProvisioningErrorInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisioningErrorInfo();
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
     * Gets the additionalDetails property value. Additional details in case of error.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAdditionalDetails() {
        return this.additionalDetails;
    }
    /**
     * Gets the errorCategory property value. Categorizes the error code. Possible values are failure, nonServiceFailure, success, unknownFutureValue
     * @return a provisioningStatusErrorCategory
     */
    @jakarta.annotation.Nullable
    public ProvisioningStatusErrorCategory getErrorCategory() {
        return this.errorCategory;
    }
    /**
     * Gets the errorCode property value. Unique error code if any occurred. Learn more
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("additionalDetails", (n) -> { this.setAdditionalDetails(n.getStringValue()); });
        deserializerMap.put("errorCategory", (n) -> { this.setErrorCategory(n.getEnumValue(ProvisioningStatusErrorCategory.class)); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("recommendedAction", (n) -> { this.setRecommendedAction(n.getStringValue()); });
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
     * Gets the reason property value. Summarizes the status and describes why the status happened.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the recommendedAction property value. Provides the resolution for the corresponding error.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRecommendedAction() {
        return this.recommendedAction;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the additionalDetails property value. Additional details in case of error.
     * @param value Value to set for the additionalDetails property.
     */
    public void setAdditionalDetails(@jakarta.annotation.Nullable final String value) {
        this.additionalDetails = value;
    }
    /**
     * Sets the errorCategory property value. Categorizes the error code. Possible values are failure, nonServiceFailure, success, unknownFutureValue
     * @param value Value to set for the errorCategory property.
     */
    public void setErrorCategory(@jakarta.annotation.Nullable final ProvisioningStatusErrorCategory value) {
        this.errorCategory = value;
    }
    /**
     * Sets the errorCode property value. Unique error code if any occurred. Learn more
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.errorCode = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the reason property value. Summarizes the status and describes why the status happened.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the recommendedAction property value. Provides the resolution for the corresponding error.
     * @param value Value to set for the recommendedAction property.
     */
    public void setRecommendedAction(@jakarta.annotation.Nullable final String value) {
        this.recommendedAction = value;
    }
}
