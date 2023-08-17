package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserRegistrationFeatureCount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The feature property
     */
    private AuthenticationMethodFeature feature;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Number of users.
     */
    private Long userCount;
    /**
     * Instantiates a new userRegistrationFeatureCount and sets the default values.
     */
    public UserRegistrationFeatureCount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userRegistrationFeatureCount
     */
    @jakarta.annotation.Nonnull
    public static UserRegistrationFeatureCount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRegistrationFeatureCount();
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
     * Gets the feature property value. The feature property
     * @return a authenticationMethodFeature
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodFeature getFeature() {
        return this.feature;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("feature", (n) -> { this.setFeature(n.getEnumValue(AuthenticationMethodFeature.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getLongValue()); });
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
     * Gets the userCount property value. Number of users.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getUserCount() {
        return this.userCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("feature", this.getFeature());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("userCount", this.getUserCount());
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
     * Sets the feature property value. The feature property
     * @param value Value to set for the feature property.
     */
    public void setFeature(@jakarta.annotation.Nullable final AuthenticationMethodFeature value) {
        this.feature = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the userCount property value. Number of users.
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Long value) {
        this.userCount = value;
    }
}
