package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the secureAssessment resource.
 */
public class Windows10SecureAssessmentConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Indicates whether or not to allow the app from printing during the test.
     */
    private Boolean allowPrinting;
    /**
     * Indicates whether or not to allow screen capture capability during a test.
     */
    private Boolean allowScreenCapture;
    /**
     * Indicates whether or not to allow text suggestions during the test.
     */
    private Boolean allowTextSuggestion;
    /**
     * The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user), an AAD account (username@tenant.com) or a local account (username).
     */
    private String configurationAccount;
    /**
     * Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a valid Url (http[s]://msdn.microsoft.com/).
     */
    private String launchUri;
    /**
     * Instantiates a new windows10SecureAssessmentConfiguration and sets the default values.
     */
    public Windows10SecureAssessmentConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10SecureAssessmentConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windows10SecureAssessmentConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Windows10SecureAssessmentConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10SecureAssessmentConfiguration();
    }
    /**
     * Gets the allowPrinting property value. Indicates whether or not to allow the app from printing during the test.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowPrinting() {
        return this.allowPrinting;
    }
    /**
     * Gets the allowScreenCapture property value. Indicates whether or not to allow screen capture capability during a test.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowScreenCapture() {
        return this.allowScreenCapture;
    }
    /**
     * Gets the allowTextSuggestion property value. Indicates whether or not to allow text suggestions during the test.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowTextSuggestion() {
        return this.allowTextSuggestion;
    }
    /**
     * Gets the configurationAccount property value. The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user), an AAD account (username@tenant.com) or a local account (username).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getConfigurationAccount() {
        return this.configurationAccount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
    @jakarta.annotation.Nullable
    public String getLaunchUri() {
        return this.launchUri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAllowPrinting(@jakarta.annotation.Nullable final Boolean value) {
        this.allowPrinting = value;
    }
    /**
     * Sets the allowScreenCapture property value. Indicates whether or not to allow screen capture capability during a test.
     * @param value Value to set for the allowScreenCapture property.
     */
    public void setAllowScreenCapture(@jakarta.annotation.Nullable final Boolean value) {
        this.allowScreenCapture = value;
    }
    /**
     * Sets the allowTextSuggestion property value. Indicates whether or not to allow text suggestions during the test.
     * @param value Value to set for the allowTextSuggestion property.
     */
    public void setAllowTextSuggestion(@jakarta.annotation.Nullable final Boolean value) {
        this.allowTextSuggestion = value;
    }
    /**
     * Sets the configurationAccount property value. The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user), an AAD account (username@tenant.com) or a local account (username).
     * @param value Value to set for the configurationAccount property.
     */
    public void setConfigurationAccount(@jakarta.annotation.Nullable final String value) {
        this.configurationAccount = value;
    }
    /**
     * Sets the launchUri property value. Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a valid Url (http[s]://msdn.microsoft.com/).
     * @param value Value to set for the launchUri property.
     */
    public void setLaunchUri(@jakarta.annotation.Nullable final String value) {
        this.launchUri = value;
    }
}
