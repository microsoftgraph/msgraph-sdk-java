package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RelatedContact implements AdditionalDataHolder, Parsable {
    /** Indicates whether the user has been consented to access student data. */
    private Boolean _accessConsent;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Name of the contact. Required. */
    private String _displayName;
    /** Primary email address of the contact. Required. */
    private String _emailAddress;
    /** Mobile phone number of the contact. */
    private String _mobilePhone;
    /** The OdataType property */
    private String _odataType;
    /** The relationship property */
    private ContactRelationship _relationship;
    /**
     * Instantiates a new relatedContact and sets the default values.
     * @return a void
     */
    public RelatedContact() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.relatedContact");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a relatedContact
     */
    @javax.annotation.Nonnull
    public static RelatedContact createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedContact();
    }
    /**
     * Gets the accessConsent property value. Indicates whether the user has been consented to access student data.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccessConsent() {
        return this._accessConsent;
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
     * Gets the displayName property value. Name of the contact. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the emailAddress property value. Primary email address of the contact. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailAddress() {
        return this._emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RelatedContact currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("accessConsent", (n) -> { currentObject.setAccessConsent(n.getBooleanValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getStringValue()); });
            this.put("mobilePhone", (n) -> { currentObject.setMobilePhone(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("relationship", (n) -> { currentObject.setRelationship(n.getEnumValue(ContactRelationship.class)); });
        }};
    }
    /**
     * Gets the mobilePhone property value. Mobile phone number of the contact.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMobilePhone() {
        return this._mobilePhone;
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
     * Gets the relationship property value. The relationship property
     * @return a contactRelationship
     */
    @javax.annotation.Nullable
    public ContactRelationship getRelationship() {
        return this._relationship;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAccessConsent(@javax.annotation.Nullable final Boolean value) {
        this._accessConsent = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the displayName property value. Name of the contact. Required.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the emailAddress property value. Primary email address of the contact. Required.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this._emailAddress = value;
    }
    /**
     * Sets the mobilePhone property value. Mobile phone number of the contact.
     * @param value Value to set for the mobilePhone property.
     * @return a void
     */
    public void setMobilePhone(@javax.annotation.Nullable final String value) {
        this._mobilePhone = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the relationship property value. The relationship property
     * @param value Value to set for the relationship property.
     * @return a void
     */
    public void setRelationship(@javax.annotation.Nullable final ContactRelationship value) {
        this._relationship = value;
    }
}
