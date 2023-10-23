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
     * The applicationInstance property
     */
    private Identity applicationInstance;
    /**
     * The assertedIdentity property
     */
    private Identity assertedIdentity;
    /**
     * The azureCommunicationServicesUser property
     */
    private Identity azureCommunicationServicesUser;
    /**
     * The encrypted property
     */
    private Identity encrypted;
    /**
     * The endpointType property
     */
    private EndpointType endpointType;
    /**
     * The guest property
     */
    private Identity guest;
    /**
     * The onPremises property
     */
    private Identity onPremises;
    /**
     * The phone property
     */
    private Identity phone;
    /**
     * Instantiates a new CommunicationsIdentitySet and sets the default values.
     */
    public CommunicationsIdentitySet() {
        super();
        this.setOdataType("#microsoft.graph.communicationsIdentitySet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CommunicationsIdentitySet
     */
    @jakarta.annotation.Nonnull
    public static CommunicationsIdentitySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommunicationsIdentitySet();
    }
    /**
     * Gets the applicationInstance property value. The applicationInstance property
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getApplicationInstance() {
        return this.applicationInstance;
    }
    /**
     * Gets the assertedIdentity property value. The assertedIdentity property
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getAssertedIdentity() {
        return this.assertedIdentity;
    }
    /**
     * Gets the azureCommunicationServicesUser property value. The azureCommunicationServicesUser property
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getAzureCommunicationServicesUser() {
        return this.azureCommunicationServicesUser;
    }
    /**
     * Gets the encrypted property value. The encrypted property
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getEncrypted() {
        return this.encrypted;
    }
    /**
     * Gets the endpointType property value. The endpointType property
     * @return a EndpointType
     */
    @jakarta.annotation.Nullable
    public EndpointType getEndpointType() {
        return this.endpointType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationInstance", (n) -> { this.setApplicationInstance(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("assertedIdentity", (n) -> { this.setAssertedIdentity(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("azureCommunicationServicesUser", (n) -> { this.setAzureCommunicationServicesUser(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("encrypted", (n) -> { this.setEncrypted(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("endpointType", (n) -> { this.setEndpointType(n.getEnumValue(EndpointType.class)); });
        deserializerMap.put("guest", (n) -> { this.setGuest(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremises", (n) -> { this.setOnPremises(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the guest property value. The guest property
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getGuest() {
        return this.guest;
    }
    /**
     * Gets the onPremises property value. The onPremises property
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getOnPremises() {
        return this.onPremises;
    }
    /**
     * Gets the phone property value. The phone property
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getPhone() {
        return this.phone;
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
     * Sets the applicationInstance property value. The applicationInstance property
     * @param value Value to set for the applicationInstance property.
     */
    public void setApplicationInstance(@jakarta.annotation.Nullable final Identity value) {
        this.applicationInstance = value;
    }
    /**
     * Sets the assertedIdentity property value. The assertedIdentity property
     * @param value Value to set for the assertedIdentity property.
     */
    public void setAssertedIdentity(@jakarta.annotation.Nullable final Identity value) {
        this.assertedIdentity = value;
    }
    /**
     * Sets the azureCommunicationServicesUser property value. The azureCommunicationServicesUser property
     * @param value Value to set for the azureCommunicationServicesUser property.
     */
    public void setAzureCommunicationServicesUser(@jakarta.annotation.Nullable final Identity value) {
        this.azureCommunicationServicesUser = value;
    }
    /**
     * Sets the encrypted property value. The encrypted property
     * @param value Value to set for the encrypted property.
     */
    public void setEncrypted(@jakarta.annotation.Nullable final Identity value) {
        this.encrypted = value;
    }
    /**
     * Sets the endpointType property value. The endpointType property
     * @param value Value to set for the endpointType property.
     */
    public void setEndpointType(@jakarta.annotation.Nullable final EndpointType value) {
        this.endpointType = value;
    }
    /**
     * Sets the guest property value. The guest property
     * @param value Value to set for the guest property.
     */
    public void setGuest(@jakarta.annotation.Nullable final Identity value) {
        this.guest = value;
    }
    /**
     * Sets the onPremises property value. The onPremises property
     * @param value Value to set for the onPremises property.
     */
    public void setOnPremises(@jakarta.annotation.Nullable final Identity value) {
        this.onPremises = value;
    }
    /**
     * Sets the phone property value. The phone property
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final Identity value) {
        this.phone = value;
    }
}
