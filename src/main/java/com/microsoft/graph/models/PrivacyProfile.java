package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivacyProfile implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** A valid smtp email address for the privacy statement contact. Not required.  */
    private String _contactEmail;
    /** A valid URL format that begins with http:// or https://. Maximum length is 255 characters. The URL that directs to the company's privacy statement. Not required.  */
    private String _statementUrl;
    /**
     * Instantiates a new privacyProfile and sets the default values.
     * @return a void
     */
    public PrivacyProfile() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privacyProfile
     */
    @javax.annotation.Nonnull
    public static PrivacyProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivacyProfile();
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
     * Gets the contactEmail property value. A valid smtp email address for the privacy statement contact. Not required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactEmail() {
        return this._contactEmail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrivacyProfile currentObject = this;
        return new HashMap<>(2) {{
            this.put("contactEmail", (n) -> { currentObject.setContactEmail(n.getStringValue()); });
            this.put("statementUrl", (n) -> { currentObject.setStatementUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the statementUrl property value. A valid URL format that begins with http:// or https://. Maximum length is 255 characters. The URL that directs to the company's privacy statement. Not required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatementUrl() {
        return this._statementUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contactEmail", this.getContactEmail());
        writer.writeStringValue("statementUrl", this.getStatementUrl());
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
     * Sets the contactEmail property value. A valid smtp email address for the privacy statement contact. Not required.
     * @param value Value to set for the contactEmail property.
     * @return a void
     */
    public void setContactEmail(@javax.annotation.Nullable final String value) {
        this._contactEmail = value;
    }
    /**
     * Sets the statementUrl property value. A valid URL format that begins with http:// or https://. Maximum length is 255 characters. The URL that directs to the company's privacy statement. Not required.
     * @param value Value to set for the statementUrl property.
     * @return a void
     */
    public void setStatementUrl(@javax.annotation.Nullable final String value) {
        this._statementUrl = value;
    }
}
