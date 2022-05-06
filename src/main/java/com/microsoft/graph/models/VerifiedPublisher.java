package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VerifiedPublisher implements AdditionalDataHolder, Parsable {
    /** The timestamp when the verified publisher was first added or most recently updated.  */
    private OffsetDateTime _addedDateTime;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The verified publisher name from the app publisher's Microsoft Partner Network (MPN) account.  */
    private String _displayName;
    /** The ID of the verified publisher from the app publisher's Partner Center account.  */
    private String _verifiedPublisherId;
    /**
     * Instantiates a new verifiedPublisher and sets the default values.
     * @return a void
     */
    public VerifiedPublisher() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a verifiedPublisher
     */
    @javax.annotation.Nonnull
    public static VerifiedPublisher createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifiedPublisher();
    }
    /**
     * Gets the addedDateTime property value. The timestamp when the verified publisher was first added or most recently updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAddedDateTime() {
        return this._addedDateTime;
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
     * Gets the displayName property value. The verified publisher name from the app publisher's Microsoft Partner Network (MPN) account.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VerifiedPublisher currentObject = this;
        return new HashMap<>(3) {{
            this.put("addedDateTime", (n) -> { currentObject.setAddedDateTime(n.getOffsetDateTimeValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("verifiedPublisherId", (n) -> { currentObject.setVerifiedPublisherId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the verifiedPublisherId property value. The ID of the verified publisher from the app publisher's Partner Center account.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVerifiedPublisherId() {
        return this._verifiedPublisherId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("addedDateTime", this.getAddedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("verifiedPublisherId", this.getVerifiedPublisherId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the addedDateTime property value. The timestamp when the verified publisher was first added or most recently updated.
     * @param value Value to set for the addedDateTime property.
     * @return a void
     */
    public void setAddedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._addedDateTime = value;
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
     * Sets the displayName property value. The verified publisher name from the app publisher's Microsoft Partner Network (MPN) account.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the verifiedPublisherId property value. The ID of the verified publisher from the app publisher's Partner Center account.
     * @param value Value to set for the verifiedPublisherId property.
     * @return a void
     */
    public void setVerifiedPublisherId(@javax.annotation.Nullable final String value) {
        this._verifiedPublisherId = value;
    }
}
