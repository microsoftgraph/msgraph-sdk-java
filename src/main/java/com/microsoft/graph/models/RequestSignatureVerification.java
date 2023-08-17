package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RequestSignatureVerification implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies which weak algorithms are allowed.  The possible values are: rsaSha1, unknownFutureValue.
     */
    private WeakAlgorithms allowedWeakAlgorithms;
    /**
     * Specifies whether signed authentication requests for this application should be required.
     */
    private Boolean isSignedRequestRequired;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new requestSignatureVerification and sets the default values.
     */
    public RequestSignatureVerification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a requestSignatureVerification
     */
    @jakarta.annotation.Nonnull
    public static RequestSignatureVerification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RequestSignatureVerification();
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
     * Gets the allowedWeakAlgorithms property value. Specifies which weak algorithms are allowed.  The possible values are: rsaSha1, unknownFutureValue.
     * @return a weakAlgorithms
     */
    @jakarta.annotation.Nullable
    public WeakAlgorithms getAllowedWeakAlgorithms() {
        return this.allowedWeakAlgorithms;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("allowedWeakAlgorithms", (n) -> { this.setAllowedWeakAlgorithms(n.getEnumValue(WeakAlgorithms.class)); });
        deserializerMap.put("isSignedRequestRequired", (n) -> { this.setIsSignedRequestRequired(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSignedRequestRequired property value. Specifies whether signed authentication requests for this application should be required.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSignedRequestRequired() {
        return this.isSignedRequestRequired;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("allowedWeakAlgorithms", this.getAllowedWeakAlgorithms());
        writer.writeBooleanValue("isSignedRequestRequired", this.getIsSignedRequestRequired());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the allowedWeakAlgorithms property value. Specifies which weak algorithms are allowed.  The possible values are: rsaSha1, unknownFutureValue.
     * @param value Value to set for the allowedWeakAlgorithms property.
     */
    public void setAllowedWeakAlgorithms(@jakarta.annotation.Nullable final WeakAlgorithms value) {
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
