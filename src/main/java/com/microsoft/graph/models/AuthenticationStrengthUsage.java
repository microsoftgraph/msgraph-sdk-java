package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationStrengthUsage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The mfa property
     */
    private java.util.List<ConditionalAccessPolicy> mfa;
    /**
     * The none property
     */
    private java.util.List<ConditionalAccessPolicy> none;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new authenticationStrengthUsage and sets the default values.
     */
    public AuthenticationStrengthUsage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationStrengthUsage
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationStrengthUsage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationStrengthUsage();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("mfa", (n) -> { this.setMfa(n.getCollectionOfObjectValues(ConditionalAccessPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("none", (n) -> { this.setNone(n.getCollectionOfObjectValues(ConditionalAccessPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mfa property value. The mfa property
     * @return a conditionalAccessPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessPolicy> getMfa() {
        return this.mfa;
    }
    /**
     * Gets the none property value. The none property
     * @return a conditionalAccessPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessPolicy> getNone() {
        return this.none;
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
        writer.writeCollectionOfObjectValues("mfa", this.getMfa());
        writer.writeCollectionOfObjectValues("none", this.getNone());
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
     * Sets the mfa property value. The mfa property
     * @param value Value to set for the mfa property.
     */
    public void setMfa(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessPolicy> value) {
        this.mfa = value;
    }
    /**
     * Sets the none property value. The none property
     * @param value Value to set for the none property.
     */
    public void setNone(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessPolicy> value) {
        this.none = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
