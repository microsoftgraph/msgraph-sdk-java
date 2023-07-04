package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmailSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Specifies the domain that should be used when sending email notifications. This domain must be verified in order to be used. We recommend that you use a domain that has the appropriate DNS records to facilitate email validation, like SPF, DKIM, DMARC, and MX, because this then complies with the RFC compliance for sending and receiving email. For details, see Learn more about Exchange Online Email Routing.
     */
    private String senderDomain;
    /**
     * Specifies if the organizations banner logo should be included in email notifications. The banner logo will replace the Microsoft logo at the top of the email notification. If true the banner logo will be taken from the tenants branding settings. This value can only be set to true if the organizationalBranding bannerLogo property is set.
     */
    private Boolean useCompanyBranding;
    /**
     * Instantiates a new EmailSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EmailSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmailSettings
     */
    @javax.annotation.Nonnull
    public static EmailSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("senderDomain", (n) -> { this.setSenderDomain(n.getStringValue()); });
        deserializerMap.put("useCompanyBranding", (n) -> { this.setUseCompanyBranding(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the senderDomain property value. Specifies the domain that should be used when sending email notifications. This domain must be verified in order to be used. We recommend that you use a domain that has the appropriate DNS records to facilitate email validation, like SPF, DKIM, DMARC, and MX, because this then complies with the RFC compliance for sending and receiving email. For details, see Learn more about Exchange Online Email Routing.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSenderDomain() {
        return this.senderDomain;
    }
    /**
     * Gets the useCompanyBranding property value. Specifies if the organizations banner logo should be included in email notifications. The banner logo will replace the Microsoft logo at the top of the email notification. If true the banner logo will be taken from the tenants branding settings. This value can only be set to true if the organizationalBranding bannerLogo property is set.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseCompanyBranding() {
        return this.useCompanyBranding;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("senderDomain", this.getSenderDomain());
        writer.writeBooleanValue("useCompanyBranding", this.getUseCompanyBranding());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the senderDomain property value. Specifies the domain that should be used when sending email notifications. This domain must be verified in order to be used. We recommend that you use a domain that has the appropriate DNS records to facilitate email validation, like SPF, DKIM, DMARC, and MX, because this then complies with the RFC compliance for sending and receiving email. For details, see Learn more about Exchange Online Email Routing.
     * @param value Value to set for the senderDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSenderDomain(@javax.annotation.Nullable final String value) {
        this.senderDomain = value;
    }
    /**
     * Sets the useCompanyBranding property value. Specifies if the organizations banner logo should be included in email notifications. The banner logo will replace the Microsoft logo at the top of the email notification. If true the banner logo will be taken from the tenants branding settings. This value can only be set to true if the organizationalBranding bannerLogo property is set.
     * @param value Value to set for the useCompanyBranding property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseCompanyBranding(@javax.annotation.Nullable final Boolean value) {
        this.useCompanyBranding = value;
    }
}
