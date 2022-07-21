package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedMobileLobApp extends ManagedApp implements Parsable {
    /** The internal committed content version. */
    private String _committedContentVersion;
    /** The list of content versions for this app. */
    private java.util.List<MobileAppContent> _contentVersions;
    /** The name of the main Lob application file. */
    private String _fileName;
    /** The total size, including all uploaded files. */
    private Long _size;
    /**
     * Instantiates a new ManagedMobileLobApp and sets the default values.
     * @return a void
     */
    public ManagedMobileLobApp() {
        super();
        this.setOdataType("#microsoft.graph.managedMobileLobApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedMobileLobApp
     */
    @javax.annotation.Nonnull
    public static ManagedMobileLobApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.managedAndroidLobApp": return new ManagedAndroidLobApp();
                case "#microsoft.graph.managedIOSLobApp": return new ManagedIOSLobApp();
            }
        }
        return new ManagedMobileLobApp();
    }
    /**
     * Gets the committedContentVersion property value. The internal committed content version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCommittedContentVersion() {
        return this._committedContentVersion;
    }
    /**
     * Gets the contentVersions property value. The list of content versions for this app.
     * @return a mobileAppContent
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppContent> getContentVersions() {
        return this._contentVersions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedMobileLobApp currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("committedContentVersion", (n) -> { currentObject.setCommittedContentVersion(n.getStringValue()); });
            this.put("contentVersions", (n) -> { currentObject.setContentVersions(n.getCollectionOfObjectValues(MobileAppContent::createFromDiscriminatorValue)); });
            this.put("fileName", (n) -> { currentObject.setFileName(n.getStringValue()); });
            this.put("size", (n) -> { currentObject.setSize(n.getLongValue()); });
        }};
    }
    /**
     * Gets the fileName property value. The name of the main Lob application file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this._fileName;
    }
    /**
     * Gets the size property value. The total size, including all uploaded files.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSize() {
        return this._size;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("committedContentVersion", this.getCommittedContentVersion());
        writer.writeCollectionOfObjectValues("contentVersions", this.getContentVersions());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeLongValue("size", this.getSize());
    }
    /**
     * Sets the committedContentVersion property value. The internal committed content version.
     * @param value Value to set for the committedContentVersion property.
     * @return a void
     */
    public void setCommittedContentVersion(@javax.annotation.Nullable final String value) {
        this._committedContentVersion = value;
    }
    /**
     * Sets the contentVersions property value. The list of content versions for this app.
     * @param value Value to set for the contentVersions property.
     * @return a void
     */
    public void setContentVersions(@javax.annotation.Nullable final java.util.List<MobileAppContent> value) {
        this._contentVersions = value;
    }
    /**
     * Sets the fileName property value. The name of the main Lob application file.
     * @param value Value to set for the fileName property.
     * @return a void
     */
    public void setFileName(@javax.annotation.Nullable final String value) {
        this._fileName = value;
    }
    /**
     * Sets the size property value. The total size, including all uploaded files.
     * @param value Value to set for the size property.
     * @return a void
     */
    public void setSize(@javax.annotation.Nullable final Long value) {
        this._size = value;
    }
}
