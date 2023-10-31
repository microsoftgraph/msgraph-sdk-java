package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftAuthenticatorFeatureSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new MicrosoftAuthenticatorFeatureSettings and sets the default values.
     */
    public MicrosoftAuthenticatorFeatureSettings() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftAuthenticatorFeatureSettings
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftAuthenticatorFeatureSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAuthenticatorFeatureSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the displayAppInformationRequiredState property value. Determines whether the user's Authenticator app shows them the client app they're signing into.
     * @return a AuthenticationMethodFeatureConfiguration
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodFeatureConfiguration getDisplayAppInformationRequiredState() {
        return this.getBackingStore().get("displayAppInformationRequiredState");
    }
    /**
     * Gets the displayLocationInformationRequiredState property value. Determines whether the user's Authenticator app shows them the geographic location of where the authentication request originated from.
     * @return a AuthenticationMethodFeatureConfiguration
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodFeatureConfiguration getDisplayLocationInformationRequiredState() {
        return this.getBackingStore().get("displayLocationInformationRequiredState");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("displayAppInformationRequiredState", (n) -> { this.setDisplayAppInformationRequiredState(n.getObjectValue(AuthenticationMethodFeatureConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("displayLocationInformationRequiredState", (n) -> { this.setDisplayLocationInformationRequiredState(n.getObjectValue(AuthenticationMethodFeatureConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("displayAppInformationRequiredState", this.getDisplayAppInformationRequiredState());
        writer.writeObjectValue("displayLocationInformationRequiredState", this.getDisplayLocationInformationRequiredState());
        writer.writeStringValue("@odata.type", this.getOdataType());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the displayAppInformationRequiredState property value. Determines whether the user's Authenticator app shows them the client app they're signing into.
     * @param value Value to set for the displayAppInformationRequiredState property.
     */
    public void setDisplayAppInformationRequiredState(@jakarta.annotation.Nullable final AuthenticationMethodFeatureConfiguration value) {
        this.getBackingStore().set("displayAppInformationRequiredState", value);
    }
    /**
     * Sets the displayLocationInformationRequiredState property value. Determines whether the user's Authenticator app shows them the geographic location of where the authentication request originated from.
     * @param value Value to set for the displayLocationInformationRequiredState property.
     */
    public void setDisplayLocationInformationRequiredState(@jakarta.annotation.Nullable final AuthenticationMethodFeatureConfiguration value) {
        this.getBackingStore().set("displayLocationInformationRequiredState", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
}
