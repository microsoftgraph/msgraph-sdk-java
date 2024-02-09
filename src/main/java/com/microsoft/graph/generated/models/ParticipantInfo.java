package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
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
public class ParticipantInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ParticipantInfo} and sets the default values.
     */
    public ParticipantInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ParticipantInfo}
     */
    @jakarta.annotation.Nonnull
    public static ParticipantInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParticipantInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the countryCode property value. The ISO 3166-1 Alpha-2 country code of the participant's best estimated physical location at the start of the call. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.backingStore.get("countryCode");
    }
    /**
     * Gets the endpointType property value. The type of endpoint the participant is using. Possible values are: default, skypeForBusiness, or skypeForBusinessVoipPhone. Read-only.
     * @return a {@link EndpointType}
     */
    @jakarta.annotation.Nullable
    public EndpointType getEndpointType() {
        return this.backingStore.get("endpointType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("endpointType", (n) -> { this.setEndpointType(n.getEnumValue(EndpointType::forValue)); });
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("languageId", (n) -> { this.setLanguageId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("participantId", (n) -> { this.setParticipantId(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identity property value. The identity property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getIdentity() {
        return this.backingStore.get("identity");
    }
    /**
     * Gets the languageId property value. The language culture string. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguageId() {
        return this.backingStore.get("languageId");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the participantId property value. The participant ID of the participant. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParticipantId() {
        return this.backingStore.get("participantId");
    }
    /**
     * Gets the region property value. The home region of the participant. This can be a country, a continent, or a larger geographic region. This doesn't change based on the participant's current physical location. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.backingStore.get("region");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeEnumValue("endpointType", this.getEndpointType());
        writer.writeObjectValue("identity", this.getIdentity());
        writer.writeStringValue("languageId", this.getLanguageId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("participantId", this.getParticipantId());
        writer.writeStringValue("region", this.getRegion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the countryCode property value. The ISO 3166-1 Alpha-2 country code of the participant's best estimated physical location at the start of the call. Read-only.
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("countryCode", value);
    }
    /**
     * Sets the endpointType property value. The type of endpoint the participant is using. Possible values are: default, skypeForBusiness, or skypeForBusinessVoipPhone. Read-only.
     * @param value Value to set for the endpointType property.
     */
    public void setEndpointType(@jakarta.annotation.Nullable final EndpointType value) {
        this.backingStore.set("endpointType", value);
    }
    /**
     * Sets the identity property value. The identity property
     * @param value Value to set for the identity property.
     */
    public void setIdentity(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("identity", value);
    }
    /**
     * Sets the languageId property value. The language culture string. Read-only.
     * @param value Value to set for the languageId property.
     */
    public void setLanguageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("languageId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the participantId property value. The participant ID of the participant. Read-only.
     * @param value Value to set for the participantId property.
     */
    public void setParticipantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("participantId", value);
    }
    /**
     * Sets the region property value. The home region of the participant. This can be a country, a continent, or a larger geographic region. This doesn't change based on the participant's current physical location. Read-only.
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("region", value);
    }
}
