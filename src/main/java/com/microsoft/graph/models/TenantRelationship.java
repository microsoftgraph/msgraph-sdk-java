package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantRelationship implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The customer who has a delegated admin relationship with a Microsoft partner.
     */
    private java.util.List<DelegatedAdminCustomer> delegatedAdminCustomers;
    /**
     * The details of the delegated administrative privileges that a Microsoft partner has in a customer tenant.
     */
    private java.util.List<DelegatedAdminRelationship> delegatedAdminRelationships;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new tenantRelationship and sets the default values.
     */
    public TenantRelationship() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantRelationship
     */
    @jakarta.annotation.Nonnull
    public static TenantRelationship createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantRelationship();
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
     * Gets the delegatedAdminCustomers property value. The customer who has a delegated admin relationship with a Microsoft partner.
     * @return a delegatedAdminCustomer
     */
    @jakarta.annotation.Nullable
    public java.util.List<DelegatedAdminCustomer> getDelegatedAdminCustomers() {
        return this.delegatedAdminCustomers;
    }
    /**
     * Gets the delegatedAdminRelationships property value. The details of the delegated administrative privileges that a Microsoft partner has in a customer tenant.
     * @return a delegatedAdminRelationship
     */
    @jakarta.annotation.Nullable
    public java.util.List<DelegatedAdminRelationship> getDelegatedAdminRelationships() {
        return this.delegatedAdminRelationships;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("delegatedAdminCustomers", (n) -> { this.setDelegatedAdminCustomers(n.getCollectionOfObjectValues(DelegatedAdminCustomer::createFromDiscriminatorValue)); });
        deserializerMap.put("delegatedAdminRelationships", (n) -> { this.setDelegatedAdminRelationships(n.getCollectionOfObjectValues(DelegatedAdminRelationship::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("delegatedAdminCustomers", this.getDelegatedAdminCustomers());
        writer.writeCollectionOfObjectValues("delegatedAdminRelationships", this.getDelegatedAdminRelationships());
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
     * Sets the delegatedAdminCustomers property value. The customer who has a delegated admin relationship with a Microsoft partner.
     * @param value Value to set for the delegatedAdminCustomers property.
     */
    public void setDelegatedAdminCustomers(@jakarta.annotation.Nullable final java.util.List<DelegatedAdminCustomer> value) {
        this.delegatedAdminCustomers = value;
    }
    /**
     * Sets the delegatedAdminRelationships property value. The details of the delegated administrative privileges that a Microsoft partner has in a customer tenant.
     * @param value Value to set for the delegatedAdminRelationships property.
     */
    public void setDelegatedAdminRelationships(@jakarta.annotation.Nullable final java.util.List<DelegatedAdminRelationship> value) {
        this.delegatedAdminRelationships = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
