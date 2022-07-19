package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InformationalUrl implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** CDN URL to the application's logo, Read-only. */
    private String _logoUrl;
    /** Link to the application's marketing page. For example, https://www.contoso.com/app/marketing */
    private String _marketingUrl;
    /** The OdataType property */
    private String _odataType;
    /** Link to the application's privacy statement. For example, https://www.contoso.com/app/privacy */
    private String _privacyStatementUrl;
    /** Link to the application's support page. For example, https://www.contoso.com/app/support */
    private String _supportUrl;
    /** Link to the application's terms of service statement. For example, https://www.contoso.com/app/termsofservice */
    private String _termsOfServiceUrl;
    /**
     * Instantiates a new informationalUrl and sets the default values.
     * @return a void
     */
    public InformationalUrl() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.informationalUrl");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a informationalUrl
     */
    @javax.annotation.Nonnull
    public static InformationalUrl createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationalUrl();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InformationalUrl currentObject = this;
        return new HashMap<>(6) {{
            this.put("logoUrl", (n) -> { currentObject.setLogoUrl(n.getStringValue()); });
            this.put("marketingUrl", (n) -> { currentObject.setMarketingUrl(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("privacyStatementUrl", (n) -> { currentObject.setPrivacyStatementUrl(n.getStringValue()); });
            this.put("supportUrl", (n) -> { currentObject.setSupportUrl(n.getStringValue()); });
            this.put("termsOfServiceUrl", (n) -> { currentObject.setTermsOfServiceUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the logoUrl property value. CDN URL to the application's logo, Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogoUrl() {
        return this._logoUrl;
    }
    /**
     * Gets the marketingUrl property value. Link to the application's marketing page. For example, https://www.contoso.com/app/marketing
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMarketingUrl() {
        return this._marketingUrl;
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
     * Gets the privacyStatementUrl property value. Link to the application's privacy statement. For example, https://www.contoso.com/app/privacy
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivacyStatementUrl() {
        return this._privacyStatementUrl;
    }
    /**
     * Gets the supportUrl property value. Link to the application's support page. For example, https://www.contoso.com/app/support
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSupportUrl() {
        return this._supportUrl;
    }
    /**
     * Gets the termsOfServiceUrl property value. Link to the application's terms of service statement. For example, https://www.contoso.com/app/termsofservice
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTermsOfServiceUrl() {
        return this._termsOfServiceUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("logoUrl", this.getLogoUrl());
        writer.writeStringValue("marketingUrl", this.getMarketingUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("privacyStatementUrl", this.getPrivacyStatementUrl());
        writer.writeStringValue("supportUrl", this.getSupportUrl());
        writer.writeStringValue("termsOfServiceUrl", this.getTermsOfServiceUrl());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the logoUrl property value. CDN URL to the application's logo, Read-only.
     * @param value Value to set for the logoUrl property.
     * @return a void
     */
    public void setLogoUrl(@javax.annotation.Nullable final String value) {
        this._logoUrl = value;
    }
    /**
     * Sets the marketingUrl property value. Link to the application's marketing page. For example, https://www.contoso.com/app/marketing
     * @param value Value to set for the marketingUrl property.
     * @return a void
     */
    public void setMarketingUrl(@javax.annotation.Nullable final String value) {
        this._marketingUrl = value;
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
     * Sets the privacyStatementUrl property value. Link to the application's privacy statement. For example, https://www.contoso.com/app/privacy
     * @param value Value to set for the privacyStatementUrl property.
     * @return a void
     */
    public void setPrivacyStatementUrl(@javax.annotation.Nullable final String value) {
        this._privacyStatementUrl = value;
    }
    /**
     * Sets the supportUrl property value. Link to the application's support page. For example, https://www.contoso.com/app/support
     * @param value Value to set for the supportUrl property.
     * @return a void
     */
    public void setSupportUrl(@javax.annotation.Nullable final String value) {
        this._supportUrl = value;
    }
    /**
     * Sets the termsOfServiceUrl property value. Link to the application's terms of service statement. For example, https://www.contoso.com/app/termsofservice
     * @param value Value to set for the termsOfServiceUrl property.
     * @return a void
     */
    public void setTermsOfServiceUrl(@javax.annotation.Nullable final String value) {
        this._termsOfServiceUrl = value;
    }
}
