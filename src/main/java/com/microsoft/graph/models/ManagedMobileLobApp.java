package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedMobileLobApp extends ManagedApp implements Parsable {
    /**
     * The internal committed content version.
     */
    private String committedContentVersion;
    /**
     * The list of content versions for this app.
     */
    private java.util.List<MobileAppContent> contentVersions;
    /**
     * The name of the main Lob application file.
     */
    private String fileName;
    /**
     * The total size, including all uploaded files.
     */
    private Long size;
    /**
     * Instantiates a new ManagedMobileLobApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.committedContentVersion;
    }
    /**
     * Gets the contentVersions property value. The list of content versions for this app.
     * @return a mobileAppContent
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppContent> getContentVersions() {
        return this.contentVersions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("committedContentVersion", (n) -> { this.setCommittedContentVersion(n.getStringValue()); });
        deserializerMap.put("contentVersions", (n) -> { this.setContentVersions(n.getCollectionOfObjectValues(MobileAppContent::createFromDiscriminatorValue)); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. The name of the main Lob application file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the size property value. The total size, including all uploaded files.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSize() {
        return this.size;
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
    @javax.annotation.Nonnull
    public void setCommittedContentVersion(@javax.annotation.Nullable final String value) {
        this.committedContentVersion = value;
    }
    /**
     * Sets the contentVersions property value. The list of content versions for this app.
     * @param value Value to set for the contentVersions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentVersions(@javax.annotation.Nullable final java.util.List<MobileAppContent> value) {
        this.contentVersions = value;
    }
    /**
     * Sets the fileName property value. The name of the main Lob application file.
     * @param value Value to set for the fileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileName(@javax.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the size property value. The total size, including all uploaded files.
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Long value) {
        this.size = value;
    }
}
