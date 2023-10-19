package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedContact implements AdditionalDataHolder, Parsable {
    /**
     * Indicates whether the user has been consented to access student data.
     */
    private Boolean accessConsent;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Name of the contact. Required.
     */
    private String displayName;
    /**
     * Primary email address of the contact. Required.
     */
    private String emailAddress;
    /**
     * Mobile phone number of the contact.
     */
    private String mobilePhone;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The relationship property
     */
    private ContactRelationship relationship;
    /**
     * Instantiates a new RelatedContact and sets the default values.
     */
    public RelatedContact() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RelatedContact
     */
    @jakarta.annotation.Nonnull
    public static RelatedContact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedContact();
    }
    /**
     * Gets the accessConsent property value. Indicates whether the user has been consented to access student data.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAccessConsent() {
        return this.accessConsent;
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the displayName property value. Name of the contact. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the emailAddress property value. Primary email address of the contact. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("accessConsent", (n) -> { this.setAccessConsent(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("mobilePhone", (n) -> { this.setMobilePhone(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("relationship", (n) -> { this.setRelationship(n.getEnumValue(ContactRelationship.class)); });
        return deserializerMap;
    }
    /**
     * Gets the mobilePhone property value. Mobile phone number of the contact.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMobilePhone() {
        return this.mobilePhone;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the relationship property value. The relationship property
     * @return a ContactRelationship
     */
    @jakarta.annotation.Nullable
    public ContactRelationship getRelationship() {
        return this.relationship;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("accessConsent", this.getAccessConsent());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeStringValue("mobilePhone", this.getMobilePhone());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("relationship", this.getRelationship());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessConsent property value. Indicates whether the user has been consented to access student data.
     * @param value Value to set for the accessConsent property.
     */
    public void setAccessConsent(@jakarta.annotation.Nullable final Boolean value) {
        this.accessConsent = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the displayName property value. Name of the contact. Required.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the emailAddress property value. Primary email address of the contact. Required.
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the mobilePhone property value. Mobile phone number of the contact.
     * @param value Value to set for the mobilePhone property.
     */
    public void setMobilePhone(@jakarta.annotation.Nullable final String value) {
        this.mobilePhone = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the relationship property value. The relationship property
     * @param value Value to set for the relationship property.
     */
    public void setRelationship(@jakarta.annotation.Nullable final ContactRelationship value) {
        this.relationship = value;
    }
}
