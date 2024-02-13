package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CommunicationsIdentitySet extends IdentitySet implements Parsable {
    /**
     * Instantiates a new {@link CommunicationsIdentitySet} and sets the default values.
     */
    public CommunicationsIdentitySet() {
        super();
        this.setOdataType("#microsoft.graph.communicationsIdentitySet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CommunicationsIdentitySet}
     */
    @jakarta.annotation.Nonnull
    public static CommunicationsIdentitySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommunicationsIdentitySet();
    }
    /**
     * Gets the applicationInstance property value. The application instance associated with this action.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getApplicationInstance() {
        return this.backingStore.get("applicationInstance");
    }
    /**
     * Gets the assertedIdentity property value. An identity the participant would like to present itself as to the other participants in the call.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getAssertedIdentity() {
        return this.backingStore.get("assertedIdentity");
    }
    /**
     * Gets the azureCommunicationServicesUser property value. The Azure Communication Services user associated with this action.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getAzureCommunicationServicesUser() {
        return this.backingStore.get("azureCommunicationServicesUser");
    }
    /**
     * Gets the encrypted property value. The encrypted user associated with this action.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getEncrypted() {
        return this.backingStore.get("encrypted");
    }
    /**
     * Gets the endpointType property value. Type of endpoint that the participant uses. Possible values are: default, voicemail, skypeForBusiness, skypeForBusinessVoipPhone, unknownFutureValue.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationInstance", (n) -> { this.setApplicationInstance(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("assertedIdentity", (n) -> { this.setAssertedIdentity(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("azureCommunicationServicesUser", (n) -> { this.setAzureCommunicationServicesUser(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("encrypted", (n) -> { this.setEncrypted(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("endpointType", (n) -> { this.setEndpointType(n.getEnumValue(EndpointType::forValue)); });
        deserializerMap.put("guest", (n) -> { this.setGuest(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremises", (n) -> { this.setOnPremises(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the guest property value. The guest user associated with this action.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getGuest() {
        return this.backingStore.get("guest");
    }
    /**
     * Gets the onPremises property value. The Skype for Business on-premises user associated with this action.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getOnPremises() {
        return this.backingStore.get("onPremises");
    }
    /**
     * Gets the phone property value. The phone user associated with this action.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getPhone() {
        return this.backingStore.get("phone");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("applicationInstance", this.getApplicationInstance());
        writer.writeObjectValue("assertedIdentity", this.getAssertedIdentity());
        writer.writeObjectValue("azureCommunicationServicesUser", this.getAzureCommunicationServicesUser());
        writer.writeObjectValue("encrypted", this.getEncrypted());
        writer.writeEnumValue("endpointType", this.getEndpointType());
        writer.writeObjectValue("guest", this.getGuest());
        writer.writeObjectValue("onPremises", this.getOnPremises());
        writer.writeObjectValue("phone", this.getPhone());
    }
    /**
     * Sets the applicationInstance property value. The application instance associated with this action.
     * @param value Value to set for the applicationInstance property.
     */
    public void setApplicationInstance(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("applicationInstance", value);
    }
    /**
     * Sets the assertedIdentity property value. An identity the participant would like to present itself as to the other participants in the call.
     * @param value Value to set for the assertedIdentity property.
     */
    public void setAssertedIdentity(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("assertedIdentity", value);
    }
    /**
     * Sets the azureCommunicationServicesUser property value. The Azure Communication Services user associated with this action.
     * @param value Value to set for the azureCommunicationServicesUser property.
     */
    public void setAzureCommunicationServicesUser(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("azureCommunicationServicesUser", value);
    }
    /**
     * Sets the encrypted property value. The encrypted user associated with this action.
     * @param value Value to set for the encrypted property.
     */
    public void setEncrypted(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("encrypted", value);
    }
    /**
     * Sets the endpointType property value. Type of endpoint that the participant uses. Possible values are: default, voicemail, skypeForBusiness, skypeForBusinessVoipPhone, unknownFutureValue.
     * @param value Value to set for the endpointType property.
     */
    public void setEndpointType(@jakarta.annotation.Nullable final EndpointType value) {
        this.backingStore.set("endpointType", value);
    }
    /**
     * Sets the guest property value. The guest user associated with this action.
     * @param value Value to set for the guest property.
     */
    public void setGuest(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("guest", value);
    }
    /**
     * Sets the onPremises property value. The Skype for Business on-premises user associated with this action.
     * @param value Value to set for the onPremises property.
     */
    public void setOnPremises(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("onPremises", value);
    }
    /**
     * Sets the phone property value. The phone user associated with this action.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("phone", value);
    }
}
