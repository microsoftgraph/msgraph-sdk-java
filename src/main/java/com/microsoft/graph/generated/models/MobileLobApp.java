package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An abstract base class containing properties for all mobile line-of-business apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileLobApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new {@link MobileLobApp} and sets the default values.
     */
    public MobileLobApp() {
        super();
        this.setOdataType("#microsoft.graph.mobileLobApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileLobApp}
     */
    @jakarta.annotation.Nonnull
    public static MobileLobApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidLobApp": return new AndroidLobApp();
                case "#microsoft.graph.iosLobApp": return new IosLobApp();
                case "#microsoft.graph.macOSDmgApp": return new MacOSDmgApp();
                case "#microsoft.graph.macOSLobApp": return new MacOSLobApp();
                case "#microsoft.graph.win32LobApp": return new Win32LobApp();
                case "#microsoft.graph.windowsAppX": return new WindowsAppX();
                case "#microsoft.graph.windowsMobileMSI": return new WindowsMobileMSI();
                case "#microsoft.graph.windowsUniversalAppX": return new WindowsUniversalAppX();
            }
        }
        return new MobileLobApp();
    }
    /**
     * Gets the committedContentVersion property value. The internal committed content version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommittedContentVersion() {
        return this.backingStore.get("committedContentVersion");
    }
    /**
     * Gets the contentVersions property value. The list of content versions for this app.
     * @return a {@link java.util.List<MobileAppContent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppContent> getContentVersions() {
        return this.backingStore.get("contentVersions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.backingStore.get("fileName");
    }
    /**
     * Gets the size property value. The total size, including all uploaded files.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("committedContentVersion", this.getCommittedContentVersion());
        writer.writeCollectionOfObjectValues("contentVersions", this.getContentVersions());
        writer.writeStringValue("fileName", this.getFileName());
    }
    /**
     * Sets the committedContentVersion property value. The internal committed content version.
     * @param value Value to set for the committedContentVersion property.
     */
    public void setCommittedContentVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("committedContentVersion", value);
    }
    /**
     * Sets the contentVersions property value. The list of content versions for this app.
     * @param value Value to set for the contentVersions property.
     */
    public void setContentVersions(@jakarta.annotation.Nullable final java.util.List<MobileAppContent> value) {
        this.backingStore.set("contentVersions", value);
    }
    /**
     * Sets the fileName property value. The name of the main Lob application file.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileName", value);
    }
    /**
     * Sets the size property value. The total size, including all uploaded files.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("size", value);
    }
}
