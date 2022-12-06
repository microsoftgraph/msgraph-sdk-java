package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10SecureAssessmentConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not to allow the app from printing during the test. */
    private Boolean _allowPrinting;
    /** Indicates whether or not to allow screen capture capability during a test. */
    private Boolean _allowScreenCapture;
    /** Indicates whether or not to allow text suggestions during the test. */
    private Boolean _allowTextSuggestion;
    /** The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user), an AAD account (username@tenant.com) or a local account (username). */
    private String _configurationAccount;
    /** Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a valid Url (http[s]://msdn.microsoft.com/). */
    private String _launchUri;
    /**
     * Instantiates a new Windows10SecureAssessmentConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows10SecureAssessmentConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10SecureAssessmentConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10SecureAssessmentConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows10SecureAssessmentConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10SecureAssessmentConfiguration();
    }
    /**
     * Gets the allowPrinting property value. Indicates whether or not to allow the app from printing during the test.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowPrinting() {
        return this._allowPrinting;
    }
    /**
     * Gets the allowScreenCapture property value. Indicates whether or not to allow screen capture capability during a test.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowScreenCapture() {
        return this._allowScreenCapture;
    }
    /**
     * Gets the allowTextSuggestion property value. Indicates whether or not to allow text suggestions during the test.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowTextSuggestion() {
        return this._allowTextSuggestion;
    }
    /**
     * Gets the configurationAccount property value. The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user), an AAD account (username@tenant.com) or a local account (username).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConfigurationAccount() {
        return this._configurationAccount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowPrinting", (n) -> { this.setAllowPrinting(n.getBooleanValue()); });
        deserializerMap.put("allowScreenCapture", (n) -> { this.setAllowScreenCapture(n.getBooleanValue()); });
        deserializerMap.put("allowTextSuggestion", (n) -> { this.setAllowTextSuggestion(n.getBooleanValue()); });
        deserializerMap.put("configurationAccount", (n) -> { this.setConfigurationAccount(n.getStringValue()); });
        deserializerMap.put("launchUri", (n) -> { this.setLaunchUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the launchUri property value. Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a valid Url (http[s]://msdn.microsoft.com/).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLaunchUri() {
        return this._launchUri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowPrinting", this.getAllowPrinting());
        writer.writeBooleanValue("allowScreenCapture", this.getAllowScreenCapture());
        writer.writeBooleanValue("allowTextSuggestion", this.getAllowTextSuggestion());
        writer.writeStringValue("configurationAccount", this.getConfigurationAccount());
        writer.writeStringValue("launchUri", this.getLaunchUri());
    }
    /**
     * Sets the allowPrinting property value. Indicates whether or not to allow the app from printing during the test.
     * @param value Value to set for the allowPrinting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowPrinting(@javax.annotation.Nullable final Boolean value) {
        this._allowPrinting = value;
    }
    /**
     * Sets the allowScreenCapture property value. Indicates whether or not to allow screen capture capability during a test.
     * @param value Value to set for the allowScreenCapture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowScreenCapture(@javax.annotation.Nullable final Boolean value) {
        this._allowScreenCapture = value;
    }
    /**
     * Sets the allowTextSuggestion property value. Indicates whether or not to allow text suggestions during the test.
     * @param value Value to set for the allowTextSuggestion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowTextSuggestion(@javax.annotation.Nullable final Boolean value) {
        this._allowTextSuggestion = value;
    }
    /**
     * Sets the configurationAccount property value. The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user), an AAD account (username@tenant.com) or a local account (username).
     * @param value Value to set for the configurationAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationAccount(@javax.annotation.Nullable final String value) {
        this._configurationAccount = value;
    }
    /**
     * Sets the launchUri property value. Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a valid Url (http[s]://msdn.microsoft.com/).
     * @param value Value to set for the launchUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLaunchUri(@javax.annotation.Nullable final String value) {
        this._launchUri = value;
    }
}
