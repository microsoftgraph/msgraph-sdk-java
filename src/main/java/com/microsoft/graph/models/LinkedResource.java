package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LinkedResource extends Entity implements Parsable {
    /** Field indicating the app name of the source that is sending the linkedResource. */
    private String _applicationName;
    /** Field indicating the title of the linkedResource. */
    private String _displayName;
    /** Id of the object that is associated with this task on the third-party/partner system. */
    private String _externalId;
    /** Deep link to the linkedResource. */
    private String _webUrl;
    /**
     * Instantiates a new linkedResource and sets the default values.
     * @return a void
     */
    public LinkedResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a linkedResource
     */
    @javax.annotation.Nonnull
    public static LinkedResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LinkedResource();
    }
    /**
     * Gets the applicationName property value. Field indicating the app name of the source that is sending the linkedResource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationName() {
        return this._applicationName;
    }
    /**
     * Gets the displayName property value. Field indicating the title of the linkedResource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the externalId property value. Id of the object that is associated with this task on the third-party/partner system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LinkedResource currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicationName", (n) -> { currentObject.setApplicationName(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the webUrl property value. Deep link to the linkedResource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("applicationName", this.getApplicationName());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the applicationName property value. Field indicating the app name of the source that is sending the linkedResource.
     * @param value Value to set for the applicationName property.
     * @return a void
     */
    public void setApplicationName(@javax.annotation.Nullable final String value) {
        this._applicationName = value;
    }
    /**
     * Sets the displayName property value. Field indicating the title of the linkedResource.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the externalId property value. Id of the object that is associated with this task on the third-party/partner system.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the webUrl property value. Deep link to the linkedResource.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
