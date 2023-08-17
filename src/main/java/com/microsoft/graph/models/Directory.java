package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Directory extends Entity implements Parsable {
    /**
     * Conceptual container for user and group directory objects.
     */
    private java.util.List<AdministrativeUnit> administrativeUnits;
    /**
     * Group of related custom security attribute definitions.
     */
    private java.util.List<AttributeSet> attributeSets;
    /**
     * Schema of a custom security attributes (key-value pairs).
     */
    private java.util.List<CustomSecurityAttributeDefinition> customSecurityAttributeDefinitions;
    /**
     * Recently deleted items. Read-only. Nullable.
     */
    private java.util.List<DirectoryObject> deletedItems;
    /**
     * Configure domain federation with organizations whose identity provider (IdP) supports either the SAML or WS-Fed protocol.
     */
    private java.util.List<IdentityProviderBase> federationConfigurations;
    /**
     * A container for on-premises directory synchronization functionalities that are available for the organization.
     */
    private java.util.List<OnPremisesDirectorySynchronization> onPremisesSynchronization;
    /**
     * Instantiates a new directory and sets the default values.
     */
    public Directory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directory
     */
    @jakarta.annotation.Nonnull
    public static Directory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Directory();
    }
    /**
     * Gets the administrativeUnits property value. Conceptual container for user and group directory objects.
     * @return a administrativeUnit
     */
    @jakarta.annotation.Nullable
    public java.util.List<AdministrativeUnit> getAdministrativeUnits() {
        return this.administrativeUnits;
    }
    /**
     * Gets the attributeSets property value. Group of related custom security attribute definitions.
     * @return a attributeSet
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttributeSet> getAttributeSets() {
        return this.attributeSets;
    }
    /**
     * Gets the customSecurityAttributeDefinitions property value. Schema of a custom security attributes (key-value pairs).
     * @return a customSecurityAttributeDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomSecurityAttributeDefinition> getCustomSecurityAttributeDefinitions() {
        return this.customSecurityAttributeDefinitions;
    }
    /**
     * Gets the deletedItems property value. Recently deleted items. Read-only. Nullable.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getDeletedItems() {
        return this.deletedItems;
    }
    /**
     * Gets the federationConfigurations property value. Configure domain federation with organizations whose identity provider (IdP) supports either the SAML or WS-Fed protocol.
     * @return a identityProviderBase
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityProviderBase> getFederationConfigurations() {
        return this.federationConfigurations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("administrativeUnits", (n) -> { this.setAdministrativeUnits(n.getCollectionOfObjectValues(AdministrativeUnit::createFromDiscriminatorValue)); });
        deserializerMap.put("attributeSets", (n) -> { this.setAttributeSets(n.getCollectionOfObjectValues(AttributeSet::createFromDiscriminatorValue)); });
        deserializerMap.put("customSecurityAttributeDefinitions", (n) -> { this.setCustomSecurityAttributeDefinitions(n.getCollectionOfObjectValues(CustomSecurityAttributeDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedItems", (n) -> { this.setDeletedItems(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("federationConfigurations", (n) -> { this.setFederationConfigurations(n.getCollectionOfObjectValues(IdentityProviderBase::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesSynchronization", (n) -> { this.setOnPremisesSynchronization(n.getCollectionOfObjectValues(OnPremisesDirectorySynchronization::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the onPremisesSynchronization property value. A container for on-premises directory synchronization functionalities that are available for the organization.
     * @return a onPremisesDirectorySynchronization
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnPremisesDirectorySynchronization> getOnPremisesSynchronization() {
        return this.onPremisesSynchronization;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("administrativeUnits", this.getAdministrativeUnits());
        writer.writeCollectionOfObjectValues("attributeSets", this.getAttributeSets());
        writer.writeCollectionOfObjectValues("customSecurityAttributeDefinitions", this.getCustomSecurityAttributeDefinitions());
        writer.writeCollectionOfObjectValues("deletedItems", this.getDeletedItems());
        writer.writeCollectionOfObjectValues("federationConfigurations", this.getFederationConfigurations());
        writer.writeCollectionOfObjectValues("onPremisesSynchronization", this.getOnPremisesSynchronization());
    }
    /**
     * Sets the administrativeUnits property value. Conceptual container for user and group directory objects.
     * @param value Value to set for the administrativeUnits property.
     */
    public void setAdministrativeUnits(@jakarta.annotation.Nullable final java.util.List<AdministrativeUnit> value) {
        this.administrativeUnits = value;
    }
    /**
     * Sets the attributeSets property value. Group of related custom security attribute definitions.
     * @param value Value to set for the attributeSets property.
     */
    public void setAttributeSets(@jakarta.annotation.Nullable final java.util.List<AttributeSet> value) {
        this.attributeSets = value;
    }
    /**
     * Sets the customSecurityAttributeDefinitions property value. Schema of a custom security attributes (key-value pairs).
     * @param value Value to set for the customSecurityAttributeDefinitions property.
     */
    public void setCustomSecurityAttributeDefinitions(@jakarta.annotation.Nullable final java.util.List<CustomSecurityAttributeDefinition> value) {
        this.customSecurityAttributeDefinitions = value;
    }
    /**
     * Sets the deletedItems property value. Recently deleted items. Read-only. Nullable.
     * @param value Value to set for the deletedItems property.
     */
    public void setDeletedItems(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.deletedItems = value;
    }
    /**
     * Sets the federationConfigurations property value. Configure domain federation with organizations whose identity provider (IdP) supports either the SAML or WS-Fed protocol.
     * @param value Value to set for the federationConfigurations property.
     */
    public void setFederationConfigurations(@jakarta.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this.federationConfigurations = value;
    }
    /**
     * Sets the onPremisesSynchronization property value. A container for on-premises directory synchronization functionalities that are available for the organization.
     * @param value Value to set for the onPremisesSynchronization property.
     */
    public void setOnPremisesSynchronization(@jakarta.annotation.Nullable final java.util.List<OnPremisesDirectorySynchronization> value) {
        this.onPremisesSynchronization = value;
    }
}
