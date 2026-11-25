package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for a script associated with amobileLobApp entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppContentScript extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MobileAppContentScript} and sets the default values.
     */
    public MobileAppContentScript() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileAppContentScript}
     */
    @jakarta.annotation.Nonnull
    public static MobileAppContentScript createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.win32LobAppInstallPowerShellScript": return new Win32LobAppInstallPowerShellScript();
                case "#microsoft.graph.win32LobAppScript": return new Win32LobAppScript();
                case "#microsoft.graph.win32LobAppUninstallPowerShellScript": return new Win32LobAppUninstallPowerShellScript();
            }
        }
        return new MobileAppContentScript();
    }
    /**
     * Gets the content property value. The content of the script. This is a Base64-encoded representation of the script&apos;s original content. The original content (before Base64 encoding) has a maximum size limit of 100KB.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the displayName property value. The display name for the script.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(MobileAppContentScriptState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the state property value. A list of possible script lifecycle states.
     * @return a {@link MobileAppContentScriptState}
     */
    @jakarta.annotation.Nullable
    public MobileAppContentScriptState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the content property value. The content of the script. This is a Base64-encoded representation of the script&apos;s original content. The original content (before Base64 encoding) has a maximum size limit of 100KB.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the displayName property value. The display name for the script.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the state property value. A list of possible script lifecycle states.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final MobileAppContentScriptState value) {
        this.backingStore.set("state", value);
    }
}
