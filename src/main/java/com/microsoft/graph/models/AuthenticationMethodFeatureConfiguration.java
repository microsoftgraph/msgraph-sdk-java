package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationMethodFeatureConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A single entity that is excluded from this feature. */
    private FeatureTarget _excludeTarget;
    /** A single entity that is included in this feature. */
    private FeatureTarget _includeTarget;
    /** The OdataType property */
    private String _odataType;
    /** Enable or disable the feature. Possible values are: default, enabled, disabled, unknownFutureValue. The default value is used when the configuration hasn't been explicitly set and uses the default behavior of Azure AD for the setting. The default value is disabled. */
    private AdvancedConfigState _state;
    /**
     * Instantiates a new authenticationMethodFeatureConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationMethodFeatureConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationMethodFeatureConfiguration
     */
    @javax.annotation.Nonnull
    public static AuthenticationMethodFeatureConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationMethodFeatureConfiguration();
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
     * Gets the excludeTarget property value. A single entity that is excluded from this feature.
     * @return a featureTarget
     */
    @javax.annotation.Nullable
    public FeatureTarget getExcludeTarget() {
        return this._excludeTarget;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("excludeTarget", (n) -> { this.setExcludeTarget(n.getObjectValue(FeatureTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("includeTarget", (n) -> { this.setIncludeTarget(n.getObjectValue(FeatureTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AdvancedConfigState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the includeTarget property value. A single entity that is included in this feature.
     * @return a featureTarget
     */
    @javax.annotation.Nullable
    public FeatureTarget getIncludeTarget() {
        return this._includeTarget;
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
     * Gets the state property value. Enable or disable the feature. Possible values are: default, enabled, disabled, unknownFutureValue. The default value is used when the configuration hasn't been explicitly set and uses the default behavior of Azure AD for the setting. The default value is disabled.
     * @return a advancedConfigState
     */
    @javax.annotation.Nullable
    public AdvancedConfigState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("excludeTarget", this.getExcludeTarget());
        writer.writeObjectValue("includeTarget", this.getIncludeTarget());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the excludeTarget property value. A single entity that is excluded from this feature.
     * @param value Value to set for the excludeTarget property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeTarget(@javax.annotation.Nullable final FeatureTarget value) {
        this._excludeTarget = value;
    }
    /**
     * Sets the includeTarget property value. A single entity that is included in this feature.
     * @param value Value to set for the includeTarget property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeTarget(@javax.annotation.Nullable final FeatureTarget value) {
        this._includeTarget = value;
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
     * Sets the state property value. Enable or disable the feature. Possible values are: default, enabled, disabled, unknownFutureValue. The default value is used when the configuration hasn't been explicitly set and uses the default behavior of Azure AD for the setting. The default value is disabled.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final AdvancedConfigState value) {
        this._state = value;
    }
}
