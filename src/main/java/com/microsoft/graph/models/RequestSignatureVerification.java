package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RequestSignatureVerification implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies which weak algorithms are allowed.  The possible values are: rsaSha1, unknownFutureValue.
     */
    private EnumSet<WeakAlgorithms> allowedWeakAlgorithms;
    /**
     * Specifies whether signed authentication requests for this application should be required.
     */
    private Boolean isSignedRequestRequired;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new RequestSignatureVerification and sets the default values.
     */
    public RequestSignatureVerification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RequestSignatureVerification
     */
    @jakarta.annotation.Nonnull
    public static RequestSignatureVerification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RequestSignatureVerification();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the allowedWeakAlgorithms property value. Specifies which weak algorithms are allowed.  The possible values are: rsaSha1, unknownFutureValue.
     * @return a EnumSet<WeakAlgorithms>
     */
    @jakarta.annotation.Nullable
    public EnumSet<WeakAlgorithms> getAllowedWeakAlgorithms() {
        return this.allowedWeakAlgorithms;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("allowedWeakAlgorithms", (n) -> { this.setAllowedWeakAlgorithms(n.getEnumSetValue(WeakAlgorithms.class)); });
        deserializerMap.put("isSignedRequestRequired", (n) -> { this.setIsSignedRequestRequired(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSignedRequestRequired property value. Specifies whether signed authentication requests for this application should be required.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSignedRequestRequired() {
        return this.isSignedRequestRequired;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("allowedWeakAlgorithms", this.getAllowedWeakAlgorithms());
        writer.writeBooleanValue("isSignedRequestRequired", this.getIsSignedRequestRequired());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowedWeakAlgorithms property value. Specifies which weak algorithms are allowed.  The possible values are: rsaSha1, unknownFutureValue.
     * @param value Value to set for the allowedWeakAlgorithms property.
     */
    public void setAllowedWeakAlgorithms(@jakarta.annotation.Nullable final EnumSet<WeakAlgorithms> value) {
        this.allowedWeakAlgorithms = value;
    }
    /**
     * Sets the isSignedRequestRequired property value. Specifies whether signed authentication requests for this application should be required.
     * @param value Value to set for the isSignedRequestRequired property.
     */
    public void setIsSignedRequestRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.isSignedRequestRequired = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
